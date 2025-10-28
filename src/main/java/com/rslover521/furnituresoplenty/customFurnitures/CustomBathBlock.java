package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.BathBlock;

import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomBathBlock extends BathBlock {
	private WoodType woodType;
	public CustomBathBlock(WoodType woodType) {
		super(Properties.of()
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
