package com.rslover521.furnituresoplenty.modFurnitures;

import com.mrcrayfish.furniture.refurbished.block.ToiletBlock;

import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomToiletBlock extends ToiletBlock {
	public WoodType woodType;
	
	public CustomToiletBlock(WoodType woodType) {
		super(Properties.of().strength(1.5F));
		this.woodType = woodType;
	}

	public WoodType getWoodType() {
		return woodType;
	}

	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
}
