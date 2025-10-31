package com.rslover521.furnituresoplenty.customBlockEntities;

import com.mrcrayfish.furniture.refurbished.blockentity.StorageCabinetBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomStorageCabinetBlockEntity extends StorageCabinetBlockEntity {
    public CustomStorageCabinetBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    public CustomStorageCabinetBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int slotCount) {
        super(type, pos, state, slotCount);
    }
}