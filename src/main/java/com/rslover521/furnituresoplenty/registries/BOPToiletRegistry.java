package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomToiletBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPToiletRegistry {

    public static final RegistryObject<Block> FIR_TOILET = registerToilet("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_TOILET = registerToilet("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_TOILET = registerToilet("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_TOILET = registerToilet("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_TOILET = registerToilet("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_TOILET = registerToilet("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_TOILET = registerToilet("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_TOILET = registerToilet("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_TOILET = registerToilet("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_TOILET = registerToilet("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_TOILET = registerToilet("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_TOILET = registerToilet("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_TOILET = registerToilet("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerToilet(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_toilet",
            () -> new CustomToiletBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_toilet", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_toilet");
        return block;
    }
}
