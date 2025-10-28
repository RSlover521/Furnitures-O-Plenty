package com.rslover521.furnituresoplenty.util;

import java.util.HashMap;
import java.util.Map;

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

        Map<String, String> registryClassMap = new HashMap<>();
        registryClassMap.put("basin", "BOPBasinRegistry");
        registryClassMap.put("bath", "BOPBathRegistry");
        registryClassMap.put("light_ceiling_fan", "BOPCeilingFanRegistry");
        registryClassMap.put("dark_ceiling_fan", "BOPCeilingFanRegistry");
        registryClassMap.put("chair", "BOPChairRegistry");
        registryClassMap.put("crate", "BOPCrateRegistry");
        registryClassMap.put("cutting_board", "BOPCuttingBoardRegistry");
        registryClassMap.put("desk", "BOPDeskRegistry");
        registryClassMap.put("drawer", "BOPDrawerRegistry");
        registryClassMap.put("kitchen_cabinetry", "BOPKitchenCabinetryRegistry");
        registryClassMap.put("kitchen_drawer", "BOPKitchenDrawerRegistry");
        registryClassMap.put("kitchen_sink", "BOPKitchenSinkRegistry");
        registryClassMap.put("kitchen_storage_cabinet", "BOPKitchenStorageCabinetRegistry");
        registryClassMap.put("lattice_fence_gate", "BOPLatticeFenceGateRegistry");
        registryClassMap.put("lattice_fence", "BOPLatticeFenceRegistry");
        registryClassMap.put("mail_box", "BOPMailboxRegistry");
        registryClassMap.put("storage_cabinet", "BOPStorageCabinetRegistry");
        registryClassMap.put("storage_jar", "BOPStorageJarRegistry");
        registryClassMap.put("table", "BOPTableRegistry");
        registryClassMap.put("toilet", "BOPToiletRegistry");

        for (String type : registryTypes) {
            System.out.println("                        // === " + type.replace("_", " ").toUpperCase() + "S ===");
            String registryClass = registryClassMap.get(type);
            String suffix = type.toUpperCase(); // convert to constant form
            for (String wood : woodTypes) {
                String constantName = wood.toUpperCase() + "_" + suffix;
                System.out.println("                        output.accept(" + registryClass + "." + constantName + ".get());");
            }
            System.out.println();
        }
    }
}
