package com.rslover521.furnituresoplenty.util.generators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public class TagGenerator {

    private static final String MODID = "furnituresoplenty";

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    // Your wood variants
    public static final List<String> WOOD_TYPES = List.of(
                "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
                "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
	);

    // Your available furniture types
    private static final List<String> FURNITURE_TYPES = List.of(
            "basin", "bath", "light_ceiling_fan", "dark_ceiling_fan", "chair", "crate",
            "cutting_board", "desk", "drawer", "kitchen_cabinetry", "kitchen_drawer",
            "kitchen_sink", "kitchen_storage_cabinet", "lattice_fence_gate", "lattice_fence",
            "mail_box", "storage_cabinet", "storage_jar", "table", "toilet"
    );

    // Tool classifications
    private static final Set<String> AXE_FURNITURE = Set.of(
            "chair", "crate", "cutting_board", "desk", "drawer",
            "kitchen_cabinetry", "kitchen_drawer", "kitchen_sink",
            "kitchen_storage_cabinet", "lattice_fence_gate", "lattice_fence",
            "mail_box", "storage_cabinet", "table"
    );

    private static final Set<String> PICKAXE_FURNITURE = Set.of(
            "basin", "bath", "toilet", "storage_jar", "light_ceiling_fan", "dark_ceiling_fan"
    );

    public static void main(String[] args) {
        Path basePath = Path.of("src/main/resources/data/minecraft/tags/blocks/mineable");

        generateTag(basePath.resolve("axe.json"), AXE_FURNITURE);
        generateTag(basePath.resolve("pickaxe.json"), PICKAXE_FURNITURE);

        System.out.println("Tags generated successfully.");
    }

    private static void generateTag(Path outputPath, Set<String> validFurniture) {
        JsonObject root = new JsonObject();
        root.addProperty("replace", false);

        JsonArray values = new JsonArray();

        for (String wood : WOOD_TYPES) {
            for (String furniture : FURNITURE_TYPES) {
                if (validFurniture.contains(furniture)) {
                    values.add(MODID + ":" + wood + "_" + furniture);
                }
            }
        }

        root.add("values", values);

        write(outputPath, root);
    }

    private static void write(Path path, JsonObject json) {
        try {
            path.toFile().getParentFile().mkdirs();

            try (FileWriter writer = new FileWriter(path.toFile())) {
                GSON.toJson(json, writer);
            }

        } catch (IOException e) {
            System.err.println("Failed to write tag: " + path);
            e.printStackTrace();
        }
    }
}
