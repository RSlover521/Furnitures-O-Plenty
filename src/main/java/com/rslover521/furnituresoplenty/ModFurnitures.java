package com.rslover521.furnituresoplenty;

import java.util.List;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import biomesoplenty.api.block.BOPWoodTypes;

public class ModFurnitures {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, 
			FurnituresOPlenty.MODID);

	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, 
			FurnituresOPlenty.MODID);

	public static final List<String> BOP_WOOD_TYPES = List.of(
		"cherry", "mahogany", "jacaranda", "palm", "willow", "fir", "redwood", "hellbark", "magic", "dead"
	);

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
		ITEMS.register(eventBus);
	}

	static {
		for(String wood : BOP_WOOD_TYPES) {
			String name = wood + "_chair";

			RegistryObject<Block> block = BLOCKS.register(name,
					() -> new CustomChairBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
			);
			
			ITEMS.register(name,
					() -> new BlockItem(block.get(), new Item.Properties())
			);

		}
	}
}


