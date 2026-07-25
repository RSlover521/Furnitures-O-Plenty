package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.CeilingFanBlock;
import com.mrcrayfish.furniture.refurbished.block.MetalType;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomCeilingFanBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomCeilingFanBlock extends CeilingFanBlock {
	private MetalType metalType;
	private WoodType woodType;

	public CustomCeilingFanBlock (WoodType woodType, MetalType metalType, BlockBehaviour.Properties properties) {
		super(woodType, metalType, properties);
		this.woodType = woodType;
		this.metalType = metalType;
	}

	public WoodType getWoodType() {
		return woodType;
	}

	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}

	public MetalType getMetalType() {
		return metalType;
	}

	public void setMetalType(MetalType metalType) {
		this.metalType = metalType;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new CustomCeilingFanBlockEntity(pos, state);
	}
}
