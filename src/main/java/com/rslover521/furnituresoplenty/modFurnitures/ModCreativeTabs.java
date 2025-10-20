package com.rslover521.furnituresoplenty.modFurnitures;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.registries.*;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FurnituresOPlenty.MODID);

	public static final RegistryObject<CreativeModeTab> FURNITURE_COMPAT_TAB = CREATIVE_MODE_TABS.register("furnituresoplenty",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + FurnituresOPlenty.MODID))
                    .icon(() -> new ItemStack(BOPChairRegistry.MAPLE_CHAIR.get())) // example icon
                    .displayItems((parameters, output) -> {

                        // Basin
                        output.accept(BOPBasinRegistry.DEAD_BASIN.get());
                        output.accept(BOPBasinRegistry.EMPYREAL_BASIN.get());
                        output.accept(BOPBasinRegistry.FIR_BASIN.get());
                        output.accept(BOPBasinRegistry.HELLBARK_BASIN.get());
                        output.accept(BOPBasinRegistry.JACARANDA_BASIN.get());
                        output.accept(BOPBasinRegistry.MAGIC_BASIN.get());
                        output.accept(BOPBasinRegistry.MAHOGANY_BASIN.get());
                        output.accept(BOPBasinRegistry.MAPLE_BASIN.get());
                        output.accept(BOPBasinRegistry.PALM_BASIN.get());
                        output.accept(BOPBasinRegistry.PINE_BASIN.get());
                        output.accept(BOPBasinRegistry.REDWOOD_BASIN.get());
                        output.accept(BOPBasinRegistry.UMBRAN_BASIN.get());
                        output.accept(BOPBasinRegistry.WILLOW_BASIN.get());

                        // Baths
                        output.accept(BOPBathRegistry.DEAD_BATH.get());
                        output.accept(BOPBathRegistry.EMPYREAL_BATH.get());
                        output.accept(BOPBathRegistry.FIR_BATH.get());
                        output.accept(BOPBathRegistry.HELLBARK_BATH.get());
                        output.accept(BOPBathRegistry.JACARANDA_BATH.get());
                        output.accept(BOPBathRegistry.MAGIC_BATH.get());
                        output.accept(BOPBathRegistry.MAHOGANY_BATH.get());
                        output.accept(BOPBathRegistry.MAPLE_BATH.get());
                        output.accept(BOPBathRegistry.PALM_BATH.get());
                        output.accept(BOPBathRegistry.PINE_BATH.get());
                        output.accept(BOPBathRegistry.REDWOOD_BATH.get());
                        output.accept(BOPBathRegistry.UMBRAN_BATH.get());
                        output.accept(BOPBathRegistry.WILLOW_BATH.get());

                        // Ceiling Fans (Dark)
                        output.accept(BOPCeilingFanRegistry.DEAD_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.EMPYREAL_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.FIR_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.HELLBARK_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.JACARANDA_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.MAGIC_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.MAHOGANY_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.MAPLE_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.PALM_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.PINE_DARK_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.REDWOOD_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.UMBRAN_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.WILLOW_DARK_CEILING_FAN.get());

                        // Ceiling Fans (Light)
                        output.accept(BOPCeilingFanRegistry.DEAD_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.EMPYREAL_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.FIR_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.HELLBARK_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.JACARANDA_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.MAGIC_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.MAHOGANY_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.MAPLE_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.PALM_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.PINE_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.REDWOOD_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.UMBRAN_LIGHT_CEILING_FAN.get());
                        output.accept(BOPCeilingFanRegistry.WILLOW_LIGHT_CEILING_FAN.get());
                        
                    	// Chairs
                        output.accept(BOPChairRegistry.DEAD_CHAIR.get());
                        output.accept(BOPChairRegistry.EMPYREAL_CHAIR.get());
                        output.accept(BOPChairRegistry.FIR_CHAIR.get());
                        output.accept(BOPChairRegistry.HELLBARK_CHAIR.get());
                        output.accept(BOPChairRegistry.JACARANDA_CHAIR.get());
                        output.accept(BOPChairRegistry.MAGIC_CHAIR.get());
                        output.accept(BOPChairRegistry.MAHOGANY_CHAIR.get());
                        output.accept(BOPChairRegistry.MAPLE_CHAIR.get());
                        output.accept(BOPChairRegistry.PALM_CHAIR.get());
                        output.accept(BOPChairRegistry.PINE_CHAIR.get());
                        output.accept(BOPChairRegistry.REDWOOD_CHAIR.get());
                        output.accept(BOPChairRegistry.UMBRAN_CHAIR.get());
                        output.accept(BOPChairRegistry.WILLOW_CHAIR.get());

                        // Crates
                        output.accept(BOPCrateRegistry.DEAD_CRATE.get());
                        output.accept(BOPCrateRegistry.EMPYREAL_CRATE.get());
                        output.accept(BOPCrateRegistry.FIR_CRATE.get());
                        output.accept(BOPCrateRegistry.HELLBARK_CRATE.get());
                        output.accept(BOPCrateRegistry.JACARANDA_CRATE.get());
                        output.accept(BOPCrateRegistry.MAGIC_CRATE.get());
                        output.accept(BOPCrateRegistry.MAHOGANY_CRATE.get());
                        output.accept(BOPCrateRegistry.MAPLE_CRATE.get());
                        output.accept(BOPCrateRegistry.PALM_CRATE.get());
                        output.accept(BOPCrateRegistry.PINE_CRATE.get());
                        output.accept(BOPCrateRegistry.REDWOOD_CRATE.get());
                        output.accept(BOPCrateRegistry.UMBRAN_CRATE.get());
                        output.accept(BOPCrateRegistry.WILLOW_CRATE.get());

                        // Cutting Boards
                        output.accept(BOPCuttingBoardRegistry.DEAD_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.EMPYREAL_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.FIR_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.HELLBARK_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.JACARANDA_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.MAGIC_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.MAHOGANY_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.MAPLE_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.PALM_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.PINE_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.REDWOOD_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.UMBRAN_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.WILLOW_CUTTING_BOARD.get());

                        // Desks
                        output.accept(BOPDeskRegistry.DEAD_DESK.get());
                        output.accept(BOPDeskRegistry.FIR_DESK.get());
                        output.accept(BOPDeskRegistry.EMPYREAL_DESK.get());
                        output.accept(BOPDeskRegistry.HELLBARK_DESK.get());
                        output.accept(BOPDeskRegistry.JACARANDA_DESK.get());
                        output.accept(BOPDeskRegistry.MAGIC_DESK.get());
                        output.accept(BOPDeskRegistry.MAHOGANY_DESK.get());
                        output.accept(BOPDeskRegistry.MAPLE_DESK.get());
                        output.accept(BOPDeskRegistry.PALM_DESK.get());
                        output.accept(BOPDeskRegistry.PINE_DESK.get());
                        output.accept(BOPDeskRegistry.REDWOOD_DESK.get());
                        output.accept(BOPDeskRegistry.UMBRAN_DESK.get());
                        output.accept(BOPDeskRegistry.WILLOW_DESK.get());

                        // Drawers
                        output.accept(BOPDrawerRegistry.DEAD_DRAWER.get());
                        output.accept(BOPDrawerRegistry.FIR_DRAWER.get());
                        output.accept(BOPDrawerRegistry.EMPYREAL_DRAWER.get());
                        output.accept(BOPDrawerRegistry.HELLBARK_DRAWER.get());
                        output.accept(BOPDrawerRegistry.JACARANDA_DRAWER.get());
                        output.accept(BOPDrawerRegistry.MAGIC_DRAWER.get());
                        output.accept(BOPDrawerRegistry.MAHOGANY_DRAWER.get());
                        output.accept(BOPDrawerRegistry.MAPLE_DRAWER.get());
                        output.accept(BOPDrawerRegistry.PALM_DRAWER.get());
                        output.accept(BOPDrawerRegistry.PINE_DRAWER.get());
                        output.accept(BOPDrawerRegistry.REDWOOD_DRAWER.get());
                        output.accept(BOPDrawerRegistry.UMBRAN_DRAWER.get());
                        output.accept(BOPDrawerRegistry.WILLOW_DRAWER.get());

                        // Kitchen Cabinetries
                        output.accept(BOPKitchenCabinetryRegistry.DEAD_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.FIR_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.EMPYREAL_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.HELLBARK_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.JACARANDA_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.MAGIC_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.MAHOGANY_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.MAPLE_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.PALM_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.PINE_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.REDWOOD_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.UMBRAN_KITCHEN_CABINETRY.get());
                        output.accept(BOPKitchenCabinetryRegistry.WILLOW_KITCHEN_CABINETRY.get());

                        // Kitchen Drawers
                        output.accept(BOPKitchenDrawerRegistry.DEAD_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.EMPYREAL_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.FIR_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.HELLBARK_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.JACARANDA_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.MAGIC_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.MAHOGANY_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.MAPLE_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.PALM_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.PINE_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.REDWOOD_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.UMBRAN_KITCHEN_DRAWER.get());
                        output.accept(BOPKitchenDrawerRegistry.WILLOW_KITCHEN_DRAWER.get());

                        // Kitchen Sinks
                        output.accept(BOPKitchenSinkRegistry.DEAD_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.EMPYREAL_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.FIR_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.HELLBARK_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.JACARANDA_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.MAGIC_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.MAHOGANY_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.MAPLE_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.PALM_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.PINE_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.REDWOOD_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.UMBRAN_KITCHEN_SINK.get());
                        output.accept(BOPKitchenSinkRegistry.WILLOW_KITCHEN_SINK.get());

                        // Kitchen Storage Cabinet
                        output.accept(BOPKitchenStorageCabinetRegistry.DEAD_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.EMPYREAL_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.FIR_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.HELLBARK_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.JACARANDA_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.MAGIC_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.MAHOGANY_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.MAPLE_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.PALM_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.PINE_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.REDWOOD_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.UMBRAN_KITCHEN_STORAGE_CABINET.get());
                        output.accept(BOPKitchenStorageCabinetRegistry.WILLOW_KITCHEN_STORAGE_CABINET.get());
                        
                        // Lattice Fence
                        output.accept(BOPLatticeFenceRegistry.DEAD_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.FIR_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.EMPYREAL_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.HELLBARK_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.JACARANDA_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.MAGIC_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.MAHOGANY_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.MAPLE_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.PALM_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.PINE_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.REDWOOD_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.UMBRAN_LATTICE_FENCE.get());
                        output.accept(BOPLatticeFenceRegistry.WILLOW_LATTICE_FENCE.get());

                        // Lattice Fence Gate
                        output.accept(BOPLatticeFenceGateRegistry.DEAD_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.FIR_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.EMPYREAL_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.HELLBARK_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.JACARANDA_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.MAGIC_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.MAHOGANY_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.MAPLE_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.PALM_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.PINE_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.REDWOOD_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.UMBRAN_LATTICE_FENCE_GATE.get());
                        output.accept(BOPLatticeFenceGateRegistry.WILLOW_LATTICE_FENCE_GATE.get());

                        // Mail Box
                        output.accept(BOPMailboxRegistry.DEAD_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.EMPYREAL_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.FIR_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.HELLBARK_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.JACARANDA_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.MAGIC_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.MAHOGANY_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.MAPLE_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.PALM_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.PINE_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.REDWOOD_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.UMBRAN_MAIL_BOX.get());
                        output.accept(BOPMailboxRegistry.WILLOW_MAIL_BOX.get());

                        // Storage Cabinet
                        output.accept(BOPStorageCabinetRegistry.DEAD_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.EMPYREAL_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.FIR_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.HELLBARK_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.JACARANDA_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.MAGIC_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.MAHOGANY_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.MAPLE_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.PALM_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.PINE_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.REDWOOD_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.UMBRAN_STORAGE_CABINET.get());
                        output.accept(BOPStorageCabinetRegistry.WILLOW_STORAGE_CABINET.get());
                        
                        // Storage Jar
                        output.accept(BOPStorageJarRegistry.DEAD_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.EMPYREAL_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.FIR_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.HELLBARK_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.JACARANDA_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.MAGIC_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.MAHOGANY_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.MAPLE_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.PALM_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.PINE_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.REDWOOD_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.UMBRAN_STORAGE_JAR.get());
                        output.accept(BOPStorageJarRegistry.WILLOW_STORAGE_JAR.get());
                        
                        // Tables
                        output.accept(BOPTableRegistry.DEAD_TABLE.get());
                        output.accept(BOPTableRegistry.EMPYREAL_TABLE.get());
                        output.accept(BOPTableRegistry.FIR_TABLE.get());
                        output.accept(BOPTableRegistry.HELLBARK_TABLE.get());
                        output.accept(BOPTableRegistry.JACARANDA_TABLE.get());
                        output.accept(BOPTableRegistry.MAGIC_TABLE.get());
                        output.accept(BOPTableRegistry.MAHOGANY_TABLE.get());
                        output.accept(BOPTableRegistry.MAPLE_TABLE.get());
                        output.accept(BOPTableRegistry.PALM_TABLE.get());
                        output.accept(BOPTableRegistry.PINE_TABLE.get());
                        output.accept(BOPTableRegistry.REDWOOD_TABLE.get());
                        output.accept(BOPTableRegistry.UMBRAN_TABLE.get());
                        output.accept(BOPTableRegistry.WILLOW_TABLE.get());
                        
                        // Toilets
                        output.accept(BOPToiletRegistry.DEAD_TOILET.get());
                        output.accept(BOPToiletRegistry.EMPYREAL_TOILET.get());
                        output.accept(BOPToiletRegistry.FIR_TOILET.get());
                        output.accept(BOPToiletRegistry.HELLBARK_TOILET.get());
                        output.accept(BOPToiletRegistry.JACARANDA_TOILET.get());
                        output.accept(BOPToiletRegistry.MAGIC_TOILET.get());
                        output.accept(BOPToiletRegistry.MAHOGANY_TOILET.get());
                        output.accept(BOPToiletRegistry.MAPLE_TOILET.get());
                        output.accept(BOPToiletRegistry.PALM_TOILET.get());
                        output.accept(BOPToiletRegistry.PINE_TOILET.get());
                        output.accept(BOPToiletRegistry.REDWOOD_TOILET.get());
                        output.accept(BOPToiletRegistry.UMBRAN_TOILET.get());
                        output.accept(BOPToiletRegistry.WILLOW_TOILET.get());
                        
                        })
                    .build());
	
	@SuppressWarnings("removal")
	public static void register() {
		CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
