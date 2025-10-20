package com.rslover521.furnituresoplenty;

import com.mojang.logging.LogUtils;
import com.rslover521.furnituresoplenty.modFurnitures.ModCreativeTabs;
import com.rslover521.furnituresoplenty.registries.*;

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
	public FurnituresOPlenty() {
    	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Block Registries
    	BOPChairRegistry.BLOCKS.register(modEventBus);
    	BOPTableRegistry.BLOCKS.register(modEventBus);
        BOPToiletRegistry.BLOCKS.register(modEventBus);
        BOPDeskRegistry.BLOCKS.register(modEventBus);
        BOPDrawerRegistry.BLOCKS.register(modEventBus);
        BOPKitchenDrawerRegistry.BLOCKS.register(modEventBus);
        BOPCuttingBoardRegistry.BLOCKS.register(modEventBus);
        BOPCrateRegistry.BLOCKS.register(modEventBus);
        BOPMailboxRegistry.BLOCKS.register(modEventBus);
        BOPBathRegistry.BLOCKS.register(modEventBus);
        BOPKitchenStorageCabinetRegistry.BLOCKS.register(modEventBus);
        BOPStorageJarRegistry.BLOCKS.register(modEventBus);
        BOPStorageCabinetRegistry.BLOCKS.register(modEventBus);
        BOPCeilingFanRegistry.BLOCKS.register(modEventBus);
        BOPLatticeFenceRegistry.BLOCKS.register(modEventBus);
        BOPLatticeFenceGateRegistry.BLOCKS.register(modEventBus);
        BOPBasinRegistry.BLOCKS.register(modEventBus);
        BOPKitchenCabinetryRegistry.BLOCKS.register(modEventBus);
        BOPKitchenSinkRegistry.BLOCKS.register(modEventBus);

        // Item Registries
        BOPKitchenDrawerRegistry.ITEMS.register(modEventBus);
        BOPDrawerRegistry.ITEMS.register(modEventBus);
        BOPDeskRegistry.ITEMS.register(modEventBus);
        BOPToiletRegistry.ITEMS.register(modEventBus);
        BOPChairRegistry.ITEMS.register(modEventBus);
        BOPTableRegistry.ITEMS.register(modEventBus);
        BOPCuttingBoardRegistry.ITEMS.register(modEventBus);
        BOPCrateRegistry.ITEMS.register(modEventBus);
        BOPMailboxRegistry.ITEMS.register(modEventBus);
        BOPBathRegistry.ITEMS.register(modEventBus);
        BOPKitchenStorageCabinetRegistry.ITEMS.register(modEventBus);
        BOPStorageJarRegistry.ITEMS.register(modEventBus);
        BOPStorageCabinetRegistry.ITEMS.register(modEventBus);
        BOPCeilingFanRegistry.ITEMS.register(modEventBus);
        BOPLatticeFenceRegistry.ITEMS.register(modEventBus);
        BOPLatticeFenceGateRegistry.ITEMS.register(modEventBus);
        BOPBasinRegistry.ITEMS.register(modEventBus);
        BOPKitchenCabinetryRegistry.ITEMS.register(modEventBus);
        BOPKitchenSinkRegistry.ITEMS.register(modEventBus);

        // Creative Tab Registries
    	ModCreativeTabs.register();
    	
    }
    
    public static void onServerStart(ServerStartingEvent event) {
    	LOGGER.info("Initializing Furnitures O' Plenty and recipes");
    }
}
