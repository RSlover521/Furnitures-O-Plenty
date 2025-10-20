package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomBasinBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPBasinRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === Biomes O' Plenty wood basin ===
	public static final RegistryObject<Block> FIR_BASIN;
	public static final RegistryObject<Block> PINE_BASIN;
	public static final RegistryObject<Block> MAPLE_BASIN;
	public static final RegistryObject<Block> REDWOOD_BASIN;
	public static final RegistryObject<Block> MAHOGANY_BASIN;
	public static final RegistryObject<Block> JACARANDA_BASIN;
	public static final RegistryObject<Block> PALM_BASIN;
	public static final RegistryObject<Block> WILLOW_BASIN;
	public static final RegistryObject<Block> DEAD_BASIN;
	public static final RegistryObject<Block> MAGIC_BASIN;
	public static final RegistryObject<Block> UMBRAN_BASIN;
	public static final RegistryObject<Block> HELLBARK_BASIN;
	public static final RegistryObject<Block> EMPYREAL_BASIN;
	
	static {
		FIR_BASIN = registerBasin("fir", BOPWoodTypes.FIR);
		PINE_BASIN = registerBasin("pine", BOPWoodTypes.PINE);
		MAPLE_BASIN = registerBasin("maple", BOPWoodTypes.MAPLE);
		REDWOOD_BASIN = registerBasin("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_BASIN = registerBasin("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_BASIN = registerBasin("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_BASIN = registerBasin("palm", BOPWoodTypes.PALM);
		WILLOW_BASIN = registerBasin("willow", BOPWoodTypes.WILLOW);
		DEAD_BASIN = registerBasin("dead", BOPWoodTypes.DEAD);
		MAGIC_BASIN = registerBasin("magic", BOPWoodTypes.MAGIC);
		UMBRAN_BASIN = registerBasin("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_BASIN = registerBasin("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_BASIN = registerBasin("empyreal", BOPWoodTypes.EMPYREAL);
	}
	
	private static RegistryObject<Block> registerBasin(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_basin", () -> 
				new CustomBasinBlock(woodType));
		ITEMS.register(name + "_basin", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_basin");
		return block;
	}
}
