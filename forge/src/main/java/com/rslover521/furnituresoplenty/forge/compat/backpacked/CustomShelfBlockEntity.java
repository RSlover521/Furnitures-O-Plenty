package com.rslover521.furnituresoplenty.forge.compat.backpacked;

import com.mrcrayfish.backpacked.blockentity.ForgeShelfBlockEntity;
import com.rslover521.furnituresoplenty.compat.backpacked.BackpackedCompat;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomShelfBlockEntity extends ForgeShelfBlockEntity {
	public CustomShelfBlockEntity(BlockPos pos, BlockState state) {
		super(BackpackedCompat.CUSTOM_SHELF.get(), pos, state);
	}

	public CustomShelfBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
}
