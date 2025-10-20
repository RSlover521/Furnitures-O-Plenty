package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomStorageJarBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPStorageJarRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);

	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);

	// === Biomes O' Plenty wood storage jars
	public static final RegistryObject<Block> FIR_STORAGE_JAR;
	public static final RegistryObject<Block> PINE_STORAGE_JAR;
	public static final RegistryObject<Block> MAPLE_STORAGE_JAR;
	public static final RegistryObject<Block> REDWOOD_STORAGE_JAR;
	public static final RegistryObject<Block> MAHOGANY_STORAGE_JAR;
	public static final RegistryObject<Block> JACARANDA_STORAGE_JAR;
	public static final RegistryObject<Block> PALM_STORAGE_JAR;
	public static final RegistryObject<Block> WILLOW_STORAGE_JAR;
	public static final RegistryObject<Block> DEAD_STORAGE_JAR;
	public static final RegistryObject<Block> MAGIC_STORAGE_JAR;
	public static final RegistryObject<Block> UMBRAN_STORAGE_JAR;
	public static final RegistryObject<Block> HELLBARK_STORAGE_JAR;
	public static final RegistryObject<Block> EMPYREAL_STORAGE_JAR;

	static {
		FIR_STORAGE_JAR = registerStorageJar("fir", BOPWoodTypes.FIR);
		PINE_STORAGE_JAR = registerStorageJar("pine", BOPWoodTypes.PINE);
		MAPLE_STORAGE_JAR = registerStorageJar("maple", BOPWoodTypes.MAPLE);
		REDWOOD_STORAGE_JAR = registerStorageJar("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_STORAGE_JAR = registerStorageJar("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_STORAGE_JAR = registerStorageJar("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_STORAGE_JAR = registerStorageJar("palm", BOPWoodTypes.PALM);
		WILLOW_STORAGE_JAR = registerStorageJar("willow", BOPWoodTypes.WILLOW);
		DEAD_STORAGE_JAR = registerStorageJar("dead", BOPWoodTypes.DEAD);
		MAGIC_STORAGE_JAR = registerStorageJar("magic", BOPWoodTypes.MAGIC);
		UMBRAN_STORAGE_JAR = registerStorageJar("unbran", BOPWoodTypes.UMBRAN);
		HELLBARK_STORAGE_JAR = registerStorageJar("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_STORAGE_JAR = registerStorageJar("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerStorageJar(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_storage_jar", () -> 
				new CustomStorageJarBlock(woodType));
		ITEMS.register(name + "_storage_jar", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_storage_jar");
		return block;
	}
}
