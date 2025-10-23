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

                        // === BASINS ===
                        output.accept(BOPBasinRegistry.FIR_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.PINE_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.MAPLE_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.REDWOOD_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.MAHOGANY_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.JACARANDA_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.PALM_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.WILLOW_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.DEAD_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.MAGIC_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.UMBRAN_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.HELLBARK_BASIN.get().asItem());
                        output.accept(BOPBasinRegistry.EMPYREAL_BASIN.get().asItem());

                        // === BATHS ===
                        output.accept(BOPBathRegistry.FIR_BATH.get().asItem());
                        output.accept(BOPBathRegistry.PINE_BATH.get().asItem());
                        output.accept(BOPBathRegistry.MAPLE_BATH.get().asItem());
                        output.accept(BOPBathRegistry.REDWOOD_BATH.get().asItem());
                        output.accept(BOPBathRegistry.MAHOGANY_BATH.get().asItem());
                        output.accept(BOPBathRegistry.JACARANDA_BATH.get().asItem());
                        output.accept(BOPBathRegistry.PALM_BATH.get().asItem());
                        output.accept(BOPBathRegistry.WILLOW_BATH.get().asItem());
                        output.accept(BOPBathRegistry.DEAD_BATH.get().asItem());
                        output.accept(BOPBathRegistry.MAGIC_BATH.get().asItem());
                        output.accept(BOPBathRegistry.UMBRAN_BATH.get().asItem());
                        output.accept(BOPBathRegistry.HELLBARK_BATH.get().asItem());
                        output.accept(BOPBathRegistry.EMPYREAL_BATH.get().asItem());

                        // === LIGHT CEILING FANS ===
                        output.accept(BOPCeilingFanRegistry.FIR_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.PINE_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.MAPLE_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.REDWOOD_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.MAHOGANY_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.JACARANDA_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.PALM_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.WILLOW_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.DEAD_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.MAGIC_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.UMBRAN_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.HELLBARK_LIGHT_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.EMPYREAL_LIGHT_CEILING_FAN.get().asItem());

                        // === DARK CEILING FANS ===
                        output.accept(BOPCeilingFanRegistry.FIR_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.PINE_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.MAPLE_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.REDWOOD_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.MAHOGANY_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.JACARANDA_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.PALM_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.WILLOW_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.DEAD_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.MAGIC_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.UMBRAN_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.HELLBARK_DARK_CEILING_FAN.get().asItem());
                        output.accept(BOPCeilingFanRegistry.EMPYREAL_DARK_CEILING_FAN.get().asItem());

                        // === CHAIRS ===
                        output.accept(BOPChairRegistry.FIR_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.PINE_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.MAPLE_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.REDWOOD_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.MAHOGANY_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.JACARANDA_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.PALM_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.WILLOW_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.DEAD_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.MAGIC_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.UMBRAN_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.HELLBARK_CHAIR.get().asItem());
                        output.accept(BOPChairRegistry.EMPYREAL_CHAIR.get().asItem());

                        // === CRATES ===
                        output.accept(BOPCrateRegistry.FIR_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.PINE_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.MAPLE_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.REDWOOD_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.MAHOGANY_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.JACARANDA_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.PALM_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.WILLOW_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.DEAD_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.MAGIC_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.UMBRAN_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.HELLBARK_CRATE.get().asItem());
                        output.accept(BOPCrateRegistry.EMPYREAL_CRATE.get().asItem());

                        // === CUTTING BOARDS ===
                        output.accept(BOPCuttingBoardRegistry.FIR_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.PINE_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.MAPLE_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.REDWOOD_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.MAHOGANY_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.JACARANDA_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.PALM_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.WILLOW_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.DEAD_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.MAGIC_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.UMBRAN_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.HELLBARK_CUTTING_BOARD.get().asItem());
                        output.accept(BOPCuttingBoardRegistry.EMPYREAL_CUTTING_BOARD.get().asItem());

                        // === DESKS ===
                        output.accept(BOPDeskRegistry.FIR_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.PINE_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.MAPLE_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.REDWOOD_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.MAHOGANY_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.JACARANDA_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.PALM_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.WILLOW_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.DEAD_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.MAGIC_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.UMBRAN_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.HELLBARK_DESK.get().asItem());
                        output.accept(BOPDeskRegistry.EMPYREAL_DESK.get().asItem());

                        // === DRAWERS ===
                        output.accept(BOPDrawerRegistry.FIR_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.PINE_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.MAPLE_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.REDWOOD_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.MAHOGANY_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.JACARANDA_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.PALM_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.WILLOW_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.DEAD_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.MAGIC_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.UMBRAN_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.HELLBARK_DRAWER.get().asItem());
                        output.accept(BOPDrawerRegistry.EMPYREAL_DRAWER.get().asItem());

                        // === KITCHEN CABINETRYS ===
                        output.accept(BOPKitchenCabinetryRegistry.FIR_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.PINE_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.MAPLE_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.REDWOOD_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.MAHOGANY_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.JACARANDA_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.PALM_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.WILLOW_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.DEAD_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.MAGIC_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.UMBRAN_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.HELLBARK_KITCHEN_CABINETRY.get().asItem());
                        output.accept(BOPKitchenCabinetryRegistry.EMPYREAL_KITCHEN_CABINETRY.get().asItem());

                        // === KITCHEN DRAWERS ===
                        output.accept(BOPKitchenDrawerRegistry.FIR_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.PINE_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.MAPLE_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.REDWOOD_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.MAHOGANY_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.JACARANDA_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.PALM_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.WILLOW_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.DEAD_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.MAGIC_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.UMBRAN_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.HELLBARK_KITCHEN_DRAWER.get().asItem());
                        output.accept(BOPKitchenDrawerRegistry.EMPYREAL_KITCHEN_DRAWER.get().asItem());

                        // === KITCHEN SINKS ===
                        output.accept(BOPKitchenSinkRegistry.FIR_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.PINE_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.MAPLE_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.REDWOOD_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.MAHOGANY_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.JACARANDA_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.PALM_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.WILLOW_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.DEAD_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.MAGIC_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.UMBRAN_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.HELLBARK_KITCHEN_SINK.get().asItem());
                        output.accept(BOPKitchenSinkRegistry.EMPYREAL_KITCHEN_SINK.get().asItem());

                        // === KITCHEN STORAGE CABINETS ===
                        output.accept(BOPKitchenStorageCabinetRegistry.FIR_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.PINE_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.MAPLE_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.REDWOOD_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.MAHOGANY_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.JACARANDA_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.PALM_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.WILLOW_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.DEAD_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.MAGIC_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.UMBRAN_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.HELLBARK_KITCHEN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPKitchenStorageCabinetRegistry.EMPYREAL_KITCHEN_STORAGE_CABINET.get().asItem());

                        // === LATTICE FENCE GATES ===
                        output.accept(BOPLatticeFenceGateRegistry.FIR_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.PINE_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.MAPLE_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.REDWOOD_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.MAHOGANY_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.JACARANDA_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.PALM_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.WILLOW_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.DEAD_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.MAGIC_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.UMBRAN_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.HELLBARK_LATTICE_FENCE_GATE.get().asItem());
                        output.accept(BOPLatticeFenceGateRegistry.EMPYREAL_LATTICE_FENCE_GATE.get().asItem());

                        // === LATTICE FENCES ===
                        output.accept(BOPLatticeFenceRegistry.FIR_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.PINE_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.MAPLE_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.REDWOOD_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.MAHOGANY_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.JACARANDA_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.PALM_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.WILLOW_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.DEAD_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.MAGIC_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.UMBRAN_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.HELLBARK_LATTICE_FENCE.get().asItem());
                        output.accept(BOPLatticeFenceRegistry.EMPYREAL_LATTICE_FENCE.get().asItem());

                        // === MAIL BOXS ===
                        output.accept(BOPMailboxRegistry.FIR_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.PINE_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.MAPLE_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.REDWOOD_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.MAHOGANY_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.JACARANDA_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.PALM_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.WILLOW_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.DEAD_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.MAGIC_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.UMBRAN_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.HELLBARK_MAIL_BOX.get().asItem());
                        output.accept(BOPMailboxRegistry.EMPYREAL_MAIL_BOX.get().asItem());

                        // === STORAGE CABINETS ===
                        output.accept(BOPStorageCabinetRegistry.FIR_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.PINE_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.MAPLE_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.REDWOOD_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.MAHOGANY_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.JACARANDA_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.PALM_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.WILLOW_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.DEAD_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.MAGIC_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.UMBRAN_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.HELLBARK_STORAGE_CABINET.get().asItem());
                        output.accept(BOPStorageCabinetRegistry.EMPYREAL_STORAGE_CABINET.get().asItem());

                        // === STORAGE JARS ===
                        output.accept(BOPStorageJarRegistry.FIR_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.PINE_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.MAPLE_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.REDWOOD_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.MAHOGANY_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.JACARANDA_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.PALM_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.WILLOW_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.DEAD_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.MAGIC_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.UMBRAN_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.HELLBARK_STORAGE_JAR.get().asItem());
                        output.accept(BOPStorageJarRegistry.EMPYREAL_STORAGE_JAR.get().asItem());

                        // === TABLES ===
                        output.accept(BOPTableRegistry.FIR_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.PINE_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.MAPLE_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.REDWOOD_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.MAHOGANY_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.JACARANDA_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.PALM_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.WILLOW_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.DEAD_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.MAGIC_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.UMBRAN_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.HELLBARK_TABLE.get().asItem());
                        output.accept(BOPTableRegistry.EMPYREAL_TABLE.get().asItem());

                        // === TOILETS ===
                        output.accept(BOPToiletRegistry.FIR_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.PINE_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.MAPLE_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.REDWOOD_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.MAHOGANY_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.JACARANDA_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.PALM_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.WILLOW_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.DEAD_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.MAGIC_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.UMBRAN_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.HELLBARK_TOILET.get().asItem());
                        output.accept(BOPToiletRegistry.EMPYREAL_TOILET.get().asItem());
                        
                        })
                    .build());
	
	@SuppressWarnings("removal")
	public static void register() {
		CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
