package com.rslover521.furnituresoplenty.modFurnitures;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FurnituresOPlenty.MODID)
public class ModAdvancementEvents {
	@SuppressWarnings("removal")
	private static final ResourceLocation ROOT_ADVANCEMENT = 
			new ResourceLocation(FurnituresOPlenty.MODID, "root");

	@SubscribeEvent
	public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
		if(event.getEntity() instanceof ServerPlayer player) {
			var advancement = player.server.getAdvancements().getAdvancement(ROOT_ADVANCEMENT);
			if (advancement != null) {
				var progress = player.getAdvancements().getOrStartProgress(advancement);
				if(!progress.isDone()) {
					for(String criterion : progress.getRemainingCriteria()) {
						player.getAdvancements().award(advancement, criterion);
					}
				}
			}
		}
	}
}
