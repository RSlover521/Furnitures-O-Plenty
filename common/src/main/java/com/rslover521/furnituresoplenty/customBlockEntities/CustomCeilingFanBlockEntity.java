package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.block.CeilingFanBlock;
import com.mrcrayfish.furniture.refurbished.blockentity.ElectricityModuleBlockEntity;
import com.mrcrayfish.furniture.refurbished.blockentity.ILevelAudio;
import com.mrcrayfish.furniture.refurbished.core.ModSounds;
import com.mrcrayfish.furniture.refurbished.platform.Services;
import com.rslover521.furnituresoplenty.client.CeilingFanAudio;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class CustomCeilingFanBlockEntity extends ElectricityModuleBlockEntity implements ILevelAudio {
	private static final float MAX_SPEED = 50.0F;
	private static final float ACCELERATION = 1.25F;
	private static final float RESISTANCE = 0.98F;
	private static final AABB[] DAMAGE_BOXES = createDamageBoxes();

	private final Vec3 audioPosition;
	private float bladeSpeed;
	private float bladeRotation;
	private float lastBladeRotation;

	public CustomCeilingFanBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.CUSTOM_CEILING_FAN.get(), pos, state);
		this.audioPosition = pos.getCenter().add(0.0D, 0.375D, 0.0D);
	}

	@Override
	public boolean isNodePowered() {
		BlockState state = this.getBlockState();
		return state.hasProperty(BlockStateProperties.POWERED) && state.getValue(BlockStateProperties.POWERED);
	}

	@Override
	public void setNodePowered(boolean powered) {
		BlockState state = this.getBlockState();
		if (this.level != null && state.hasProperty(BlockStateProperties.POWERED)) {
			this.level.setBlock(this.worldPosition, state.setValue(BlockStateProperties.POWERED, powered), 3);
		}
	}

	public Direction getDirection() {
		BlockState state = this.getBlockState();
		if (state.hasProperty(CeilingFanBlock.FACING)) {
			return state.getValue(CeilingFanBlock.FACING);
		}
		return Direction.NORTH;
	}

	public float getRotation(float partialTick) {
		return Mth.lerp(partialTick, this.lastBladeRotation, this.bladeRotation);
	}

	public AABB getDamageBox(Direction direction) {
		return DAMAGE_BOXES[direction.get3DDataValue()];
	}

	@Override
	public void moduleTick(Level level) {
		super.moduleTick(level);
		if (!level.isClientSide) {
			this.performDamage(level);
		} else {
			this.updateAnimation();
			EnvExecutor.runInEnv(Env.CLIENT, () -> () -> CeilingFanAudio.play(this));
		}
	}

	@Override
	public SoundEvent getSound() {
		return ModSounds.BLOCK_CEILING_FAN_SPIN.get();
	}

	@Override
	public SoundSource getSource() {
		return SoundSource.BLOCKS;
	}

	@Override
	public Vec3 getAudioPosition() {
		return this.audioPosition;
	}

	@Override
	public boolean canPlayAudio() {
		return this.bladeSpeed > 5.0F && !this.isRemoved();
	}

	@Override
	public float getAudioVolume() {
		return this.bladeSpeed / MAX_SPEED;
	}

	@Override
	public float getAudioPitch() {
		return 0.5F + this.bladeSpeed / MAX_SPEED;
	}

	@Override
	public int getAudioHash() {
		return this.worldPosition.hashCode();
	}

	@Override
	public boolean isAudioEqual(ILevelAudio audio) {
		return this == audio;
	}

	@Override
	public double getAudioRadiusSqr() {
		return 16.0D;
	}

	@Override
	public void setLevel(Level level) {
		super.setLevel(level);
		this.registerElectricityNodeTicker(level);
		if (level.isClientSide && this.isNodePowered()) {
			this.bladeSpeed = MAX_SPEED;
		}
	}

	private void updateAnimation() {
		this.lastBladeRotation = this.bladeRotation;
		if (this.isNodePowered()) {
			this.bladeSpeed = Math.min(this.bladeSpeed + ACCELERATION, MAX_SPEED);
		}
		this.bladeSpeed *= RESISTANCE;
		this.bladeRotation += this.bladeSpeed;
		if (this.bladeRotation > 360.0F) {
			this.bladeRotation -= 360.0F;
			this.lastBladeRotation -= 360.0F;
		}
	}

	private void performDamage(Level level) {
		if (!this.isNodePowered()) {
			return;
		}

		AABB box = this.getDamageBox(this.getDirection()).move(this.getBlockPos());
		for (LivingEntity entity : level.getEntitiesOfClass(LivingEntity.class, box)) {
			entity.hurt(Services.BLOCK.ceilingFanDamageSource(level), 0.5F);
			entity.setLastHurtByMob(entity);
		}
	}

	private static AABB[] createDamageBoxes() {
		AABB[] boxes = new AABB[Direction.values().length];
		boxes[Direction.UP.get3DDataValue()] = new AABB(-0.625D, 0.5D, -0.625D, 1.625D, 0.625D, 1.625D);
		boxes[Direction.DOWN.get3DDataValue()] = new AABB(-0.625D, 0.375D, -0.625D, 1.625D, 0.5D, 1.625D);
		boxes[Direction.NORTH.get3DDataValue()] = new AABB(-0.625D, -0.625D, 0.375D, 1.625D, 1.625D, 0.5D);
		boxes[Direction.EAST.get3DDataValue()] = new AABB(0.5D, -0.625D, -0.625D, 0.625D, 1.625D, 1.625D);
		boxes[Direction.SOUTH.get3DDataValue()] = new AABB(-0.625D, -0.625D, 0.5D, 1.625D, 1.625D, 0.625D);
		boxes[Direction.WEST.get3DDataValue()] = new AABB(0.375D, -0.625D, -0.625D, 0.5D, 1.625D, 1.625D);
		return boxes;
	}
}
