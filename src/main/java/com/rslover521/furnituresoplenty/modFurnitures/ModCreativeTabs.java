package com.rslover521.furnituresoplenty.modFurnitures;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.registries.BOPChairRegistry;

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
                    .icon(() -> new ItemStack(BOPChairRegistry.MAPLE_CHAIR.get())) // example icon
                    .displayItems((parameters, output) -> {
                        output.accept(BOPChairRegistry.DEAD_CHAIR.get());
                        output.accept(BOPChairRegistry.EMPYREAL_CHAIR.get());
                        output.accept(BOPChairRegistry.FIR_CHAIR.get());
                        output.accept(BOPChairRegistry.HELLBARK_CHAIR.get());
                        output.accept(BOPChairRegistry.JACARANDA_CHAIR.get());
                        output.accept(BOPChairRegistry.MAGIC_CHAIR.get());
                        output.accept(BOPChairRegistry.MAHOGANY_CHAIR.get());
                        output.accept(BOPChairRegistry.MAPLE_CHAIR.get());
                        output.accept(BOPChairRegistry.PALM_CHAIR.get());
                        output.accept(BOPChairRegistry.PINE_CHAIR.get());
                        output.accept(BOPChairRegistry.REDWOOD_CHAIR.get());
                        output.accept(BOPChairRegistry.UMBRAN_CHAIR.get());
                        output.accept(BOPChairRegistry.WILLOW_CHAIR.get());
                        })
                    .build());
	
	@SuppressWarnings("removal")
	public static void register() {
		CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
