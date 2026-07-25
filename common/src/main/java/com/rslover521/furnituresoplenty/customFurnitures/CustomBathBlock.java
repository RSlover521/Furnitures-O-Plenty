package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.WoodenBathBlock;
import com.mrcrayfish.furniture.refurbished.blockentity.BathBlockEntity;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomBathBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomBathBlock extends WoodenBathBlock {
	private WoodType woodType;
	public CustomBathBlock(WoodType woodType, BlockBehaviour.Properties properties) {
		super(woodType, properties);
		this.woodType = woodType;
	}

	public WoodType getWoodType() {
		return woodType;
	}

	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new CustomBathBlockEntity(pos, state);
	}

	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state,
			BlockEntityType<T> type) {
		return level.isClientSide ? createTicker(type, ModBlockEntities.CUSTOM_BATH.get(), BathBlockEntity::clientTick)
				: null;
	}
}
