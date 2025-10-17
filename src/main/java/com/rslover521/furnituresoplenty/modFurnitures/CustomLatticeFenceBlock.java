package com.rslover521.furnituresoplenty.modFurnitures;

import com.mrcrayfish.furniture.refurbished.block.LatticeFenceBlock;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public class CustomLatticeFenceBlock extends LatticeFenceBlock {
	private WoodType woodType;
	
	public CustomLatticeFenceBlock(WoodType woodType) {
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
