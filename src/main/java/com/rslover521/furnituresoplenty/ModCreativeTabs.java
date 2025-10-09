package com.rslover521.furnituresoplenty;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD);
public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = 
			DeferredRegister.create(ForgeRegistries.CREATIVE_MODE_TABS, FurnituresOPlenty.MODID);

	public static final RegistryObjec<CreativeModeTab> FURNITURES_TAB = 
			CREATIVE_TABS.register("furnitures_tab", () -> CreativeModeTab);
}
