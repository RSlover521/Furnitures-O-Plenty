package com.rslover521.furnituresoplenty.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeskGenerator {

    private static final String MOD_ID = "furnituresoplenty";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    private static final String[] DESK_MODELS = {"", "_left", "_right", "_middle"};

    public static void main(String[] args) {
        Path output = Path.of("src/main/resources"); // generated JSONs will be placed here

        try {
            for (String wood : WOOD_TYPES) {
                generateBlockstate(output, wood);
                for (String suffix : DESK_MODELS) {
                    generateBlockModel(output, wood, suffix);
                }
                generateItemModel(output, wood);
            }
            System.out.println("✅ Desk JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "facing=east,left=false,right=false": {"model": "%MODID%:block/%WOOD%_desk","y":90},
            "facing=east,left=false,right=true":  {"model": "%MODID%:block/%WOOD%_desk_right","y":90},
            "facing=east,left=true,right=false":  {"model": "%MODID%:block/%WOOD%_desk_left","y":90},
            "facing=east,left=true,right=true":   {"model": "%MODID%:block/%WOOD%_desk_middle","y":90},
            "facing=north,left=false,right=false":{"model": "%MODID%:block/%WOOD%_desk"},
            "facing=north,left=false,right=true": {"model": "%MODID%:block/%WOOD%_desk_right"},
            "facing=north,left=true,right=false": {"model": "%MODID%:block/%WOOD%_desk_left"},
            "facing=north,left=true,right=true":  {"model": "%MODID%:block/%WOOD%_desk_middle"},
            "facing=south,left=false,right=false":{"model": "%MODID%:block/%WOOD%_desk","y":180},
            "facing=south,left=false,right=true": {"model": "%MODID%:block/%WOOD%_desk_right","y":180},
            "facing=south,left=true,right=false": {"model": "%MODID%:block/%WOOD%_desk_left","y":180},
            "facing=south,left=true,right=true":  {"model": "%MODID%:block/%WOOD%_desk_middle","y":180},
            "facing=west,left=false,right=false": {"model": "%MODID%:block/%WOOD%_desk","y":270},
            "facing=west,left=false,right=true":  {"model": "%MODID%:block/%WOOD%_desk_right","y":270},
            "facing=west,left=true,right=false":  {"model": "%MODID%:block/%WOOD%_desk_left","y":270},
            "facing=west,left=true,right=true":   {"model": "%MODID%:block/%WOOD%_desk_middle","y":270}
          }
        }
        """.replace("%MODID%", MOD_ID)
         .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_desk.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModel(Path output, String wood, String suffix) throws IOException {
        String baseModel = suffix.isEmpty() ? "desk" : "desk" + suffix;
        String json = """
        {
          "parent": "%MODID%:block/%BASE%",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_desk"
          }
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood)
          .replace("%BASE%", baseModel);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_desk" + suffix + ".json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_desk"
        }
        """.replace("%MODID%", MOD_ID)
         .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_desk.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
