package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomMailboxBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPMailboxRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
		
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === Biomes O' Plenty wood mailboxes
	public static final RegistryObject<Block> FIR_MAIL_BOX;
	public static final RegistryObject<Block> PINE_MAIL_BOX;
	public static final RegistryObject<Block> MAPLE_MAIL_BOX;
	public static final RegistryObject<Block> REDWOOD_MAIL_BOX;
	public static final RegistryObject<Block> MAHOGANY_MAIL_BOX;
	public static final RegistryObject<Block> JACARANDA_MAIL_BOX;
	public static final RegistryObject<Block> PALM_MAIL_BOX;
	public static final RegistryObject<Block> WILLOW_MAIL_BOX;
	public static final RegistryObject<Block> DEAD_MAIL_BOX;
	public static final RegistryObject<Block> MAGIC_MAIL_BOX;
	public static final RegistryObject<Block> UMBRAN_MAIL_BOX;
	public static final RegistryObject<Block> HELLBARK_MAIL_BOX;
	public static final RegistryObject<Block> EMPYREAL_MAIL_BOX;

	static {
		FIR_MAIL_BOX = registerMailBox("fir", BOPWoodTypes.FIR);
		PINE_MAIL_BOX = registerMailBox("pine", BOPWoodTypes.PINE);
		MAPLE_MAIL_BOX = registerMailBox("maple", BOPWoodTypes.MAPLE);
		REDWOOD_MAIL_BOX = registerMailBox("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_MAIL_BOX = registerMailBox("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_MAIL_BOX = registerMailBox("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_MAIL_BOX = registerMailBox("palm", BOPWoodTypes.PALM);
		WILLOW_MAIL_BOX = registerMailBox("willow", BOPWoodTypes.WILLOW);
		DEAD_MAIL_BOX = registerMailBox("dead", BOPWoodTypes.DEAD);
		MAGIC_MAIL_BOX = registerMailBox("magic", BOPWoodTypes.MAGIC);
		UMBRAN_MAIL_BOX = registerMailBox("unbran", BOPWoodTypes.UMBRAN);
		HELLBARK_MAIL_BOX = registerMailBox("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_MAIL_BOX = registerMailBox("empyreal", BOPWoodTypes.EMPYREAL);
	}

	private static RegistryObject<Block> registerMailBox (String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_mail_box", () -> 
				new CustomMailboxBlock(woodType));
		ITEMS.register(name + "_mail_box", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name + "_mail_box");
		return block;
	}
}
