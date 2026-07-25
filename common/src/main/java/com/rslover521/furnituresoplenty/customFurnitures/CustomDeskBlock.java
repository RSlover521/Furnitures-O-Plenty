package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.DeskBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomDeskBlock extends DeskBlock {
	private WoodType woodType;
	
	public CustomDeskBlock(WoodType woodType, BlockBehaviour.Properties properties) {
		super(woodType, properties);
		this.woodType = woodType;
	}

	public WoodType getWoodType() {
		return woodType;
	}

	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
}
