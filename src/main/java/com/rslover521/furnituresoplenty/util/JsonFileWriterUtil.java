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

    public static void main(String[] args) {
        for (String wood : WOOD_TYPES) {
            generateBlockModel(wood);
            generateItemModel(wood);
        }
        System.out.println("Finished generating JSON files for all wood types!");
    }

    private static void generateBlockstate(String wood) {
        String json = """
        {
          "variants": {
            "facing=north": { "model": "furnituresoplenty:block/%s_chair", "y": 0 },
            "facing=east":  { "model": "furnituresoplenty:block/%s_chair", "y": 90 },
            "facing=south": { "model": "furnituresoplenty:block/%s_chair", "y": 180 },
            "facing=west":  { "model": "furnituresoplenty:block/%s_chair", "y": 270 }
          }
        }
        """.formatted(wood, wood, wood, wood);
        write(BASE_PATH + "blockstates/" + wood + "_chair.json", json);
    }

    private static void generateBlockModel(String wood) {
        String json = """
        {
          "parent": "refurbished_furniture:block/chair",
          "textures": {
            "particle": "biomesoplenty:block/%s_planks",
            "texture": "furnituresoplenty:block/%s_chair"
          }
        }
        """.formatted(wood, wood);
        write(BASE_PATH + "models/block/" + wood + "_chair.json", json);
    }

    private static void generateItemModel(String wood) {
        String json = """
        {
          "parent": "furnituresoplenty:block/%s_chair"
        }
        """.formatted(wood);
        write(BASE_PATH + "models/item/" + wood + "_chair.json", json);
    }

    private static void write(String filePath, String content) {
        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();
            try (FileWriter writer = new FileWriter(file, StandardCharsets.UTF_8)) {
                writer.write(content);
            }
            System.out.println("Wrote: " + filePath);
        } catch (IOException e) {
            System.err.println("Failed to write: " + filePath);
            e.printStackTrace();
        }
    }
}
