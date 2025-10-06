package com.rslover521.furnituresoplenty;

import com.rslover521.ModBlocks.BOPWoodFurnitureRegistry;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile;

public class FurnitureBlockStateProvider extends BlockStateProvider {
	
	 public FurnitureBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
	        super(output, FurnituresOPlenty.MODID, exFileHelper);
	    }

	
	protected void registerStatesAndModels() {
		for(String wood : BOPWoodFurnitureRegistry.BOP_WOODS) {
			Block block = BOPWoodFurnitureRegistry.CHAIRS.get(wood).get();
			
			ModelFile chairModel = models()
					.withExistingParent(wood + "_chair", modLoc("block/chair_template"))
					.texture("texture", modLoc("block/" + wood + "_planks"));
					
			getVariantBuilder(block)
			.partialState()
			.modelForState()
			.modelFile(chairModel)
			.addModel();
			
			simpleBlockItem(block, chairModel);
		}
	}
}
