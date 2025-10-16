package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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

	// === Biomes O' Plenty wood dark ceiling fans ===
	public static final RegistryObject<Block> FIR_DARK_CEILING_FAN;

	
}
