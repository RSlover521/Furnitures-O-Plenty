package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomCuttingBoardBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPCuttingBoardRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);

	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);

	// === Biomes O' Plenty wood cutting boards ===
	public static final RegistryObject<Block> FIR_CUTTING_BOARD;
	public static final RegistryObject<Block> PINE_CUTTING_BOARD;
	public static final RegistryObject<Block> MAPLE_CUTTING_BOARD;
	public static final RegistryObject<Block> REDWOOD_CUTTING_BOARD;
	public static final RegistryObject<Block> MAHOGANY_CUTTING_BOARD;
	public static final RegistryObject<Block> JACARANDA_CUTTING_BOARD;
	public static final RegistryObject<Block> PALM_CUTTING_BOARD;
	public static final RegistryObject<Block> WILLOW_CUTTING_BOARD;
	public static final RegistryObject<Block> DEAD_CUTTING_BOARD;
	public static final RegistryObject<Block> MAGIC_CUTTING_BOARD;
	public static final RegistryObject<Block> UMBRAN_CUTTING_BOARD;
	public static final RegistryObject<Block> HELLBARK_CUTTING_BOARD;
	public static final RegistryObject<Block> EMPYREAL_CUTTING_BOARD;

	static {
		FIR_CUTTING_BOARD = registerCuttingBoard("fir", BOPWoodTypes.FIR);
		PINE_CUTTING_BOARD = registerCuttingBoard("pine", BOPWoodTypes.PINE);
		MAPLE_CUTTING_BOARD = registerCuttingBoard("maple", BOPWoodTypes.MAPLE);
		REDWOOD_CUTTING_BOARD = registerCuttingBoard("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_CUTTING_BOARD = registerCuttingBoard("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_CUTTING_BOARD = registerCuttingBoard("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_CUTTING_BOARD = registerCuttingBoard("palm", BOPWoodTypes.PALM);
		WILLOW_CUTTING_BOARD = registerCuttingBoard("willow", BOPWoodTypes.WILLOW);
		DEAD_CUTTING_BOARD = registerCuttingBoard("dead", BOPWoodTypes.DEAD);
		MAGIC_CUTTING_BOARD = registerCuttingBoard("magic", BOPWoodTypes.MAGIC);
		UMBRAN_CUTTING_BOARD = registerCuttingBoard("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_CUTTING_BOARD = registerCuttingBoard("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_CUTTING_BOARD = registerCuttingBoard("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerCuttingBoard(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_cutting_board", () -> 
				new CustomCuttingBoardBlock(woodType));
		ITEMS.register(name + "_cutting_board", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name + "_cutting_board");
		return block;
	}
}
