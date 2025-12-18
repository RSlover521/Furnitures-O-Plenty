package com.rslover521.furnituresoplenty.util.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class TableGenerator {

    private static final String MODID = "furnituresoplenty";
    private static final String FURNITURE = "table";

    private static final String[] WOOD_TYPES = {
        "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
        "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    /*
     * Block BooleanProperty order (EXACT)
     * This MUST match the order used in the Block class.
     */
    private static final String[] BLOCK_PROPS = {
        "east", "north", "south", "west"
    };

    /*
     * Parent model naming order (CANONICAL)
     * This MUST match Refurbished Furniture parent filenames.
     */
    private static final String[] MODEL_ORDER = {
        "north", "east", "south", "west"
    };

    private static final File BLOCKSTATE_DIR =
        new File("src/main/resources/assets/" + MODID + "/blockstates");
    private static final File BLOCK_MODEL_DIR =
        new File("src/main/resources/assets/" + MODID + "/models/block");
    private static final File ITEM_MODEL_DIR =
        new File("src/main/resources/assets/" + MODID + "/models/item");

    private static int generatedFiles = 0;

    public static void main(String[] args) {
        BLOCKSTATE_DIR.mkdirs();
        BLOCK_MODEL_DIR.mkdirs();
        ITEM_MODEL_DIR.mkdirs();

        for (String wood : WOOD_TYPES) {
            generateForWood(wood);
        }

        System.out.println("Generation complete. Files written: " + generatedFiles);
    }

    /* ====================================================================== */
    /*  Generation                                                            */
    /* ====================================================================== */

    private static void generateForWood(String wood) {
        String baseName = wood + "_" + FURNITURE;

        for (int mask = 0; mask < 16; mask++) {
            String suffix = buildModelSuffix(mask);
            String modelName = suffix.isEmpty() ? baseName : baseName + "_" + suffix;
            writeBlockModel(modelName, wood, suffix);
        }

        writeBlockstate(baseName);
        writeItemModel(baseName);
    }

    /* ====================================================================== */
    /*  Blockstate                                                            */
    /* ====================================================================== */

    private static void writeBlockstate(String baseName) {
        StringBuilder json = new StringBuilder();
        json.append("{\n  \"variants\": {\n");

        for (int mask = 0; mask < 16; mask++) {
            String stateKey = buildBlockstateKey(mask);
            String suffix = buildModelSuffix(mask);
            String model = suffix.isEmpty() ? baseName : baseName + "_" + suffix;

            json.append("    \"")
                .append(stateKey)
                .append("\": { \"model\": \"")
                .append(MODID)
                .append(":block/")
                .append(model)
                .append("\" }");

            if (mask < 15) json.append(",");
            json.append("\n");
        }

        json.append("  }\n}");
        writeFile(new File(BLOCKSTATE_DIR, baseName + ".json"), json.toString());
    }

    private static String buildBlockstateKey(int mask) {
        StringBuilder key = new StringBuilder();

        for (int bit = 0; bit < BLOCK_PROPS.length; bit++) {
            if (bit > 0) key.append(",");
            key.append(BLOCK_PROPS[bit])
                .append("=")
                .append((mask & (1 << bit)) != 0);
        }

        return key.toString();
    }

    /* ====================================================================== */
    /*  Models                                                                */
    /* ====================================================================== */

    private static void writeBlockModel(String name, String wood, String suffix) {
        String parent = suffix.isEmpty()
            ? FURNITURE
            : FURNITURE + "_" + suffix;

        String json = """
            {
              "parent": "refurbished_furniture:block/%1$s",
              "textures": {
                "particle": "biomesoplenty:block/%2$s_planks",
                "texture": "furnituresoplenty:block/%2$s_table"
              }
            }
            """.formatted(parent, wood);

        writeFile(new File(BLOCK_MODEL_DIR, name + ".json"), json);
    }

    private static void writeItemModel(String baseName) {
        String json = """
            {
              "parent": "furnituresoplenty:block/%1$s"
            }
            """.formatted(baseName);

        writeFile(new File(ITEM_MODEL_DIR, baseName + ".json"), json);
    }

    /* ====================================================================== */
    /*  Suffix logic (CORE FIX)                                                */
    /* ====================================================================== */

    private static String buildModelSuffix(int mask) {
        Map<String, Boolean> connections = new LinkedHashMap<>();

        // Decode mask using BLOCK_PROPS order
        for (int bit = 0; bit < BLOCK_PROPS.length; bit++) {
            connections.put(
                BLOCK_PROPS[bit],
                (mask & (1 << bit)) != 0
            );
        }

        // Emit suffix in MODEL_ORDER
        StringBuilder suffix = new StringBuilder();
        for (String dir : MODEL_ORDER) {
            if (connections.get(dir)) {
                if (!suffix.isEmpty()) suffix.append("_");
                suffix.append(dir);
            }
        }

        return suffix.toString();
    }

    /* ====================================================================== */
    /*  IO                                                                    */
    /* ====================================================================== */

    private static void writeFile(File file, String content) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            generatedFiles++;
            System.out.println("Generated: " + file.getPath());
        } catch (IOException e) {
            throw new RuntimeException("Failed to write " + file, e);
        }
    }
}
