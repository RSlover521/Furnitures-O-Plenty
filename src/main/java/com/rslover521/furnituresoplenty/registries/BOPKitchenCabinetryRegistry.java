package com.rslover521.furnituresoplenty.registries;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomKitchenCabinetryBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPKitchenCabinetryRegistry {

    public static final RegistryObject<Block> FIR_KITCHEN_CABINETRY = registerKitchenCabinetry("fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_KITCHEN_CABINETRY = registerKitchenCabinetry("pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_KITCHEN_CABINETRY = registerKitchenCabinetry("maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_KITCHEN_CABINETRY = registerKitchenCabinetry("redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_KITCHEN_CABINETRY = registerKitchenCabinetry("mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_KITCHEN_CABINETRY = registerKitchenCabinetry("jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_KITCHEN_CABINETRY = registerKitchenCabinetry("palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_KITCHEN_CABINETRY = registerKitchenCabinetry("willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_KITCHEN_CABINETRY = registerKitchenCabinetry("dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_KITCHEN_CABINETRY = registerKitchenCabinetry("magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_KITCHEN_CABINETRY = registerKitchenCabinetry("umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_KITCHEN_CABINETRY = registerKitchenCabinetry("hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_KITCHEN_CABINETRY = registerKitchenCabinetry("empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerKitchenCabinetry(String wood, WoodType woodType) {
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(wood + "_kitchen_cabinetry",
            () -> new CustomKitchenCabinetryBlock(woodType));
        ModRegistry.ITEMS.register(wood + "_kitchen_cabinetry", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + wood + "_kitchen_cabinetry");
        return block;
    }
}
