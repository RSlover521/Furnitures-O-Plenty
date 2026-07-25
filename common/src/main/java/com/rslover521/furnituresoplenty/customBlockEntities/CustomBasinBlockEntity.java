package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.blockentity.BasinBlockEntity;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomBasinBlockEntity extends BasinBlockEntity {
	public CustomBasinBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.CUSTOM_BASIN.get(), pos, state);
	}

	public CustomBasinBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
}
