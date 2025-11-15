package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DrawerGenerator {

    private static final String MOD_ID = "furnituresoplenty";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    private static final String[] PARTS = {
            "drawer", "drawer_left", "drawer_middle", "drawer_right"
    };

    public static void main(String[] args) {
        Path output = Path.of("src/main/resources/");

        try {
            for (String wood : WOOD_TYPES) {
                generateBlockstate(output, wood);
                for (String part : PARTS) {
                    generateBlockModelClosed(output, wood, part);
                    generateBlockModelOpen(output, wood, part);
                }
                generateItemModel(output, wood);
            }
            System.out.println("✅ Drawer JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "facing=east,left=false,open=false,right=false": { "model": "%MODID%:block/%WOOD%_drawer_closed", "y": 90 },
            "facing=east,left=false,open=false,right=true":  { "model": "%MODID%:block/%WOOD%_drawer_right_closed", "y": 90 },
            "facing=east,left=false,open=true,right=false":  { "model": "%MODID%:block/%WOOD%_drawer_open", "y": 90 },
            "facing=east,left=false,open=true,right=true":   { "model": "%MODID%:block/%WOOD%_drawer_right_open", "y": 90 },
            "facing=east,left=true,open=false,right=false":  { "model": "%MODID%:block/%WOOD%_drawer_left_closed", "y": 90 },
            "facing=east,left=true,open=false,right=true":   { "model": "%MODID%:block/%WOOD%_drawer_middle_closed", "y": 90 },
            "facing=east,left=true,open=true,right=false":   { "model": "%MODID%:block/%WOOD%_drawer_left_open", "y": 90 },
            "facing=east,left=true,open=true,right=true":    { "model": "%MODID%:block/%WOOD%_drawer_middle_open", "y": 90 },
            
            "facing=north,left=false,open=false,right=false": { "model": "%MODID%:block/%WOOD%_drawer_closed" },
            "facing=north,left=false,open=false,right=true":  { "model": "%MODID%:block/%WOOD%_drawer_right_closed" },
            "facing=north,left=false,open=true,right=false":  { "model": "%MODID%:block/%WOOD%_drawer_open" },
            "facing=north,left=false,open=true,right=true":   { "model": "%MODID%:block/%WOOD%_drawer_right_open" },
            "facing=north,left=true,open=false,right=false":  { "model": "%MODID%:block/%WOOD%_drawer_left_closed" },
            "facing=north,left=true,open=false,right=true":   { "model": "%MODID%:block/%WOOD%_drawer_middle_closed" },
            "facing=north,left=true,open=true,right=false":   { "model": "%MODID%:block/%WOOD%_drawer_left_open" },
            "facing=north,left=true,open=true,right=true":    { "model": "%MODID%:block/%WOOD%_drawer_middle_open" },
            
            "facing=south,left=false,open=false,right=false": { "model": "%MODID%:block/%WOOD%_drawer_closed", "y": 180 },
            "facing=south,left=false,open=false,right=true":  { "model": "%MODID%:block/%WOOD%_drawer_right_closed", "y": 180 },
            "facing=south,left=false,open=true,right=false":  { "model": "%MODID%:block/%WOOD%_drawer_open", "y": 180 },
            "facing=south,left=false,open=true,right=true":   { "model": "%MODID%:block/%WOOD%_drawer_right_open", "y": 180 },
            "facing=south,left=true,open=false,right=false":  { "model": "%MODID%:block/%WOOD%_drawer_left_closed", "y": 180 },
            "facing=south,left=true,open=false,right=true":   { "model": "%MODID%:block/%WOOD%_drawer_middle_closed", "y": 180 },
            "facing=south,left=true,open=true,right=false":   { "model": "%MODID%:block/%WOOD%_drawer_left_open", "y": 180 },
            "facing=south,left=true,open=true,right=true":    { "model": "%MODID%:block/%WOOD%_drawer_middle_open", "y": 180 },
            
            "facing=west,left=false,open=false,right=false":  { "model": "%MODID%:block/%WOOD%_drawer_closed", "y": 270 },
            "facing=west,left=false,open=false,right=true":   { "model": "%MODID%:block/%WOOD%_drawer_right_closed", "y": 270 },
            "facing=west,left=false,open=true,right=false":   { "model": "%MODID%:block/%WOOD%_drawer_open", "y": 270 },
            "facing=west,left=false,open=true,right=true":    { "model": "%MODID%:block/%WOOD%_drawer_right_open", "y": 270 },
            "facing=west,left=true,open=false,right=false":   { "model": "%MODID%:block/%WOOD%_drawer_left_closed", "y": 270 },
            "facing=west,left=true,open=false,right=true":    { "model": "%MODID%:block/%WOOD%_drawer_middle_closed", "y": 270 },
            "facing=west,left=true,open=true,right=false":    { "model": "%MODID%:block/%WOOD%_drawer_left_open", "y": 270 },
            "facing=west,left=true,open=true,right=true":     { "model": "%MODID%:block/%WOOD%_drawer_middle_open", "y": 270 }
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_drawer.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelClosed(Path output, String wood, String part) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%PART%_closed",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_drawer"
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood)
           .replace("%PART%", part);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_" + part + "_closed.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModelOpen(Path output, String wood, String part) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%PART%_open",
          "textures": {
            "particle": "%MODID%:block/%WOOD%_particle",
            "texture": "%MODID%:block/%WOOD%_drawer"
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood)
           .replace("%PART%", part);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_" + part + "_open.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_drawer_closed"
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_drawer.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
