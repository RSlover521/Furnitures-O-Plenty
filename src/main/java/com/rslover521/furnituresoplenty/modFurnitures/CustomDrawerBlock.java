package com.rslover521.furnituresoplenty.modFurnitures;

import com.mrcrayfish.furniture.refurbished.block.DrawerBlock;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public class CustomDrawerBlock extends DrawerBlock {
	private WoodType woodType;

	public CustomDrawerBlock(WoodType woodType) {
		super(woodType, Properties.of()
				.mapColor(MapColor.WOOD)
				.strength(2.0F, 3.0F));
		
		this.woodType = woodType;
	}

	public WoodType getWoodType() {
		return woodType;
	}

	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
}
