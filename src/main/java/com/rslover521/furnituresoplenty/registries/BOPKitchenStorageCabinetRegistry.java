package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomKitchenStorageCabinetBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPKitchenStorageCabinetRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);

	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);

	// === Biomes O' Plenty wood kitchen storage cabinets ===
	public static final RegistryObject<Block> FIR_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> PINE_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> MAPLE_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> REDWOOD_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> MAHOGANY_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> JACARANDA_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> PALM_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> WILLOW_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> DEAD_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> MAGIC_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> UMBRAN_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> HELLBARK_KITCHEN_STORAGE_CABINETS;
	public static final RegistryObject<Block> EMPYREAL_KITCHEN_STORAGE_CABINETS;

	static {
		FIR_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("fir", BOPWoodTypes.FIR);
		PINE_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("pine", BOPWoodTypes.PINE);
		MAPLE_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("maple", BOPWoodTypes.MAPLE);
		REDWOOD_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("palm", BOPWoodTypes.PALM);
		WILLOW_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("willow", BOPWoodTypes.WILLOW);
		DEAD_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("dead", BOPWoodTypes.DEAD);
		MAGIC_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("magic", BOPWoodTypes.MAGIC);
		UMBRAN_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_KITCHEN_STORAGE_CABINETS = registerKitchenStorageCabinets("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerKitchenStorageCabinets(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_kitchen_storage_cabinets", () -> 
				new CustomKitchenStorageCabinetBlock(woodType));
		ITEMS.register(name + "_kitchen_storage_cabinets", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name 
				+ "_kitchen_storage_cabinets");
		return block;
	}
}
