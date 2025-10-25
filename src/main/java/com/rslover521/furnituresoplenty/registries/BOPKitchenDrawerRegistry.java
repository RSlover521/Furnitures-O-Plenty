package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomKitchenDrawerBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPKitchenDrawerRegistry {

    public static final RegistryObject<Block> FIR_KITCHEN_DRAWER = registerKitchenDrawer("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_KITCHEN_DRAWER = registerKitchenDrawer("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_KITCHEN_DRAWER = registerKitchenDrawer("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_KITCHEN_DRAWER = registerKitchenDrawer("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_KITCHEN_DRAWER = registerKitchenDrawer("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_KITCHEN_DRAWER = registerKitchenDrawer("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_KITCHEN_DRAWER = registerKitchenDrawer("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_KITCHEN_DRAWER = registerKitchenDrawer("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_KITCHEN_DRAWER = registerKitchenDrawer("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_KITCHEN_DRAWER = registerKitchenDrawer("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_KITCHEN_DRAWER = registerKitchenDrawer("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_KITCHEN_DRAWER = registerKitchenDrawer("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_KITCHEN_DRAWER = registerKitchenDrawer("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerKitchenDrawer(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_kitchen_drawer",
            () -> new CustomKitchenDrawerBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_kitchen_drawer", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_kitchen_drawer");
        return block;
    }
}
