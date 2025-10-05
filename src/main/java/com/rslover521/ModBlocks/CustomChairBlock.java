package com.rslover521.ModBlocks;

import java.lang.reflect.Constructor;
import java.util.List;

import com.mrcrayfish.furniture.refurbished.block.ChairBlock;
import com.rslover521.entity.SeatEntity;

import biomesoplenty.api.block.BOPWoodTypes;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.resources.ResourceLocation;

public class CustomChairBlock extends ChairBlock {
	private WoodType woodType;
	
	public CustomChairBlock(WoodType woodType) {
		super(woodType, Properties.of()
				.strength(1.5F)
				.sound(SoundType.WOOD));
		this.woodType = woodType;
	}
	
	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		if(level.isClientSide) return InteractionResult.SUCCESS;
		if(!player.isPassenger()) {
			SeatEntity seat = new SeatEntity(level, pos.getX() + 0.5D, pos.getY() + 0.25D, pos.getZ() + 0.5D);
			level.addFreshEntity(seat);
			player.startRiding(seat);
		}
		return InteractionResult.CONSUME;
	}
	
	public WoodType getWoodType() {
		return woodType;
	}
	
	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}
}
