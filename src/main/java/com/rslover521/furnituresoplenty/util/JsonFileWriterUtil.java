package com.rslover521.furnituresoplenty.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JsonFileWriterUtil {

    private static final String[] WOOD_TYPES = {
        "maple", "fir", "mahogany", "jacaranda",
        "palm", "willow", "dead", "magic", "umbran",
        "hellbark", "empyreal", "pine", "redwood"
    };

    private static final String BASE_PATH = "src/main/resources/assets/furnituresoplenty/";

    private static int count;

    public static void main(String[] args) {
        for (String wood : WOOD_TYPES) {
            generateAll(wood, "table");
        }
        System.out.println("Finished generating JSON files for all wood types! Wrote " + count + " files.");
    }

    public static void generateAll(String woodType, String registerType) {
        generateBlockstate(woodType, registerType);
        generateBlockModel(woodType, registerType);
        generateItemModel(woodType, registerType);
    }

    private static void generateBlockstate(String wood, String type) {
        String json = """
        {
          "variants": {
            "": { "model": "furnituresoplenty:block/%1$s_%2$s" }
          }
        }
        """.formatted(wood, type);
        write(BASE_PATH + "blockstates/" + wood + "_" + type + ".json", json);
    }

    private static void generateBlockModel(String wood, String type) {
        // Only special-case the "table" model (for now)
    	// Full Blockbench-exported model for "table", but we add a textures map that points "texture" -> our file.
        String json = """
        {
          "credit": "Model by MrCrayfish (https://twitter.com/MrCrayfish) using Blockbench. All Rights Reserved.",
          "textures": {
            "texture": "furnituresoplenty:block/%1$s_table",
            "particle": "biomesoplenty:block/%1$s_planks"
          },
          "elements": [
            {
              "from": [0, 0, 0],
              "to": [2, 14, 2],
              "faces": {
                "north": {"uv": [12.75, 0, 13, 3.5], "texture": "#texture"},
                "east": {"uv": [13, 0, 13.25, 3.5], "texture": "#texture"},
                "south": {"uv": [13.25, 0, 13.5, 3.5], "texture": "#texture"},
                "west": {"uv": [13.5, 0, 13.75, 3.5], "texture": "#texture"},
                "down": {"uv": [16, 3, 15.75, 3.5], "texture": "#texture"}
              }
            },
            {
              "from": [2, 12, 1],
              "to": [14, 14, 1],
              "faces": {
                "north": {"uv": [12.5, 4, 14, 4.5], "texture": "#texture"},
                "south": {"uv": [12.5, 4, 14, 4.5], "texture": "#texture"}
              }
            },
            {
              "from": [14, 0, 0],
              "to": [16, 14, 2],
              "faces": {
                "north": {"uv": [13.5, 0, 13.75, 3.5], "texture": "#texture"},
                "east": {"uv": [12.75, 0, 13, 3.5], "texture": "#texture"},
                "south": {"uv": [13, 0, 13.25, 3.5], "texture": "#texture"},
                "west": {"uv": [13.25, 0, 13.5, 3.5], "texture": "#texture"},
                "down": {"uv": [16, 3, 15.75, 3.5], "rotation": 270, "texture": "#texture"}
              }
            },
            {
              "from": [15, 12, 2],
              "to": [15, 14, 14],
              "faces": {
                "east": {"uv": [12.5, 4, 14, 4.5], "texture": "#texture"},
                "west": {"uv": [12.5, 4, 14, 4.5], "texture": "#texture"}
              }
            },
            {
              "from": [14, 0, 14],
              "to": [16, 14, 16],
              "faces": {
                "north": {"uv": [13.25, 0, 13.5, 3.5], "texture": "#texture"},
                "east": {"uv": [13.5, 0, 13.75, 3.5], "texture": "#texture"},
                "south": {"uv": [12.75, 0, 13, 3.5], "texture": "#texture"},
                "west": {"uv": [13, 0, 13.25, 3.5], "texture": "#texture"},
                "down": {"uv": [16, 3, 15.75, 3.5], "rotation": 180, "texture": "#texture"}
              }
            },
            {
              "from": [2, 12, 15],
              "to": [14, 14, 15],
              "faces": {
                "north": {"uv": [12.5, 4, 14, 4.5], "texture": "#texture"},
                "south": {"uv": [12.5, 4, 14, 4.5], "texture": "#texture"}
              }
            },
            {
              "from": [0, 0, 14],
              "to": [2, 14, 16],
              "faces": {
                "north": {"uv": [13, 0, 13.25, 3.5], "texture": "#texture"},
                "east": {"uv": [13.25, 0, 13.5, 3.5], "texture": "#texture"},
                "south": {"uv": [13.5, 0, 13.75, 3.5], "texture": "#texture"},
                "west": {"uv": [12.75, 0, 13, 3.5], "texture": "#texture"},
                "down": {"uv": [16, 3, 15.75, 3.5], "rotation": 90, "texture": "#texture"}
              }
            },
            {
              "from": [1, 12, 2],
              "to": [1, 14, 14],
              "faces": {
                "east": {"uv": [12.5, 4, 14, 4.5], "texture": "#texture"},
                "west": {"uv": [12.5, 4, 14, 4.5], "texture": "#texture"}
              }
            },
            {
              "from": [-1, 14, -1],
              "to": [17, 15.99, 17],
              "faces": {
                "north": {"uv": [13.75, 0, 16, 0.5], "texture": "#texture"},
                "east": {"uv": [13.75, 0.5, 16, 1], "texture": "#texture"},
                "south": {"uv": [13.75, 1, 16, 1.5], "texture": "#texture"},
                "west": {"uv": [13.75, 1.5, 16, 2], "texture": "#texture"},
                "up": {"uv": [0, 0, 2.25, 4.5], "texture": "#texture"},
                "down": {"uv": [2.25, 0, 0, 4.5], "texture": "#texture"}
              }
            }
          ],
          "display": {
            "thirdperson_righthand": {
              "rotation": [75, 315, 0],
              "translation": [0, 2.5, 0],
              "scale": [0.375, 0.375, 0.375]
            },
            "thirdperson_lefthand": {
              "rotation": [75, -45, 0],
              "translation": [0, 2.5, 0],
              "scale": [0.375, 0.375, 0.375]
            },
            "firstperson_righthand": {
              "rotation": [0, 315, 0],
              "translation": [0, 2, 0],
              "scale": [0.4, 0.4, 0.4]
            },
            "firstperson_lefthand": {
              "rotation": [0, -45, 0],
              "scale": [0.4, 0.4, 0.4]
            },
            "ground": {
              "translation": [0, 3, 0],
              "scale": [0.25, 0.25, 0.25]
            },
            "gui": {
              "rotation": [30, 45, 0],
              "translation": [0, -0.35, 0],
              "scale": [0.55, 0.55, 0.55]
            },
            "head": {
              "rotation": [0, 180, 0],
              "translation": [0, 8, 0]
            },
            "fixed": {
              "rotation": [0, 180, 0],
              "translation": [0, -2, -5.5]
            }
          }
        }
        """.formatted(wood);
        write(BASE_PATH + "models/block/" + wood + "_" + type + ".json", json);
        
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
