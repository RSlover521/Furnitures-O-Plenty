package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomBasinBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPBasinRegistry {

    public static final RegistryObject<Block> FIR_BASIN = registerBasin("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_BASIN = registerBasin("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_BASIN = registerBasin("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_BASIN = registerBasin("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_BASIN = registerBasin("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_BASIN = registerBasin("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_BASIN = registerBasin("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_BASIN = registerBasin("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_BASIN = registerBasin("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_BASIN = registerBasin("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_BASIN = registerBasin("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_BASIN = registerBasin("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_BASIN = registerBasin("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerBasin(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_basin",
            () -> new CustomBasinBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_basin", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + wood + "_basin");
        return block;
    }
}
