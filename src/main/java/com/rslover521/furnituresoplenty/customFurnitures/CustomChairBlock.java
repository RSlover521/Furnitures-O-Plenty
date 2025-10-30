package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.ChairBlock;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomChairBlock extends ChairBlock {
	private WoodType woodType;
	
	public CustomChairBlock(WoodType woodType) {
		super(woodType, Properties.of()
				.strength(1.5F)
				.sound(SoundType.WOOD));
		this.woodType = woodType;
	}
	
	public WoodType getWoodType() {
		return woodType;
	}
	
	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
}
