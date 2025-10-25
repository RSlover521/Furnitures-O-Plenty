package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomTableBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPTableRegistry {

    public static final RegistryObject<Block> FIR_TABLE = registerTable("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_TABLE = registerTable("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_TABLE = registerTable("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_TABLE = registerTable("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_TABLE = registerTable("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_TABLE = registerTable("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_TABLE = registerTable("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_TABLE = registerTable("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_TABLE = registerTable("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_TABLE = registerTable("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_TABLE = registerTable("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_TABLE = registerTable("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_TABLE = registerTable("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerTable(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_table",
            () -> new CustomTableBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_table", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_table");
        return block;
    }
}
