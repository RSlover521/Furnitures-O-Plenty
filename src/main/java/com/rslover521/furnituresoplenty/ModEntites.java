package com.rslover521.furnituresoplenty;

import com.rslover521.entity.SeatEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntites {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FurnituresOPlenty.MODID);
	
	public static final RegistryObject<EntityType<SeatEntity>> SEAT = ENTITIES.register("seat",
			() -> EntityType.Builder.<SeatEntity>of(SeatEntity::new, MobCategory.MISC)
			.sized(0.001F, 0.001F)
			.clientTrackingRange(10)
			.updateInterval(1)
			.build("seat"));
}
