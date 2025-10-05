package com.rslover521.ModBlocks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPWoodFurnitureRegistry {
	private static final Map<String, Function<String, Block>> FURNITURE_TYPES = Map.ofEntries(
			Map.entry("chair", CustomChairBlock::new)
	        /*Map.entry("table", CustomTableBlock::new)
	        Map.entry("coffee_table", CustomCoffeeTableBlock::new),
	        Map.entry("bench", CustomBenchBlock::new),
	        Map.entry("bedside_cabinet", CustomBedsideCabinetBlock::new),
	        Map.entry("desk", CustomDeskBlock::new),
	        Map.entry("desk_cabinet", CustomDeskCabinetBlock::new),
	        Map.entry("kitchen_counter", CustomKitchenCounterBlock::new),
	        Map.entry("kitchen_drawer", CustomKitchenDrawerBlock::new),
	        Map.entry("shelf", CustomShelfBlock::new),
	        Map.entry("crate", CustomCrateBlock::new),
	        Map.entry("mailbox", CustomMailboxBlock::new)*/
	        );
	
	public static final List<String> BOP_WOODS = List.of(
		    "maple",
		    "cherry",
		    "mahogany",
		    "jacaranda",
		    "willow",
		    "dead",
		    "magic",
		    "umbran",
		    "hellbark",
		    "fir"
		);
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);

	public static final Map<String, RegistryObject<Block>> CHAIRS = new HashMap<>();
	public static final Map<String, WoodType> REGISTERED_WOOD_TYPES = new HashMap<>();
	
	public static void registerAllChairs() {
		for (String wood : BOP_WOODS) {
			String id = wood + "_chair";

        RegistryObject<Block> block = BLOCKS.register(id, () -> new CustomChairBlock(wood));
        ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties()));

        CHAIRS.put(wood, block);
		}
	}
}
