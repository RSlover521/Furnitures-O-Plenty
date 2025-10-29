package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.blockentity.DrawerBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomDrawerBlockEntity extends DrawerBlockEntity {
	public CustomDrawerBlockEntity(BlockPos pos, BlockState state) {
		super(pos, state);
	}
	
	public CustomDrawerBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int rows) {
		super(type, pos, state, rows);
	}
}
