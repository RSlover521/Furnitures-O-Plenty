package com.rslover521.furnituresoplenty.modItems;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomBasinBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomBathBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomCeilingFanBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomCrateBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomCuttingBoardBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomDrawerBlockEntity;
import com.rslover521.furnituresoplenty.customFurnitures.CustomCeilingFanBlock;
import com.rslover521.furnituresoplenty.customFurnitures.CustomCrateBlock;
import com.rslover521.furnituresoplenty.customFurnitures.CustomCuttingBoardBlock;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = 
			DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FurnituresOPlenty.MODID);

	@SuppressWarnings("null")
	public static final RegistryObject<BlockEntityType<CustomBasinBlockEntity>> CUSTOM_BASIN = 
			BLOCK_ENTITIES.register("custom_basin", 
					() -> BlockEntityType.Builder.of(CustomBasinBlockEntity::new, 
							ModBlocks.FIR_BASIN.get(),
							ModBlocks.PINE_BASIN.get(),
                    		ModBlocks.MAPLE_BASIN.get(),
                            ModBlocks.REDWOOD_BASIN.get(),
                            ModBlocks.MAHOGANY_BASIN.get(),
                            ModBlocks.JACARANDA_BASIN.get(),
                            ModBlocks.PALM_BASIN.get(),
                            ModBlocks.WILLOW_BASIN.get(),
                            ModBlocks.DEAD_BASIN.get(),
                            ModBlocks.MAGIC_BASIN.get(),
                            ModBlocks.UMBRAN_BASIN.get(),
                            ModBlocks.HELLBARK_BASIN.get(),
                            ModBlocks.EMPYREAL_BASIN.get()
					).build(null));

	@SuppressWarnings("null")
	public static final RegistryObject<BlockEntityType<CustomBathBlockEntity>> CUSTOM_BATH = 
			BLOCK_ENTITIES.register("custom_bath", 
					() -> BlockEntityType.Builder.of(CustomBathBlockEntity::new, 
							ModBlocks.DEAD_BATH.get(),
							ModBlocks.PINE_BATH.get(),
                    		ModBlocks.MAPLE_BATH.get(),
                            ModBlocks.REDWOOD_BATH.get(),
                            ModBlocks.MAHOGANY_BATH.get(),
                            ModBlocks.JACARANDA_BATH.get(),
                            ModBlocks.PALM_BATH.get(),
                            ModBlocks.WILLOW_BATH.get(),
                            ModBlocks.DEAD_BATH.get(),
                            ModBlocks.MAGIC_BATH.get(),
                            ModBlocks.UMBRAN_BATH.get(),
                            ModBlocks.HELLBARK_BATH.get(),
                            ModBlocks.EMPYREAL_BATH.get()
					).build(null));

	@SuppressWarnings("null")
	public static final RegistryObject<BlockEntityType<CustomCeilingFanBlockEntity>> CUSTOM_CEILING_FAN = 
			BLOCK_ENTITIES.register("custom_ceiling_fan", 
					() -> BlockEntityType.Builder.of(CustomCeilingFanBlockEntity::new, 
							// Dark Ceiling Fan
							ModBlocks.FIR_DARK_CEILING_FAN.get(),
							ModBlocks.DEAD_DARK_CEILING_FAN.get(),
							ModBlocks.PINE_DARK_CEILING_FAN.get(),
                    		ModBlocks.MAPLE_DARK_CEILING_FAN.get(),
                            ModBlocks.REDWOOD_DARK_CEILING_FAN.get(),
                            ModBlocks.MAHOGANY_DARK_CEILING_FAN.get(),
                            ModBlocks.JACARANDA_DARK_CEILING_FAN.get(),
                            ModBlocks.PALM_DARK_CEILING_FAN.get(),
                            ModBlocks.WILLOW_DARK_CEILING_FAN.get(),
                            ModBlocks.DEAD_DARK_CEILING_FAN.get(),
                            ModBlocks.MAGIC_DARK_CEILING_FAN.get(),
                            ModBlocks.UMBRAN_DARK_CEILING_FAN.get(),
                            ModBlocks.HELLBARK_DARK_CEILING_FAN.get(),
                            ModBlocks.EMPYREAL_DARK_CEILING_FAN.get(),

							// Light Ceiling Fan
							ModBlocks.FIR_LIGHT_CEILING_FAN.get(),
							ModBlocks.DEAD_LIGHT_CEILING_FAN.get(),
							ModBlocks.PINE_LIGHT_CEILING_FAN.get(),
                    		ModBlocks.MAPLE_LIGHT_CEILING_FAN.get(),
                            ModBlocks.REDWOOD_LIGHT_CEILING_FAN.get(),
                            ModBlocks.MAHOGANY_LIGHT_CEILING_FAN.get(),
                            ModBlocks.JACARANDA_LIGHT_CEILING_FAN.get(),
                            ModBlocks.PALM_LIGHT_CEILING_FAN.get(),
                            ModBlocks.WILLOW_LIGHT_CEILING_FAN.get(),
                            ModBlocks.DEAD_LIGHT_CEILING_FAN.get(),
                            ModBlocks.MAGIC_LIGHT_CEILING_FAN.get(),
                            ModBlocks.UMBRAN_LIGHT_CEILING_FAN.get(),
                            ModBlocks.HELLBARK_LIGHT_CEILING_FAN.get(),
                            ModBlocks.EMPYREAL_LIGHT_CEILING_FAN.get()
					).build(null));

    @SuppressWarnings("null")
    public static final RegistryObject<BlockEntityType<CustomCrateBlockEntity>> CUSTOM_CRATE = 
            BLOCK_ENTITIES.register("custom_crate",
                    () -> BlockEntityType.Builder.of(CustomCrateBlockEntity::new, 
                            ModBlocks.FIR_CRATE.get(),
                            ModBlocks.PINE_CRATE.get(),
                            ModBlocks.MAPLE_CRATE.get(),
                            ModBlocks.REDWOOD_CRATE.get(),
                            ModBlocks.MAHOGANY_CRATE.get(),
                            ModBlocks.JACARANDA_CRATE.get(),
                            ModBlocks.PALM_CRATE.get(),
                            ModBlocks.WILLOW_CRATE.get(),
                            ModBlocks.DEAD_CRATE.get(),
                            ModBlocks.MAGIC_CRATE.get(),
                            ModBlocks.UMBRAN_CRATE.get(),
                            ModBlocks.HELLBARK_CRATE.get(),
                            ModBlocks.EMPYREAL_CRATE.get()
                    ).build(null));

    @SuppressWarnings("null")
    public static final RegistryObject<BlockEntityType<CustomCuttingBoardBlockEntity>> CUSTOM_CUTTING_BOARD =
            BLOCK_ENTITIES.register("custom_cutting_board",
                    () -> BlockEntityType.Builder.of(CustomCuttingBoardBlockEntity::new, 
                           ModBlocks.FIR_CUTTING_BOARD.get(),
                            ModBlocks.PINE_CUTTING_BOARD.get(),
                            ModBlocks.MAPLE_CUTTING_BOARD.get(),
                            ModBlocks.REDWOOD_CUTTING_BOARD.get(),
                            ModBlocks.MAHOGANY_CUTTING_BOARD.get(),
                            ModBlocks.JACARANDA_CUTTING_BOARD.get(),
                            ModBlocks.PALM_CUTTING_BOARD.get(),
                            ModBlocks.WILLOW_CUTTING_BOARD.get(),
                            ModBlocks.DEAD_CUTTING_BOARD.get(),
                            ModBlocks.MAGIC_CUTTING_BOARD.get(),
                            ModBlocks.UMBRAN_CUTTING_BOARD.get(),
                            ModBlocks.HELLBARK_CUTTING_BOARD.get(),
                            ModBlocks.EMPYREAL_CUTTING_BOARD.get() 
                    ).build(null));

    @SuppressWarnings("null")
    public static final RegistryObject<BlockEntityType<CustomDrawerBlockEntity>> CUSTOM_DRAWER = 
            BLOCK_ENTITIES.register("custom_drawer", 
                    () -> BlockEntityType.Builder.of(CustomDrawerBlockEntity::new, 
                            ModBlocks.FIR_DRAWER.get(),
                            ModBlocks.PINE_DRAWER.get(),
                            ModBlocks.MAPLE_DRAWER.get(),
                            ModBlocks.REDWOOD_DRAWER.get(),
                            ModBlocks.MAHOGANY_DRAWER.get(),
                            ModBlocks.JACARANDA_DRAWER.get(),
                            ModBlocks.PALM_DRAWER.get(),
                            ModBlocks.WILLOW_DRAWER.get(),
                            ModBlocks.DEAD_DRAWER.get(),
                            ModBlocks.MAGIC_DRAWER.get(),
                            ModBlocks.UMBRAN_DRAWER.get(),
                            ModBlocks.HELLBARK_DRAWER.get(),
                            ModBlocks.EMPYREAL_DRAWER.get()
                    ).build(null));

    
}
