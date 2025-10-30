package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.CuttingBoardBlock;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public class CustomCuttingBoardBlock extends CuttingBoardBlock {
	private WoodType woodType;
	public CustomCuttingBoardBlock(WoodType woodType) {
		super(woodType, Properties.of()
				.mapColor(MapColor.WOOD)
				.strength(2.0F, 3.0F)
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
