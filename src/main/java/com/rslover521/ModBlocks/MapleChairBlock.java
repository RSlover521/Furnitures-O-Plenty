package com.rslover521.ModBlocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MapleChairBlock extends Block{
	public MapleChairBlock() {
		super(BlockBehaviour.Properties
				.of()
				.strength(2.0f, 3.0f) // Hardness of a block
				.sound(SoundType.WOOD)
				.noOcclusion());
	}
}
