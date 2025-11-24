package com.rslover521.furnituresoplenty.util.generators;

public class CreativeTabGenerator {
    public static void main(String[] args) {
        String[] woodTypes = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
        };

        String[] registryTypes = {
            "basin", "bath", "light_ceiling_fan", "dark_ceiling_fan", "chair", "crate",
            "cutting_board", "desk", "drawer", "kitchen_cabinetry", "kitchen_drawer",
            "kitchen_sink", "kitchen_storage_cabinet", "lattice_fence_gate", "lattice_fence",
            "mail_box", "storage_cabinet", "storage_jar", "table", "toilet"
        };

        for (String type : registryTypes) {
            System.out.println("                        // === " + type.replace("_", " ").toUpperCase() + "S ===");
            String suffix = type.toUpperCase(); // convert to constant form
            for (String wood : woodTypes) {
                String constantName = wood.toUpperCase() + "_" + suffix;
                System.out.println("                        output.accept(new ItemStack(ModBlocks." + constantName + ".get()));");
            }
            System.out.println();
        }
    }
}
