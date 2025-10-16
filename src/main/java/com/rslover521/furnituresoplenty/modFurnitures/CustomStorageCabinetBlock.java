package com.rslover521.furnituresoplenty.modFurnitures;

import com.mrcrayfish.furniture.refurbished.block.StorageCabinetBlock;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public class CustomStorageCabinetBlock extends StorageCabinetBlock {
	private WoodType woodType;

	public CustomStorageCabinetBlock(WoodType woodType) {
		super(Properties.of()
				.mapColor(MapColor.WOOD)
				.strength(2.0F, 3.0F)
		);
		this.woodType = woodType;
	}

	public WoodType woodType() {
		return woodType;
	}

	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
}
