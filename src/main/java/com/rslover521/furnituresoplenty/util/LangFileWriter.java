package com.rslover521.furnituresoplenty.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Utility that auto-generates en_us.json for all wood types and registry types.
 * Example output:
 * "block.furnituresoplenty.oak_chair": "Oak Chair"
 */
public class LangFileWriter {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        // === CONFIGURATION ===
        String modId = "furnituresoplenty";
        Path langPath = Path.of("src/main/resources/assets/" + modId + "/lang");

        String[] woodTypes = {
                "fir", "pine", "maple", "redwood", "mahogany", "jacaranda", 
                "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
        };

        String[] registryTypes = {
                "basin", "bath", "light_ceiling_fan", "dark_ceiling_fan", "chair", "crate", 
                "cutting_board", "desk", "drawer", "kitchen_cabinetry", "kitchen_drawer", 
                "kitchen_sink", "kitchen_storage_cabinet", "lattice_fence_gate", "lattice_fence", 
                "mail_box", "storage_cabinet", "storage_jar", "table", "toilet"
        };

        writeLangFile(langPath, modId, woodTypes, registryTypes);
    }

    public static void writeLangFile(Path outputDir, String modId, String[] woodTypes, String[] registryTypes) {
        Map<String, String> entries = new LinkedHashMap<>();

        // Generate entries like block.furnituresoplenty.oak_chair = Oak Chair
        for (String wood : woodTypes) {
            for (String type : registryTypes) {
                String key = "block." + modId + "." + wood + "_" + type;
                String value = capitalizeWords(wood) + " " + capitalizeWords(type);
                entries.put(key, value);
            }
        }

        try {
            Files.createDirectories(outputDir);
            Path file = outputDir.resolve("en_us.json");

            try (FileWriter writer = new FileWriter(file.toFile())) {
                GSON.toJson(entries, writer);
            }

            System.out.println("[LangFileWriter] ✅ Generated " + file.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("[LangFileWriter] ❌ Failed to write en_us.json: " + e.getMessage());
        }
    }

    private static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) return input;
        String[] parts = input.split("_");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            if (!part.isEmpty()) {
                sb.append(part.substring(0, 1).toUpperCase(Locale.ROOT))
                  .append(part.substring(1));
                if (i < parts.length - 1) sb.append(" ");
            }
        }
        return sb.toString();
    }
}

