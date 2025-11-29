package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CeilingFanGenerator {

    private static final String MOD_ID = "furnituresoplenty";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    private static final String[] FAN_TYPES = {"light", "dark"};
    private static final String[] POWER_STATES = {"off", "on"};

    public static void main(String[] args) {
        Path output = Path.of("src/main/resources/");

        try {
            for (String wood : WOOD_TYPES) {
                for (String type : FAN_TYPES) {
                    generateBlockstate(output, wood, type);
                    for (String state : POWER_STATES) {
                        generateBlockModel(output, wood, type, state);
                    }
                    generateItemModel(output, wood, type);
                }
            }
            System.out.println("✅ Ceiling fan JSONs generated for all wood types!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateBlockstate(Path output, String wood, String type) throws IOException {
        StringBuilder variants = new StringBuilder();
        boolean first = true;

        for (boolean lit : new boolean[]{false, true}) {
            for (boolean powered : new boolean[]{false, true}) {
                String state = (lit && powered) ? "on" : "off";

                String variant = String.format("\"lit=%s,powered=%s\": { \"model\": \"%s:block/%s_ceiling_fan_base_%s\" }",
                        lit, powered, MOD_ID, wood + "_" + type, state);

                if (!first) variants.append(",\n            ");
                variants.append(variant);
                first = false;
            }
        }

        String json = "{\n  \"variants\": {\n            " + variants + "\n  }\n}";

        Path path = output.resolve("assets/" + MOD_ID + "/blockstates/" + wood + "_" + type + "_ceiling_fan.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateBlockModel(Path output, String wood, String type, String state) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/ceiling_fan_base_%STATE%",
          "textures": {
            "particle": "%MODID%:block/%TYPE%_particle",
            "texture": "%MODID%:block/%WOOD%_%TYPE%_ceiling_fan"
          }
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood)
           .replace("%TYPE%", type)
           .replace("%STATE%", state);

        Path path = output.resolve("assets/" + MOD_ID + "/models/block/" + wood + "_" + type + "_ceiling_fan_base_" + state + ".json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }

    private static void generateItemModel(Path output, String wood, String type) throws IOException {
        String json = """
        {
          "parent": "%MODID%:block/%WOOD%_%TYPE%_ceiling_fan"
        }
        """.replace("%MODID%", MOD_ID)
           .replace("%WOOD%", wood)
           .replace("%TYPE%", type);

        Path path = output.resolve("assets/" + MOD_ID + "/models/item/" + wood + "_" + type + "_ceiling_fan.json");
        Files.createDirectories(path.getParent());
        Files.writeString(path, json);
    }
}
