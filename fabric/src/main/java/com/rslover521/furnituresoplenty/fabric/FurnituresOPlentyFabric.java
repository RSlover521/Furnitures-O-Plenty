package com.rslover521.furnituresoplenty.fabric;

import com.rslover521.furnituresoplenty.FurnituresOPlentyCommon;
import com.rslover521.furnituresoplenty.compat.backpacked.BackpackedCompat;
import com.rslover521.furnituresoplenty.fabric.compat.backpacked.CustomShelfBlockEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.resources.ResourceLocation;

public final class FurnituresOPlentyFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FurnituresOPlentyCommon.init();
        if (FabricLoader.getInstance().isModLoaded("backpacked")) {
            BackpackedCompat.register(CustomShelfBlockEntity::new, woodType -> net.minecraft.world.level.material.MapColor.WOOD);
        }
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            var player = handler.getPlayer();
            var advancement = server.getAdvancements().getAdvancement(
                    new ResourceLocation(FurnituresOPlentyCommon.MODID, "root"));
            if (advancement != null) {
                var progress = player.getAdvancements().getOrStartProgress(advancement);
                if (!progress.isDone()) {
                    for (String criterion : progress.getRemainingCriteria()) {
                        player.getAdvancements().award(advancement, criterion);
                    }
                }
            }
        });
    }
}
