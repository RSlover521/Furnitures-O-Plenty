package com.rslover521.furnituresoplenty.util.validators;

import com.google.gson.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ModValidator {

    // Your mod ID
    private static final String MOD_ID = "furnituresoplenty";

    // List of external mod namespaces to ignore
    private static final Set<String> EXTERNAL_MODS = Set.of(
            "minecraft",
            "biomesoplenty",
            "refurbished_furniture",
            "framework",
            "terrablender"
    );

    // Paths to check
    private static final Path RESOURCES_DIR = Paths.get("src/main/resources/assets", MOD_ID);
    private static final Path MODELS_BLOCK = RESOURCES_DIR.resolve("models/block");
    private static final Path MODELS_ITEM = RESOURCES_DIR.resolve("models/item");
    private static final Path TEXTURES = RESOURCES_DIR.resolve("textures/block");

    public static void main(String[] args) throws IOException {
        System.out.println("Starting mod validator...");

        validateFolder(MODELS_BLOCK);
        validateFolder(MODELS_ITEM);

        System.out.println("Validation complete.");
    }

    private static void validateFolder(Path folder) throws IOException {
        if (!Files.exists(folder)) return;

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(folder, "*.json")) {
            for (Path f : stream) {
                validateJsonFile(f);
            }
        }
    }

    private static void validateJsonFile(Path f) {
        try (Reader reader = Files.newBufferedReader(f)) {
            JsonElement elem = JsonParser.parseReader(reader);
            if (!elem.isJsonObject()) {
                System.out.println("[Invalid JSON] " + f.getFileName());
                return;
            }

            JsonObject json = elem.getAsJsonObject();

            // Validate parent
            if (json.has("parent")) {
                String parent = json.get("parent").getAsString();
                if (!isExternalNamespace(parent)) {
                    String parentRel = parent.contains(":") ? parent.split(":", 2)[1] : parent;
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

            // Validate textures
            if (json.has("textures")) {
                JsonObject textures = json.getAsJsonObject("textures");
                for (String key : textures.keySet()) {
                    String tex = textures.get(key).getAsString();
                    if (isExternalNamespace(tex)) continue;

                    // Resolve internal path
                    if (!tex.contains(":")) tex = MOD_ID + ":" + tex;
                    String texPathStr = tex.split(":", 2)[1];
                    Path texPath = TEXTURES.resolve(texPathStr + ".png");

                    if (!Files.exists(texPath)) {
                        System.out.println("[Missing texture] " + f.getFileName() + " → " + texPath);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("[Error reading JSON] " + f.getFileName() + " → " + e.getMessage());
        }
    }

    private static boolean isExternalNamespace(String str) {
        String[] parts = str.split(":", 2);
        return parts.length == 2 && EXTERNAL_MODS.contains(parts[0]);
    }
}
