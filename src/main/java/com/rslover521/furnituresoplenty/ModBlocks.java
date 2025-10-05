package com.rslover521.furnituresoplenty;

import com.rslover521.ModBlocks.CustomChairBlock;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	@SuppressWarnings("removal")
	public static final ResourceKey<CreativeModeTab> DECORATIONS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), new ResourceLocation("minecraft", "decorations"));
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	public static final RegistryObject<Block> MAPLE_CHAIR = BLOCKS.register("maple_chair", () -> new CustomChairBlock("maple"));
	
	public static final RegistryObject<BlockItem> MAPLE_CHAIR_ITEM = ITEMS.register("maple_chair",
			() -> new BlockItem(MAPLE_CHAIR.get(), new Item.Properties()));
	
}
