package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.blockentity.BasinBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomBasinBlockEntity extends BasinBlockEntity {
	public CustomBasinBlockEntity(BlockPos pos, BlockState state) {
		super(pos, state);
	}

	public CustomBasinBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
}
