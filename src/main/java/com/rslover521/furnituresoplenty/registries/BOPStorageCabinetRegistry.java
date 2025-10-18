package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomStorageCabinetBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPStorageCabinetRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
			
	// === Biomes O' Plenty wood storage cabinets
	public static final RegistryObject<Block> FIR_STORAGE_CABINET;
	public static final RegistryObject<Block> PINE_STORAGE_CABINET;
	public static final RegistryObject<Block> MAPLE_STORAGE_CABINET;
	public static final RegistryObject<Block> REDWOOD_STORAGE_CABINET;
	public static final RegistryObject<Block> MAHOGANY_STORAGE_CABINET;
	public static final RegistryObject<Block> JACARANDA_STORAGE_CABINET;
	public static final RegistryObject<Block> PALM_STORAGE_CABINET;
	public static final RegistryObject<Block> WILLOW_STORAGE_CABINET;
	public static final RegistryObject<Block> DEAD_STORAGE_CABINET;
	public static final RegistryObject<Block> MAGIC_STORAGE_CABINET;
	public static final RegistryObject<Block> UMBRAN_STORAGE_CABINET;
	public static final RegistryObject<Block> HELLBARK_STORAGE_CABINET;
	public static final RegistryObject<Block> EMPYREAL_STORAGE_CABINET;

	static {
		FIR_STORAGE_CABINET = registerStorageCabinets("fir", BOPWoodTypes.FIR);
		PINE_STORAGE_CABINET = registerStorageCabinets("pine", BOPWoodTypes.PINE);
		MAPLE_STORAGE_CABINET = registerStorageCabinets("maple", BOPWoodTypes.MAPLE);
		REDWOOD_STORAGE_CABINET = registerStorageCabinets("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_STORAGE_CABINET = registerStorageCabinets("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_STORAGE_CABINET = registerStorageCabinets("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_STORAGE_CABINET = registerStorageCabinets("palm", BOPWoodTypes.PALM);
		WILLOW_STORAGE_CABINET = registerStorageCabinets("willow", BOPWoodTypes.WILLOW);
		DEAD_STORAGE_CABINET = registerStorageCabinets("dead", BOPWoodTypes.DEAD);
		MAGIC_STORAGE_CABINET = registerStorageCabinets("magic", BOPWoodTypes.MAGIC);
		UMBRAN_STORAGE_CABINET = registerStorageCabinets("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_STORAGE_CABINET = registerStorageCabinets("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_STORAGE_CABINET = registerStorageCabinets("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerStorageCabinets(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_storage_cabinets", () -> 
				new CustomStorageCabinetBlock(woodType));
		ITEMS.register(name + "_storage_cabinets", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name 
				+ "_storage_cabinets");
		return block;
	}
}
