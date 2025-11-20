package com.rslover521.furnituresoplenty.util.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;

public class EmptyJsonGenerator {

    private static int count;

    private static final String[] woodTypes = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    private static final String[] registryTypes = {
            "basin", "bath", "light_ceiling_fan", "dark_ceiling_fan", "chair", "crate",
            "cutting_board", "desk", "drawer", "kitchen_cabinetry", "kitchen_drawer",
            "kitchen_sink", "kitchen_storage_cabinet", "lattice_fence_gate", "lattice_fence",
            "mail_box", "storage_cabinet", "storage_jar", "table", "toilet"
    };

    private static final File BLOCKSTATE_DIR =
            new File("src/main/resources/assets/" + FurnituresOPlenty.MODID + "/blockstates");
    private static final File BLOCK_MODEL_DIR =
            new File("src/main/resources/assets/" + FurnituresOPlenty.MODID + "/models/block");
    private static final File ITEM_MODEL_DIR =
            new File("src/main/resources/assets/" + FurnituresOPlenty.MODID + "/models/item");

    public static void main(String[] args) {
        // Create directories
        BLOCKSTATE_DIR.mkdirs();
        BLOCK_MODEL_DIR.mkdirs();
        ITEM_MODEL_DIR.mkdirs();

        for (String wood : woodTypes) {
            for (String type : registryTypes) {
                createEmptyJson(new File(BLOCKSTATE_DIR, wood + "_" + type + ".json"));
                createEmptyJson(new File(BLOCK_MODEL_DIR, wood + "_" + type + ".json"));
                createEmptyJson(new File(ITEM_MODEL_DIR, wood + "_" + type + ".json"));
            }
        }

        System.out.println("✅" + count + " JSON files generated!");
    }

    private static void createEmptyJson(File file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("{}"); // empty JSON object
            System.out.println("Created: " + file.getPath());
            count ++;
        } catch (IOException e) {
            System.err.println("Error creating file: " + file.getPath());
            e.printStackTrace();
        }
    }
}
