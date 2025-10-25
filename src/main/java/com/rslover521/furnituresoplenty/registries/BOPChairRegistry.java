package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomChairBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPChairRegistry {

    public static final RegistryObject<Block> FIR_CHAIR = registerChair("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_CHAIR = registerChair("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_CHAIR = registerChair("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_CHAIR = registerChair("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_CHAIR = registerChair("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_CHAIR = registerChair("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_CHAIR = registerChair("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_CHAIR = registerChair("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_CHAIR = registerChair("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_CHAIR = registerChair("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_CHAIR = registerChair("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_CHAIR = registerChair("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_CHAIR = registerChair("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerChair(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_chair",
            () -> new CustomChairBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_chair", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_chair");
        return block;
    }
}
