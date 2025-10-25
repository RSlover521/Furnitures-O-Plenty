package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomStorageJarBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPStorageJarRegistry {

    public static final RegistryObject<Block> FIR_STORAGE_JAR = registerStorageJar("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_STORAGE_JAR = registerStorageJar("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_STORAGE_JAR = registerStorageJar("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_STORAGE_JAR = registerStorageJar("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_STORAGE_JAR = registerStorageJar("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_STORAGE_JAR = registerStorageJar("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_STORAGE_JAR = registerStorageJar("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_STORAGE_JAR = registerStorageJar("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_STORAGE_JAR = registerStorageJar("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_STORAGE_JAR = registerStorageJar("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_STORAGE_JAR = registerStorageJar("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_STORAGE_JAR = registerStorageJar("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_STORAGE_JAR = registerStorageJar("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerStorageJar(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_storage_jar",
            () -> new CustomStorageJarBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_storage_jar", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_storage_jar");
        return block;
    }
}
