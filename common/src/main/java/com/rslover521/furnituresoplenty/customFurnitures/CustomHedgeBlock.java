package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.HedgeBlock;
import com.mrcrayfish.furniture.refurbished.block.LeafType;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class CustomHedgeBlock extends HedgeBlock { 
	private CustomBOPLeafType type;
	public CustomHedgeBlock(CustomBOPLeafType type, BlockBehaviour.Properties properties) {
		super(type.toLeafType(), properties);
		this.type = type;
	}

	public LeafType getLeafType() {
		return type.toLeafType();
	}

	public CustomBOPLeafType getCustomLeafType() {
		return type;
	}
	
}
