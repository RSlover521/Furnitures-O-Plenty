package com.rslover521.furnituresoplenty.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MailBoxGenerator {

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
                generateBlockModel(output, wood, false); // normal
                generateBlockModel(output, wood, true);  // unchecked
                generateItemModel(output, wood);
            }
            System.out.println("✅ Mailbox JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood) throws IOException {
        String json = """
        {
          "variants": {
            "enabled=false,facing=east": {"model":"%MODID%:block/%WOOD%_mail_box","y":90},
            "enabled=false,facing=north": {"model":"%MODID%:block/%WOOD%_mail_box"},
            "enabled=false,facing=south": {"model":"%MODID%:block/%WOOD%_mail_box","y":180},
            "enabled=false,facing=west": {"model":"%MODID%:block/%WOOD%_mail_box","y":270},
            "enabled=true,facing=east": {"model":"%MODID%:block/%WOOD%_mail_box_unchecked","y":90},
            "enabled=true,facing=north": {"model":"%MODID%:block/%WOOD%_mail_box_unchecked"},
            "enabled=true,facing=south": {"model":"%MODID%:block/%WOOD%_mail_box_unchecked","y":180},
            "enabled=true,facing=west": {"model":"%MODID%:block/%WOOD%_mail_box_unchecked","y":270}
          }
        }
        """.replace("%MODID%", MOD_ID)
         .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_mail_box.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModel(Path output, String wood, boolean unchecked) throws IOException {
        String suffix = unchecked ? "_unchecked" : "";
        String json = """
        {
          "parent": "%MODID%:block/mail_box%suffix%",
          "textures": {
            "particle": "biomesoplenty:block/%WOOD%_planks",
            "texture": "%MODID%:block/%WOOD%_mail_box"
          }
        }
        """
        .replace("%MODID%", MOD_ID)
        .replace("%WOOD%", wood)
        .replace("%suffix%", suffix);

        String filename = wood + "_mail_box" + suffix + ".json";
        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + filename);
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_mail_box"
        }
        """.replace("%MODID%", MOD_ID)
          .replace("%WOOD%", wood);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_mail_box.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
