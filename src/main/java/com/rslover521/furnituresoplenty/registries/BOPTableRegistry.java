package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomTableBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPTableRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === Biomes O' Plenty wood tables ===
	public static final RegistryObject<Block> FIR_TABLE;
	public static final RegistryObject<Block> PINE_TABLE;
	public static final RegistryObject<Block> MAPLE_TABLE;
	public static final RegistryObject<Block> REDWOOD_TABLE;
	public static final RegistryObject<Block> MAHOGANY_TABLE;
	public static final RegistryObject<Block> JACARANDA_TABLE;
	public static final RegistryObject<Block> PALM_TABLE;
	public static final RegistryObject<Block> WILLOW_TABLE;
	public static final RegistryObject<Block> DEAD_TABLE;
	public static final RegistryObject<Block> MAGIC_TABLE;
	public static final RegistryObject<Block> UMBRAN_TABLE;
	public static final RegistryObject<Block> HELLBARK_TABLE;
	public static final RegistryObject<Block> EMPYREAL_TABLE;
	
	static {
		FIR_TABLE = registerTable("fir", BOPWoodTypes.FIR);
		PINE_TABLE = registerTable("pine", BOPWoodTypes.PINE);
		MAPLE_TABLE = registerTable("maple", BOPWoodTypes.MAPLE);
		REDWOOD_TABLE = registerTable("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_TABLE = registerTable("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_TABLE = registerTable("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_TABLE = registerTable("palm", BOPWoodTypes.PALM);
		WILLOW_TABLE = registerTable("willow", BOPWoodTypes.WILLOW);
		DEAD_TABLE = registerTable("dead", BOPWoodTypes.DEAD);
		MAGIC_TABLE = registerTable("magic", BOPWoodTypes.MAGIC);
		UMBRAN_TABLE = registerTable("unbran", BOPWoodTypes.UMBRAN);
		HELLBARK_TABLE = registerTable("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_TABLE = registerTable("empyreal", BOPWoodTypes.EMPYREAL);
	}
	
	private static RegistryObject<Block> registerTable(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_table", () -> 
				new CustomTableBlock(woodType));
		ITEMS.register(name + "_table", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name + "_table");
		return block;
	}
}
