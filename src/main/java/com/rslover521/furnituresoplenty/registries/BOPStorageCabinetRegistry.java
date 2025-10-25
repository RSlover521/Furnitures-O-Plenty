package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomStorageCabinetBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPStorageCabinetRegistry {

    public static final RegistryObject<Block> FIR_STORAGE_CABINET = registerStorageCabinet("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_STORAGE_CABINET = registerStorageCabinet("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_STORAGE_CABINET = registerStorageCabinet("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_STORAGE_CABINET = registerStorageCabinet("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_STORAGE_CABINET = registerStorageCabinet("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_STORAGE_CABINET = registerStorageCabinet("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_STORAGE_CABINET = registerStorageCabinet("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_STORAGE_CABINET = registerStorageCabinet("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_STORAGE_CABINET = registerStorageCabinet("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_STORAGE_CABINET = registerStorageCabinet("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_STORAGE_CABINET = registerStorageCabinet("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_STORAGE_CABINET = registerStorageCabinet("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_STORAGE_CABINET = registerStorageCabinet("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerStorageCabinet(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_storage_cabinet",
            () -> new CustomStorageCabinetBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_storage_cabinet", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_storage_cabinet");
        return block;
    }
}
