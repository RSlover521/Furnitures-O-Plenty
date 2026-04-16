package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.HedgeBlock;
import com.mrcrayfish.furniture.refurbished.block.LeafType;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class CustomHedgeBlock extends HedgeBlock { 
	private LeafType type;
	public CustomHedgeBlock(LeafType type, BlockBehaviour.Properties properties) {
		super(type, properties);
		this.type = type;
	}

	public LeafType getLeafType() {
		return type;
	}
	
}
