package com.rslover521.furnituresoplenty;

import com.mojang.logging.LogUtils;
import com.rslover521.furnituresoplenty.core.ModAdvancementEvents;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;
import com.rslover521.furnituresoplenty.core.ModBlocks;
import com.rslover521.furnituresoplenty.core.ModCreativeTabs;
import com.rslover521.furnituresoplenty.core.ModExtraModels;
import com.rslover521.furnituresoplenty.core.ModItems;

import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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

        ModBlocks.register(modEventBus);

        ModCreativeTabs.register(modEventBus);
        
        ModBlockEntities.register(modEventBus);

        ModAdvancementEvents.register(modEventBus);
        
        ModItems.register(modEventBus);

        ModExtraModels.register(modEventBus);

        // Defer init until after registries exist
        context.getModEventBus().addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    	
    }
    
    public static void onServerStart(ServerStartingEvent event) {
    	LOGGER.info("Initializing Furnitures O' Plenty and recipes");
    }
}
