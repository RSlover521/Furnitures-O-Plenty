package com.rslover521.furnituresoplenty.forge;

import com.mojang.logging.LogUtils;
import com.rslover521.furnituresoplenty.FurnituresOPlentyCommon;
import com.rslover521.furnituresoplenty.compat.backpacked.BackpackedCompat;
import com.rslover521.furnituresoplenty.core.ModBlocks;
import com.rslover521.furnituresoplenty.forge.compat.backpacked.CustomShelfBlockEntity;
import dev.architectury.platform.forge.EventBuses;

import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FurnituresOPlenty.MODID)
public class FurnituresOPlenty {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "furnituresoplenty";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public FurnituresOPlenty(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        EventBuses.registerModEventBus(MODID, modEventBus);
        FurnituresOPlentyCommon.init();

        // Keep every reference to Backpacked behind this presence check. Loading the
        // compatibility class without Backpacked would otherwise fail class loading.
        if (ModList.get().isLoaded("backpacked")) {
            BackpackedCompat.register(CustomShelfBlockEntity::new,
                    woodType -> ModBlocks.BOP_PLANKS_BY_WOOD.get(woodType).get().defaultMapColor());
        }

        // Defer init until after registries exist
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    	
    }
    
    public static void onServerStart(ServerStartingEvent event) {
    	LOGGER.info("Initializing Furnitures O' Plenty and recipes");
    }
}
