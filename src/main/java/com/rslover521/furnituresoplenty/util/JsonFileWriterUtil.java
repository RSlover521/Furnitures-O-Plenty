package com.rslover521.furnituresoplenty.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JsonFileWriterUtil {

    // Add all BOP wood types here
    private static final String[] WOOD_TYPES = {
        "maple", "fir", "mahogany", "jacaranda",
        "palm", "willow", "dead", "magic", "umbran",
        "hellbark", "empyreal", "pine", "redwood"
    };

    // Base path for generated assets (relative to project root)
    private static final String BASE_PATH = "src/main/resources/assets/furnituresoplenty/";

    private static int count;

    public static void main(String[] args) {
        for (String wood : WOOD_TYPES) {
            generateAll(wood, "table");
        }
        System.out.println("Finished generating JSON files for all wood types! Wrote " + count + " files.");
    }

    /**
     * Generates blockstate, block model, and item model JSONs for a given wood type and furniture type.
     *
     * @param woodType     e.g. "maple"
     * @param registerType e.g. "chair", "table", "toilet"
     */
    public static void generateAll(String woodType, String registerType) {
        generateBlockstate(woodType, registerType);
        generateBlockModel(woodType, registerType);
        generateItemModel(woodType, registerType);
    }

    private static void generateBlockstate(String wood, String type) {
        String json = """
        {
          "variants": {
            "facing=north": { "model": "furnituresoplenty:block/%1$s_%2$s", "y": 0 },
            "facing=east":  { "model": "furnituresoplenty:block/%1$s_%2$s", "y": 90 },
            "facing=south": { "model": "furnituresoplenty:block/%1$s_%2$s", "y": 180 },
            "facing=west":  { "model": "furnituresoplenty:block/%1$s_%2$s", "y": 270 }
          }
        }
        """.formatted(wood, type);
        write(BASE_PATH + "blockstates/" + wood + "_" + type + ".json", json);
    }

    private static void generateBlockModel(String wood, String type) {
        String json = """
        {
          "parent": "refurbished_furniture:block/%2$s",
          "textures": {
            "particle": "biomesoplenty:block/%1$s_planks",
            "texture": "furnituresoplenty:block/%1$s_%2$s"
          }
        }
        """.formatted(wood, type);
        write(BASE_PATH + "models/block/" + wood + "_" + type + ".json", json);
    }

    private static void generateItemModel(String wood, String type) {
        String json = """
        {
          "parent": "furnituresoplenty:block/%1$s_%2$s"
        }
        """.formatted(wood, type);
        write(BASE_PATH + "models/item/" + wood + "_" + type + ".json", json);
    }

    private static void write(String filePath, String content) {
        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();
            try (FileWriter writer = new FileWriter(file, StandardCharsets.UTF_8)) {
                writer.write(content);
                count++;
            }
            System.out.println("Wrote: " + filePath);
        } catch (IOException e) {
            System.err.println("Failed to write: " + filePath);
            e.printStackTrace();
        }
    }
}
