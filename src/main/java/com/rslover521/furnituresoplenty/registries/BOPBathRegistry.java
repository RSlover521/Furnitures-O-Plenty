package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomBathBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPBathRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);

	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);

	// === Biomes O' Plenty wood baths
	public static final RegistryObject<Block> FIR_BATH;
	public static final RegistryObject<Block> PINE_BATH;
	public static final RegistryObject<Block> MAPLE_BATH;
	public static final RegistryObject<Block> REDWOOD_BATH;
	public static final RegistryObject<Block> MAHOGANY_BATH;
	public static final RegistryObject<Block> JACARANDA_BATH;
	public static final RegistryObject<Block> PALM_BATH;
	public static final RegistryObject<Block> WILLOW_BATH;
	public static final RegistryObject<Block> DEAD_BATH;
	public static final RegistryObject<Block> MAGIC_BATH;
	public static final RegistryObject<Block> UMBRAN_BATH;
	public static final RegistryObject<Block> HELLBARK_BATH;
	public static final RegistryObject<Block> EMPYREAL_BATH;

	static {
		FIR_BATH = registerBath("fir", BOPWoodTypes.FIR);
		PINE_BATH = registerBath("pine", BOPWoodTypes.PINE);
		MAPLE_BATH = registerBath("maple", BOPWoodTypes.MAPLE);
		REDWOOD_BATH = registerBath("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_BATH = registerBath("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_BATH = registerBath("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_BATH = registerBath("palm", BOPWoodTypes.PALM);
		WILLOW_BATH = registerBath("willow", BOPWoodTypes.WILLOW);
		DEAD_BATH = registerBath("dead", BOPWoodTypes.DEAD);
		MAGIC_BATH = registerBath("magic", BOPWoodTypes.MAGIC);
		UMBRAN_BATH = registerBath("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_BATH = registerBath("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_BATH = registerBath("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerBath(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_bath", () -> 
				new CustomBathBlock(woodType));
		ITEMS.register(name + "_bath", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_bath");
		return block;
	}
}
