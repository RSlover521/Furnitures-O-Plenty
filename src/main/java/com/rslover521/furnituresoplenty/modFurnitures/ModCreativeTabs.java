package com.rslover521.furnituresoplenty.modFurnitures;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FurnituresOPlenty.MODID);

	public static final RegistryObject<CreativeModeTab> FURNITURE_COMPAT_TAB = CREATIVE_MODE_TABS.register("furnituresoplenty",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + FurnituresOPlenty.MODID))
                    .icon(() -> new ItemStack(ModBlocks.MAPLE_CHAIR.get())) // example icon
                    .displayItems((parameters, output) -> {

                        // === BASINS ===
                        output.accept(ModBlocks.FIR_BASIN.get());
                        output.accept(ModBlocks.PINE_BASIN.get());
                        output.accept(ModBlocks.MAPLE_BASIN.get());
                        output.accept(ModBlocks.REDWOOD_BASIN.get());
                        output.accept(ModBlocks.MAHOGANY_BASIN.get());
                        output.accept(ModBlocks.JACARANDA_BASIN.get());
                        output.accept(ModBlocks.PALM_BASIN.get());
                        output.accept(ModBlocks.WILLOW_BASIN.get());
                        output.accept(ModBlocks.DEAD_BASIN.get());
                        output.accept(ModBlocks.MAGIC_BASIN.get());
                        output.accept(ModBlocks.UMBRAN_BASIN.get());
                        output.accept(ModBlocks.HELLBARK_BASIN.get());
                        output.accept(ModBlocks.EMPYREAL_BASIN.get());

                        // === BATHS ===
                        output.accept(ModBlocks.FIR_BATH.get());
                        output.accept(ModBlocks.PINE_BATH.get());
                        output.accept(ModBlocks.MAPLE_BATH.get());
                        output.accept(ModBlocks.REDWOOD_BATH.get());
                        output.accept(ModBlocks.MAHOGANY_BATH.get());
                        output.accept(ModBlocks.JACARANDA_BATH.get());
                        output.accept(ModBlocks.PALM_BATH.get());
                        output.accept(ModBlocks.WILLOW_BATH.get());
                        output.accept(ModBlocks.DEAD_BATH.get());
                        output.accept(ModBlocks.MAGIC_BATH.get());
                        output.accept(ModBlocks.UMBRAN_BATH.get());
                        output.accept(ModBlocks.HELLBARK_BATH.get());
                        output.accept(ModBlocks.EMPYREAL_BATH.get());

                        // === LIGHT CEILING FANS ===
                        output.accept(ModBlocks.FIR_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.PINE_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.MAPLE_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.REDWOOD_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.MAHOGANY_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.JACARANDA_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.PALM_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.WILLOW_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.DEAD_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.MAGIC_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.UMBRAN_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.HELLBARK_LIGHT_CEILING_FAN.get());
                        output.accept(ModBlocks.EMPYREAL_LIGHT_CEILING_FAN.get());

                        // === DARK CEILING FANS ===
                        output.accept(ModBlocks.FIR_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.PINE_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.MAPLE_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.REDWOOD_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.MAHOGANY_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.JACARANDA_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.PALM_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.WILLOW_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.DEAD_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.MAGIC_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.UMBRAN_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.HELLBARK_DARK_CEILING_FAN.get());
                        output.accept(ModBlocks.EMPYREAL_DARK_CEILING_FAN.get());

                        // === CHAIRS ===
                        output.accept(ModBlocks.FIR_CHAIR.get());
                        output.accept(ModBlocks.PINE_CHAIR.get());
                        output.accept(ModBlocks.MAPLE_CHAIR.get());
                        output.accept(ModBlocks.REDWOOD_CHAIR.get());
                        output.accept(ModBlocks.MAHOGANY_CHAIR.get());
                        output.accept(ModBlocks.JACARANDA_CHAIR.get());
                        output.accept(ModBlocks.PALM_CHAIR.get());
                        output.accept(ModBlocks.WILLOW_CHAIR.get());
                        output.accept(ModBlocks.DEAD_CHAIR.get());
                        output.accept(ModBlocks.MAGIC_CHAIR.get());
                        output.accept(ModBlocks.UMBRAN_CHAIR.get());
                        output.accept(ModBlocks.HELLBARK_CHAIR.get());
                        output.accept(ModBlocks.EMPYREAL_CHAIR.get());

                        // === CRATES ===
                        output.accept(ModBlocks.FIR_CRATE.get());
                        output.accept(ModBlocks.PINE_CRATE.get());
                        output.accept(ModBlocks.MAPLE_CRATE.get());
                        output.accept(ModBlocks.REDWOOD_CRATE.get());
                        output.accept(ModBlocks.MAHOGANY_CRATE.get());
                        output.accept(ModBlocks.JACARANDA_CRATE.get());
                        output.accept(ModBlocks.PALM_CRATE.get());
                        output.accept(ModBlocks.WILLOW_CRATE.get());
                        output.accept(ModBlocks.DEAD_CRATE.get());
                        output.accept(ModBlocks.MAGIC_CRATE.get());
                        output.accept(ModBlocks.UMBRAN_CRATE.get());
                        output.accept(ModBlocks.HELLBARK_CRATE.get());
                        output.accept(ModBlocks.EMPYREAL_CRATE.get());

                        // === CUTTING BOARDS ===
                        output.accept(ModBlocks.FIR_CUTTING_BOARD.get());
                        output.accept(ModBlocks.PINE_CUTTING_BOARD.get());
                        output.accept(ModBlocks.MAPLE_CUTTING_BOARD.get());
                        output.accept(ModBlocks.REDWOOD_CUTTING_BOARD.get());
                        output.accept(ModBlocks.MAHOGANY_CUTTING_BOARD.get());
                        output.accept(ModBlocks.JACARANDA_CUTTING_BOARD.get());
                        output.accept(ModBlocks.PALM_CUTTING_BOARD.get());
                        output.accept(ModBlocks.WILLOW_CUTTING_BOARD.get());
                        output.accept(ModBlocks.DEAD_CUTTING_BOARD.get());
                        output.accept(ModBlocks.MAGIC_CUTTING_BOARD.get());
                        output.accept(ModBlocks.UMBRAN_CUTTING_BOARD.get());
                        output.accept(ModBlocks.HELLBARK_CUTTING_BOARD.get());
                        output.accept(ModBlocks.EMPYREAL_CUTTING_BOARD.get());

                        // === DESKS ===
                        output.accept(ModBlocks.FIR_DESK.get());
                        output.accept(ModBlocks.PINE_DESK.get());
                        output.accept(ModBlocks.MAPLE_DESK.get());
                        output.accept(ModBlocks.REDWOOD_DESK.get());
                        output.accept(ModBlocks.MAHOGANY_DESK.get());
                        output.accept(ModBlocks.JACARANDA_DESK.get());
                        output.accept(ModBlocks.PALM_DESK.get());
                        output.accept(ModBlocks.WILLOW_DESK.get());
                        output.accept(ModBlocks.DEAD_DESK.get());
                        output.accept(ModBlocks.MAGIC_DESK.get());
                        output.accept(ModBlocks.UMBRAN_DESK.get());
                        output.accept(ModBlocks.HELLBARK_DESK.get());
                        output.accept(ModBlocks.EMPYREAL_DESK.get());

                        // === DRAWERS ===
                        output.accept(ModBlocks.FIR_DRAWER.get());
                        output.accept(ModBlocks.PINE_DRAWER.get());
                        output.accept(ModBlocks.MAPLE_DRAWER.get());
                        output.accept(ModBlocks.REDWOOD_DRAWER.get());
                        output.accept(ModBlocks.MAHOGANY_DRAWER.get());
                        output.accept(ModBlocks.JACARANDA_DRAWER.get());
                        output.accept(ModBlocks.PALM_DRAWER.get());
                        output.accept(ModBlocks.WILLOW_DRAWER.get());
                        output.accept(ModBlocks.DEAD_DRAWER.get());
                        output.accept(ModBlocks.MAGIC_DRAWER.get());
                        output.accept(ModBlocks.UMBRAN_DRAWER.get());
                        output.accept(ModBlocks.HELLBARK_DRAWER.get());
                        output.accept(ModBlocks.EMPYREAL_DRAWER.get());

                        // === KITCHEN CABINETRYS ===
                        output.accept(ModBlocks.FIR_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.PINE_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.MAPLE_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.REDWOOD_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.MAHOGANY_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.JACARANDA_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.PALM_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.WILLOW_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.DEAD_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.MAGIC_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.UMBRAN_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.HELLBARK_KITCHEN_CABINETRY.get());
                        output.accept(ModBlocks.EMPYREAL_KITCHEN_CABINETRY.get());

                        // === KITCHEN DRAWERS ===
                        output.accept(ModBlocks.FIR_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.PINE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.MAPLE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.REDWOOD_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.MAHOGANY_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.JACARANDA_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.PALM_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.WILLOW_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.DEAD_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.MAGIC_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.UMBRAN_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.HELLBARK_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.EMPYREAL_KITCHEN_DRAWER.get());

                        // === KITCHEN SINKS ===
                        output.accept(ModBlocks.FIR_KITCHEN_SINK.get());
                        output.accept(ModBlocks.PINE_KITCHEN_SINK.get());
                        output.accept(ModBlocks.MAPLE_KITCHEN_SINK.get());
                        output.accept(ModBlocks.REDWOOD_KITCHEN_SINK.get());
                        output.accept(ModBlocks.MAHOGANY_KITCHEN_SINK.get());
                        output.accept(ModBlocks.JACARANDA_KITCHEN_SINK.get());
                        output.accept(ModBlocks.PALM_KITCHEN_SINK.get());
                        output.accept(ModBlocks.WILLOW_KITCHEN_SINK.get());
                        output.accept(ModBlocks.DEAD_KITCHEN_SINK.get());
                        output.accept(ModBlocks.MAGIC_KITCHEN_SINK.get());
                        output.accept(ModBlocks.UMBRAN_KITCHEN_SINK.get());
                        output.accept(ModBlocks.HELLBARK_KITCHEN_SINK.get());
                        output.accept(ModBlocks.EMPYREAL_KITCHEN_SINK.get());

                        // === KITCHEN STORAGE CABINETS ===
                        output.accept(ModBlocks.FIR_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.PINE_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.MAPLE_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.REDWOOD_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.MAHOGANY_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.JACARANDA_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.PALM_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.WILLOW_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.DEAD_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.MAGIC_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.UMBRAN_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.HELLBARK_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.EMPYREAL_KITCHEN_STORAGE_CABINET.get());

                        // === LATTICE FENCE GATES ===
                        output.accept(ModBlocks.FIR_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.PINE_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.MAPLE_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.REDWOOD_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.MAHOGANY_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.JACARANDA_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.PALM_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.WILLOW_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.DEAD_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.MAGIC_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.UMBRAN_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.HELLBARK_LATTICE_FENCE_GATE.get());
                        output.accept(ModBlocks.EMPYREAL_LATTICE_FENCE_GATE.get());

                        // === LATTICE FENCES ===
                        output.accept(ModBlocks.FIR_LATTICE_FENCE.get());
                        output.accept(ModBlocks.PINE_LATTICE_FENCE.get());
                        output.accept(ModBlocks.MAPLE_LATTICE_FENCE.get());
                        output.accept(ModBlocks.REDWOOD_LATTICE_FENCE.get());
                        output.accept(ModBlocks.MAHOGANY_LATTICE_FENCE.get());
                        output.accept(ModBlocks.JACARANDA_LATTICE_FENCE.get());
                        output.accept(ModBlocks.PALM_LATTICE_FENCE.get());
                        output.accept(ModBlocks.WILLOW_LATTICE_FENCE.get());
                        output.accept(ModBlocks.DEAD_LATTICE_FENCE.get());
                        output.accept(ModBlocks.MAGIC_LATTICE_FENCE.get());
                        output.accept(ModBlocks.UMBRAN_LATTICE_FENCE.get());
                        output.accept(ModBlocks.HELLBARK_LATTICE_FENCE.get());
                        output.accept(ModBlocks.EMPYREAL_LATTICE_FENCE.get());

                        // === MAIL BOXS ===
                        output.accept(ModBlocks.FIR_MAIL_BOX.get());
                        output.accept(ModBlocks.PINE_MAIL_BOX.get());
                        output.accept(ModBlocks.MAPLE_MAIL_BOX.get());
                        output.accept(ModBlocks.REDWOOD_MAIL_BOX.get());
                        output.accept(ModBlocks.MAHOGANY_MAIL_BOX.get());
                        output.accept(ModBlocks.JACARANDA_MAIL_BOX.get());
                        output.accept(ModBlocks.PALM_MAIL_BOX.get());
                        output.accept(ModBlocks.WILLOW_MAIL_BOX.get());
                        output.accept(ModBlocks.DEAD_MAIL_BOX.get());
                        output.accept(ModBlocks.MAGIC_MAIL_BOX.get());
                        output.accept(ModBlocks.UMBRAN_MAIL_BOX.get());
                        output.accept(ModBlocks.HELLBARK_MAIL_BOX.get());
                        output.accept(ModBlocks.EMPYREAL_MAIL_BOX.get());

                        // === STORAGE CABINETS ===
                        output.accept(ModBlocks.FIR_STORAGE_CABINET.get());
                        output.accept(ModBlocks.PINE_STORAGE_CABINET.get());
                        output.accept(ModBlocks.MAPLE_STORAGE_CABINET.get());
                        output.accept(ModBlocks.REDWOOD_STORAGE_CABINET.get());
                        output.accept(ModBlocks.MAHOGANY_STORAGE_CABINET.get());
                        output.accept(ModBlocks.JACARANDA_STORAGE_CABINET.get());
                        output.accept(ModBlocks.PALM_STORAGE_CABINET.get());
                        output.accept(ModBlocks.WILLOW_STORAGE_CABINET.get());
                        output.accept(ModBlocks.DEAD_STORAGE_CABINET.get());
                        output.accept(ModBlocks.MAGIC_STORAGE_CABINET.get());
                        output.accept(ModBlocks.UMBRAN_STORAGE_CABINET.get());
                        output.accept(ModBlocks.HELLBARK_STORAGE_CABINET.get());
                        output.accept(ModBlocks.EMPYREAL_STORAGE_CABINET.get());

                        // === STORAGE JARS ===
                        output.accept(ModBlocks.FIR_STORAGE_JAR.get());
                        output.accept(ModBlocks.PINE_STORAGE_JAR.get());
                        output.accept(ModBlocks.MAPLE_STORAGE_JAR.get());
                        output.accept(ModBlocks.REDWOOD_STORAGE_JAR.get());
                        output.accept(ModBlocks.MAHOGANY_STORAGE_JAR.get());
                        output.accept(ModBlocks.JACARANDA_STORAGE_JAR.get());
                        output.accept(ModBlocks.PALM_STORAGE_JAR.get());
                        output.accept(ModBlocks.WILLOW_STORAGE_JAR.get());
                        output.accept(ModBlocks.DEAD_STORAGE_JAR.get());
                        output.accept(ModBlocks.MAGIC_STORAGE_JAR.get());
                        output.accept(ModBlocks.UMBRAN_STORAGE_JAR.get());
                        output.accept(ModBlocks.HELLBARK_STORAGE_JAR.get());
                        output.accept(ModBlocks.EMPYREAL_STORAGE_JAR.get());

                        // === TABLES ===
                        output.accept(ModBlocks.FIR_TABLE.get());
                        output.accept(ModBlocks.PINE_TABLE.get());
                        output.accept(ModBlocks.MAPLE_TABLE.get());
                        output.accept(ModBlocks.REDWOOD_TABLE.get());
                        output.accept(ModBlocks.MAHOGANY_TABLE.get());
                        output.accept(ModBlocks.JACARANDA_TABLE.get());
                        output.accept(ModBlocks.PALM_TABLE.get());
                        output.accept(ModBlocks.WILLOW_TABLE.get());
                        output.accept(ModBlocks.DEAD_TABLE.get());
                        output.accept(ModBlocks.MAGIC_TABLE.get());
                        output.accept(ModBlocks.UMBRAN_TABLE.get());
                        output.accept(ModBlocks.HELLBARK_TABLE.get());
                        output.accept(ModBlocks.EMPYREAL_TABLE.get());

                        // === TOILETS ===
                        output.accept(ModBlocks.FIR_TOILET.get());
                        output.accept(ModBlocks.PINE_TOILET.get());
                        output.accept(ModBlocks.MAPLE_TOILET.get());
                        output.accept(ModBlocks.REDWOOD_TOILET.get());
                        output.accept(ModBlocks.MAHOGANY_TOILET.get());
                        output.accept(ModBlocks.JACARANDA_TOILET.get());
                        output.accept(ModBlocks.PALM_TOILET.get());
                        output.accept(ModBlocks.WILLOW_TOILET.get());
                        output.accept(ModBlocks.DEAD_TOILET.get());
                        output.accept(ModBlocks.MAGIC_TOILET.get());
                        output.accept(ModBlocks.UMBRAN_TOILET.get());
                        output.accept(ModBlocks.HELLBARK_TOILET.get());
                        output.accept(ModBlocks.EMPYREAL_TOILET.get());
                        
                        })
                    .build());
	
	@SuppressWarnings("removal")
	public static void register() {
		CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
