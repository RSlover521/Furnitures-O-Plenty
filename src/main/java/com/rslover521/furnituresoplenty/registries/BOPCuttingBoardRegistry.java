package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomCuttingBoardBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPCuttingBoardRegistry {

    public static final RegistryObject<Block> FIR_CUTTING_BOARD = registerCuttingBoard("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_CUTTING_BOARD = registerCuttingBoard("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_CUTTING_BOARD = registerCuttingBoard("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_CUTTING_BOARD = registerCuttingBoard("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_CUTTING_BOARD = registerCuttingBoard("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_CUTTING_BOARD = registerCuttingBoard("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_CUTTING_BOARD = registerCuttingBoard("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_CUTTING_BOARD = registerCuttingBoard("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_CUTTING_BOARD = registerCuttingBoard("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_CUTTING_BOARD = registerCuttingBoard("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_CUTTING_BOARD = registerCuttingBoard("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_CUTTING_BOARD = registerCuttingBoard("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_CUTTING_BOARD = registerCuttingBoard("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerCuttingBoard(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_cutting_board",
            () -> new CustomCuttingBoardBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_cutting_board", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_cutting_board");
        return block;
    }
}
