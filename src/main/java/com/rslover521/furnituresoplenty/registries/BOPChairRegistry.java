package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomChairBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPChairRegistry {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);

	// === Biomes O' Plenty wood chairs ===
	public static final RegistryObject<Block> FIR_CHAIR;
	public static final RegistryObject<Block> PINE_CHAIR;
	public static final RegistryObject<Block> MAPLE_CHAIR;
	public static final RegistryObject<Block> REDWOOD_CHAIR;
	public static final RegistryObject<Block> MAHOGANY_CHAIR;
	public static final RegistryObject<Block> JACARANDA_CHAIR;
	public static final RegistryObject<Block> PALM_CHAIR;
	public static final RegistryObject<Block> WILLOW_CHAIR;
	public static final RegistryObject<Block> DEAD_CHAIR;
	public static final RegistryObject<Block> MAGIC_CHAIR;
	public static final RegistryObject<Block> UMBRAN_CHAIR;
	public static final RegistryObject<Block> HELLBARK_CHAIR;
	public static final RegistryObject<Block> EMPYREAL_CHAIR;

	static {
		FIR_CHAIR = registerChair("fir", BOPWoodTypes.FIR);
		PINE_CHAIR = registerChair("pine", BOPWoodTypes.PINE);
		MAPLE_CHAIR = registerChair("maple", BOPWoodTypes.MAPLE);
		REDWOOD_CHAIR = registerChair("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_CHAIR = registerChair("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_CHAIR = registerChair("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_CHAIR = registerChair("palm", BOPWoodTypes.PALM);
		WILLOW_CHAIR = registerChair("willow", BOPWoodTypes.WILLOW);
		DEAD_CHAIR = registerChair("dead", BOPWoodTypes.DEAD);
		MAGIC_CHAIR = registerChair("magic", BOPWoodTypes.MAGIC);
		UMBRAN_CHAIR = registerChair("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_CHAIR = registerChair("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_CHAIR = registerChair("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerChair(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_chair", () -> 
				new CustomChairBlock(woodType));
		ITEMS.register(name + "_chair", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_chair");
		return block;
	}
}