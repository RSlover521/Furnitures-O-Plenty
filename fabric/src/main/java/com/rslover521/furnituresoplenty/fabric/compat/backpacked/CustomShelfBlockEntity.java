package com.rslover521.furnituresoplenty.fabric.compat.backpacked;

import com.mrcrayfish.backpacked.blockentity.ShelfBlockEntity;
import com.rslover521.furnituresoplenty.compat.backpacked.BackpackedCompat;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public final class CustomShelfBlockEntity extends ShelfBlockEntity {
    public CustomShelfBlockEntity(BlockPos pos, BlockState state) {
        super(BackpackedCompat.CUSTOM_SHELF.get(), pos, state);
    }

    public CustomShelfBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}
