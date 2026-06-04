package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.backpacked.blockentity.ForgeShelfBlockEntity;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomShelfBlockEntity extends ForgeShelfBlockEntity {
	public CustomShelfBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.CUSTOM_SHELF.get(), pos, state);
	}

	public CustomShelfBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
}
