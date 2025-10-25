package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomDeskBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPDeskRegistry {

    public static final RegistryObject<Block> FIR_DESK = registerDesk("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_DESK = registerDesk("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_DESK = registerDesk("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_DESK = registerDesk("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_DESK = registerDesk("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_DESK = registerDesk("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_DESK = registerDesk("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_DESK = registerDesk("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_DESK = registerDesk("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_DESK = registerDesk("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_DESK = registerDesk("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_DESK = registerDesk("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_DESK = registerDesk("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerDesk(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_desk",
            () -> new CustomDeskBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_desk", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_desk");
        return block;
    }
}
