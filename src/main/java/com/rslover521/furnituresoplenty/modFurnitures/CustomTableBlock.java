package com.rslover521.furnituresoplenty.modFurnitures;

import com.mrcrayfish.furniture.refurbished.block.TableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomTableBlock extends TableBlock {
    private final WoodType type;

    public CustomTableBlock(WoodType woodType) {
    	super(woodType, BlockBehaviour.Properties.of()
    	        .strength(1.5F)
    	        .sound(SoundType.WOOD));
        this.type = woodType;
    }

    public WoodType getWoodType() {
        return type;
    }
}
