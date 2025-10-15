package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomCrateBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPCrateRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === Biomes O' Plenty wood crates ===
	public static final RegistryObject<Block> FIR_CRATE;
	public static final RegistryObject<Block> PINE_CRATE;
	public static final RegistryObject<Block> MAPLE_CRATE;
	public static final RegistryObject<Block> REDWOOD_CRATE;
	public static final RegistryObject<Block> MAHOGANY_CRATE;
	public static final RegistryObject<Block> JACARANDA_CRATE;
	public static final RegistryObject<Block> PALM_CRATE;
	public static final RegistryObject<Block> WILLOW_CRATE;
	public static final RegistryObject<Block> DEAD_CRATE;
	public static final RegistryObject<Block> MAGIC_CRATE;
	public static final RegistryObject<Block> UMBRAN_CRATE;
	public static final RegistryObject<Block> HELLBARK_CRATE;
	public static final RegistryObject<Block> EMPYREAL_CRATE;


	static {
		FIR_CRATE = registerCrate("fir", BOPWoodTypes.FIR);
		PINE_CRATE = registerCrate ("pine", BOPWoodTypes.PINE);
		MAPLE_CRATE = registerCrate("maple", BOPWoodTypes.MAPLE);
		REDWOOD_CRATE = registerCrate("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_CRATE = registerCrate("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_CRATE = registerCrate("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_CRATE = registerCrate("palm", BOPWoodTypes.PALM);
		WILLOW_CRATE = registerCrate("willow", BOPWoodTypes.WILLOW);
		DEAD_CRATE = registerCrate("dead", BOPWoodTypes.DEAD);
		MAGIC_CRATE = registerCrate("magic", BOPWoodTypes.MAGIC);
		UMBRAN_CRATE = registerCrate("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_CRATE = registerCrate("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_CRATE = registerCrate("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerCrate(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_crate", () -> 
				new CustomCrateBlock(woodType));
		ITEMS.register(name + "_crate", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name + "_crate");
		return block;
	}
}
