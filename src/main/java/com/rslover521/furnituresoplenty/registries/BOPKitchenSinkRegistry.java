package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomKitchenSinkBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPKitchenSinkRegistry {

    public static final RegistryObject<Block> FIR_KITCHEN_SINK = registerKitchenSink("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_KITCHEN_SINK = registerKitchenSink("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_KITCHEN_SINK = registerKitchenSink("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_KITCHEN_SINK = registerKitchenSink("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_KITCHEN_SINK = registerKitchenSink("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_KITCHEN_SINK = registerKitchenSink("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_KITCHEN_SINK = registerKitchenSink("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_KITCHEN_SINK = registerKitchenSink("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_KITCHEN_SINK = registerKitchenSink("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_KITCHEN_SINK = registerKitchenSink("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_KITCHEN_SINK = registerKitchenSink("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_KITCHEN_SINK = registerKitchenSink("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_KITCHEN_SINK = registerKitchenSink("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerKitchenSink(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_kitchen_sink",
            () -> new CustomKitchenSinkBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_kitchen_sink", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_kitchen_sink");
        return block;
    }
}
