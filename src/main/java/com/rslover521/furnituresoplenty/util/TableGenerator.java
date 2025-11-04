package com.rslover521.furnituresoplenty.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TableGenerator {

    private static final String MODID = "furnituresoplenty";

    private static int count = 0;

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    // Furniture type
    private static final String FURNITURE = "table";

    private static final File BLOCKSTATE_DIR =
            new File("src/main/resources/assets/" + MODID + "/blockstates");
    private static final File BLOCK_MODEL_DIR =
            new File("src/main/resources/assets/" + MODID + "/models/block");
    private static final File ITEM_MODEL_DIR =
            new File("src/main/resources/assets/" + MODID + "/models/item");

    // All 16 combinations in Refurbished naming style
    private static final String[] VARIANT_NAMES = {
            "", "west", "south", "south_west", "north", "west_north",
            "north_south", "south_west_north", "east", "east_west",
            "east_south", "east_south_west", "north_east", "west_north_east",
            "north_east_south", "north_east_south_west"
    };

    public static void main(String[] args) {
        BLOCKSTATE_DIR.mkdirs();
        BLOCK_MODEL_DIR.mkdirs();
        ITEM_MODEL_DIR.mkdirs();

        for (String wood : WOOD_TYPES) {
            generateTable(wood);
        }

        System.out.println("✅ All table JSONs for Furniture-O-Plenty generated! " + count + " files wrote!");
    }

    private static void generateTable(String wood) {
        String baseName = wood + "_" + FURNITURE;

        for (int i = 0; i < 16; i++) {
            String variantSuffix = VARIANT_NAMES[i].isEmpty() ? "" : "_" + VARIANT_NAMES[i];
            String modelName = baseName + variantSuffix;
            generateBlockModel(modelName, wood, VARIANT_NAMES[i]);
        }

        generateBlockstate(baseName);

        generateItemModel(baseName);
    }

    private static void generateBlockstate(String baseName) {
        String[] directions = {"east", "north", "south", "west"};
        StringBuilder json = new StringBuilder("{\n  \"variants\": {\n");

        for (int i = 0; i < 16; i++) {
            StringBuilder props = new StringBuilder();
            for (int d = 0; d < 4; d++) {
                if (props.length() > 0) props.append(",");
                props.append(directions[d]).append("=").append((i & (1 << d)) != 0);
            }

            String variantSuffix = VARIANT_NAMES[i].isEmpty() ? "" : "_" + VARIANT_NAMES[i];
            json.append("    \"").append(props).append("\": { \"model\": \"")
                    .append(MODID).append(":block/").append(baseName).append(variantSuffix).append("\" }");
            if (i < 15) json.append(",");
            json.append("\n");
        }

        json.append("  }\n}");
        write(new File(BLOCKSTATE_DIR, baseName + ".json"), json.toString());
    }

    private static void generateBlockModel(String name, String wood, String variant) {
        String parentName = variant.isEmpty() ? FURNITURE : FURNITURE + "_" + variant;
        String json = """
                {
                  "parent": "refurbished_furniture:block/%1$s",
                  "textures": {
                    "particle": "biomesoplenty:block/%2$s_planks",
                    "texture": "furnituresoplenty:block/%2$s_table"
                  }
                }
                """.formatted(parentName, wood);
        write(new File(BLOCK_MODEL_DIR, name + ".json"), json);
    }

    private static void generateItemModel(String baseName) {
        String json = """
                {
                  "parent": "furnituresoplenty:block/%1$s"
                }
                """.formatted(baseName);
        write(new File(ITEM_MODEL_DIR, baseName + ".json"), json);
    }

    private static void write(File file, String content) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Generated: " + file.getPath());
            count ++;
        } catch (IOException e) {
            System.err.println("Error writing: " + file.getPath());
            e.printStackTrace();
        }
    }
}
