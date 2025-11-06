package com.rslover521.furnituresoplenty.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CrateGenerator {

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
            System.out.println("✅ Crate JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "open=false": { "model": "%MODID%:block/%WOOD%_crate_closed" },
            "open=true":  { "model": "%MODID%:block/%WOOD%_crate_open" }
          }
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_crate.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelClosed(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/crate_closed",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_crate"
          }
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_crate_closed.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelOpen(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/crate_open",
          "textures": {
            "particle": "%MODID%:block/%WOOD%_particle",
            "texture": "%MODID%:block/%WOOD%_crate"
          }
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_crate_open.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_crate_closed"
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_crate.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
