package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomLatticeFenceGateBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPLatticeFenceGateRegistry {

    public static final RegistryObject<Block> FIR_LATTICE_FENCE_GATE = registerLatticeFenceGate("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_LATTICE_FENCE_GATE = registerLatticeFenceGate("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_LATTICE_FENCE_GATE = registerLatticeFenceGate("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_LATTICE_FENCE_GATE = registerLatticeFenceGate("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_LATTICE_FENCE_GATE = registerLatticeFenceGate("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_LATTICE_FENCE_GATE = registerLatticeFenceGate("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_LATTICE_FENCE_GATE = registerLatticeFenceGate("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_LATTICE_FENCE_GATE = registerLatticeFenceGate("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_LATTICE_FENCE_GATE = registerLatticeFenceGate("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_LATTICE_FENCE_GATE = registerLatticeFenceGate("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_LATTICE_FENCE_GATE = registerLatticeFenceGate("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_LATTICE_FENCE_GATE = registerLatticeFenceGate("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_LATTICE_FENCE_GATE = registerLatticeFenceGate("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerLatticeFenceGate(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_lattice_fence_gate",
            () -> new CustomLatticeFenceGateBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_lattice_fence_gate", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_lattice_fence_gate");
        return block;
    }
}
