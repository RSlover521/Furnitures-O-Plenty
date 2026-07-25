package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.blockentity.CrateBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomCrateBlockEntity extends CrateBlockEntity {
	public CustomCrateBlockEntity(BlockPos pos, BlockState state) {
		super(pos, state);
	}

	public CustomCrateBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int row) {
		super(type, pos, state, row);
	}
}
