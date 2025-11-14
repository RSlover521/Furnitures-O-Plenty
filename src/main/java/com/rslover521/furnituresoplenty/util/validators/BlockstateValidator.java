package com.rslover521.furnituresoplenty.util.validators;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import com.google.gson.*;

/**
 * Minecraft Blockstate Syntax Validator
 *
 * Usage:
 *   - Open this class in your IDE (IntelliJ/VSCode)
 *   - Run as Java Application
 *   - Make sure MOD_ID and ASSETS_PATH match your mod
 */
public class BlockstateValidator {

    // === CONFIGURE YOUR MOD ID AND PATH ===
    private static final String MOD_ID = "furnituresoplenty";
    private static final Path ASSETS_PATH = Paths.get("src/main/resources/assets/furnituresoplenty");

    public static void main(String[] args) throws IOException {
        Path blockstatesDir = ASSETS_PATH.resolve("blockstates");

        if (!Files.exists(blockstatesDir)) {
            System.out.println("❌ Blockstates folder not found: " + blockstatesDir);
            return;
        }

        int total = 0;
        int failures = 0;

        try (var stream = Files.walk(blockstatesDir)) {
            for (Path file : (Iterable<Path>) stream.filter(Files::isRegularFile)::iterator) {
                if (!file.toString().endsWith(".json")) continue;
                total++;
                List<String> issues = validateBlockstate(file);

                if (!issues.isEmpty()) {
                    failures++;
                    System.out.println("\n❌ " + blockstatesDir.relativize(file) + " — " + issues.size() + " issue(s):");
                    for (String i : issues) System.out.println("   - " + i);
                } else {
                    System.out.println("✅ " + blockstatesDir.relativize(file) + " looks valid.");
                }
            }
        }

        System.out.println("\n=== Done: " + total + " blockstates checked, " + failures + " with issues. ===");
    }

    private static List<String> validateBlockstate(Path file) {
        List<String> errors = new ArrayList<>();
        JsonObject root;

        try (Reader reader = Files.newBufferedReader(file)) {
            root = JsonParser.parseReader(reader).getAsJsonObject();
        } catch (JsonParseException e) {
            errors.add("Invalid JSON: " + e.getMessage());
            return errors;
        } catch (Exception e) {
            errors.add("Failed to read file: " + e.getMessage());
            return errors;
        }

        if (!root.has("variants") && !root.has("multipart")) {
            errors.add("Missing both 'variants' and 'multipart' keys.");
        }

        // Check variants
        if (root.has("variants") && root.get("variants").isJsonObject()) {
            JsonObject variants = root.getAsJsonObject("variants");
            for (Map.Entry<String, JsonElement> entry : variants.entrySet()) {
                JsonElement val = entry.getValue();
                if (!val.isJsonObject()) {
                    errors.add("Variant '" + entry.getKey() + "' must be an object.");
                    continue;
                }
                JsonObject obj = val.getAsJsonObject();
                if (!obj.has("model")) {
                    errors.add("Variant '" + entry.getKey() + "' missing 'model' property.");
                } else {
                    validateModelPath(obj.get("model").getAsString(), errors);
                }
            }
        }

        // Check multipart
        if (root.has("multipart") && root.get("multipart").isJsonArray()) {
            for (JsonElement e : root.getAsJsonArray("multipart")) {
                if (!e.isJsonObject()) {
                    errors.add("Multipart entry must be an object.");
                    continue;
                }
                JsonObject obj = e.getAsJsonObject();
                if (!obj.has("apply")) {
                    errors.add("Multipart entry missing 'apply'.");
                    continue;
                }
                JsonElement apply = obj.get("apply");
                if (apply.isJsonObject()) {
                    JsonObject applyObj = apply.getAsJsonObject();
                    if (!applyObj.has("model")) {
                        errors.add("Multipart 'apply' missing 'model' key.");
                    } else {
                        validateModelPath(applyObj.get("model").getAsString(), errors);
                    }
                } else if (apply.isJsonArray()) {
                    for (JsonElement a : apply.getAsJsonArray()) {
                        if (!a.isJsonObject()) {
                            errors.add("Multipart 'apply' array contains non-object.");
                            continue;
                        }
                        JsonObject sub = a.getAsJsonObject();
                        if (sub.has("model")) {
                            validateModelPath(sub.get("model").getAsString(), errors);
                        } else {
                            errors.add("Multipart 'apply' entry missing 'model' key.");
                        }
                    }
                } else {
                    errors.add("Multipart 'apply' must be object or array.");
                }
            }
        }

        return errors;
    }

    private static void validateModelPath(String model, List<String> errors) {
        if (!model.matches("^[a-z0-9_\\-]+:[a-z0-9_\\-/]+$")) {
            errors.add("Invalid model path: '" + model + "'");
            return;
        }
        if (!model.startsWith(MOD_ID + ":")) {
            errors.add("Model '" + model + "' does not match modid '" + MOD_ID + "'");
        }

        String relPath = model.split(":", 2)[1] + ".json";
        Path fullPath = ASSETS_PATH.resolve("models").resolve(relPath);
        if (!Files.exists(fullPath)) {
            errors.add("Missing model file: " + fullPath);
        }
    }
}
