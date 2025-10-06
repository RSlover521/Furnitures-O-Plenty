package com.rslover521.furnituresoplenty;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.server.packs.PackType;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FurnituresOPlenty.MODID, bus = net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		var gen = event.getGenerator();
		var exFileHelper = event.getExistingFileHelper();
		
		if(event.includeClient()) {
			gen.addProvider(true, (DataProvider.Factory<? extends DataProvider>)(output -> new FurnitureBlockStateProvider(output, exFileHelper)));
		}
	}

}
