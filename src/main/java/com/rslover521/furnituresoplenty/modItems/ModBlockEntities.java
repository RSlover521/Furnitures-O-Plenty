package com.rslover521.furnituresoplenty.modItems;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomBasinBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomBathBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomCeilingFanBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomCrateBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomCuttingBoardBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomDrawerBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomKitchenDrawerBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomKitchenSinkBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomMailboxBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomStorageJarBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomToiletBlockEntity;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomStorageCabinetBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@SuppressWarnings("null")
public class ModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = 
			DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FurnituresOPlenty.MODID);

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

	public static final RegistryObject<BlockEntityType<CustomKitchenDrawerBlockEntity>> CUSTOM_KITCHEN_DRAWER = 
			BLOCK_ENTITIES.register("custom_block_entities", 
					() -> BlockEntityType.Builder.of(CustomKitchenDrawerBlockEntity::new, 
							ModBlocks.FIR_KITCHEN_DRAWER.get(),
                            ModBlocks.PINE_KITCHEN_DRAWER.get(),
                            ModBlocks.MAPLE_KITCHEN_DRAWER.get(),
                            ModBlocks.REDWOOD_KITCHEN_DRAWER.get(),
                            ModBlocks.MAHOGANY_KITCHEN_DRAWER.get(),
                            ModBlocks.JACARANDA_KITCHEN_DRAWER.get(),
                            ModBlocks.PALM_KITCHEN_DRAWER.get(),
                            ModBlocks.WILLOW_KITCHEN_DRAWER.get(),
                            ModBlocks.DEAD_KITCHEN_DRAWER.get(),
                            ModBlocks.MAGIC_KITCHEN_DRAWER.get(),
                            ModBlocks.UMBRAN_KITCHEN_DRAWER.get(),
                            ModBlocks.HELLBARK_KITCHEN_DRAWER.get(),
                            ModBlocks.EMPYREAL_KITCHEN_DRAWER.get()
					).build(null));

	public static final RegistryObject<BlockEntityType<CustomKitchenSinkBlockEntity>> CUSTOM_KITCHEN_SINK = 
			BLOCK_ENTITIES.register("custom_kitchen_sink", 
					() -> BlockEntityType.Builder.of(CustomKitchenSinkBlockEntity::new, 
					ModBlocks.FIR_KITCHEN_SINK.get(),
                            ModBlocks.PINE_KITCHEN_SINK.get(),
                            ModBlocks.MAPLE_KITCHEN_SINK.get(),
                            ModBlocks.REDWOOD_KITCHEN_SINK.get(),
                            ModBlocks.MAHOGANY_KITCHEN_SINK.get(),
                            ModBlocks.JACARANDA_KITCHEN_SINK.get(),
                            ModBlocks.PALM_KITCHEN_SINK.get(),
                            ModBlocks.WILLOW_KITCHEN_SINK.get(),
                            ModBlocks.DEAD_KITCHEN_SINK.get(),
                            ModBlocks.MAGIC_KITCHEN_SINK.get(),
                            ModBlocks.UMBRAN_KITCHEN_SINK.get(),
                            ModBlocks.HELLBARK_KITCHEN_SINK.get(),
                            ModBlocks.EMPYREAL_KITCHEN_SINK.get()
					).build(null));

	public static final RegistryObject<BlockEntityType<CustomMailboxBlockEntity>> CUSTOM_MAIL_BOX = 
			BLOCK_ENTITIES.register("custom_mail_box", 
					() -> BlockEntityType.Builder.of(CustomMailboxBlockEntity::new,
					 		ModBlocks.FIR_MAIL_BOX.get(),
                            ModBlocks.PINE_MAIL_BOX.get(),
                            ModBlocks.MAPLE_MAIL_BOX.get(),
                            ModBlocks.REDWOOD_MAIL_BOX.get(),
                            ModBlocks.MAHOGANY_MAIL_BOX.get(),
                            ModBlocks.JACARANDA_MAIL_BOX.get(),
                            ModBlocks.PALM_MAIL_BOX.get(),
                            ModBlocks.WILLOW_MAIL_BOX.get(),
                            ModBlocks.DEAD_MAIL_BOX.get(),
                            ModBlocks.MAGIC_MAIL_BOX.get(),
                            ModBlocks.UMBRAN_MAIL_BOX.get(),
                            ModBlocks.HELLBARK_MAIL_BOX.get(),
                            ModBlocks.EMPYREAL_MAIL_BOX.get()
					).build(null));

    public static final RegistryObject<BlockEntityType<CustomStorageJarBlockEntity>> CUSTOM_STORAGE_JAR =
            BLOCK_ENTITIES.register("custom_storage_jar",
                    () -> BlockEntityType.Builder.of(CustomStorageJarBlockEntity::new,
                            ModBlocks.FIR_STORAGE_JAR.get(),
                            ModBlocks.PINE_STORAGE_JAR.get(),
                            ModBlocks.MAPLE_STORAGE_JAR.get(),
                            ModBlocks.REDWOOD_STORAGE_JAR.get(),
                            ModBlocks.MAHOGANY_STORAGE_JAR.get(),
                            ModBlocks.JACARANDA_STORAGE_JAR.get(),
                            ModBlocks.PALM_STORAGE_JAR.get(),
                            ModBlocks.WILLOW_STORAGE_JAR.get(),
                            ModBlocks.DEAD_STORAGE_JAR.get(),
                            ModBlocks.MAGIC_STORAGE_JAR.get(),
                            ModBlocks.UMBRAN_STORAGE_JAR.get(),
                            ModBlocks.HELLBARK_STORAGE_JAR.get(),
                            ModBlocks.EMPYREAL_STORAGE_JAR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<CustomStorageCabinetBlockEntity>> CUSTOM_STORAGE_CABINET =
            BLOCK_ENTITIES.register("custom_storage_cabinet",
                    () -> BlockEntityType.Builder.of(CustomStorageCabinetBlockEntity::new,
                            // Kitchen Storage Cabinets
                            ModBlocks.FIR_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.PINE_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.MAPLE_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.REDWOOD_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.MAHOGANY_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.JACARANDA_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.PALM_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.WILLOW_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.DEAD_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.MAGIC_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.UMBRAN_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.HELLBARK_KITCHEN_STORAGE_CABINET.get(),
                            ModBlocks.EMPYREAL_KITCHEN_STORAGE_CABINET.get(),

                            // Storage Cabinets
                            ModBlocks.FIR_STORAGE_CABINET.get(),
                            ModBlocks.PINE_STORAGE_CABINET.get(),
                            ModBlocks.MAPLE_STORAGE_CABINET.get(),
                            ModBlocks.REDWOOD_STORAGE_CABINET.get(),
                            ModBlocks.MAHOGANY_STORAGE_CABINET.get(),
                            ModBlocks.JACARANDA_STORAGE_CABINET.get(),
                            ModBlocks.PALM_STORAGE_CABINET.get(),
                            ModBlocks.WILLOW_STORAGE_CABINET.get(),
                            ModBlocks.DEAD_STORAGE_CABINET.get(),
                            ModBlocks.MAGIC_STORAGE_CABINET.get(),
                            ModBlocks.UMBRAN_STORAGE_CABINET.get(),
                            ModBlocks.HELLBARK_STORAGE_CABINET.get(),
                            ModBlocks.EMPYREAL_STORAGE_CABINET.get()
                    ).build(null));
    
    public static final RegistryObject<BlockEntityType<CustomToiletBlockEntity>> CUSTOM_TOILET = 
    		BLOCK_ENTITIES.register("custom_toilet_entities", 
    				() -> BlockEntityType.Builder.of(CustomToiletBlockEntity::new,
    						ModBlocks.FIR_TOILET.get(),
                            ModBlocks.PINE_TOILET.get(),
                            ModBlocks.MAPLE_TOILET.get(),
                            ModBlocks.REDWOOD_TOILET.get(),
                            ModBlocks.MAHOGANY_TOILET.get(),
                            ModBlocks.JACARANDA_TOILET.get(),
                            ModBlocks.PALM_TOILET.get(),
                            ModBlocks.WILLOW_TOILET.get(),
                            ModBlocks.DEAD_TOILET.get(),
                            ModBlocks.MAGIC_TOILET.get(),
                            ModBlocks.UMBRAN_TOILET.get(),
                            ModBlocks.HELLBARK_TOILET.get(),
                            ModBlocks.EMPYREAL_TOILET.get()
                     ).build(null));
}