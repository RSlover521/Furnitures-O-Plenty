package com.rslover521.furnituresoplenty;

import com.mojang.logging.LogUtils;
import com.rslover521.furnituresoplenty.modFurnitures.ModBlocks;
import com.rslover521.furnituresoplenty.modFurnitures.ModCreativeTabs;

import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FurnituresOPlenty.MODID)
public class FurnituresOPlenty {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "furnituresoplenty";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    
    @SuppressWarnings("removal")
	public FurnituresOPlenty(FMLJavaModLoadingContext context) {
    	IEventBus modEventBus = context.getModEventBus();

        ModBlocks.register(modEventBus);

    	ModCreativeTabs.register();
    	
    }
    
    public static void onServerStart(ServerStartingEvent event) {
    	LOGGER.info("Initializing Furnitures O' Plenty and recipes");
    }
}
