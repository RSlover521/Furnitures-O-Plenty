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
                        output.accept(ModItems.FIR_BASIN.get());
                        output.accept(ModItems.PINE_BASIN.get());
                        output.accept(ModItems.MAPLE_BASIN.get());
                        output.accept(ModItems.REDWOOD_BASIN.get());
                        output.accept(ModItems.MAHOGANY_BASIN.get());
                        output.accept(ModItems.JACARANDA_BASIN.get());
                        output.accept(ModItems.PALM_BASIN.get());
                        output.accept(ModItems.WILLOW_BASIN.get());
                        output.accept(ModItems.DEAD_BASIN.get());
                        output.accept(ModItems.MAGIC_BASIN.get());
                        output.accept(ModItems.UMBRAN_BASIN.get());
                        output.accept(ModItems.HELLBARK_BASIN.get());
                        output.accept(ModItems.EMPYREAL_BASIN.get());

                        // === BATHS ===
                        output.accept(ModItems.FIR_BATH.get());
                        output.accept(ModItems.PINE_BATH.get());
                        output.accept(ModItems.MAPLE_BATH.get());
                        output.accept(ModItems.REDWOOD_BATH.get());
                        output.accept(ModItems.MAHOGANY_BATH.get());
                        output.accept(ModItems.JACARANDA_BATH.get());
                        output.accept(ModItems.PALM_BATH.get());
                        output.accept(ModItems.WILLOW_BATH.get());
                        output.accept(ModItems.DEAD_BATH.get());
                        output.accept(ModItems.MAGIC_BATH.get());
                        output.accept(ModItems.UMBRAN_BATH.get());
                        output.accept(ModItems.HELLBARK_BATH.get());
                        output.accept(ModItems.EMPYREAL_BATH.get());

                        // === LIGHT CEILING FANS ===
                        output.accept(ModItems.FIR_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.PINE_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.MAPLE_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.REDWOOD_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.MAHOGANY_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.JACARANDA_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.PALM_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.WILLOW_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.DEAD_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.MAGIC_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.UMBRAN_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.HELLBARK_LIGHT_CEILING_FAN.get());
                        output.accept(ModItems.EMPYREAL_LIGHT_CEILING_FAN.get());

                        // === DARK CEILING FANS ===
                        output.accept(ModItems.FIR_DARK_CEILING_FAN.get());
                        output.accept(ModItems.PINE_DARK_CEILING_FAN.get());
                        output.accept(ModItems.MAPLE_DARK_CEILING_FAN.get());
                        output.accept(ModItems.REDWOOD_DARK_CEILING_FAN.get());
                        output.accept(ModItems.MAHOGANY_DARK_CEILING_FAN.get());
                        output.accept(ModItems.JACARANDA_DARK_CEILING_FAN.get());
                        output.accept(ModItems.PALM_DARK_CEILING_FAN.get());
                        output.accept(ModItems.WILLOW_DARK_CEILING_FAN.get());
                        output.accept(ModItems.DEAD_DARK_CEILING_FAN.get());
                        output.accept(ModItems.MAGIC_DARK_CEILING_FAN.get());
                        output.accept(ModItems.UMBRAN_DARK_CEILING_FAN.get());
                        output.accept(ModItems.HELLBARK_DARK_CEILING_FAN.get());
                        output.accept(ModItems.EMPYREAL_DARK_CEILING_FAN.get());

                        // === CHAIRS ===
                        output.accept(ModItems.FIR_CHAIR.get());
                        output.accept(ModItems.PINE_CHAIR.get());
                        output.accept(ModItems.MAPLE_CHAIR.get());
                        output.accept(ModItems.REDWOOD_CHAIR.get());
                        output.accept(ModItems.MAHOGANY_CHAIR.get());
                        output.accept(ModItems.JACARANDA_CHAIR.get());
                        output.accept(ModItems.PALM_CHAIR.get());
                        output.accept(ModItems.WILLOW_CHAIR.get());
                        output.accept(ModItems.DEAD_CHAIR.get());
                        output.accept(ModItems.MAGIC_CHAIR.get());
                        output.accept(ModItems.UMBRAN_CHAIR.get());
                        output.accept(ModItems.HELLBARK_CHAIR.get());
                        output.accept(ModItems.EMPYREAL_CHAIR.get());

                        // === CRATES ===
                        output.accept(ModItems.FIR_CRATE.get());
                        output.accept(ModItems.PINE_CRATE.get());
                        output.accept(ModItems.MAPLE_CRATE.get());
                        output.accept(ModItems.REDWOOD_CRATE.get());
                        output.accept(ModItems.MAHOGANY_CRATE.get());
                        output.accept(ModItems.JACARANDA_CRATE.get());
                        output.accept(ModItems.PALM_CRATE.get());
                        output.accept(ModItems.WILLOW_CRATE.get());
                        output.accept(ModItems.DEAD_CRATE.get());
                        output.accept(ModItems.MAGIC_CRATE.get());
                        output.accept(ModItems.UMBRAN_CRATE.get());
                        output.accept(ModItems.HELLBARK_CRATE.get());
                        output.accept(ModItems.EMPYREAL_CRATE.get());

                        // === CUTTING BOARDS ===
                        output.accept(ModItems.FIR_CUTTING_BOARD.get());
                        output.accept(ModItems.PINE_CUTTING_BOARD.get());
                        output.accept(ModItems.MAPLE_CUTTING_BOARD.get());
                        output.accept(ModItems.REDWOOD_CUTTING_BOARD.get());
                        output.accept(ModItems.MAHOGANY_CUTTING_BOARD.get());
                        output.accept(ModItems.JACARANDA_CUTTING_BOARD.get());
                        output.accept(ModItems.PALM_CUTTING_BOARD.get());
                        output.accept(ModItems.WILLOW_CUTTING_BOARD.get());
                        output.accept(ModItems.DEAD_CUTTING_BOARD.get());
                        output.accept(ModItems.MAGIC_CUTTING_BOARD.get());
                        output.accept(ModItems.UMBRAN_CUTTING_BOARD.get());
                        output.accept(ModItems.HELLBARK_CUTTING_BOARD.get());
                        output.accept(ModItems.EMPYREAL_CUTTING_BOARD.get());

                        // === DESKS ===
                        output.accept(ModItems.FIR_DESK.get());
                        output.accept(ModItems.PINE_DESK.get());
                        output.accept(ModItems.MAPLE_DESK.get());
                        output.accept(ModItems.REDWOOD_DESK.get());
                        output.accept(ModItems.MAHOGANY_DESK.get());
                        output.accept(ModItems.JACARANDA_DESK.get());
                        output.accept(ModItems.PALM_DESK.get());
                        output.accept(ModItems.WILLOW_DESK.get());
                        output.accept(ModItems.DEAD_DESK.get());
                        output.accept(ModItems.MAGIC_DESK.get());
                        output.accept(ModItems.UMBRAN_DESK.get());
                        output.accept(ModItems.HELLBARK_DESK.get());
                        output.accept(ModItems.EMPYREAL_DESK.get());

                        // === DRAWERS ===
                        output.accept(ModItems.FIR_DRAWER.get());
                        output.accept(ModItems.PINE_DRAWER.get());
                        output.accept(ModItems.MAPLE_DRAWER.get());
                        output.accept(ModItems.REDWOOD_DRAWER.get());
                        output.accept(ModItems.MAHOGANY_DRAWER.get());
                        output.accept(ModItems.JACARANDA_DRAWER.get());
                        output.accept(ModItems.PALM_DRAWER.get());
                        output.accept(ModItems.WILLOW_DRAWER.get());
                        output.accept(ModItems.DEAD_DRAWER.get());
                        output.accept(ModItems.MAGIC_DRAWER.get());
                        output.accept(ModItems.UMBRAN_DRAWER.get());
                        output.accept(ModItems.HELLBARK_DRAWER.get());
                        output.accept(ModItems.EMPYREAL_DRAWER.get());

                        // === KITCHEN CABINETRYS ===
                        output.accept(ModItems.FIR_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.PINE_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.MAPLE_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.REDWOOD_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.MAHOGANY_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.JACARANDA_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.PALM_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.WILLOW_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.DEAD_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.MAGIC_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.UMBRAN_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.HELLBARK_KITCHEN_CABINETRY.get());
                        output.accept(ModItems.EMPYREAL_KITCHEN_CABINETRY.get());

                        // === KITCHEN DRAWERS ===
                        output.accept(ModItems.FIR_KITCHEN_DRAWER.get());
                        output.accept(ModItems.PINE_KITCHEN_DRAWER.get());
                        output.accept(ModItems.MAPLE_KITCHEN_DRAWER.get());
                        output.accept(ModItems.REDWOOD_KITCHEN_DRAWER.get());
                        output.accept(ModItems.MAHOGANY_KITCHEN_DRAWER.get());
                        output.accept(ModItems.JACARANDA_KITCHEN_DRAWER.get());
                        output.accept(ModItems.PALM_KITCHEN_DRAWER.get());
                        output.accept(ModItems.WILLOW_KITCHEN_DRAWER.get());
                        output.accept(ModItems.DEAD_KITCHEN_DRAWER.get());
                        output.accept(ModItems.MAGIC_KITCHEN_DRAWER.get());
                        output.accept(ModItems.UMBRAN_KITCHEN_DRAWER.get());
                        output.accept(ModItems.HELLBARK_KITCHEN_DRAWER.get());
                        output.accept(ModItems.EMPYREAL_KITCHEN_DRAWER.get());

                        // === KITCHEN SINKS ===
                        output.accept(ModItems.FIR_KITCHEN_SINK.get());
                        output.accept(ModItems.PINE_KITCHEN_SINK.get());
                        output.accept(ModItems.MAPLE_KITCHEN_SINK.get());
                        output.accept(ModItems.REDWOOD_KITCHEN_SINK.get());
                        output.accept(ModItems.MAHOGANY_KITCHEN_SINK.get());
                        output.accept(ModItems.JACARANDA_KITCHEN_SINK.get());
                        output.accept(ModItems.PALM_KITCHEN_SINK.get());
                        output.accept(ModItems.WILLOW_KITCHEN_SINK.get());
                        output.accept(ModItems.DEAD_KITCHEN_SINK.get());
                        output.accept(ModItems.MAGIC_KITCHEN_SINK.get());
                        output.accept(ModItems.UMBRAN_KITCHEN_SINK.get());
                        output.accept(ModItems.HELLBARK_KITCHEN_SINK.get());
                        output.accept(ModItems.EMPYREAL_KITCHEN_SINK.get());

                        // === KITCHEN STORAGE CABINETS ===
                        output.accept(ModItems.FIR_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.PINE_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.MAPLE_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.REDWOOD_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.MAHOGANY_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.JACARANDA_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.PALM_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.WILLOW_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.DEAD_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.MAGIC_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.UMBRAN_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.HELLBARK_KITCHEN_STORAGE_CABINET.get());
                        output.accept(ModItems.EMPYREAL_KITCHEN_STORAGE_CABINET.get());

                        // === LATTICE FENCE GATES ===
                        output.accept(ModItems.FIR_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.PINE_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.MAPLE_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.REDWOOD_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.MAHOGANY_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.JACARANDA_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.PALM_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.WILLOW_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.DEAD_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.MAGIC_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.UMBRAN_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.HELLBARK_LATTICE_FENCE_GATE.get());
                        output.accept(ModItems.EMPYREAL_LATTICE_FENCE_GATE.get());

                        // === LATTICE FENCES ===
                        output.accept(ModItems.FIR_LATTICE_FENCE.get());
                        output.accept(ModItems.PINE_LATTICE_FENCE.get());
                        output.accept(ModItems.MAPLE_LATTICE_FENCE.get());
                        output.accept(ModItems.REDWOOD_LATTICE_FENCE.get());
                        output.accept(ModItems.MAHOGANY_LATTICE_FENCE.get());
                        output.accept(ModItems.JACARANDA_LATTICE_FENCE.get());
                        output.accept(ModItems.PALM_LATTICE_FENCE.get());
                        output.accept(ModItems.WILLOW_LATTICE_FENCE.get());
                        output.accept(ModItems.DEAD_LATTICE_FENCE.get());
                        output.accept(ModItems.MAGIC_LATTICE_FENCE.get());
                        output.accept(ModItems.UMBRAN_LATTICE_FENCE.get());
                        output.accept(ModItems.HELLBARK_LATTICE_FENCE.get());
                        output.accept(ModItems.EMPYREAL_LATTICE_FENCE.get());

                        // === MAIL BOXS ===
                        output.accept(ModItems.FIR_MAIL_BOX.get());
                        output.accept(ModItems.PINE_MAIL_BOX.get());
                        output.accept(ModItems.MAPLE_MAIL_BOX.get());
                        output.accept(ModItems.REDWOOD_MAIL_BOX.get());
                        output.accept(ModItems.MAHOGANY_MAIL_BOX.get());
                        output.accept(ModItems.JACARANDA_MAIL_BOX.get());
                        output.accept(ModItems.PALM_MAIL_BOX.get());
                        output.accept(ModItems.WILLOW_MAIL_BOX.get());
                        output.accept(ModItems.DEAD_MAIL_BOX.get());
                        output.accept(ModItems.MAGIC_MAIL_BOX.get());
                        output.accept(ModItems.UMBRAN_MAIL_BOX.get());
                        output.accept(ModItems.HELLBARK_MAIL_BOX.get());
                        output.accept(ModItems.EMPYREAL_MAIL_BOX.get());

                        // === STORAGE CABINETS ===
                        output.accept(ModItems.FIR_STORAGE_CABINET.get());
                        output.accept(ModItems.PINE_STORAGE_CABINET.get());
                        output.accept(ModItems.MAPLE_STORAGE_CABINET.get());
                        output.accept(ModItems.REDWOOD_STORAGE_CABINET.get());
                        output.accept(ModItems.MAHOGANY_STORAGE_CABINET.get());
                        output.accept(ModItems.JACARANDA_STORAGE_CABINET.get());
                        output.accept(ModItems.PALM_STORAGE_CABINET.get());
                        output.accept(ModItems.WILLOW_STORAGE_CABINET.get());
                        output.accept(ModItems.DEAD_STORAGE_CABINET.get());
                        output.accept(ModItems.MAGIC_STORAGE_CABINET.get());
                        output.accept(ModItems.UMBRAN_STORAGE_CABINET.get());
                        output.accept(ModItems.HELLBARK_STORAGE_CABINET.get());
                        output.accept(ModItems.EMPYREAL_STORAGE_CABINET.get());

                        // === STORAGE JARS ===
                        output.accept(ModItems.FIR_STORAGE_JAR.get());
                        output.accept(ModItems.PINE_STORAGE_JAR.get());
                        output.accept(ModItems.MAPLE_STORAGE_JAR.get());
                        output.accept(ModItems.REDWOOD_STORAGE_JAR.get());
                        output.accept(ModItems.MAHOGANY_STORAGE_JAR.get());
                        output.accept(ModItems.JACARANDA_STORAGE_JAR.get());
                        output.accept(ModItems.PALM_STORAGE_JAR.get());
                        output.accept(ModItems.WILLOW_STORAGE_JAR.get());
                        output.accept(ModItems.DEAD_STORAGE_JAR.get());
                        output.accept(ModItems.MAGIC_STORAGE_JAR.get());
                        output.accept(ModItems.UMBRAN_STORAGE_JAR.get());
                        output.accept(ModItems.HELLBARK_STORAGE_JAR.get());
                        output.accept(ModItems.EMPYREAL_STORAGE_JAR.get());

                        // === TABLES ===
                        output.accept(ModItems.FIR_TABLE.get());
                        output.accept(ModItems.PINE_TABLE.get());
                        output.accept(ModItems.MAPLE_TABLE.get());
                        output.accept(ModItems.REDWOOD_TABLE.get());
                        output.accept(ModItems.MAHOGANY_TABLE.get());
                        output.accept(ModItems.JACARANDA_TABLE.get());
                        output.accept(ModItems.PALM_TABLE.get());
                        output.accept(ModItems.WILLOW_TABLE.get());
                        output.accept(ModItems.DEAD_TABLE.get());
                        output.accept(ModItems.MAGIC_TABLE.get());
                        output.accept(ModItems.UMBRAN_TABLE.get());
                        output.accept(ModItems.HELLBARK_TABLE.get());
                        output.accept(ModItems.EMPYREAL_TABLE.get());

                        // === TOILETS ===
                        output.accept(ModItems.FIR_TOILET.get());
                        output.accept(ModItems.PINE_TOILET.get());
                        output.accept(ModItems.MAPLE_TOILET.get());
                        output.accept(ModItems.REDWOOD_TOILET.get());
                        output.accept(ModItems.MAHOGANY_TOILET.get());
                        output.accept(ModItems.JACARANDA_TOILET.get());
                        output.accept(ModItems.PALM_TOILET.get());
                        output.accept(ModItems.WILLOW_TOILET.get());
                        output.accept(ModItems.DEAD_TOILET.get());
                        output.accept(ModItems.MAGIC_TOILET.get());
                        output.accept(ModItems.UMBRAN_TOILET.get());
                        output.accept(ModItems.HELLBARK_TOILET.get());
                        output.accept(ModItems.EMPYREAL_TOILET.get());                        
                        })
                    .build());
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}
