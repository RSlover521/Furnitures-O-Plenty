package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomCrateBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPCrateRegistry {

    public static final RegistryObject<Block> FIR_CRATE = registerCrate("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_CRATE = registerCrate("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_CRATE = registerCrate("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_CRATE = registerCrate("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_CRATE = registerCrate("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_CRATE = registerCrate("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_CRATE = registerCrate("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_CRATE = registerCrate("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_CRATE = registerCrate("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_CRATE = registerCrate("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_CRATE = registerCrate("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_CRATE = registerCrate("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_CRATE = registerCrate("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerCrate(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_crate",
            () -> new CustomCrateBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_crate", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_crate");
        return block;
    }
}
