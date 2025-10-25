package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomLatticeFenceBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPLatticeFenceRegistry {

    public static final RegistryObject<Block> FIR_LATTICE_FENCE = registerLatticeFence("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_LATTICE_FENCE = registerLatticeFence("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_LATTICE_FENCE = registerLatticeFence("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_LATTICE_FENCE = registerLatticeFence("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_LATTICE_FENCE = registerLatticeFence("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_LATTICE_FENCE = registerLatticeFence("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_LATTICE_FENCE = registerLatticeFence("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_LATTICE_FENCE = registerLatticeFence("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_LATTICE_FENCE = registerLatticeFence("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_LATTICE_FENCE = registerLatticeFence("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_LATTICE_FENCE = registerLatticeFence("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_LATTICE_FENCE = registerLatticeFence("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_LATTICE_FENCE = registerLatticeFence("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerLatticeFence(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_lattice_fence",
            () -> new CustomLatticeFenceBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_lattice_fence", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_lattice_fence");
        return block;
    }
}