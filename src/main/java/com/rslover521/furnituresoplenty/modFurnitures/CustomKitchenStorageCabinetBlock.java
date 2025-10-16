package com.rslover521.furnituresoplenty.modFurnitures;

import com.mrcrayfish.furniture.refurbished.block.KitchenStorageCabinetBlock;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public class CustomKitchenStorageCabinetBlock extends KitchenStorageCabinetBlock {
	private WoodType woodType;

	public CustomKitchenStorageCabinetBlock(WoodType woodType) {
		super(Properties.of().mapColor(MapColor.WOOD).strength(2.0F, 3.0F));
		this.woodType = woodType;
	}

	public WoodType getWoodType() {
		return woodType;
	}

	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
	
}
