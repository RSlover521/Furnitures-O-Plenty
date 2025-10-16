package com.rslover521.furnituresoplenty;

import com.mojang.logging.LogUtils;
import com.rslover521.furnituresoplenty.modFurnitures.ModCreativeTabs;
import com.rslover521.furnituresoplenty.registries.*;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FurnituresOPlenty.MODID)
public class FurnituresOPlenty {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "furnituresoplenty";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example", () -> new Block(BlockBehaviour.Properties.of()));
    
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

        // Creative Tab Registries
    	ModCreativeTabs.register();
    	
    }
    
    public static void onServerStart(ServerStartingEvent event) {
    	LOGGER.info("Initializing Furnitures O' Plenty and recipes");
    }
}
