package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.BasinBlock;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public class CustomBasinBlock extends BasinBlock{
	private WoodType woodType;
	
	public CustomBasinBlock(WoodType woodType) {
		super(Properties.of()
				.mapColor(MapColor.WOOD)
				.strength(3.0F)
				);
		this.woodType = woodType;
	}
	
	public WoodType getWoodType() {
		return woodType;
	}
	
	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
}
