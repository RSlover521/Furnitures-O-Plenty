package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StorageCabinetGenerator {

    private static final String MOD_ID = "furnituresoplenty";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    private static final String[] CABINET_TYPES = {
            "open_hinge_right", "open_hinge_left", "closed_hinge_right", "closed_hinge_left"
    };

    public static void main(String[] args) {
        Path output = Path.of("src/main/resources/");

        try {
            for (String wood : WOOD_TYPES) {
                generateBlockstate(output, wood);
                generateBlockModels(output, wood);
                generateItemModel(output, wood);
            }
            System.out.println("✅ Storage Cabinet JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "facing=east,hinge=left,open=false":  { "model": "%MODID%:block/%WOOD%_cabinet_closed_hinge_left", "y": 90 },
            "facing=east,hinge=left,open=true":   { "model": "%MODID%:block/%WOOD%_cabinet_open_hinge_left", "y": 90 },
            "facing=east,hinge=right,open=false": { "model": "%MODID%:block/%WOOD%_cabinet_closed_hinge_right", "y": 90 },
            "facing=east,hinge=right,open=true":  { "model": "%MODID%:block/%WOOD%_cabinet_open_hinge_right", "y": 90 },
            "facing=north,hinge=left,open=false":  { "model": "%MODID%:block/%WOOD%_cabinet_closed_hinge_left" },
            "facing=north,hinge=left,open=true":   { "model": "%MODID%:block/%WOOD%_cabinet_open_hinge_left" },
            "facing=north,hinge=right,open=false": { "model": "%MODID%:block/%WOOD%_cabinet_closed_hinge_right" },
            "facing=north,hinge=right,open=true":  { "model": "%MODID%:block/%WOOD%_cabinet_open_hinge_right" },
            "facing=south,hinge=left,open=false":  { "model": "%MODID%:block/%WOOD%_cabinet_closed_hinge_left", "y": 180 },
            "facing=south,hinge=left,open=true":   { "model": "%MODID%:block/%WOOD%_cabinet_open_hinge_left", "y": 180 },
            "facing=south,hinge=right,open=false": { "model": "%MODID%:block/%WOOD%_cabinet_closed_hinge_right", "y": 180 },
            "facing=south,hinge=right,open=true":  { "model": "%MODID%:block/%WOOD%_cabinet_open_hinge_right", "y": 180 },
            "facing=west,hinge=left,open=false":  { "model": "%MODID%:block/%WOOD%_cabinet_closed_hinge_left", "y": 270 },
            "facing=west,hinge=left,open=true":   { "model": "%MODID%:block/%WOOD%_cabinet_open_hinge_left", "y": 270 },
            "facing=west,hinge=right,open=false": { "model": "%MODID%:block/%WOOD%_cabinet_closed_hinge_right", "y": 270 },
            "facing=west,hinge=right,open=true":  { "model": "%MODID%:block/%WOOD%_cabinet_open_hinge_right", "y": 270 }
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_storage_cabinet.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModels(Path output, String wood) throws IOException {
        for (String type : CABINET_TYPES) {
            String json = """
            {
              "parent": "%MODID%:block/cabinet_%TYPE%",
              "textures": {
                "particle": "biomesoplenty:block/%WOOD%_planks",
                "texture": "%MODID%:block/%WOOD%_storage_cabinet"
              }
            }
            """.replace("%MODID%", MOD_ID)
               .replace("%WOOD%", wood)
               .replace("%TYPE%", type);

            Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_cabinet_" + type + ".json");
            Files.createDirectories(path.getParent());
            Files.writeString(path, json);
        }
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        // Use open_hinge_right as the default item model
        String json = """
        {
            "parent": "furnituresoplenty:block/%WOOD%_cabinet_closed_hinge_left"
        }
        """.replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_storage_cabinet.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
