package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.DrawerBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomDrawerBlock extends DrawerBlock {
	private WoodType woodType;

	public CustomDrawerBlock(WoodType woodType, BlockBehaviour.Properties properties) {
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
