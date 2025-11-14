package com.rslover521.furnituresoplenty.util.validators;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import com.google.gson.*;

public class ModValidator {

    private static final String MOD_ID = "furnituresoplenty";

    private static final Path SOURCE_DIR = Paths.get("src/main/java");
    private static final Path RESOURCES_DIR = Paths.get("src/main/resources/assets/" + MOD_ID);

    private static final Path MODELS_BLOCK = RESOURCES_DIR.resolve("models/block");
    private static final Path MODELS_ITEM = RESOURCES_DIR.resolve("models/item");
    private static final Path BLOCKSTATES = RESOURCES_DIR.resolve("blockstates");
    private static final Path TEXTURES = RESOURCES_DIR.resolve("textures");

    private static final Pattern REGISTER_PATTERN =
            Pattern.compile("\\.(register|registerBlock)\\(\"(.*?)\"", Pattern.MULTILINE);

    public static void main(String[] args) throws Exception {
        System.out.println("===== FURNITURES O' PLENTY – PRE-LAUNCH VALIDATOR =====\n");

        List<String> registryNames = new ArrayList<>();
        System.out.println("Scanning registry classes...");

        scanJavaFiles(SOURCE_DIR, registryNames);

        System.out.println("\nFound " + registryNames.size() + " registry entries.");
        checkDuplicates(registryNames);

        System.out.println("\nChecking blockstates...");
        validateJsonFolder(BLOCKSTATES);

        System.out.println("\nChecking block models...");
        validateJsonFolder(MODELS_BLOCK);

        System.out.println("\nChecking item models...");
        validateJsonFolder(MODELS_ITEM);

        System.out.println("\n===== VALIDATION COMPLETE =====");
    }

    private static void scanJavaFiles(Path dir, List<String> registryNames) throws IOException {
        Files.walk(dir)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(javaFile -> {
                    try {
                        String content = Files.readString(javaFile);
                        Matcher m = REGISTER_PATTERN.matcher(content);

                        while (m.find()) {
                            String name = m.group(2).trim();
                            registryNames.add(name);
                            System.out.println("[Registry] " + name + " (from " + javaFile.getFileName() + ")");
                        }

                    } catch (IOException e) {
                        System.out.println("[Error] Could not read " + javaFile);
                    }
                });
    }

    private static void checkDuplicates(List<String> names) {
        System.out.println("\nChecking for duplicate registry names...");
        Set<String> seen = new HashSet<>();

        for (String n : names) {
            if (!seen.add(n)) {
                System.out.println("[DUPLICATE] " + n);
            }
        }
    }

    private static void validateJsonFolder(Path folder) throws IOException {
        if (!Files.exists(folder)) {
            System.out.println("Folder missing: " + folder);
            return;
        }

        Files.walk(folder)
                .filter(f -> f.toString().endsWith(".json"))
                .forEach(f -> {
                    try {
                        JsonObject json = JsonParser.parseReader(new FileReader(f.toFile())).getAsJsonObject();

                        // Check for "parent"
                        if (json.has("parent")) {
                            String parent = json.get("parent").getAsString();
                            if (parent.startsWith(MOD_ID + ":")) {
                                // convert furnituresoplenty:block/x → models/block/x.json
                                String parentRel = parent.substring(MOD_ID.length() + 1);

                                Path parentPath;
                                if (parentRel.startsWith("block/")) {
                                    parentPath = MODELS_BLOCK.resolve(parentRel.substring(6) + ".json");
                                } else if (parentRel.startsWith("item/")) {
                                    parentPath = MODELS_ITEM.resolve(parentRel.substring(5) + ".json");
                                } else {
                                    parentPath = RESOURCES_DIR.resolve(parentRel + ".json");
                                }

                                if (!Files.exists(parentPath)) {
                                    System.out.println("[Missing parent] In " + f.getFileName() + " → " + parentPath);
                                }
                            }
                        }

                        // Check textures
                        if (json.has("textures")) {
                            JsonObject textures = json.getAsJsonObject("textures");
                            for (String key : textures.keySet()) {
                                String tex = textures.get(key).getAsString();

                                // Only validate mod textures, not minecraft:
                                if (!tex.contains(":")) tex = MOD_ID + ":" + tex;

                                String texPathStr = tex.split(":", 2)[1];
                                Path texPath = TEXTURES.resolve(texPathStr + ".png");

                                if (!Files.exists(texPath)) {
                                    System.out.println("[Missing texture] " + f.getFileName() + " → " + texPath);
                                }
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("[INVALID JSON] " + f.getFileName() + " → " + e.getMessage());
                    }
                });
    }
}
