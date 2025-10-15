package com.rslover521.furnituresoplenty.modFurnitures;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.registries.*;

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
                    .title(Component.translatable("itemGroup." + FurnituresOPlenty.MODID))
                    .icon(() -> new ItemStack(BOPChairRegistry.MAPLE_CHAIR.get())) // example icon
                    .displayItems((parameters, output) -> {

                    	// Chairs
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

                        // Cutting Boards
                        output.accept(BOPCuttingBoardRegistry.DEAD_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.EMPYREAL_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.FIR_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.HELLBARK_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.JACARANDA_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.MAGIC_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.MAHOGANY_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.MAPLE_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.PALM_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.PINE_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.REDWOOD_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.UMBRAN_CUTTING_BOARD.get());
                        output.accept(BOPCuttingBoardRegistry.WILLOW_CUTTING_BOARD.get());

                        // Desks
                        output.accept(BOPDeskRegistry.FIR_DESK.get());
                        output.accept(BOPDeskRegistry.EMPYREAL_DESK.get());
                        output.accept(BOPDeskRegistry.FIR_DESK.get());
                        output.accept(BOPDeskRegistry.HELLBARK_DESK.get());
                        output.accept(BOPDeskRegistry.JACARANDA_DESK.get());
                        output.accept(BOPDeskRegistry.MAGIC_DESK.get());
                        output.accept(BOPDeskRegistry.MAHOGANY_DESK.get());
                        output.accept(BOPDeskRegistry.MAPLE_DESK.get());
                        output.accept(BOPDeskRegistry.PALM_DESK.get());
                        output.accept(BOPDeskRegistry.PINE_DESK.get());
                        output.accept(BOPDeskRegistry.REDWOOD_DESK.get());
                        output.accept(BOPDeskRegistry.UMBRAN_DESK.get());
                        output.accept(BOPDeskRegistry.WILLOW_DESK.get());
                        
                        // Tables
                        output.accept(BOPTableRegistry.DEAD_TABLE.get());
                        output.accept(BOPTableRegistry.EMPYREAL_TABLE.get());
                        output.accept(BOPTableRegistry.FIR_TABLE.get());
                        output.accept(BOPTableRegistry.HELLBARK_TABLE.get());
                        output.accept(BOPTableRegistry.JACARANDA_TABLE.get());
                        output.accept(BOPTableRegistry.MAGIC_TABLE.get());
                        output.accept(BOPTableRegistry.MAHOGANY_TABLE.get());
                        output.accept(BOPTableRegistry.MAPLE_TABLE.get());
                        output.accept(BOPTableRegistry.PALM_TABLE.get());
                        output.accept(BOPTableRegistry.PINE_TABLE.get());
                        output.accept(BOPTableRegistry.REDWOOD_TABLE.get());
                        output.accept(BOPTableRegistry.UMBRAN_TABLE.get());
                        output.accept(BOPTableRegistry.WILLOW_TABLE.get());
                        
                        })
                    .build());
	
	@SuppressWarnings("removal")
	public static void register() {
		CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
