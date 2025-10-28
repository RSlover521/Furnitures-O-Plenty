package com.rslover521.furnituresoplenty.customFurnitures;

import java.util.Map;

import com.google.common.collect.ImmutableList;
import com.mrcrayfish.furniture.refurbished.block.StorageCabinetBlock;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CustomStorageCabinetBlock extends StorageCabinetBlock {
	private WoodType woodType;

	public CustomStorageCabinetBlock(WoodType woodType) {
		super(Properties.of()
				.mapColor(MapColor.WOOD)
				.strength(2.0F, 3.0F)
		);
		this.woodType = woodType;
	}

	public WoodType woodType() {
		return woodType;
	}

	public void setWoodType(WoodType woodType) {
		this.woodType = woodType;
	}

	@Override
	protected Map<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> arg0) {
		return shapes;
	}
}
