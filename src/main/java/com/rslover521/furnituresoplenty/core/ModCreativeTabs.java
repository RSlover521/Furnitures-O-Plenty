package com.rslover521.furnituresoplenty.core;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
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
                        output.accept(new ItemStack(ModBlocks.FIR_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_BASIN.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_BASIN.get()));

                        // === BATHS ===
                        output.accept(new ItemStack(ModBlocks.FIR_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_BATH.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_BATH.get()));

                        // === LIGHT CEILING FANS ===
                        output.accept(new ItemStack(ModBlocks.FIR_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_LIGHT_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_LIGHT_CEILING_FAN.get()));

                        // === DARK CEILING FANS ===
                        output.accept(new ItemStack(ModBlocks.FIR_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_DARK_CEILING_FAN.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_DARK_CEILING_FAN.get()));

                        // === CHAIRS ===
                        output.accept(new ItemStack(ModBlocks.FIR_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_CHAIR.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_CHAIR.get()));

                        // === CRATES ===
                        output.accept(new ItemStack(ModBlocks.FIR_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_CRATE.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_CRATE.get()));

                        // === CUTTING BOARDS ===
                        output.accept(new ItemStack(ModBlocks.FIR_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_CUTTING_BOARD.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_CUTTING_BOARD.get()));

                        // === DESKS ===
                        output.accept(new ItemStack(ModBlocks.FIR_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_DESK.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_DESK.get()));

                        // === DRAWERS ===
                        output.accept(new ItemStack(ModBlocks.FIR_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_DRAWER.get()));

                        // === KITCHEN CABINETRYS ===
                        output.accept(new ItemStack(ModBlocks.FIR_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_KITCHEN_CABINETRY.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_KITCHEN_CABINETRY.get()));

                        // === KITCHEN DRAWERS ===
                        output.accept(new ItemStack(ModBlocks.FIR_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_KITCHEN_DRAWER.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_KITCHEN_DRAWER.get()));

                        // === KITCHEN SINKS ===
                        output.accept(new ItemStack(ModBlocks.FIR_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_KITCHEN_SINK.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_KITCHEN_SINK.get()));

                        // === KITCHEN STORAGE CABINETS ===
                        output.accept(new ItemStack(ModBlocks.FIR_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_KITCHEN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_KITCHEN_STORAGE_CABINET.get()));

                        // === LATTICE FENCE GATES ===
                        output.accept(new ItemStack(ModBlocks.FIR_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_LATTICE_FENCE_GATE.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_LATTICE_FENCE_GATE.get()));

                        // === LATTICE FENCES ===
                        output.accept(new ItemStack(ModBlocks.FIR_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_LATTICE_FENCE.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_LATTICE_FENCE.get()));

                        // === MAIL BOXS ===
                        output.accept(new ItemStack(ModBlocks.FIR_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_MAIL_BOX.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_MAIL_BOX.get()));

                        // === STORAGE CABINETS ===
                        output.accept(new ItemStack(ModBlocks.FIR_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_STORAGE_CABINET.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_STORAGE_CABINET.get()));

                        // === STORAGE JARS ===
                        output.accept(new ItemStack(ModBlocks.FIR_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_STORAGE_JAR.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_STORAGE_JAR.get()));

                        // === TABLES ===
                        output.accept(new ItemStack(ModBlocks.FIR_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_TABLE.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_TABLE.get()));

                        // === TOILETS ===
                        output.accept(new ItemStack(ModBlocks.FIR_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.PINE_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.MAPLE_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.REDWOOD_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.MAHOGANY_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.JACARANDA_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.PALM_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.WILLOW_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.DEAD_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.MAGIC_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.UMBRAN_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.HELLBARK_TOILET.get()));
                        output.accept(new ItemStack(ModBlocks.EMPYREAL_TOILET.get()));                        
                        })
                    .build());
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}
