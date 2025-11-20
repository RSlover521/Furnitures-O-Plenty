package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StorageJarGenerator {

    private static final String MOD_ID = "furnituresoplenty";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    public static void main(String[] args) {
        Path output = Path.of("src/main/resources"); // generated JSONs will be placed here

        try {
            for (String wood : WOOD_TYPES) {
                generateBlockstate(output, wood);
                generateBlockModel(output, wood);
                generateItemModel(output, wood);
            }
            System.out.println("✅ Storage jar JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "facing=east": {"model": "%MODID%:block/%WOOD%_storage_jar","y":90},
            "facing=north": {"model": "%MODID%:block/%WOOD%_storage_jar"},
            "facing=south": {"model": "%MODID%:block/%WOOD%_storage_jar","y":180},
            "facing=west": {"model": "%MODID%:block/%WOOD%_storage_jar","y":270}
          }
        }
        """.replace("%MODID%", MOD_ID)
         .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_storage_jar.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/storage_jar",
          "textures": {
            "particle": "minecraft:block/glass",
            "texture": "%MODID%:block/%WOOD%_storage_jar"
          }
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_storage_jar.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_storage_jar"
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_storage_jar.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
