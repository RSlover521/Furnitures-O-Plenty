package com.rslover521.furnituresoplenty;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;
import com.rslover521.furnituresoplenty.core.ModBlocks;
import com.rslover521.furnituresoplenty.core.ModCreativeTabs;
import com.rslover521.furnituresoplenty.core.ModItems;

/** Loader-neutral bootstrap shared by Forge and Fabric. */
public final class FurnituresOPlentyCommon {
    public static final String MODID = "furnituresoplenty";
    public static final Logger LOGGER = LogUtils.getLogger();

    private static boolean initialized;

    private FurnituresOPlentyCommon() {
    }

    public static synchronized void init() {
        if (initialized) {
            return;
        }
        initialized = true;
        LOGGER.info("Initializing Furnitures O' Plenty common module");
        ModBlocks.init();
        ModItems.init();
        ModBlockEntities.init();
        ModCreativeTabs.init();
    }
}
