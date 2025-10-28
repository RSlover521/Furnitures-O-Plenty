package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.DeskBlock;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public class CustomDeskBlock extends DeskBlock {
	private WoodType woodType;
	
	public CustomDeskBlock(WoodType woodType) {
		super(woodType, Properties.of()
			.strength(2.0F)
			.mapColor(MapColor.WOOD)
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
