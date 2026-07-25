package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.TableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomTableBlock extends TableBlock {
    private final WoodType type;

    public CustomTableBlock(WoodType woodType, BlockBehaviour.Properties properties) {
    	super(woodType, properties);
        this.type = woodType;
    }

    public WoodType getWoodType() {
        return type;
    }
}
