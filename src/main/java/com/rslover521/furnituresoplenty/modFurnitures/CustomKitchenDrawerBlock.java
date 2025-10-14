package com.rslover521.furnituresoplenty.modFurnitures;

import com.mrcrayfish.furniture.refurbished.block.KitchenDrawerBlock;

import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomKitchenDrawerBlock extends KitchenDrawerBlock {
	private WoodType woodType;
	public CustomKitchenDrawerBlock(WoodType woodType) {
		super(Properties.of().strength(2.0F, 3.0F));
		this.woodType = woodType;
	}

	public WoodType getWoodType() {
		return woodType;
	}

	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
}
