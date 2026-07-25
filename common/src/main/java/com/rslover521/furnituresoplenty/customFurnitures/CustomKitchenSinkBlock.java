package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.WoodenKitchenSinkBlock;
import com.mrcrayfish.furniture.refurbished.blockentity.KitchenSinkBlockEntity;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomKitchenSinkBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomKitchenSinkBlock extends WoodenKitchenSinkBlock {
	private WoodType woodType;
	
	public CustomKitchenSinkBlock(WoodType woodType, BlockBehaviour.Properties properties) {
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
		return new CustomKitchenSinkBlockEntity(pos, state);
	}

	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state,
			BlockEntityType<T> type) {
		return level.isClientSide
				? createTicker(type, ModBlockEntities.CUSTOM_KITCHEN_SINK.get(), KitchenSinkBlockEntity::clientTick)
				: null;
	}
}
