package com.rslover521.furnituresoplenty.registries;

import com.mrcrayfish.furniture.refurbished.block.MetalType;
import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.modFurnitures.CustomCeilingFanBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class BOPCeilingFanRegistry {

    // light ceiling fans
    public static final RegistryObject<Block> FIR_LIGHT_CEILING_FAN = registerCeilingFans("light", "fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_LIGHT_CEILING_FAN = registerCeilingFans("light", "pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_LIGHT_CEILING_FAN = registerCeilingFans("light", "maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_LIGHT_CEILING_FAN = registerCeilingFans("light", "redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_LIGHT_CEILING_FAN = registerCeilingFans("light", "mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_LIGHT_CEILING_FAN = registerCeilingFans("light", "jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_LIGHT_CEILING_FAN = registerCeilingFans("light", "palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_LIGHT_CEILING_FAN = registerCeilingFans("light", "willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_LIGHT_CEILING_FAN = registerCeilingFans("light", "dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_LIGHT_CEILING_FAN = registerCeilingFans("light", "magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_LIGHT_CEILING_FAN = registerCeilingFans("light", "umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_LIGHT_CEILING_FAN = registerCeilingFans("light", "hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_LIGHT_CEILING_FAN = registerCeilingFans("light", "empyreal", BOPWoodTypes.EMPYREAL);

    // dark ceiling fans
    public static final RegistryObject<Block> FIR_DARK_CEILING_FAN = registerCeilingFans("dark", "fir", BOPWoodTypes.FIR);
    public static final RegistryObject<Block> PINE_DARK_CEILING_FAN = registerCeilingFans("dark", "pine", BOPWoodTypes.PINE);
    public static final RegistryObject<Block> MAPLE_DARK_CEILING_FAN = registerCeilingFans("dark", "maple", BOPWoodTypes.MAPLE);
    public static final RegistryObject<Block> REDWOOD_DARK_CEILING_FAN = registerCeilingFans("dark", "redwood", BOPWoodTypes.REDWOOD);
    public static final RegistryObject<Block> MAHOGANY_DARK_CEILING_FAN = registerCeilingFans("dark", "mahogany", BOPWoodTypes.MAHOGANY);
    public static final RegistryObject<Block> JACARANDA_DARK_CEILING_FAN = registerCeilingFans("dark", "jacaranda", BOPWoodTypes.JACARANDA);
    public static final RegistryObject<Block> PALM_DARK_CEILING_FAN = registerCeilingFans("dark", "palm", BOPWoodTypes.PALM);
    public static final RegistryObject<Block> WILLOW_DARK_CEILING_FAN = registerCeilingFans("dark", "willow", BOPWoodTypes.WILLOW);
    public static final RegistryObject<Block> DEAD_DARK_CEILING_FAN = registerCeilingFans("dark", "dead", BOPWoodTypes.DEAD);
    public static final RegistryObject<Block> MAGIC_DARK_CEILING_FAN = registerCeilingFans("dark", "magic", BOPWoodTypes.MAGIC);
    public static final RegistryObject<Block> UMBRAN_DARK_CEILING_FAN = registerCeilingFans("dark", "umbran", BOPWoodTypes.UMBRAN);
    public static final RegistryObject<Block> HELLBARK_DARK_CEILING_FAN = registerCeilingFans("dark", "hellbark", BOPWoodTypes.HELLBARK);
    public static final RegistryObject<Block> EMPYREAL_DARK_CEILING_FAN = registerCeilingFans("dark", "empyreal", BOPWoodTypes.EMPYREAL);

    private static RegistryObject<Block> registerCeilingFans(String metalType, String wood, WoodType woodType) {
        MetalType type = metalType.equals("light") ? MetalType.LIGHT : MetalType.DARK;
        RegistryObject<Block> block = ModRegistry.BLOCKS.register(metalType + "_" + wood + "_ceiling_fan",
            () -> new CustomCeilingFanBlock(woodType, type));
        ModRegistry.ITEMS.register(metalType + "_" + wood + "_ceiling_fan", () -> new BlockItem(block.get(), new Item.Properties()));
        FurnituresOPlenty.LOGGER.info("Registered " + metalType + "_" + wood + "_ceiling_fan");
        return block;
    }
}
