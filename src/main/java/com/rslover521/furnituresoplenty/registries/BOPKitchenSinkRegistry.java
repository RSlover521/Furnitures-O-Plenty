package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomKitchenSinkBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPKitchenSinkRegistry {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === Biomes O' Plenty wood kitchen sink
	public static final RegistryObject<Block> FIR_KITCHEN_SINK;
	public static final RegistryObject<Block> PINE_KITCHEN_SINK;
	public static final RegistryObject<Block> MAPLE_KITCHEN_SINK;
	public static final RegistryObject<Block> REDWOOD_KITCHEN_SINK;
	public static final RegistryObject<Block> MAHOGANY_KITCHEN_SINK;
	public static final RegistryObject<Block> JACARANDA_KITCHEN_SINK;
	public static final RegistryObject<Block> PALM_KITCHEN_SINK;
	public static final RegistryObject<Block> WILLOW_KITCHEN_SINK;
	public static final RegistryObject<Block> DEAD_KITCHEN_SINK;
	public static final RegistryObject<Block> MAGIC_KITCHEN_SINK;
	public static final RegistryObject<Block> UMBRAN_KITCHEN_SINK;
	public static final RegistryObject<Block> HELLBARK_KITCHEN_SINK;
	public static final RegistryObject<Block> EMPYREAL_KITCHEN_SINK;
	
	static {
		FIR_KITCHEN_SINK = registerKitchenSink("fir", BOPWoodTypes.FIR);
		PINE_KITCHEN_SINK = registerKitchenSink("pine", BOPWoodTypes.PINE);
		MAPLE_KITCHEN_SINK = registerKitchenSink("maple", BOPWoodTypes.MAPLE);
		REDWOOD_KITCHEN_SINK = registerKitchenSink("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_KITCHEN_SINK = registerKitchenSink("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_KITCHEN_SINK = registerKitchenSink("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_KITCHEN_SINK = registerKitchenSink("palm", BOPWoodTypes.PALM);
		WILLOW_KITCHEN_SINK = registerKitchenSink("willow", BOPWoodTypes.WILLOW);
		DEAD_KITCHEN_SINK = registerKitchenSink("dead", BOPWoodTypes.DEAD);
		MAGIC_KITCHEN_SINK = registerKitchenSink("magic", BOPWoodTypes.MAGIC);
		UMBRAN_KITCHEN_SINK = registerKitchenSink("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_KITCHEN_SINK = registerKitchenSink("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_KITCHEN_SINK = registerKitchenSink("empyreal", BOPWoodTypes.EMPYREAL);
	}
	
	private static RegistryObject<Block> registerKitchenSink(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_kitchen_sink", () -> 
				new CustomKitchenSinkBlock(woodType));
		ITEMS.register(name + "_kitchen_sink", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_kitchen_sink");
		return block;
	}
}
