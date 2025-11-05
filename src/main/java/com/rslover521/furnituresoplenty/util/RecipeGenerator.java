package com.rslover521.furnituresoplenty.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RecipeGenerator {

    private static final String MOD_ID = "refurbished_furniture";

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    public static void main(String[] args) {
        Path output = Path.of("src/main/resources/data/furnituresoplenty/recipes/");

        try {
            for (String wood : WOOD_TYPES) {
                generateRecipes(output, wood);
            }
            System.out.println("✅ All recipes generated!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateRecipes(Path output, String wood) throws IOException {
        // 1. Dark ceiling fan
        String darkFan = """
        {
          "type": "minecraft:crafting_shapeless",
          "category": "misc",
          "ingredients": [
            { "item": "furnituresoplenty:%WOOD%_light_ceiling_fan" },
            { "item": "minecraft:black_dye" }
          ],
          "result": { "item": "%MODID%:%WOOD%_dark_ceiling_fan" }
        }
        """.replace("%MODID%", MOD_ID).replace("%WOOD%", wood);
        write(output, wood + "_dark_ceiling_fan.json", darkFan);

        // 2. Light ceiling fan
        String lightFan = """
        {
          "type": "%MODID%:workbench_constructing",
          "materials": [
            { "count": 8, "item": "minecraft:%WOOD%_planks" }
          ],
          "result": "furnituresoplenty:%WOOD%_light_ceiling_fan",
          "show_notification": false
        }
        """.replace("%MODID%", MOD_ID).replace("%WOOD%", wood);
        write(output, wood + "_light_ceiling_fan.json", lightFan);

        // 3. Toilet
        write(output, wood + "_toilet.json", constructWorkbenchRecipe(
                new String[][]{
                        {"3", "minecraft:%WOOD%_planks"},
                        {"5", "minecraft:quartz_block"},
                        {"1", "minecraft:iron_ingot"},
                        {"1", "minecraft:copper_ingot"}
                },
                "furnituresoplenty:%WOOD%_toilet", false, wood
        ));

        // 4. Table
        write(output, wood + "_table.json", constructWorkbenchRecipe(
                new String[][]{
                        {"6", "minecraft:%WOOD%_planks"}
                },
                "furnituresoplenty:%WOOD%_table", false, wood
        ));

        // 5. Storage Jar
        write(output, wood + "_storage_jar.json", constructWorkbenchRecipe(
                new String[][]{
                        {"2", "minecraft:%WOOD%_planks"},
                        {"1", "minecraft:glass"}
                },
                "furnituresoplenty:%WOOD%_storage_jar", false, wood
        ));

        // 6. Storage Cabinet (count 2)
        write(output, wood + "_storage_cabinet.json", constructWorkbenchRecipe(
                new String[][]{
                        {"8", "minecraft:%WOOD%_planks"},
                        {"1", "minecraft:iron_ingot"}
                },
                "furnituresoplenty:%WOOD%_storage_cabinet", 2, false, wood
        ));

        // 7. Mailbox
        write(output, wood + "_mailbox.json", constructWorkbenchRecipe(
                new String[][]{
                        {"8", "minecraft:%WOOD%_planks"}
                },
                "furnituresoplenty:%WOOD%_mail_box", false, wood
        ));

        // 8. Lattice Fence
        write(output, wood + "_lattice_fence.json", constructWorkbenchRecipe(
                new String[][]{
                        {"4", "minecraft:%WOOD%_planks"},
                        {"4", "minecraft:stick"}
                },
                "furnituresoplenty:%WOOD%_lattice_fence", 3, false, wood
        ));

        // 9. Lattice Fence Gate
        write(output, wood + "_lattice_fence_gate.json", constructWorkbenchRecipe(
                new String[][]{
                        {"2", "minecraft:%WOOD%_planks"},
                        {"4", "minecraft:stick"}
                },
                "furnituresoplenty:%WOOD%_lattice_fence_gate", false, wood
        ));

        // 10. Kitchen Storage Cabinet
        write(output, wood + "_kitchen_storage_cabinet.json", constructWorkbenchRecipe(
                new String[][]{
                        {"12", "minecraft:%WOOD%_planks"},
                        {"1", "minecraft:white_dye"}
                },
                "furnituresoplenty:%WOOD%_kitchen_storage_cabinet", 2, false, wood
        ));

        // 11. Kitchen Sink
        write(output, wood + "_kitchen_sink.json", constructWorkbenchRecipe(
                new String[][]{
                        {"10", "minecraft:%WOOD%_planks"},
                        {"1", "minecraft:copper_ingot"},
                        {"1", "minecraft:quartz_block"},
                        {"1", "minecraft:white_dye"}
                },
                "furnituresoplenty:%WOOD%_kitchen_sink", false, wood
        ));

        // 12. Kitchen Drawer
        write(output, wood + "_kitchen_drawer.json", constructWorkbenchRecipe(
                new String[][]{
                        {"12", "minecraft:%WOOD%_planks"},
                        {"1", "minecraft:white_dye"}
                },
                "furnituresoplenty:%WOOD%_kitchen_drawer", 2, false, wood
        ));

        // 13. Kitchen Cabinetry
        write(output, wood + "_kitchen_cabinetry.json", constructWorkbenchRecipe(
                new String[][]{
                        {"8", "minecraft:%WOOD%_planks"},
                        {"1", "minecraft:white_dye"}
                },
                "furnituresoplenty:%WOOD%_kitchen_cabinetry", 2, false, wood
        ));

        // 14. Drawer
        write(output, wood + "_drawer.json", constructWorkbenchRecipe(
                new String[][]{
                        {"10", "minecraft:%WOOD%_planks"}
                },
                "furnituresoplenty:%WOOD%_drawer", false, wood
        ));

        // 15. Desk
        write(output, wood + "_desk.json", constructWorkbenchRecipe(
                new String[][]{
                        {"6", "minecraft:%WOOD%_planks"}
                },
                "furnituresoplenty:%WOOD%_desk", false, wood
        ));

        // 16. Cutting Board
        write(output, wood + "_cutting_board.json", constructWorkbenchRecipe(
                new String[][]{
                        {"2", "minecraft:%WOOD%_planks"}
                },
                "furnituresoplenty:%WOOD%_cutting_board", false, wood
        ));

        // 17. Crate
        write(output, wood + "_crate.json", constructWorkbenchRecipe(
                new String[][]{
                        {"8", "minecraft:%WOOD%_planks"}
                },
                "furnituresoplenty:%WOOD%_crate", false, wood
        ));

        // 18. Chair
        write(output, wood + "_chair.json", constructWorkbenchRecipe(
                new String[][]{
                        {"4", "minecraft:%WOOD%_planks"}
                },
                "furnituresoplenty:%WOOD%_chair", false, wood
        ));

        // 19. Bath
        write(output, wood + "_bath.json", constructWorkbenchRecipe(
                new String[][]{
                        {"5", "minecraft:%WOOD%_planks"},
                        {"8", "minecraft:quartz_block"},
                        {"2", "minecraft:iron_ingot"},
                        {"1", "minecraft:copper_ingot"}
                },
                "furnituresoplenty:%WOOD%_bath", false, wood
        ));

        // 20. Basin
        write(output, wood + "_basin.json", constructWorkbenchRecipe(
                new String[][]{
                        {"3", "minecraft:%WOOD%_planks"},
                        {"4", "minecraft:quartz_block"},
                        {"2", "minecraft:iron_ingot"},
                        {"1", "minecraft:copper_ingot"}
                },
                "furnituresoplenty:%WOOD%_basin", false, wood
        ));
    }

    private static String constructWorkbenchRecipe(String[][] materials, String result, boolean showNotification, String wood) {
        return constructWorkbenchRecipe(materials, result, 1, showNotification, wood);
    }

    private static String constructWorkbenchRecipe(String[][] materials, String result, int resultCount, boolean showNotification, String wood) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n  \"type\": \"").append(MOD_ID).append(":workbench_constructing\",\n");
        sb.append("  \"materials\": [\n");
        for (int i = 0; i < materials.length; i++) {
            String count = materials[i][0];
            String item = materials[i][1].replace("%WOOD%", wood);
            sb.append("    { \"count\": ").append(count).append(", \"item\": \"").append(item).append("\" }");
            if (i < materials.length - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("  ],\n");
        if (resultCount == 1) {
            sb.append("  \"result\": \"").append(result.replace("%WOOD%", wood)).append("\",\n");
        } else {
            sb.append("  \"result\": { \"count\": ").append(resultCount).append(", \"item\": \"").append(result.replace("%WOOD%", wood)).append("\" },\n");
        }
        sb.append("  \"show_notification\": ").append(showNotification).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private static void write(Path output, String filename, String content) throws IOException {
        Path path = output.resolve(filename);
        Files.createDirectories(path.getParent());
        Files.writeString(path, content);
    }
}
