package com.rslover521.furnituresoplenty;

import com.rslover521.modBlocks.BOPWoodFurnitureRegistry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FurnituresOPlenty.MODID);

	public static final RegistryObject<CreativeModeTab> FURNITURE_COMPAT_TAB = CREATIVE_MODE_TABS.register("furnituresoplenty",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + FurnituresOPlenty.MODID + ".furnituresoplenty"))
                    .icon(() -> new ItemStack(BOPWoodFurnitureRegistry.MAPLE_CHAIR.get())) // example icon
                    .displayItems((parameters, output) -> {
                        output.accept(BOPWoodFurnitureRegistry.DEAD_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.EMPYREAL_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.FIR_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.HELLBARK_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.JACARANDA_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.MAGIC_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.MAHOGANY_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.MAPLE_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.PALM_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.PINE_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.REDWOOD_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.UMBRAN_CHAIR.get());
                        output.accept(BOPWoodFurnitureRegistry.WILLOW_CHAIR.get());
                        })
                    .build());
	
	@SuppressWarnings("removal")
	public static void register() {
		CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
