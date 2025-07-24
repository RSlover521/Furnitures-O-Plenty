package com.rslover521.furnituressoplenty;

import com.mojang.logging.LogUtils;
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

    public FurnituresOPlenty(FMLJavaModLoadingContext context) {
    	LOGGER.info("hi");
    }
}
