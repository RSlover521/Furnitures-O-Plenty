package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.blockentity.CuttingBoardBlockEntity;
import com.mrcrayfish.furniture.refurbished.core.ModRecipeTypes;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomCuttingBoardBlockEntity extends CuttingBoardBlockEntity {
	public CustomCuttingBoardBlockEntity(BlockPos pos, BlockState state) {
		this(ModBlockEntities.CUSTOM_CUTTING_BOARD.get(), pos, state);
	}

	public CustomCuttingBoardBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state, 5, ModRecipeTypes.CUTTING_BOARD_SLICING.get(),
				ModRecipeTypes.CUTTING_BOARD_COMBINING.get());
	}
}
