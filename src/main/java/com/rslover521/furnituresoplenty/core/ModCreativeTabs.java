package com.rslover521.furnituresoplenty.core;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.ItemLike;
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
                        accept(output, ModItems.FIR_BASIN);
                        accept(output, ModItems.PINE_BASIN);
                        accept(output, ModItems.MAPLE_BASIN);
                        accept(output, ModItems.REDWOOD_BASIN);
                        accept(output, ModItems.MAHOGANY_BASIN);
                        accept(output, ModItems.JACARANDA_BASIN);
                        accept(output, ModItems.PALM_BASIN);
                        accept(output, ModItems.WILLOW_BASIN);
                        accept(output, ModItems.DEAD_BASIN);
                        accept(output, ModItems.MAGIC_BASIN);
                        accept(output, ModItems.UMBRAN_BASIN);
                        accept(output, ModItems.HELLBARK_BASIN);
                        accept(output, ModItems.EMPYREAL_BASIN);

                        // === BATHS ===
                        accept(output, ModItems.FIR_BATH);
                        accept(output, ModItems.PINE_BATH);
                        accept(output, ModItems.MAPLE_BATH);
                        accept(output, ModItems.REDWOOD_BATH);
                        accept(output, ModItems.MAHOGANY_BATH);
                        accept(output, ModItems.JACARANDA_BATH);
                        accept(output, ModItems.PALM_BATH);
                        accept(output, ModItems.WILLOW_BATH);
                        accept(output, ModItems.DEAD_BATH);
                        accept(output, ModItems.MAGIC_BATH);
                        accept(output, ModItems.UMBRAN_BATH);
                        accept(output, ModItems.HELLBARK_BATH);
                        accept(output, ModItems.EMPYREAL_BATH);

                        // === LIGHT CEILING FANS ===
                        accept(output, ModItems.FIR_LIGHT_CEILING_FAN);
                        accept(output, ModItems.PINE_LIGHT_CEILING_FAN);
                        accept(output, ModItems.MAPLE_LIGHT_CEILING_FAN);
                        accept(output, ModItems.REDWOOD_LIGHT_CEILING_FAN);
                        accept(output, ModItems.MAHOGANY_LIGHT_CEILING_FAN);
                        accept(output, ModItems.JACARANDA_LIGHT_CEILING_FAN);
                        accept(output, ModItems.PALM_LIGHT_CEILING_FAN);
                        accept(output, ModItems.WILLOW_LIGHT_CEILING_FAN);
                        accept(output, ModItems.DEAD_LIGHT_CEILING_FAN);
                        accept(output, ModItems.MAGIC_LIGHT_CEILING_FAN);
                        accept(output, ModItems.UMBRAN_LIGHT_CEILING_FAN);
                        accept(output, ModItems.HELLBARK_LIGHT_CEILING_FAN);
                        accept(output, ModItems.EMPYREAL_LIGHT_CEILING_FAN);

                        // === DARK CEILING FANS ===
                        accept(output, ModItems.FIR_DARK_CEILING_FAN);
                        accept(output, ModItems.PINE_DARK_CEILING_FAN);
                        accept(output, ModItems.MAPLE_DARK_CEILING_FAN);
                        accept(output, ModItems.REDWOOD_DARK_CEILING_FAN);
                        accept(output, ModItems.MAHOGANY_DARK_CEILING_FAN);
                        accept(output, ModItems.JACARANDA_DARK_CEILING_FAN);
                        accept(output, ModItems.PALM_DARK_CEILING_FAN);
                        accept(output, ModItems.WILLOW_DARK_CEILING_FAN);
                        accept(output, ModItems.DEAD_DARK_CEILING_FAN);
                        accept(output, ModItems.MAGIC_DARK_CEILING_FAN);
                        accept(output, ModItems.UMBRAN_DARK_CEILING_FAN);
                        accept(output, ModItems.HELLBARK_DARK_CEILING_FAN);
                        accept(output, ModItems.EMPYREAL_DARK_CEILING_FAN);

                        // === CHAIRS ===
                        accept(output, ModItems.FIR_CHAIR);
                        accept(output, ModItems.PINE_CHAIR);
                        accept(output, ModItems.MAPLE_CHAIR);
                        accept(output, ModItems.REDWOOD_CHAIR);
                        accept(output, ModItems.MAHOGANY_CHAIR);
                        accept(output, ModItems.JACARANDA_CHAIR);
                        accept(output, ModItems.PALM_CHAIR);
                        accept(output, ModItems.WILLOW_CHAIR);
                        accept(output, ModItems.DEAD_CHAIR);
                        accept(output, ModItems.MAGIC_CHAIR);
                        accept(output, ModItems.UMBRAN_CHAIR);
                        accept(output, ModItems.HELLBARK_CHAIR);
                        accept(output, ModItems.EMPYREAL_CHAIR);

                        // === CRATES ===
                        accept(output, ModItems.FIR_CRATE);
                        accept(output, ModItems.PINE_CRATE);
                        accept(output, ModItems.MAPLE_CRATE);
                        accept(output, ModItems.REDWOOD_CRATE);
                        accept(output, ModItems.MAHOGANY_CRATE);
                        accept(output, ModItems.JACARANDA_CRATE);
                        accept(output, ModItems.PALM_CRATE);
                        accept(output, ModItems.WILLOW_CRATE);
                        accept(output, ModItems.DEAD_CRATE);
                        accept(output, ModItems.MAGIC_CRATE);
                        accept(output, ModItems.UMBRAN_CRATE);
                        accept(output, ModItems.HELLBARK_CRATE);
                        accept(output, ModItems.EMPYREAL_CRATE);

                        // === CUTTING BOARDS ===
                        accept(output, ModItems.FIR_CUTTING_BOARD);
                        accept(output, ModItems.PINE_CUTTING_BOARD);
                        accept(output, ModItems.MAPLE_CUTTING_BOARD);
                        accept(output, ModItems.REDWOOD_CUTTING_BOARD);
                        accept(output, ModItems.MAHOGANY_CUTTING_BOARD);
                        accept(output, ModItems.JACARANDA_CUTTING_BOARD);
                        accept(output, ModItems.PALM_CUTTING_BOARD);
                        accept(output, ModItems.WILLOW_CUTTING_BOARD);
                        accept(output, ModItems.DEAD_CUTTING_BOARD);
                        accept(output, ModItems.MAGIC_CUTTING_BOARD);
                        accept(output, ModItems.UMBRAN_CUTTING_BOARD);
                        accept(output, ModItems.HELLBARK_CUTTING_BOARD);
                        accept(output, ModItems.EMPYREAL_CUTTING_BOARD);

                        // === DESKS ===
                        accept(output, ModItems.FIR_DESK);
                        accept(output, ModItems.PINE_DESK);
                        accept(output, ModItems.MAPLE_DESK);
                        accept(output, ModItems.REDWOOD_DESK);
                        accept(output, ModItems.MAHOGANY_DESK);
                        accept(output, ModItems.JACARANDA_DESK);
                        accept(output, ModItems.PALM_DESK);
                        accept(output, ModItems.WILLOW_DESK);
                        accept(output, ModItems.DEAD_DESK);
                        accept(output, ModItems.MAGIC_DESK);
                        accept(output, ModItems.UMBRAN_DESK);
                        accept(output, ModItems.HELLBARK_DESK);
                        accept(output, ModItems.EMPYREAL_DESK);

                        // === DRAWERS ===
                        accept(output, ModItems.FIR_DRAWER);
                        accept(output, ModItems.PINE_DRAWER);
                        accept(output, ModItems.MAPLE_DRAWER);
                        accept(output, ModItems.REDWOOD_DRAWER);
                        accept(output, ModItems.MAHOGANY_DRAWER);
                        accept(output, ModItems.JACARANDA_DRAWER);
                        accept(output, ModItems.PALM_DRAWER);
                        accept(output, ModItems.WILLOW_DRAWER);
                        accept(output, ModItems.DEAD_DRAWER);
                        accept(output, ModItems.MAGIC_DRAWER);
                        accept(output, ModItems.UMBRAN_DRAWER);
                        accept(output, ModItems.HELLBARK_DRAWER);
                        accept(output, ModItems.EMPYREAL_DRAWER);

                        // === KITCHEN CABINETRYS ===
                        accept(output, ModItems.FIR_KITCHEN_CABINETRY);
                        accept(output, ModItems.PINE_KITCHEN_CABINETRY);
                        accept(output, ModItems.MAPLE_KITCHEN_CABINETRY);
                        accept(output, ModItems.REDWOOD_KITCHEN_CABINETRY);
                        accept(output, ModItems.MAHOGANY_KITCHEN_CABINETRY);
                        accept(output, ModItems.JACARANDA_KITCHEN_CABINETRY);
                        accept(output, ModItems.PALM_KITCHEN_CABINETRY);
                        accept(output, ModItems.WILLOW_KITCHEN_CABINETRY);
                        accept(output, ModItems.DEAD_KITCHEN_CABINETRY);
                        accept(output, ModItems.MAGIC_KITCHEN_CABINETRY);
                        accept(output, ModItems.UMBRAN_KITCHEN_CABINETRY);
                        accept(output, ModItems.HELLBARK_KITCHEN_CABINETRY);
                        accept(output, ModItems.EMPYREAL_KITCHEN_CABINETRY);

                        // === KITCHEN DRAWERS ===
                        accept(output, ModItems.FIR_KITCHEN_DRAWER);
                        accept(output, ModItems.PINE_KITCHEN_DRAWER);
                        accept(output, ModItems.MAPLE_KITCHEN_DRAWER);
                        accept(output, ModItems.REDWOOD_KITCHEN_DRAWER);
                        accept(output, ModItems.MAHOGANY_KITCHEN_DRAWER);
                        accept(output, ModItems.JACARANDA_KITCHEN_DRAWER);
                        accept(output, ModItems.PALM_KITCHEN_DRAWER);
                        accept(output, ModItems.WILLOW_KITCHEN_DRAWER);
                        accept(output, ModItems.DEAD_KITCHEN_DRAWER);
                        accept(output, ModItems.MAGIC_KITCHEN_DRAWER);
                        accept(output, ModItems.UMBRAN_KITCHEN_DRAWER);
                        accept(output, ModItems.HELLBARK_KITCHEN_DRAWER);
                        accept(output, ModItems.EMPYREAL_KITCHEN_DRAWER);

                        // === KITCHEN SINKS ===
                        accept(output, ModItems.FIR_KITCHEN_SINK);
                        accept(output, ModItems.PINE_KITCHEN_SINK);
                        accept(output, ModItems.MAPLE_KITCHEN_SINK);
                        accept(output, ModItems.REDWOOD_KITCHEN_SINK);
                        accept(output, ModItems.MAHOGANY_KITCHEN_SINK);
                        accept(output, ModItems.JACARANDA_KITCHEN_SINK);
                        accept(output, ModItems.PALM_KITCHEN_SINK);
                        accept(output, ModItems.WILLOW_KITCHEN_SINK);
                        accept(output, ModItems.DEAD_KITCHEN_SINK);
                        accept(output, ModItems.MAGIC_KITCHEN_SINK);
                        accept(output, ModItems.UMBRAN_KITCHEN_SINK);
                        accept(output, ModItems.HELLBARK_KITCHEN_SINK);
                        accept(output, ModItems.EMPYREAL_KITCHEN_SINK);

                        // === KITCHEN STORAGE CABINETS ===
                        accept(output, ModItems.FIR_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.PINE_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.MAPLE_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.REDWOOD_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.MAHOGANY_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.JACARANDA_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.PALM_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.WILLOW_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.DEAD_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.MAGIC_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.UMBRAN_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.HELLBARK_KITCHEN_STORAGE_CABINET);
                        accept(output, ModItems.EMPYREAL_KITCHEN_STORAGE_CABINET);

                        // === LATTICE FENCE GATES ===
                        accept(output, ModItems.FIR_LATTICE_FENCE_GATE);
                        accept(output, ModItems.PINE_LATTICE_FENCE_GATE);
                        accept(output, ModItems.MAPLE_LATTICE_FENCE_GATE);
                        accept(output, ModItems.REDWOOD_LATTICE_FENCE_GATE);
                        accept(output, ModItems.MAHOGANY_LATTICE_FENCE_GATE);
                        accept(output, ModItems.JACARANDA_LATTICE_FENCE_GATE);
                        accept(output, ModItems.PALM_LATTICE_FENCE_GATE);
                        accept(output, ModItems.WILLOW_LATTICE_FENCE_GATE);
                        accept(output, ModItems.DEAD_LATTICE_FENCE_GATE);
                        accept(output, ModItems.MAGIC_LATTICE_FENCE_GATE);
                        accept(output, ModItems.UMBRAN_LATTICE_FENCE_GATE);
                        accept(output, ModItems.HELLBARK_LATTICE_FENCE_GATE);
                        accept(output, ModItems.EMPYREAL_LATTICE_FENCE_GATE);

                        // === LATTICE FENCES ===
                        accept(output, ModItems.FIR_LATTICE_FENCE);
                        accept(output, ModItems.PINE_LATTICE_FENCE);
                        accept(output, ModItems.MAPLE_LATTICE_FENCE);
                        accept(output, ModItems.REDWOOD_LATTICE_FENCE);
                        accept(output, ModItems.MAHOGANY_LATTICE_FENCE);
                        accept(output, ModItems.JACARANDA_LATTICE_FENCE);
                        accept(output, ModItems.PALM_LATTICE_FENCE);
                        accept(output, ModItems.WILLOW_LATTICE_FENCE);
                        accept(output, ModItems.DEAD_LATTICE_FENCE);
                        accept(output, ModItems.MAGIC_LATTICE_FENCE);
                        accept(output, ModItems.UMBRAN_LATTICE_FENCE);
                        accept(output, ModItems.HELLBARK_LATTICE_FENCE);
                        accept(output, ModItems.EMPYREAL_LATTICE_FENCE);

                        // === MAIL BOXS ===
                        accept(output, ModItems.FIR_MAIL_BOX);
                        accept(output, ModItems.PINE_MAIL_BOX);
                        accept(output, ModItems.MAPLE_MAIL_BOX);
                        accept(output, ModItems.REDWOOD_MAIL_BOX);
                        accept(output, ModItems.MAHOGANY_MAIL_BOX);
                        accept(output, ModItems.JACARANDA_MAIL_BOX);
                        accept(output, ModItems.PALM_MAIL_BOX);
                        accept(output, ModItems.WILLOW_MAIL_BOX);
                        accept(output, ModItems.DEAD_MAIL_BOX);
                        accept(output, ModItems.MAGIC_MAIL_BOX);
                        accept(output, ModItems.UMBRAN_MAIL_BOX);
                        accept(output, ModItems.HELLBARK_MAIL_BOX);
                        accept(output, ModItems.EMPYREAL_MAIL_BOX);

                        // === HEDGES ===
                        accept(output, ModItems.FLOWERING_OAK_HEDGE);
                        accept(output, ModItems.CYPRESS_HEDGE);
                        accept(output, ModItems.SNOWBLOSSOM_HEDGE);
                        accept(output, ModItems.RAINBOW_BIRCH_HEDGE);
                        accept(output, ModItems.FIR_HEDGE);
                        accept(output, ModItems.PINE_HEDGE);
                        accept(output, ModItems.RED_MAPLE_HEDGE);
                        accept(output, ModItems.ORANGE_MAPLE_HEDGE);
                        accept(output, ModItems.YELLOW_MAPLE_HEDGE);
                        accept(output, ModItems.REDWOOD_HEDGE);
                        accept(output, ModItems.MAHOGANY_HEDGE);
                        accept(output, ModItems.JACARANDA_HEDGE);
                        accept(output, ModItems.PALM_HEDGE);
                        accept(output, ModItems.WILLOW_HEDGE);
                        accept(output, ModItems.DEAD_HEDGE);
                        accept(output, ModItems.MAGIC_HEDGE);
                        accept(output, ModItems.UMBRAN_HEDGE);
                        accept(output, ModItems.HELLBARK_HEDGE);
                        accept(output, ModItems.EMPYREAL_HEDGE);

                        // === STORAGE CABINETS ===
                        accept(output, ModItems.FIR_STORAGE_CABINET);
                        accept(output, ModItems.PINE_STORAGE_CABINET);
                        accept(output, ModItems.MAPLE_STORAGE_CABINET);
                        accept(output, ModItems.REDWOOD_STORAGE_CABINET);
                        accept(output, ModItems.MAHOGANY_STORAGE_CABINET);
                        accept(output, ModItems.JACARANDA_STORAGE_CABINET);
                        accept(output, ModItems.PALM_STORAGE_CABINET);
                        accept(output, ModItems.WILLOW_STORAGE_CABINET);
                        accept(output, ModItems.DEAD_STORAGE_CABINET);
                        accept(output, ModItems.MAGIC_STORAGE_CABINET);
                        accept(output, ModItems.UMBRAN_STORAGE_CABINET);
                        accept(output, ModItems.HELLBARK_STORAGE_CABINET);
                        accept(output, ModItems.EMPYREAL_STORAGE_CABINET);

                        // === STORAGE JARS ===
                        accept(output, ModItems.FIR_STORAGE_JAR);
                        accept(output, ModItems.PINE_STORAGE_JAR);
                        accept(output, ModItems.MAPLE_STORAGE_JAR);
                        accept(output, ModItems.REDWOOD_STORAGE_JAR);
                        accept(output, ModItems.MAHOGANY_STORAGE_JAR);
                        accept(output, ModItems.JACARANDA_STORAGE_JAR);
                        accept(output, ModItems.PALM_STORAGE_JAR);
                        accept(output, ModItems.WILLOW_STORAGE_JAR);
                        accept(output, ModItems.DEAD_STORAGE_JAR);
                        accept(output, ModItems.MAGIC_STORAGE_JAR);
                        accept(output, ModItems.UMBRAN_STORAGE_JAR);
                        accept(output, ModItems.HELLBARK_STORAGE_JAR);
                        accept(output, ModItems.EMPYREAL_STORAGE_JAR);

                        // === TABLES ===
                        accept(output, ModItems.FIR_TABLE);
                        accept(output, ModItems.PINE_TABLE);
                        accept(output, ModItems.MAPLE_TABLE);
                        accept(output, ModItems.REDWOOD_TABLE);
                        accept(output, ModItems.MAHOGANY_TABLE);
                        accept(output, ModItems.JACARANDA_TABLE);
                        accept(output, ModItems.PALM_TABLE);
                        accept(output, ModItems.WILLOW_TABLE);
                        accept(output, ModItems.DEAD_TABLE);
                        accept(output, ModItems.MAGIC_TABLE);
                        accept(output, ModItems.UMBRAN_TABLE);
                        accept(output, ModItems.HELLBARK_TABLE);
                        accept(output, ModItems.EMPYREAL_TABLE);

                        // === TOILETS ===
                        accept(output, ModItems.FIR_TOILET);
                        accept(output, ModItems.PINE_TOILET);
                        accept(output, ModItems.MAPLE_TOILET);
                        accept(output, ModItems.REDWOOD_TOILET);
                        accept(output, ModItems.MAHOGANY_TOILET);
                        accept(output, ModItems.JACARANDA_TOILET);
                        accept(output, ModItems.PALM_TOILET);
                        accept(output, ModItems.WILLOW_TOILET);
                        accept(output, ModItems.DEAD_TOILET);
                        accept(output, ModItems.MAGIC_TOILET);
                        accept(output, ModItems.UMBRAN_TOILET);
                        accept(output, ModItems.HELLBARK_TOILET);
                        accept(output, ModItems.EMPYREAL_TOILET);                        
                        })
                    .build());
	
	private static void accept(CreativeModeTab.Output output, RegistryObject<? extends ItemLike> item) {
		if (item.isPresent()) {
			output.accept(item.get());
		} else {
			FurnituresOPlenty.LOGGER.warn("Skipping missing creative tab item: {}", item.getId());
		}
	}

	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}
