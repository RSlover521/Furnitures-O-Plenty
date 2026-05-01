package com.rslover521.furnituresoplenty.core;

import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.CeilingFanBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.StorageJarRenderer;
import com.rslover521.furnituresoplenty.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.client.renderer.CustomCeilingFanBlockEntityRenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FurnituresOPlenty.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ModClientRenderers {
    private ModClientRenderers() {
    }

    @SuppressWarnings("removal")
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_OAK_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYPRESS_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SNOWBLOSSOM_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RAINBOW_BIRCH_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORIGIN_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FIR_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINE_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_MAPLE_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_MAPLE_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_MAPLE_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDWOOD_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAHOGANY_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.JACARANDA_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PALM_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILLOW_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEAD_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGIC_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.UMBRAN_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HELLBARK_HEDGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPYREAL_HEDGE.get(), RenderType.cutoutMipped());

            registerFanBlade(ModBlocks.FIR_LIGHT_CEILING_FAN.get(), ModExtraModels.FIR_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.PINE_LIGHT_CEILING_FAN.get(), ModExtraModels.PINE_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.MAPLE_LIGHT_CEILING_FAN.get(), ModExtraModels.MAPLE_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.REDWOOD_LIGHT_CEILING_FAN.get(), ModExtraModels.REDWOOD_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.MAHOGANY_LIGHT_CEILING_FAN.get(), ModExtraModels.MAHOGANY_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.JACARANDA_LIGHT_CEILING_FAN.get(), ModExtraModels.JACARANDA_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.PALM_LIGHT_CEILING_FAN.get(), ModExtraModels.PALM_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.WILLOW_LIGHT_CEILING_FAN.get(), ModExtraModels.WILLOW_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.DEAD_LIGHT_CEILING_FAN.get(), ModExtraModels.DEAD_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.MAGIC_LIGHT_CEILING_FAN.get(), ModExtraModels.MAGIC_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.UMBRAN_LIGHT_CEILING_FAN.get(), ModExtraModels.UMBRAN_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.HELLBARK_LIGHT_CEILING_FAN.get(), ModExtraModels.HELLBARK_LIGHT_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.EMPYREAL_LIGHT_CEILING_FAN.get(), ModExtraModels.EMPYREAL_LIGHT_CEILING_FAN_BLADE);

            registerFanBlade(ModBlocks.FIR_DARK_CEILING_FAN.get(), ModExtraModels.FIR_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.PINE_DARK_CEILING_FAN.get(), ModExtraModels.PINE_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.MAPLE_DARK_CEILING_FAN.get(), ModExtraModels.MAPLE_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.REDWOOD_DARK_CEILING_FAN.get(), ModExtraModels.REDWOOD_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.MAHOGANY_DARK_CEILING_FAN.get(), ModExtraModels.MAHOGANY_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.JACARANDA_DARK_CEILING_FAN.get(), ModExtraModels.JACARANDA_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.PALM_DARK_CEILING_FAN.get(), ModExtraModels.PALM_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.WILLOW_DARK_CEILING_FAN.get(), ModExtraModels.WILLOW_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.DEAD_DARK_CEILING_FAN.get(), ModExtraModels.DEAD_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.MAGIC_DARK_CEILING_FAN.get(), ModExtraModels.MAGIC_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.UMBRAN_DARK_CEILING_FAN.get(), ModExtraModels.UMBRAN_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.HELLBARK_DARK_CEILING_FAN.get(), ModExtraModels.HELLBARK_DARK_CEILING_FAN_BLADE);
            registerFanBlade(ModBlocks.EMPYREAL_DARK_CEILING_FAN.get(), ModExtraModels.EMPYREAL_DARK_CEILING_FAN_BLADE);
        });
    }

    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.CUSTOM_CEILING_FAN.get(), CustomCeilingFanBlockEntityRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CUSTOM_STORAGE_JAR.get(), StorageJarRenderer::new);
    }

    private static void registerFanBlade(net.minecraft.world.level.block.Block block, ResourceLocation modelLocation) {
        CeilingFanBlockEntityRenderer.registerFanBlade(block,
                () -> Minecraft.getInstance().getModelManager().getModel(modelLocation));
    }
}
