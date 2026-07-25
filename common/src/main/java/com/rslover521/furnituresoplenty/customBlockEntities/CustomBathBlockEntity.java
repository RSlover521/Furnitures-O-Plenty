package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.blockentity.BathBlockEntity;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomBathBlockEntity extends BathBlockEntity {
	public CustomBathBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.CUSTOM_BATH.get(), pos, state);
	}

	public CustomBathBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
	
}
