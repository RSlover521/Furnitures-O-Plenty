package com.rslover521.furnituresoplenty.customFurnitures;

import com.mrcrayfish.furniture.refurbished.block.WoodenToiletBlock;
import com.mrcrayfish.furniture.refurbished.entity.Seat;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomToiletBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class CustomToiletBlock extends WoodenToiletBlock {
	public WoodType woodType;
	
	public CustomToiletBlock(WoodType woodType, BlockBehaviour.Properties properties) {
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
		return new CustomToiletBlockEntity(pos, state);
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
			BlockHitResult hit) {
		Vec3 hitLocation = hit.getLocation().subtract(Vec3.atLowerCornerOf(pos));
		if (hitLocation.y() <= 0.625D) {
			if (level.isClientSide()) {
				return InteractionResult.SUCCESS;
			}
			return Seat.sit(player, pos, 0.35D, state.getValue(DIRECTION).getOpposite())
					? InteractionResult.SUCCESS
					: InteractionResult.PASS;
		}
		return super.use(state, level, pos, player, hand, hit);
	}
}
