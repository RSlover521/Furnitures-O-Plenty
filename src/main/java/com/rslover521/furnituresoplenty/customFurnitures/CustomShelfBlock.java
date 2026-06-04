package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.backpacked.block.ShelfBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomShelfBlock extends ShelfBlock {
	private WoodType woodType;

	public CustomShelfBlock(WoodType woodType, BlockBehaviour.Properties properties) {
		super(properties);
		this.woodType = woodType;
	}

	public WoodType getWoodType() {
		return woodType;
	}
}
