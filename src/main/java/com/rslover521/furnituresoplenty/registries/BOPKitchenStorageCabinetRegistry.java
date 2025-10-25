package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomKitchenStorageCabinetBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPKitchenStorageCabinetRegistry {

    public static final RegistryObject<Block> FIR_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinet("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerKitchenStorageCabinet(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_kitchen_storage_cabinet",
            () -> new CustomKitchenStorageCabinetBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_kitchen_storage_cabinet", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_kitchen_storage_cabinet");
        return block;
    }
}
