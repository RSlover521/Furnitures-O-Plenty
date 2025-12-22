package com.rslover521.furnituresoplenty.util.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class RecipeGenerator {

    /* Your mod namespace (where recipes live) */
    private static final String MOD_ID = "furnituresoplenty";

    /* Refurbished Furniture namespace (recipe serializer owner) */
    private static final String RF_MOD_ID = "refurbished_furniture";

    private static final List<String> WOOD_TYPES = List.of(
        "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
        "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    );

    /* Strongly-typed material definition */
    private record Material(int count, String item) {}

    public static void main(String[] args) {
        Path output = Path.of("")
            .toAbsolutePath()
            .resolve("src/main/resources/data/" + MOD_ID + "/recipes");

        try {
            for (String wood : WOOD_TYPES) {
                generateRecipes(output, wood);
            }
            System.out.println("All recipes generated successfully.");
        } catch (IOException e) {
            throw new RuntimeException("Failed to generate recipes", e);
        }
    }

    private static void generateRecipes(Path output, String wood) throws IOException {

        /* 1. Dark ceiling fan (shapeless) */
        write(output, wood + "_dark_ceiling_fan.json", """
        {
          "type": "minecraft:crafting_shapeless",
          "category": "misc",
          "ingredients": [
            { "item": "%s:%s_light_ceiling_fan" },
            { "item": "minecraft:black_dye" }
          ],
          "result": {
            "item": "%s:%s_dark_ceiling_fan",
            "count": 1
          }
        }
        """.formatted(MOD_ID, wood, MOD_ID, wood));

        /* 2. Light ceiling fan */
        write(output, wood + "_light_ceiling_fan.json",
            workbench(
                wood,
                "%s:%s_light_ceiling_fan".formatted(MOD_ID, wood),
                1,
                false,
                new Material(8, "minecraft:%WOOD%_planks")
            )
        );

        /* Furniture recipes */

        recipe(output, wood, "toilet", 1,
            new Material(3, "minecraft:%WOOD%_planks"),
            new Material(5, "minecraft:quartz_block"),
            new Material(1, "minecraft:iron_ingot"),
            new Material(1, "minecraft:copper_ingot")
        );

        recipe(output, wood, "table", 1,
            new Material(6, "minecraft:%WOOD%_planks")
        );

        recipe(output, wood, "storage_jar", 1,
            new Material(2, "minecraft:%WOOD%_planks"),
            new Material(1, "minecraft:glass")
        );

        recipe(output, wood, "storage_cabinet", 2,
            new Material(8, "minecraft:%WOOD%_planks"),
            new Material(1, "minecraft:iron_ingot")
        );

        recipe(output, wood, "mail_box", 1,
            new Material(8, "minecraft:%WOOD%_planks")
        );

        recipe(output, wood, "lattice_fence", 3,
            new Material(4, "minecraft:%WOOD%_planks"),
            new Material(4, "minecraft:stick")
        );

        recipe(output, wood, "lattice_fence_gate", 1,
            new Material(2, "minecraft:%WOOD%_planks"),
            new Material(4, "minecraft:stick")
        );

        recipe(output, wood, "kitchen_storage_cabinet", 2,
            new Material(12, "minecraft:%WOOD%_planks"),
            new Material(1, "minecraft:white_dye")
        );

        recipe(output, wood, "kitchen_sink", 1,
            new Material(10, "minecraft:%WOOD%_planks"),
            new Material(1, "minecraft:copper_ingot"),
            new Material(1, "minecraft:quartz_block"),
            new Material(1, "minecraft:white_dye")
        );

        recipe(output, wood, "kitchen_drawer", 2,
            new Material(12, "minecraft:%WOOD%_planks"),
            new Material(1, "minecraft:white_dye")
        );

        recipe(output, wood, "kitchen_cabinetry", 2,
            new Material(8, "minecraft:%WOOD%_planks"),
            new Material(1, "minecraft:white_dye")
        );

        recipe(output, wood, "drawer", 1,
            new Material(10, "minecraft:%WOOD%_planks")
        );

        recipe(output, wood, "desk", 1,
            new Material(6, "minecraft:%WOOD%_planks")
        );

        recipe(output, wood, "cutting_board", 1,
            new Material(2, "minecraft:%WOOD%_planks")
        );

        recipe(output, wood, "crate", 1,
            new Material(8, "minecraft:%WOOD%_planks")
        );

        recipe(output, wood, "chair", 1,
            new Material(4, "minecraft:%WOOD%_planks")
        );

        recipe(output, wood, "bath", 1,
            new Material(5, "minecraft:%WOOD%_planks"),
            new Material(8, "minecraft:quartz_block"),
            new Material(2, "minecraft:iron_ingot"),
            new Material(1, "minecraft:copper_ingot")
        );

        recipe(output, wood, "basin", 1,
            new Material(3, "minecraft:%WOOD%_planks"),
            new Material(4, "minecraft:quartz_block"),
            new Material(2, "minecraft:iron_ingot"),
            new Material(1, "minecraft:copper_ingot")
        );
    }

    /* Generic furniture recipe helper */
    private static void recipe(Path output, String wood, String name, int count, Material... materials)
        throws IOException {

        String file = wood + "_" + name + (count > 1 ? "_x" + count : "") + ".json";
        String result = "%s:%s_%s".formatted(MOD_ID, wood, name);

        write(output, file, workbench(wood, result, count, false, materials));
    }

    /* Workbench recipe builder */
    private static String workbench(String wood, String result, int count, boolean showNotification,
                                    Material... materials) {

        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"type\": \"").append(RF_MOD_ID).append(":workbench_constructing\",\n");
        json.append("  \"materials\": [\n");

        for (int i = 0; i < materials.length; i++) {
            Material m = materials[i];
            json.append("    { \"count\": ").append(m.count())
                .append(", \"item\": \"")
                .append(m.item().replace("%WOOD%", wood))
                .append("\" }");
            if (i < materials.length - 1) json.append(",");
            json.append("\n");
        }

        json.append("  ],\n");
        json.append("  \"result\": { \"item\": \"")
            .append(result)
            .append("\", \"count\": ")
            .append(count)
            .append(" },\n");
        json.append("  \"show_notification\": ").append(showNotification).append("\n");
        json.append("}");

        return json.toString();
    }

    private static void write(Path output, String filename, String content) throws IOException {
        Path path = output.resolve(filename);
        Files.createDirectories(path.getParent());
        Files.writeString(path, content);
    }
}
