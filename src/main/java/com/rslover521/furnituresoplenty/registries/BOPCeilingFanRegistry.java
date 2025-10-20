package com.rslover521.furnituresoplenty.registries;

import com.mrcrayfish.furniture.refurbished.block.MetalType;
import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomCeilingFanBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPCeilingFanRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
			
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);

	// === Biomes O' Plenty wood light ceiling fans ===
	public static final RegistryObject<Block> FIR_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> PINE_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> MAPLE_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> REDWOOD_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> MAHOGANY_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> JACARANDA_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> PALM_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> WILLOW_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> DEAD_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> MAGIC_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> UMBRAN_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> HELLBARK_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> EMPYREAL_LIGHT_CEILING_FAN;

	// === Biomes O' Plenty wood dark ceiling fans ===
	public static final RegistryObject<Block> FIR_DARK_CEILING_FAN;
	public static final RegistryObject<Block> PINE_DARK_CEILING_FAN;
	public static final RegistryObject<Block> MAPLE_DARK_CEILING_FAN;
	public static final RegistryObject<Block> REDWOOD_DARK_CEILING_FAN;
	public static final RegistryObject<Block> MAHOGANY_DARK_CEILING_FAN;
	public static final RegistryObject<Block> JACARANDA_DARK_CEILING_FAN;
	public static final RegistryObject<Block> PALM_DARK_CEILING_FAN;
	public static final RegistryObject<Block> WILLOW_DARK_CEILING_FAN;
	public static final RegistryObject<Block> DEAD_DARK_CEILING_FAN;
	public static final RegistryObject<Block> MAGIC_DARK_CEILING_FAN;
	public static final RegistryObject<Block> UMBRAN_DARK_CEILING_FAN;
	public static final RegistryObject<Block> HELLBARK_DARK_CEILING_FAN;
	public static final RegistryObject<Block> EMPYREAL_DARK_CEILING_FAN;
	
	static {
		// light fans
		FIR_LIGHT_CEILING_FAN = registerCeilingFans("light", "fir", BOPWoodTypes.FIR);
		PINE_LIGHT_CEILING_FAN = registerCeilingFans("light", "pine", BOPWoodTypes.PINE);
		MAPLE_LIGHT_CEILING_FAN = registerCeilingFans("light", "maple", BOPWoodTypes.MAPLE);
		REDWOOD_LIGHT_CEILING_FAN = registerCeilingFans("light", "redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_LIGHT_CEILING_FAN = registerCeilingFans("light", "mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_LIGHT_CEILING_FAN = registerCeilingFans("light", "jacaranda", BOPWoodTypes.JACARANDA);
		PALM_LIGHT_CEILING_FAN = registerCeilingFans("light", "palm", BOPWoodTypes.PALM);
		WILLOW_LIGHT_CEILING_FAN = registerCeilingFans("light", "willow", BOPWoodTypes.WILLOW);
		DEAD_LIGHT_CEILING_FAN = registerCeilingFans("light", "dead", BOPWoodTypes.DEAD);
		MAGIC_LIGHT_CEILING_FAN = registerCeilingFans("light", "magic", BOPWoodTypes.MAGIC);
		UMBRAN_LIGHT_CEILING_FAN = registerCeilingFans("light", "umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_LIGHT_CEILING_FAN = registerCeilingFans("light", "hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_LIGHT_CEILING_FAN = registerCeilingFans("light", "empyreal", BOPWoodTypes.EMPYREAL);
		
		// dark fans
		FIR_DARK_CEILING_FAN = registerCeilingFans("dark", "fir", BOPWoodTypes.FIR);
		PINE_DARK_CEILING_FAN = registerCeilingFans("dark", "pine", BOPWoodTypes.PINE);
		MAPLE_DARK_CEILING_FAN = registerCeilingFans("dark", "maple", BOPWoodTypes.MAPLE);
		REDWOOD_DARK_CEILING_FAN = registerCeilingFans("dark", "redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_DARK_CEILING_FAN = registerCeilingFans("dark", "mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_DARK_CEILING_FAN = registerCeilingFans("dark", "jacaranda", BOPWoodTypes.JACARANDA);
		PALM_DARK_CEILING_FAN = registerCeilingFans("dark", "palm", BOPWoodTypes.PALM);
		WILLOW_DARK_CEILING_FAN = registerCeilingFans("dark", "willow", BOPWoodTypes.WILLOW);
		DEAD_DARK_CEILING_FAN = registerCeilingFans("dark", "dead", BOPWoodTypes.DEAD);
		MAGIC_DARK_CEILING_FAN = registerCeilingFans("dark", "magic", BOPWoodTypes.MAGIC);
		UMBRAN_DARK_CEILING_FAN = registerCeilingFans("dark", "umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_DARK_CEILING_FAN = registerCeilingFans("dark", "hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_DARK_CEILING_FAN = registerCeilingFans("dark", "empyreal", BOPWoodTypes.EMPYREAL);
	}
	
	private static RegistryObject<Block> registerCeilingFans(String metalType, String wood, WoodType woodType) {
		if (metalType == "light") {
			RegistryObject<Block> block = BLOCKS.register(metalType + "_" + wood + "_ceiling_fan", () -> 
					new CustomCeilingFanBlock(woodType, MetalType.LIGHT));
			ITEMS.register(metalType + "_" + wood + "_ceiling_fan", () -> 
					new BlockItem(block.get(), new Item.Properties()));
			FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + metalType + "_" + wood + "_ceiling_fan");
			return block;
		} else {
			RegistryObject<Block> block = BLOCKS.register(metalType + "_" + wood + "_ceiling_fan", () -> 
					new CustomCeilingFanBlock(woodType, MetalType.DARK));
			ITEMS.register(metalType + "_" + wood + "_ceiling_fan", () -> 
			new BlockItem(block.get(), new Item.Properties()));
			FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + metalType + "_" + wood + "_ceiling_fan");
			return block;
		}
	}

	
}
