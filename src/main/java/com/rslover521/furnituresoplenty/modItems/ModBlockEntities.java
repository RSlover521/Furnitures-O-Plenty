package com.rslover521.furnituresoplenty.modItems;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modBlockEntities.CustomBasinBlockEntity;

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

	

	
}
