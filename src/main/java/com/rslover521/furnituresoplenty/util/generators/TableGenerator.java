package com.rslover521.furnituresoplenty.util.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TableGenerator {

    private static final String MODID = "furnituresoplenty";
    private static int count = 0;

    private static final String[] WOOD_TYPES = {
        "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
        "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    /* ------------------------------------------------------------------ */
    /* Bit layout:
       bit 0 = north
       bit 1 = east
       bit 2 = south
       bit 3 = west
    */
    private static final Map<Integer, String> SUFFIX_MAP = new HashMap<>();

    static {
        SUFFIX_MAP.put(0b0000, "");

        SUFFIX_MAP.put(0b0001, "north");
        SUFFIX_MAP.put(0b0010, "east");
        SUFFIX_MAP.put(0b0100, "south");
        SUFFIX_MAP.put(0b1000, "west");

        SUFFIX_MAP.put(0b1010, "east_west");
        SUFFIX_MAP.put(0b0101, "north_south");

        SUFFIX_MAP.put(0b0011, "north_east");
        SUFFIX_MAP.put(0b0111, "north_east_south");
        SUFFIX_MAP.put(0b1111, "north_east_south_west");

        SUFFIX_MAP.put(0b0110, "east_south");
        SUFFIX_MAP.put(0b1110, "east_south_west");

        SUFFIX_MAP.put(0b1100, "south_west");
        SUFFIX_MAP.put(0b1101, "south_west_north");

        SUFFIX_MAP.put(0b1001, "west_north");
        SUFFIX_MAP.put(0b1011, "west_north_east");
    }

    /* ------------------------------------------------------------------ */

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

    /* ------------------------------------------------------------------ */

    private static void generateTable(String wood) {
        String baseName = wood + "_table";

        for (int mask = 0; mask < 16; mask++) {
            String suffix = SUFFIX_MAP.get(mask);
            String modelName = suffix.isEmpty()
                ? baseName
                : baseName + "_" + suffix;

            generateBlockModel(modelName, suffix, wood);
        }

        generateBlockstate(baseName);
        generateItemModel(baseName);
    }

    /* ------------------------------------------------------------------ */

    private static void generateBlockstate(String baseName) {
        StringBuilder json = new StringBuilder("""
        {
          "variants": {
        """);

        for (int mask = 0; mask < 16; mask++) {
            boolean north = (mask & 0b0001) != 0;
            boolean east  = (mask & 0b0010) != 0;
            boolean south = (mask & 0b0100) != 0;
            boolean west  = (mask & 0b1000) != 0;

            String suffix = SUFFIX_MAP.get(mask);
            String modelName = suffix.isEmpty()
                ? baseName
                : baseName + "_" + suffix;

            json.append("    \"")
                .append("north=").append(north).append(",")
                .append("east=").append(east).append(",")
                .append("south=").append(south).append(",")
                .append("west=").append(west)
                .append("\": { \"model\": \"")
                .append(MODID).append(":block/")
                .append(modelName)
                .append("\" }");

            if (mask < 15) json.append(",");
            json.append("\n");
        }

        json.append("""
          }
        }
        """);

        write(new File(BLOCKSTATE_DIR, baseName + ".json"), json.toString());
    }

    /* ------------------------------------------------------------------ */

    private static void generateBlockModel(String name, String suffix, String wood) {
        String parent = suffix.isEmpty()
            ? "table"
            : "table_" + suffix;

        String json = """
        {
          "parent": "refurbished_furniture:block/%s",
          "textures": {
            "particle": "biomesoplenty:block/%s_planks",
            "texture": "furnituresoplenty:block/%s_table"
          }
        }
        """.formatted(parent, wood, wood);

        write(new File(BLOCK_MODEL_DIR, name + ".json"), json);
    }

    /* ------------------------------------------------------------------ */

    private static void generateItemModel(String baseName) {
        String json = """
        {
          "parent": "%s:block/%s"
        }
        """.formatted(MODID, baseName);

        write(new File(ITEM_MODEL_DIR, baseName + ".json"), json);
    }

    /* ------------------------------------------------------------------ */

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
