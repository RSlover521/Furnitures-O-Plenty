package com.rslover521.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;

public class SeatEntity extends Entity{
	public static final EntityType<SeatEntity> TYPE = EntityType.Builder
			.<SeatEntity>of(SeatEntity::new, MobCategory.MISC)
			.sized(0.001F, 0.001F)
			.clientTrackingRange(10)
			.updateInterval(1)
			.build("seat");
	
	public SeatEntity(EntityType<? extends SeatEntity> type, Level level) {
		super(type, level);
		this.noPhysics = true;
	}
	
	public SeatEntity(Level level, double x, double y, double z) {
		this(TYPE, level);
		this.setPos(x, y, z);
	}
	
	@Override
	public void tick() {
		super.tick();
		if(!this.level().isClientSide && !this.isPassenger()) {
			this.discard();
		}
	}
	
	@Override
	protected void defineSynchedData() {}
	
	@Override
	protected void readAdditionalSaveData(CompoundTag tag) {}
	
	@Override
	protected void addAdditionalSaveData(CompoundTag tag) {}
	
	@Override
	public boolean isPickable() {
		return false;
	}
	
	@Override
	public boolean canCollideWith(Entity entity) {
		return false;
	}
	
	@Override
	public boolean isInvisible() {
		return true;
	}
	
	@Override
	public boolean canBeCollidedWith() {
		return false;
	}
}
