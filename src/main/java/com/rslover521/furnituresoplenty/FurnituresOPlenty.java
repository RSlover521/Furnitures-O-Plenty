package com.rslover521.furnituresoplenty;

import com.mojang.logging.LogUtils;

import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FurnituresOPlenty.MODID)
public class FurnituresOPlenty {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "furnituresoplenty";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    @SuppressWarnings("removal")
	public FurnituresOPlenty(FMLJavaModLoadingContext context) {
    	ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	ModBlocks.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static void onServerStart(ServerStartingEvent event) {
    	LOGGER.info("Initializing Furnitures O' Plenty and recipes");
    }
}
