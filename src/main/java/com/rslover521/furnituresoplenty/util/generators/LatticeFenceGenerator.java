package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LatticeFenceGenerator {

    private static final String MOD_ID = "furnituresoplenty";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    public static void main(String[] args) {
        Path output = Path.of("src/main/resources/");

        try {
            for (String wood : WOOD_TYPES) {
                generateBlockstate(output, wood);
                generateBlockModelCenter(output, wood);
                generateBlockModelConnection(output, wood);
                generateItemModel(output, wood);
            }
            System.out.println("✅ Lattice fence JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "multipart": [
            {
              "apply": {
                "model": "%MODID%:block/%WOOD%_lattice_fence_center"
              }
            },
            {
              "when": { "north": "true" },
              "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_connection", "y": 180 }
            },
            {
              "when": { "east": "true" },
              "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_connection", "y": 270 }
            },
            {
              "when": { "south": "true" },
              "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_connection" }
            },
            {
              "when": { "west": "true" },
              "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_connection", "y": 90 }
            }
          ]
        }
        """
        .replace("%MODID%", MOD_ID)
        .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_lattice_fence.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelCenter(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/lattice_fence_center",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_lattice_fence"
          }
        }
        """
        .replace("%MODID%", MOD_ID)
        .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_lattice_fence_center.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelConnection(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/lattice_fence_connection",
          "textures": {
            "particle": "%MODID%:block/%WOOD%_particle",
            "texture": "%MODID%:block/%WOOD%_lattice_fence"
          }
        }
        """
        .replace("%MODID%", MOD_ID)
        .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_lattice_fence_connection.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_lattice_fence"
        }
        """
        .replace("%MODID%", MOD_ID)
        .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_lattice_fence.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
