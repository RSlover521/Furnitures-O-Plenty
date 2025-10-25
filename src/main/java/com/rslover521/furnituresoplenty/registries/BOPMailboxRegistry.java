package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomMailboxBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPMailboxRegistry {

	public static final RegistryObject<Block> FIR_MAIL_BOX = registerMailbox("fir", BOPWoodTypes.FIR);
	public static final RegistryObject<Block> PINE_MAIL_BOX = registerMailbox("pine", BOPWoodTypes.PINE);
	public static final RegistryObject<Block> MAPLE_MAIL_BOX = registerMailbox("maple", BOPWoodTypes.MAPLE);
	public static final RegistryObject<Block> REDWOOD_MAIL_BOX = registerMailbox("redwood", BOPWoodTypes.REDWOOD);
	public static final RegistryObject<Block> MAHOGANY_MAIL_BOX = registerMailbox("mahogany", BOPWoodTypes.MAHOGANY);
	public static final RegistryObject<Block> JACARANDA_MAIL_BOX = registerMailbox("jacaranda", BOPWoodTypes.JACARANDA);
	public static final RegistryObject<Block> PALM_MAIL_BOX = registerMailbox("palm", BOPWoodTypes.PALM);
	public static final RegistryObject<Block> WILLOW_MAIL_BOX = registerMailbox("willow", BOPWoodTypes.WILLOW);
	public static final RegistryObject<Block> DEAD_MAIL_BOX = registerMailbox("dead", BOPWoodTypes.DEAD);
	public static final RegistryObject<Block> MAGIC_MAIL_BOX = registerMailbox("magic", BOPWoodTypes.MAGIC);
	public static final RegistryObject<Block> UMBRAN_MAIL_BOX = registerMailbox("umbran", BOPWoodTypes.UMBRAN);
	public static final RegistryObject<Block> HELLBARK_MAIL_BOX = registerMailbox("hellbark", BOPWoodTypes.HELLBARK);
	public static final RegistryObject<Block> EMPYREAL_MAIL_BOX = registerMailbox("empyreal", BOPWoodTypes.EMPYREAL);

	private static RegistryObject<Block> registerMailbox(String wood, WoodType woodType) {
	    RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_mail_box", () -> new CustomMailboxBlock(woodType));
	    ModRegistry.ITEMS.register(wood + "_mail_box", () -> new BlockItem(block.get(), new Item.Properties()));
	    FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + wood + "_mail_box");
	    return block;
	}

}
