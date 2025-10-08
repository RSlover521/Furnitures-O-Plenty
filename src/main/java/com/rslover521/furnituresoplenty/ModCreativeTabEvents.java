package com.rslover521.furnituresoplenty;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

@Mod.EventBusSubscriber(modid = FurnituresOPlenty.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabEvents {
	
	@SubscribeEvent
	public static void onBuildCreativeTab(BuildCreativeModeTabContentsEvent event) {
		if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			event.accept(ModFurnitures.MAPLE_CHAIR_ITEM.get());
		}
		
	}
}
