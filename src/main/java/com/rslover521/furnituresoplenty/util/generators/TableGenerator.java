package com.rslover521.furnituresoplenty.util.generators;

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

    private static final String FURNITURE = "table";
    private static final String[] DIRS = { "east", "north", "south", "west" };

    private static final File BLOCKSTATE_DIR =
        new File("src/main/resources/assets/" + MODID + "/blockstates");
    private static final File BLOCK_MODEL_DIR =
        new File("src/main/resources/assets/" + MODID + "/models/block");
    private static final File ITEM_MODEL_DIR =
        new File("src/main/resources/assets/" + MODID + "/models/item");

    public static void main(String[] args) {
        BLOCKSTATE_DIR.mkdirs();
        BLOCK_MODEL_DIR.mkdirs();
        ITEM_MODEL_DIR.mkdirs();

        for (String wood : WOOD_TYPES) {
            generateTable(wood);
        }

        System.out.println("Done! Generated " + count + " files.");
    }

    private static void generateTable(String wood) {
        String baseName = wood + "_" + FURNITURE;

        // Generate 16 block models
        for (int mask = 0; mask < 16; mask++) {
            String suffix = getVariantSuffix(mask);
            String modelName = suffix.isEmpty() ? baseName : baseName + "_" + suffix;
            generateBlockModel(modelName, wood, suffix);
        }

        generateBlockstate(baseName);
        generateItemModel(baseName);
    }

    private static void generateBlockstate(String baseName) {
        StringBuilder json = new StringBuilder("{\n  \"variants\": {\n");

        for (int mask = 0; mask < 16; mask++) {
            StringBuilder props = new StringBuilder();

            for (int i = 0; i < DIRS.length; i++) {
                if (props.length() > 0) props.append(",");
                props.append(DIRS[i]).append("=")
                    .append((mask & (1 << i)) != 0);
            }

            String suffix = getVariantSuffix(mask);
            String modelName = suffix.isEmpty() ? baseName : baseName + "_" + suffix;

            json.append("    \"")
                .append(props)
                .append("\": { \"model\": \"")
                .append(MODID)
                .append(":block/")
                .append(modelName)
                .append("\" }");

            if (mask < 15) json.append(",");
            json.append("\n");
        }

        json.append("  }\n}");
        write(new File(BLOCKSTATE_DIR, baseName + ".json"), json.toString());
    }

    private static void generateBlockModel(String name, String wood, String variant) {
        String parent = variant.isEmpty()
            ? FURNITURE
            : FURNITURE + "_" + variant;

        String json = """
                {
                  "parent": "refurbished_furniture:block/%1$s",
                  "textures": {
                    "particle": "biomesoplenty:block/%2$s_planks",
                    "texture": "furnituresoplenty:block/%2$s_table"
                  }
                }
                """.formatted(parent, wood);

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

    private static String getVariantSuffix(int mask) {
        StringBuilder suffix = new StringBuilder();

        for (int i = 0; i < DIRS.length; i++) {
            if ((mask & (1 << i)) != 0) {
                if (!suffix.isEmpty()) suffix.append("_");
                suffix.append(DIRS[i]);
            }
        }

        return suffix.toString();
    }

    private static void write(File file, String content) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            count++;
            System.out.println("Generated: " + file.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
