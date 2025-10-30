package com.rslover521.furnituresoplenty.customBlockEntities;

import com.rslover521.furnituresoplenty.blockEntities.ModBlockEntities;

import com.mrcrayfish.furniture.block.entity.StorageJarBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class CustomStorageJarBlockEntity extends StorageJarBlockEntity {
    public CustomStorageJarBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CUSTOM_STORAGE_JAR.get(), pos, state);
    }

    public CustomStorageJarBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}