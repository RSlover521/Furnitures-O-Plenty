package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class KitchenDrawerGenerator {

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
                generateBlockModelOpen(output, wood);
                generateBlockModelClosed(output, wood);
                generateItemModel(output, wood);
            }
            System.out.println("✅ Kitchen drawer JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "facing=east,open=false": { "model": "%MODID%:block/%WOOD%_kitchen_drawer_closed", "y": 90 },
            "facing=east,open=true":  { "model": "%MODID%:block/%WOOD%_kitchen_drawer_open", "y": 90 },
            "facing=north,open=false": { "model": "%MODID%:block/%WOOD%_kitchen_drawer_closed" },
            "facing=north,open=true":  { "model": "%MODID%:block/%WOOD%_kitchen_drawer_open" },
            "facing=south,open=false": { "model": "%MODID%:block/%WOOD%_kitchen_drawer_closed", "y": 180 },
            "facing=south,open=true":  { "model": "%MODID%:block/%WOOD%_kitchen_drawer_open", "y": 180 },
            "facing=west,open=false":  { "model": "%MODID%:block/%WOOD%_kitchen_drawer_closed", "y": 270 },
            "facing=west,open=true":   { "model": "%MODID%:block/%WOOD%_kitchen_drawer_open", "y": 270 }
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_kitchen_drawer.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelOpen(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/kitchen_drawer_open",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_kitchen_drawer"
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_kitchen_drawer_open.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelClosed(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/kitchen_drawer_closed",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_kitchen_drawer"
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_kitchen_drawer_closed.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_kitchen_drawer_closed"
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_kitchen_drawer.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
