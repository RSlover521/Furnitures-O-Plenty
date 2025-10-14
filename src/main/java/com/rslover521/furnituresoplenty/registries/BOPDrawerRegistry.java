package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomDrawerBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPDrawerRegistry {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);

	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);

	// === Biomes O' Plenty wood drawers ===
	public static final RegistryObject<Block> FIR_DRAWER;
	public static final RegistryObject<Block> PINE_DRAWER;
	public static final RegistryObject<Block> MAPLE_DRAWER;
	public static final RegistryObject<Block> REDWOOD_DRAWER;
	public static final RegistryObject<Block> MAHOGANY_DRAWER;
	public static final RegistryObject<Block> JACARANDA_DRAWER;
	public static final RegistryObject<Block> PALM_DRAWER;
	public static final RegistryObject<Block> WILLOW_DRAWER;
	public static final RegistryObject<Block> DEAD_DRAWER;
	public static final RegistryObject<Block> MAGIC_DRAWER;
	public static final RegistryObject<Block> UMBRAN_DRAWER;
	public static final RegistryObject<Block> HELLBARK_DRAWER;
	public static final RegistryObject<Block> EMPYREAL_DRAWER;


	static {
		FIR_DRAWER = registerDrawer("fir", BOPWoodTypes.FIR);
		PINE_DRAWER = registerDrawer("pine", BOPWoodTypes.PINE);
		MAPLE_DRAWER = registerDrawer("maple", BOPWoodTypes.MAPLE);
		REDWOOD_DRAWER = registerDrawer("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_DRAWER = registerDrawer("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_DRAWER = registerDrawer("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_DRAWER = registerDrawer("palm", BOPWoodTypes.PALM);
		WILLOW_DRAWER = registerDrawer("willow", BOPWoodTypes.WILLOW);
		DEAD_DRAWER = registerDrawer("dead", BOPWoodTypes.DEAD);
		MAGIC_DRAWER = registerDrawer("magic", BOPWoodTypes.MAGIC);
		UMBRAN_DRAWER = registerDrawer("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_DRAWER = registerDrawer("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_DRAWER = registerDrawer("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerDrawer(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_drawer", () -> 
				new CustomDrawerBlock(woodType));
		ITEMS.register(name + "_drawer", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name + "_drawer");
		return block;
	}
}
