package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.LatticeFenceBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomLatticeFenceBlock extends LatticeFenceBlock {
	private WoodType woodType;
	
	public CustomLatticeFenceBlock(WoodType woodType, BlockBehaviour.Properties properties) {
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
