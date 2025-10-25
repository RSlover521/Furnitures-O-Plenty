package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomDrawerBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPDrawerRegistry {

    public static final RegistryObject<Block> FIR_DRAWER = registerDrawer("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_DRAWER = registerDrawer("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_DRAWER = registerDrawer("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_DRAWER = registerDrawer("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_DRAWER = registerDrawer("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_DRAWER = registerDrawer("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_DRAWER = registerDrawer("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_DRAWER = registerDrawer("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_DRAWER = registerDrawer("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_DRAWER = registerDrawer("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_DRAWER = registerDrawer("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_DRAWER = registerDrawer("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_DRAWER = registerDrawer("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerDrawer(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_drawer",
            () -> new CustomDrawerBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_drawer", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_drawer");
        return block;
    }
}
