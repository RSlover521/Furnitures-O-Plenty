package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.WoodenBasinBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomBasinBlock extends WoodenBasinBlock{
	private WoodType woodType;
	
	public CustomBasinBlock(WoodType woodType, BlockBehaviour.Properties properties) {
		super(woodType, properties);
	}
	
	public WoodType getWoodType() {
		return woodType;
	}
	
	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
}
