package com.rslover521.furnituresoplenty.util.generators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChairGenerator {

    private static final String OUTPUT_DIR = "src/main/resources/assets/furnituresoplenty";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    // Gson instance for pretty JSON formatting
    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .disableHtmlEscaping() // keep '=' instead of \u003d
            .create();

    public static void main(String[] args) {
        try {
            for (String wood : WOOD_TYPES) {
                generateBlockstate(wood);
                generateBlockModel(wood, false);
                generateBlockModel(wood, true);
                generateItemModel(wood);
            }
            System.out.println("✅ Chair blockstates and models generated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(String wood) throws IOException {
        String jsonContent = """
        {
          "variants": {
            "facing=east,tucked=false": {
              "model": "furnituresoplenty:block/%s_chair",
              "y": 90
            },
            "facing=east,tucked=true": {
              "model": "furnituresoplenty:block/%s_chair_tucked",
              "y": 90
            },
            "facing=north,tucked=false": {
              "model": "furnituresoplenty:block/%s_chair"
            },
            "facing=north,tucked=true": {
              "model": "furnituresoplenty:block/%s_chair_tucked"
            },
            "facing=south,tucked=false": {
              "model": "furnituresoplenty:block/%s_chair",
              "y": 180
            },
            "facing=south,tucked=true": {
              "model": "furnituresoplenty:block/%s_chair_tucked",
              "y": 180
            },
            "facing=west,tucked=false": {
              "model": "furnituresoplenty:block/%s_chair",
              "y": 270
            },
            "facing=west,tucked=true": {
              "model": "furnituresoplenty:block/%s_chair_tucked",
              "y": 270
            }
          }
        }
        """.formatted(wood, wood, wood, wood, wood, wood, wood, wood);

        writeJson(jsonContent, Path.of(OUTPUT_DIR, "blockstates", wood + "_chair.json"));
    }

    private static void generateBlockModel(String wood, boolean tucked) throws IOException {
        String parent = tucked ? "chair_tucked" : "chair";
        String fileName = wood + (tucked ? "_chair_tucked" : "_chair");

        String jsonContent = """
        {
          "parent": "refurbished_furniture:block/%s",
          "textures": {
            "particle": "biomesoplenty:block/%s_planks",
            "texture": "furnituresoplenty:block/%s_chair"
          }
        }
        """.formatted(parent, wood, wood);

        writeJson(jsonContent, Path.of(OUTPUT_DIR, "models", "block", fileName + ".json"));
    }

    private static void generateItemModel(String wood) throws IOException {
        String jsonContent = """
        {
          "parent": "furnituresoplenty:block/%s_chair"
        }
        """.formatted(wood);

        writeJson(jsonContent, Path.of(OUTPUT_DIR, "models", "item", wood + "_chair.json"));
    }

    private static void writeJson(String content, Path filePath) throws IOException {
        Files.createDirectories(filePath.getParent());
        JsonObject json = JsonParser.parseString(content).getAsJsonObject();
        try (FileWriter writer = new FileWriter(filePath.toFile())) {
            GSON.toJson(json, writer); // pretty print!
        }
    }
}
