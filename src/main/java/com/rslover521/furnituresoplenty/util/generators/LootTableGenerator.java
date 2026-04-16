package com.rslover521.furnituresoplenty.util.generators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class LootTableGenerator {

    private static final String MODID = "furnituresoplenty";

	public static final List<String> WOOD_TYPES = List.of(
                "fir", "pine", "maple", "redwood", "mahogany", "jacaranda", 
                "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
	);

	public static final List<String> FURNITURE_TYPES = List.of(
                "basin", "bath", "light_ceiling_fan", "dark_ceiling_fan", "chair", "crate", 
                "cutting_board", "desk", "drawer", "kitchen_cabinetry", "kitchen_drawer", 
                "kitchen_sink", "kitchen_storage_cabinet", "lattice_fence_gate", "lattice_fence", 
                "mail_box", "storage_cabinet", "storage_jar", "table", "toilet"
	);

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        Path outputBase = Path.of("src/main/resources/data/" + MODID + "/loot_tables/blocks");

        for (String wood : WOOD_TYPES) {
            for (String furniture : FURNITURE_TYPES) {
                String blockName = wood + "_" + furniture;
                generateSimpleBlockLootTable(outputBase, blockName);
            }
        }

        System.out.println("Loot tables generated successfully.");
    }

    private static void generateSimpleBlockLootTable(Path basePath, String blockName) {
        JsonObject root = new JsonObject();
        root.addProperty("type", "minecraft:block");

        JsonArray pools = new JsonArray();
        JsonObject pool = new JsonObject();

        pool.addProperty("rolls", 1);

        // Conditions
        JsonArray conditions = new JsonArray();
        JsonObject survivesExplosion = new JsonObject();
        survivesExplosion.addProperty("condition", "minecraft:survives_explosion");
        conditions.add(survivesExplosion);
        pool.add("conditions", conditions);

        // Entries
        JsonArray entries = new JsonArray();
        JsonObject entry = new JsonObject();
        entry.addProperty("type", "minecraft:item");
        entry.addProperty("name", MODID + ":" + blockName);
        entries.add(entry);

        pool.add("entries", entries);
        pools.add(pool);

        root.add("pools", pools);

        // Write file
        try {
            Path filePath = basePath.resolve(blockName + ".json");
            filePath.toFile().getParentFile().mkdirs();

            try (FileWriter writer = new FileWriter(filePath.toFile())) {
                GSON.toJson(root, writer);
            }

        } catch (IOException e) {
            System.err.println("Failed to write loot table for: " + blockName);
            e.printStackTrace();
        }
    }
}