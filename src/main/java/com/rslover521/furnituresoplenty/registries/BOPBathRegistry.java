package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomBathBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPBathRegistry {

    public static final RegistryObject<Block> FIR_BATH = registerBath("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_BATH = registerBath("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_BATH = registerBath("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_BATH = registerBath("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_BATH = registerBath("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_BATH = registerBath("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_BATH = registerBath("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_BATH = registerBath("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_BATH = registerBath("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_BATH = registerBath("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_BATH = registerBath("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_BATH = registerBath("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_BATH = registerBath("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerBath(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_bath",
            () -> new CustomBathBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_bath", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_bath");
        return block;
    }
}
