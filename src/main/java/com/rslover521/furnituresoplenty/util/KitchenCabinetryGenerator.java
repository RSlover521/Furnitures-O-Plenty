package com.rslover521.furnituresoplenty.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class KitchenCabinetryGenerator {

    private static final String MOD_ID = "furnituresoplenty";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    private static final String[] SHAPES = {
            "default", "inside_corner_left", "inside_corner_right", "outside_corner_left", "outside_corner_right"
    };

    public static void main(String[] args) {
        Path output = Path.of("src/main/resources/");

        try {
            for (String wood : WOOD_TYPES) {
                generateBlockstate(output, wood);
                for (String shape : SHAPES) {
                    generateBlockModel(output, wood, shape);
                }
                generateItemModel(output, wood);
            }
            System.out.println("✅ Kitchen cabinetry JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "facing=north,shape=default": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_default" },
            "facing=north,shape=inside_corner_left": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_inside_corner_left" },
            "facing=north,shape=inside_corner_right": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_inside_corner_right" },
            "facing=north,shape=outside_corner_left": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_outside_corner_left" },
            "facing=north,shape=outside_corner_right": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_outside_corner_right" },

            "facing=east,shape=default": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_default", "y": 90 },
            "facing=east,shape=inside_corner_left": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_inside_corner_left", "y": 90 },
            "facing=east,shape=inside_corner_right": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_inside_corner_right", "y": 90 },
            "facing=east,shape=outside_corner_left": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_outside_corner_left", "y": 90 },
            "facing=east,shape=outside_corner_right": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_outside_corner_right", "y": 90 },

            "facing=south,shape=default": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_default", "y": 180 },
            "facing=south,shape=inside_corner_left": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_inside_corner_left", "y": 180 },
            "facing=south,shape=inside_corner_right": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_inside_corner_right", "y": 180 },
            "facing=south,shape=outside_corner_left": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_outside_corner_left", "y": 180 },
            "facing=south,shape=outside_corner_right": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_outside_corner_right", "y": 180 },

            "facing=west,shape=default": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_default", "y": 270 },
            "facing=west,shape=inside_corner_left": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_inside_corner_left", "y": 270 },
            "facing=west,shape=inside_corner_right": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_inside_corner_right", "y": 270 },
            "facing=west,shape=outside_corner_left": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_outside_corner_left", "y": 270 },
            "facing=west,shape=outside_corner_right": { "model": "%MODID%:block/%WOOD%_kitchen_cabinetry_outside_corner_right", "y": 270 }
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_kitchen_cabinetry.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModel(Path output, String wood, String shape) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/kitchen_cabinetry_%SHAPE%",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_kitchen_cabinetry"
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood)
           .replace("%SHAPE%", shape);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_kitchen_cabinetry_" + shape + ".json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_kitchen_cabinetry_default"
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_kitchen_cabinetry.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
