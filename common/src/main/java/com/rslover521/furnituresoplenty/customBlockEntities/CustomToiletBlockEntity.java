package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.blockentity.ToiletBlockEntity;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomToiletBlockEntity extends ToiletBlockEntity {
	public CustomToiletBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.CUSTOM_TOILET.get(), pos, state);
	}

	public CustomToiletBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
	
}
