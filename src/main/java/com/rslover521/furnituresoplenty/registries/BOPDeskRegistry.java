package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.modFurnitures.CustomDeskBlock;
import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPDeskRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === Biomes O' Plenty wood desks ===
	public static final RegistryObject<Block> FIR_DESK;
	public static final RegistryObject<Block> PINE_DESK;
	public static final RegistryObject<Block> MAPLE_DESK;
	public static final RegistryObject<Block> REDWOOD_DESK;
	public static final RegistryObject<Block> MAHOGANY_DESK;
	public static final RegistryObject<Block> JACARANDA_DESK;
	public static final RegistryObject<Block> PALM_DESK; 
	public static final RegistryObject<Block> WILLOW_DESK;
	public static final RegistryObject<Block> DEAD_DESK;
	public static final RegistryObject<Block> MAGIC_DESK;
	public static final RegistryObject<Block> UMBRAN_DESK;
	public static final RegistryObject<Block> HELLBARK_DESK;
	public static final RegistryObject<Block> EMPYREAL_DESK;

	static {
		FIR_DESK = registerDesk("fir", BOPWoodTypes.FIR);
		PINE_DESK = registerDesk("pine", BOPWoodTypes.PINE);
		MAPLE_DESK = registerDesk("maple", BOPWoodTypes.MAPLE);
		REDWOOD_DESK = registerDesk("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_DESK = registerDesk("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_DESK = registerDesk("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_DESK = registerDesk("palm", BOPWoodTypes.PALM);
		WILLOW_DESK = registerDesk("willow", BOPWoodTypes.WILLOW);
		DEAD_DESK = registerDesk("dead", BOPWoodTypes.DEAD);
		MAGIC_DESK = registerDesk("magic", BOPWoodTypes.MAGIC);
		UMBRAN_DESK = registerDesk("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_DESK = registerDesk("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_DESK = registerDesk("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerDesk(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_desk", () -> 
				new CustomDeskBlock(woodType));
		ITEMS.register(name + "_desk", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		return block;
	}
}
