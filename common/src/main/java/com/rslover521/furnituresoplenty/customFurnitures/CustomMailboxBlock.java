package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.MailboxBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomMailboxBlock extends MailboxBlock {
	private WoodType woodType;
	public CustomMailboxBlock(WoodType woodType, BlockBehaviour.Properties properties) {
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

