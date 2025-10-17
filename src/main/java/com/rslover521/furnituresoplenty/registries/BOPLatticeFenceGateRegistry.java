package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomLatticeFenceGateBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BOPLatticeFenceGateRegistry {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
	
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === Biomes O' Plenty wood lattice fence gate ===
	public static final RegistryObject<Block> FIR_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> PINE_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> MAPLE_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> REDWOOD_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> MAHOGANY_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> JACARANDA_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> PALM_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> WILLOW_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> DEAD_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> MAGIC_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> UMBRAN_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> HELLBARK_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> EMPYREAL_LATTICE_FENCE_GATE;
	
	static {
		FIR_LATTICE_FENCE_GATE = registerLatticeFenceGate("fir", BOPWoodTypes.FIR);
		PINE_LATTICE_FENCE_GATE = registerLatticeFenceGate("pine", BOPWoodTypes.PINE);
		MAPLE_LATTICE_FENCE_GATE = registerLatticeFenceGate("maple", BOPWoodTypes.MAPLE);
		REDWOOD_LATTICE_FENCE_GATE = registerLatticeFenceGate("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_LATTICE_FENCE_GATE = registerLatticeFenceGate("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_LATTICE_FENCE_GATE = registerLatticeFenceGate("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_LATTICE_FENCE_GATE = registerLatticeFenceGate("palm", BOPWoodTypes.PALM);
		WILLOW_LATTICE_FENCE_GATE = registerLatticeFenceGate("willow", BOPWoodTypes.WILLOW);
		DEAD_LATTICE_FENCE_GATE = registerLatticeFenceGate("dead", BOPWoodTypes.DEAD);
		MAGIC_LATTICE_FENCE_GATE = registerLatticeFenceGate("magic", BOPWoodTypes.MAGIC);
		UMBRAN_LATTICE_FENCE_GATE = registerLatticeFenceGate("unbran", BOPWoodTypes.UMBRAN);
		HELLBARK_LATTICE_FENCE_GATE = registerLatticeFenceGate("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_LATTICE_FENCE_GATE = registerLatticeFenceGate("empyreal", BOPWoodTypes.EMPYREAL);
	}
	
	private static RegistryObject<Block> registerLatticeFenceGate(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_lattice_fence_gate", () -> 
				new CustomLatticeFenceGateBlock(woodType));
		ITEMS.register(name + "_lattice_fence_gate", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name + "_lattice_fence_gate");
		return block;
	}
}
