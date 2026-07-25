package com.rslover521.furnituresoplenty.compat.backpacked;

import com.mrcrayfish.backpacked.block.ShelfBlock;
import com.mrcrayfish.backpacked.blockentity.ShelfBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public final class CustomShelfBlock extends ShelfBlock {
    private final WoodType woodType;
    private final BlockEntityType.BlockEntitySupplier<ShelfBlockEntity> blockEntityFactory;

    public CustomShelfBlock(WoodType woodType, BlockBehaviour.Properties properties,
            BlockEntityType.BlockEntitySupplier<ShelfBlockEntity> blockEntityFactory) {
        super(properties);
        this.woodType = woodType;
        this.blockEntityFactory = blockEntityFactory;
    }

    public WoodType getWoodType() {
        return woodType;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return blockEntityFactory.create(pos, state);
    }
}
