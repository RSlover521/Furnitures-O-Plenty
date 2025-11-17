package com.rslover521.furnituresoplenty.util.generators;

public class ModBlocksGenerator {

    // Each entry: methodName, blockClass, suffix
    private static final String[][] DEFINITIONS = {
        {"registerBasin", "CustomBasinBlock", "_basin"},
        {"registerBath", "CustomBathBlock", "_bath"},
        {"registerCeilingFans", "CustomCeilingFanBlock", "_ceiling_fan"}, // special argument handling below
        {"registerChair", "CustomChairBlock", "_chair"},
        {"registerCrate", "CustomCrateBlock", "_crate"},
        {"registerCuttingBoard", "CustomCuttingBoardBlock", "_cutting_board"},
        {"registerDesk", "CustomDeskBlock", "_desk"},
        {"registerDrawer", "CustomDrawerBlock", "_drawer"},
        {"registerKitchenCabinetry", "CustomKitchenCabinetryBlock", "_kitchen_cabinetry"},
        {"registerKitchenDrawer", "CustomKitchenDrawerBlock", "_kitchen_drawer"},
        {"registerKitchenSink", "CustomKitchenSinkBlock", "_kitchen_sink"},
        {"registerKitchenStorageCabinets", "CustomKitchenStorageCabinetBlock", "_kitchen_storage_cabinet"},
        {"registerLatticeFenceGate", "CustomLatticeFenceGateBlock", "_lattice_fence_gate"},
        {"registerLatticeFences", "CustomLatticeFenceBlock", "_lattice_fence"},
        {"registerMailBox", "CustomMailboxBlock", "_mail_box"},
        {"registerStorageCabinets", "CustomStorageCabinetBlock", "_storage_cabinets"},
        {"registerStorageJar", "CustomStorageJarBlock", "_storage_jar"},
        {"registerTable", "CustomTableBlock", "_table"},
        {"registerToilet", "CustomToiletBlock", "_toilet"}
    };

    public static void main(String[] args) {

        for (String[] def : DEFINITIONS) {
            String methodName = def[0];
            String blockClass = def[1];
            String suffix = def[2];

            // SPECIAL CASE: ceiling fans (Has metal type + wood string)
            if (methodName.equals("registerCeilingFans")) {
                System.out.println(generateCeilingFanMethod(blockClass, suffix));
            } else {
                System.out.println(generateStandardMethod(methodName, blockClass, suffix));
            }
        }
    }

    private static String generateStandardMethod(String methodName, String blockClass, String suffix) {
        return """
            private static RegistryObject<Block> %METHOD%(String name, WoodType woodType) {
                RegistryObject<Block> block = BLOCKS.register(name + "%SUFFIX%", () -> {
                    Block planks = BOPBlocks.BOP_PLANKS_BY_WOOD.get(woodType);
                    if (planks == null)
                        throw new IllegalArgumentException("Unknown planks for wood type: " + woodType);

                    return new %BLOCK%(woodType, BlockBehaviour.Properties.copy(planks));
                });

                FurnituresOPlenty.LOGGER.info("Successfully registered block and item for "
                        + FurnituresOPlenty.MODID + ":" + name + "%SUFFIX%");
                return block;
            }
            """
                .replace("%METHOD%", methodName)
                .replace("%BLOCK%", blockClass)
                .replace("%SUFFIX%", suffix);
    }

    private static String generateCeilingFanMethod(String blockClass, String suffix) {
        return """
            private static RegistryObject<Block> registerCeilingFans(String metalType, String wood, WoodType woodType) {
                MetalType type = metalType.equals("light") ? MetalType.LIGHT : MetalType.DARK;

                RegistryObject<Block> block = BLOCKS.register(metalType + "_" + wood + "%SUFFIX%", () -> {
                    Block planks = BOPBlocks.BOP_PLANKS_BY_WOOD.get(woodType);
                    if (planks == null)
                        throw new IllegalArgumentException("Unknown planks for wood type: " + woodType);

                    return new %BLOCK%(woodType, type, BlockBehaviour.Properties.copy(planks));
                });

                FurnituresOPlenty.LOGGER.info("Successfully registered block and item for "
                        + FurnituresOPlenty.MODID + ":" + metalType + "_" + wood + "%SUFFIX%");
                return block;
            }
            """
                .replace("%BLOCK%", blockClass)
                .replace("%SUFFIX%", suffix);
    }
}
