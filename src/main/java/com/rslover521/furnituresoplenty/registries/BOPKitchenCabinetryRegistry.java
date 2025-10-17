package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomKitchenCabinetryBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPKitchenCabinetryRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === Biomes O' Plenty wood kitchen cabinetry
	public static final RegistryObject<Block> FIR_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> PINE_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> MAPLE_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> REDWOOD_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> MAHOGANY_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> JACARANDA_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> PALM_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> WILLOW_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> DEAD_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> MAGIC_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> UMBRAN_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> HELLBARK_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> EMPYREAL_KITCHEN_CABINETRY;
	
	static {
		FIR_KITCHEN_CABINETRY = registerKitchenCabinetry("fir", BOPWoodTypes.FIR);
		PINE_KITCHEN_CABINETRY = registerKitchenCabinetry("pine", BOPWoodTypes.PINE);
		MAPLE_KITCHEN_CABINETRY = registerKitchenCabinetry("maple", BOPWoodTypes.MAPLE);
		REDWOOD_KITCHEN_CABINETRY = registerKitchenCabinetry("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_KITCHEN_CABINETRY = registerKitchenCabinetry("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_KITCHEN_CABINETRY = registerKitchenCabinetry("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_KITCHEN_CABINETRY = registerKitchenCabinetry("palm", BOPWoodTypes.PALM);
		WILLOW_KITCHEN_CABINETRY = registerKitchenCabinetry("willow", BOPWoodTypes.WILLOW);
		DEAD_KITCHEN_CABINETRY = registerKitchenCabinetry("dead", BOPWoodTypes.DEAD);
		MAGIC_KITCHEN_CABINETRY = registerKitchenCabinetry("magic", BOPWoodTypes.MAGIC);
		UMBRAN_KITCHEN_CABINETRY = registerKitchenCabinetry("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_KITCHEN_CABINETRY = registerKitchenCabinetry("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_KITCHEN_CABINETRY = registerKitchenCabinetry("empyreal", BOPWoodTypes.EMPYREAL);
	}
	
	private static RegistryObject<Block> registerKitchenCabinetry(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_kitchen_cabinetry", () -> 
				new CustomKitchenCabinetryBlock(woodType));
		ITEMS.register(name + "_kitchen_cabinetry", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name + "_kitchen_cabinetry");
		return block;
	}
}
