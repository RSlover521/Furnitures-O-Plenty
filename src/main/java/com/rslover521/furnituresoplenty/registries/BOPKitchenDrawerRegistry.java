package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomKitchenDrawerBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPKitchenDrawerRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === Biomes O' Plenty wood kitchen drawer ===
	public static final RegistryObject<Block> FIR_KITCHEN_DRAWER;
	public static final RegistryObject<Block> PINE_KITCHEN_DRAWER;
	public static final RegistryObject<Block> MAPLE_KITCHEN_DRAWER;
	public static final RegistryObject<Block> REDWOOD_KITCHEN_DRAWER;
	public static final RegistryObject<Block> MAHOGANY_KITCHEN_DRAWER;
	public static final RegistryObject<Block> JACARANDA_KITCHEN_DRAWER;
	public static final RegistryObject<Block> PALM_KITCHEN_DRAWER;
	public static final RegistryObject<Block> WILLOW_KITCHEN_DRAWER;
	public static final RegistryObject<Block> DEAD_KITCHEN_DRAWER;
	public static final RegistryObject<Block> MAGIC_KITCHEN_DRAWER;
	public static final RegistryObject<Block> UMBRAN_KITCHEN_DRAWER;
	public static final RegistryObject<Block> HELLBARK_KITCHEN_DRAWER;
	public static final RegistryObject<Block> EMPYREAL_KITCHEN_DRAWER;

	static {
		FIR_KITCHEN_DRAWER = registerKitchenDrawer("fir", BOPWoodTypes.FIR);
		PINE_KITCHEN_DRAWER = registerKitchenDrawer("pine", BOPWoodTypes.PINE);
		MAPLE_KITCHEN_DRAWER = registerKitchenDrawer("maple", BOPWoodTypes.MAPLE);
		REDWOOD_KITCHEN_DRAWER = registerKitchenDrawer("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_KITCHEN_DRAWER = registerKitchenDrawer("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_KITCHEN_DRAWER = registerKitchenDrawer("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_KITCHEN_DRAWER = registerKitchenDrawer("palm", BOPWoodTypes.PALM);
		WILLOW_KITCHEN_DRAWER = registerKitchenDrawer("willow", BOPWoodTypes.WILLOW);
		DEAD_KITCHEN_DRAWER = registerKitchenDrawer("dead", BOPWoodTypes.DEAD);
		MAGIC_KITCHEN_DRAWER = registerKitchenDrawer("magic", BOPWoodTypes.MAGIC);
		UMBRAN_KITCHEN_DRAWER = registerKitchenDrawer("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_KITCHEN_DRAWER = registerKitchenDrawer("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_KITCHEN_DRAWER = registerKitchenDrawer("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerKitchenDrawer(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_kitchen_drawer", () -> 
				new CustomKitchenDrawerBlock(woodType));
		ITEMS.register(name + "_kitchen_drawer", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name + "_kitchen_drawer");
		return block;
	}
}
