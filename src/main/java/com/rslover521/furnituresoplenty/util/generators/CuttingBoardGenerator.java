package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CuttingBoardGenerator {

    private static final String MOD_ID = "furnituresoplenty";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    public static void main(String[] args) {
        Path output = Path.of("src/main/resources"); // generated JSONs will go here

        try {
            for (String wood : WOOD_TYPES) {
                generateBlockstate(output, wood);
                generateBlockModel(output, wood);
                generateItemModel(output, wood);
            }
            System.out.println("✅ Cutting board JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "facing=east": {"model": "%MODID%:block/%WOOD%_cutting_board","y":90},
            "facing=north": {"model": "%MODID%:block/%WOOD%_cutting_board"},
            "facing=south": {"model": "%MODID%:block/%WOOD%_cutting_board","y":180},
            "facing=west": {"model": "%MODID%:block/%WOOD%_cutting_board","y":270}
          }
        }
        """.replace("%MODID%", MOD_ID)
         .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_cutting_board.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/cutting_board",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_cutting_board"
          }
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_cutting_board.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_cutting_board"
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_cutting_board.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
