package com.rslover521.ModBlocks;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import biomesoplenty.api.block.BOPWoodTypes;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPWoodFurnitureRegistry {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	
	public static final Map<String, RegistryObject<Block>> CHAIRS = new HashMap<>();
	
	public static void registerAllChairs() {
		for (Field field : BOPWoodTypes.class.getDeclaredFields()) {
			if (field.getType() == WoodType.class) {
				try {
					WoodType type = (WoodType) field.get(null);
					String id = type.name().replace("biomesoplenty:", "") + "_chair";
					
					RegistryObject<Block> block = BLOCKS.register(id, () -> new CustomChairBlock(type));
					ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties()));
					
					CHAIRS.put(type.name(), block);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
}