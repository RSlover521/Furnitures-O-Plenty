package com.rslover521.furnituresoplenty.util.generators;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class ParentModelGenerator {

    private static final String OUTPUT_DIR = "src/main/resources/assets/furnituresoplenty/models/block/";

    public static void main(String[] args) {
        generateAllBaseParents();
    }

    /**
     * Generates every base parent model file (no wood prefix).
     * Each file will contain:
     * {
     *   "parent": "refurbished_furniture:block/<name>"
     * }
     */
    public static void generateAllBaseParents() {
        List<String> baseNames = List.of(
            // basin / bath
            "basin",
            "bath_bottom",
            "bath_head",

            // ceiling fan bases (from your logs)
            "ceiling_fan_base_off",
            "ceiling_fan_base_on",

            // crate
            "crate_closed",
            "crate_open",
            "crate", // generic crate (safe to include)

            // desk parts
            "desk",
            "desk_left",
            "desk_middle",
            "desk_right",

            // drawers (closed/open variants)
            "drawer",
            "drawer_closed",
            "drawer_open",
            "drawer_left_closed",
            "drawer_left_open",
            "drawer_right_closed",
            "drawer_right_open",
            "drawer_middle_closed",
            "drawer_middle_open",

            // kitchen cabinetry shapes
            "kitchen_cabinetry_default",
            "kitchen_cabinetry_inside_corner_left",
            "kitchen_cabinetry_inside_corner_right",
            "kitchen_cabinetry_outside_corner_left",
            "kitchen_cabinetry_outside_corner_right",

            // kitchen drawers
            "kitchen_drawer_closed",
            "kitchen_drawer_open",

            // kitchen storage cabinet hinge/open combos
            "kitchen_storage_cabinet_closed_hinge_left",
            "kitchen_storage_cabinet_closed_hinge_right",
            "kitchen_storage_cabinet_open_hinge_left",
            "kitchen_storage_cabinet_open_hinge_right",

            // lattice gates/fences
            "lattice_fence_gate_open",
            "lattice_fence_gate_closed",
            "lattice_fence_center",
            "lattice_fence_connection",

            // mailbox
            "mail_box",
            "mail_box_unchecked",

            // storage cabinets (various)
            "storage_cabinet_open_hinge_left",
            "storage_cabinet_open_hinge_right",
            "storage_cabinet_closed_hinge_left",
            "storage_cabinet_closed_hinge_right",

            // others from your list
            "cutting_board",
            "chair",
            "chair_tucked",
            "crate", // already included but harmless
            "kitchen_sink",
            "storage_jar",
            "table",
            "toilet",
            "storage_jar"
        );

        // Ensure output dir exists
        File dir = new File(OUTPUT_DIR);
        if (!dir.exists()) dir.mkdirs();

        for (String name : baseNames) {
            writeParentJson(name);
        }

        System.out.println("✓ All base parent model files created (" + baseNames.size() + " entries).");
    }

    private static void writeParentJson(String baseName) {
        File file = new File(OUTPUT_DIR, baseName + ".json");
        try (FileWriter writer = new FileWriter(file)) {
            String parent = "refurbished_furniture:block/" + baseName;
            writer.write("{\n");
            writer.write("  \"parent\": \"" + parent + "\"\n");
            writer.write("}\n");
            writer.flush();
        } catch (Exception e) {
            System.err.println("Failed to write " + file.getPath() + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
