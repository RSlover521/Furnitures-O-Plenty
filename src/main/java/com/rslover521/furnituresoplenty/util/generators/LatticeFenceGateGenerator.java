package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LatticeFenceGateGenerator {

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
                generateBlockModelClosed(output, wood);
                generateBlockModelOpen(output, wood);
                generateItemModel(output, wood);
            }
            System.out.println("✅ Lattice fence gate JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "multipart": [
            { "when": { "facing": "north", "open": "false" }, "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_gate_closed" } },
            { "when": { "facing": "east", "open": "false" },  "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_gate_closed", "y": 90 } },
            { "when": { "facing": "south", "open": "false" }, "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_gate_closed", "y": 180 } },
            { "when": { "facing": "west", "open": "false" },  "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_gate_closed", "y": 270 } },

            { "when": { "facing": "north", "open": "true" },  "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_gate_open" } },
            { "when": { "facing": "east", "open": "true" },   "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_gate_open", "y": 90 } },
            { "when": { "facing": "south", "open": "true" },  "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_gate_open", "y": 180 } },
            { "when": { "facing": "west", "open": "true" },   "apply": { "model": "%MODID%:block/%WOOD%_lattice_fence_gate_open", "y": 270 } }
          ]
        }
        """
        .replace("%MODID%", MOD_ID)
        .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_lattice_fence_gate.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelClosed(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/lattice_fence_gate_closed",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_lattice_fence_gate"
          }
        }
        """
        .replace("%MODID%", MOD_ID)
        .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_lattice_fence_gate_closed.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelOpen(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/lattice_fence_gate_open",
          "textures": {
            "particle": "%MODID%:block/%WOOD%_particle",
            "texture": "%MODID%:block/%WOOD%_lattice_fence_gate"
          }
        }
        """
        .replace("%MODID%", MOD_ID)
        .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_lattice_fence_gate_open.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/lattice_fence_gate_closed",
          "textures": {
            "particle": "%MODID%:block/%WOOD%_particle",
            "texture": "%MODID%:block/%WOOD%_lattice_fence_gate"
          }
        }
        """
        .replace("%MODID%", MOD_ID)
        .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_lattice_fence_gate.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
