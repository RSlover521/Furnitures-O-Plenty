package com.rslover521.furnituresoplenty.util.generators;

public class ModItemGenerator {
	
	public static final String[] woodTypes = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
        };

    public static final String[] registryTypes = {
            "basin", "bath", "light_ceiling_fan", "dark_ceiling_fan", "chair", "crate",
            "cutting_board", "desk", "drawer", "kitchen_cabinetry", "kitchen_drawer",
            "kitchen_sink", "kitchen_storage_cabinet", "lattice_fence_gate", "lattice_fence",
            "mail_box", "storage_cabinet", "storage_jar", "table", "toilet"
        };
        
        
	public static void main(String args[]) {
		run();
	}
	
	@SuppressWarnings("unused")
	public static void run() {
		for (String type : registryTypes) {
		    System.out.println("        // === " + type.replace("_", " ").toUpperCase() + "S ===");
		    String suffix = type.toUpperCase(); // Convert to constant style

		    for (String wood : woodTypes) {
		        String constantName = (wood + "_" + type).toUpperCase();

		        System.out.println(
		            "        public static final RegistryObject<Item> " + constantName +
		            " = ITEMS.register(\"" + wood + "_" + type + "\", " +
		            "() -> new BlockItem(ModBlocks." + constantName + ".get(), new Item.Properties()));"
		        );
		    }

		    System.out.println();
		}
	}
}
