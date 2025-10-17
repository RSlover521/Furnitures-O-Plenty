package com.rslover521.furnituresoplenty.modFurnitures;

import com.mrcrayfish.furniture.refurbished.block.KitchenCabinetryBlock;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public class CustomKitchenCabinetryBlock extends KitchenCabinetryBlock{
	private WoodType woodType;

	public CustomKitchenCabinetryBlock(WoodType woodType) {
		super(Properties.of()
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
