package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomToiletBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPToiletRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);

	// === Biomes O' Plenty wood toilets ===
	public static final RegistryObject<Block> FIR_TOILET;
	public static final RegistryObject<Block> PINE_TOILET;
	public static final RegistryObject<Block> MAPLE_TOILET;
	public static final RegistryObject<Block> REDWOOD_TOILET;
	public static final RegistryObject<Block> MAHOGANY_TOILET;
	public static final RegistryObject<Block> JACARANDA_TOILET;
	public static final RegistryObject<Block> PALM_TOILET;
	public static final RegistryObject<Block> WILLOW_TOILET;
	public static final RegistryObject<Block> DEAD_TOILET;
	public static final RegistryObject<Block> MAGIC_TOILET;
	public static final RegistryObject<Block> UMBRAN_TOILET;
	public static final RegistryObject<Block> HELLBARK_TOILET;
	public static final RegistryObject<Block> EMPYREAL_TOILET;

	static {
		FIR_TOILET = registerToilet("fir", BOPWoodTypes.FIR);
		PINE_TOILET = registerToilet("pine", BOPWoodTypes.PINE);
		MAPLE_TOILET = registerToilet("maple", BOPWoodTypes.MAPLE);
		REDWOOD_TOILET = registerToilet("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_TOILET = registerToilet("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_TOILET = registerToilet("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_TOILET = registerToilet("palm", BOPWoodTypes.PALM);
		WILLOW_TOILET = registerToilet("willow", BOPWoodTypes.WILLOW);
		DEAD_TOILET = registerToilet("dead", BOPWoodTypes.DEAD);
		MAGIC_TOILET = registerToilet("magic", BOPWoodTypes.MAGIC);
		UMBRAN_TOILET = registerToilet("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_TOILET = registerToilet("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_TOILET = registerToilet("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerToilet(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_toilet", () -> 
				new CustomToiletBlock(woodType));
		ITEMS.register(name + "_table", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_toilet");
		return block;
	}
}
