package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BathGenerator {

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
                generateBlockModelBottom(output, wood);
                generateBlockModelHead(output, wood);
                generateItemModel(output, wood);
            }
            System.out.println("✅ Bath JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "facing=east,type=bottom": { "model": "%MODID%:block/%WOOD%_bath_bottom", "y": 90 },
            "facing=east,type=head":   { "model": "%MODID%:block/%WOOD%_bath_head",   "y": 90 },

            "facing=north,type=bottom": { "model": "%MODID%:block/%WOOD%_bath_bottom" },
            "facing=north,type=head":   { "model": "%MODID%:block/%WOOD%_bath_head" },

            "facing=south,type=bottom": { "model": "%MODID%:block/%WOOD%_bath_bottom", "y": 180 },
            "facing=south,type=head":   { "model": "%MODID%:block/%WOOD%_bath_head",   "y": 180 },

            "facing=west,type=bottom":  { "model": "%MODID%:block/%WOOD%_bath_bottom", "y": 270 },
            "facing=west,type=head":    { "model": "%MODID%:block/%WOOD%_bath_head",   "y": 270 }
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_bath.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelBottom(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/bath_bottom",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_bath"
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_bath_bottom.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelHead(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/bath_head",
          "textures": {
            "particle": "%MODID%:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_bath"
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_bath_head.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:item/bath",
          "textures": {
            "texture": "%MODID%:block/%WOOD%_bath"
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_bath.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
