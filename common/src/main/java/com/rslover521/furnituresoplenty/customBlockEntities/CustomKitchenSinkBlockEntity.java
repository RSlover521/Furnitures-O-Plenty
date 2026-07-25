package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.blockentity.KitchenSinkBlockEntity;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomKitchenSinkBlockEntity extends KitchenSinkBlockEntity {
	public CustomKitchenSinkBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.CUSTOM_KITCHEN_SINK.get(), pos, state);
	}

	public CustomKitchenSinkBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
}
