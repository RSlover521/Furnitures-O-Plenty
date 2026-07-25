package com.rslover521.furnituresoplenty.forge.core;

import com.rslover521.furnituresoplenty.forge.compat.backpacked.BackpackedClientCompat;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.CeilingFanBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.BasinBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.BathBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.KitchenSinkBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.StorageJarRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.ToiletBlockEntityRenderer;
import com.rslover521.furnituresoplenty.forge.FurnituresOPlenty;
import com.rslover521.furnituresoplenty.client.renderer.CustomCeilingFanBlockEntityRenderer;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;
import com.rslover521.furnituresoplenty.core.ModBlocks;
import com.rslover521.furnituresoplenty.core.ModExtraModels;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import dev.architectury.registry.registries.RegistrySupplier;

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

            registerRenderLayer(RenderType.cutout(),
                    ModBlocks.FIR_LATTICE_FENCE_GATE,
                    ModBlocks.PINE_LATTICE_FENCE_GATE,
                    ModBlocks.MAPLE_LATTICE_FENCE_GATE,
                    ModBlocks.REDWOOD_LATTICE_FENCE_GATE,
                    ModBlocks.MAHOGANY_LATTICE_FENCE_GATE,
                    ModBlocks.JACARANDA_LATTICE_FENCE_GATE,
                    ModBlocks.PALM_LATTICE_FENCE_GATE,
                    ModBlocks.WILLOW_LATTICE_FENCE_GATE,
                    ModBlocks.DEAD_LATTICE_FENCE_GATE,
                    ModBlocks.MAGIC_LATTICE_FENCE_GATE,
                    ModBlocks.UMBRAN_LATTICE_FENCE_GATE,
                    ModBlocks.HELLBARK_LATTICE_FENCE_GATE,
                    ModBlocks.EMPYREAL_LATTICE_FENCE_GATE,
                    ModBlocks.FIR_LATTICE_FENCE,
                    ModBlocks.PINE_LATTICE_FENCE,
                    ModBlocks.MAPLE_LATTICE_FENCE,
                    ModBlocks.REDWOOD_LATTICE_FENCE,
                    ModBlocks.MAHOGANY_LATTICE_FENCE,
                    ModBlocks.JACARANDA_LATTICE_FENCE,
                    ModBlocks.PALM_LATTICE_FENCE,
                    ModBlocks.WILLOW_LATTICE_FENCE,
                    ModBlocks.DEAD_LATTICE_FENCE,
                    ModBlocks.MAGIC_LATTICE_FENCE,
                    ModBlocks.UMBRAN_LATTICE_FENCE,
                    ModBlocks.HELLBARK_LATTICE_FENCE,
                    ModBlocks.EMPYREAL_LATTICE_FENCE,
                    ModBlocks.FIR_STORAGE_JAR,
                    ModBlocks.PINE_STORAGE_JAR,
                    ModBlocks.MAPLE_STORAGE_JAR,
                    ModBlocks.REDWOOD_STORAGE_JAR,
                    ModBlocks.MAHOGANY_STORAGE_JAR,
                    ModBlocks.JACARANDA_STORAGE_JAR,
                    ModBlocks.PALM_STORAGE_JAR,
                    ModBlocks.WILLOW_STORAGE_JAR,
                    ModBlocks.DEAD_STORAGE_JAR,
                    ModBlocks.MAGIC_STORAGE_JAR,
                    ModBlocks.UMBRAN_STORAGE_JAR,
                    ModBlocks.HELLBARK_STORAGE_JAR,
                    ModBlocks.EMPYREAL_STORAGE_JAR,
                    ModBlocks.FIR_TOILET,
                    ModBlocks.PINE_TOILET,
                    ModBlocks.MAPLE_TOILET,
                    ModBlocks.REDWOOD_TOILET,
                    ModBlocks.MAHOGANY_TOILET,
                    ModBlocks.JACARANDA_TOILET,
                    ModBlocks.PALM_TOILET,
                    ModBlocks.WILLOW_TOILET,
                    ModBlocks.DEAD_TOILET,
                    ModBlocks.MAGIC_TOILET,
                    ModBlocks.UMBRAN_TOILET,
                    ModBlocks.HELLBARK_TOILET,
                    ModBlocks.EMPYREAL_TOILET);

            registerRenderLayer(RenderType.translucent(),
                    ModBlocks.FIR_LIGHT_CEILING_FAN,
                    ModBlocks.PINE_LIGHT_CEILING_FAN,
                    ModBlocks.MAPLE_LIGHT_CEILING_FAN,
                    ModBlocks.REDWOOD_LIGHT_CEILING_FAN,
                    ModBlocks.MAHOGANY_LIGHT_CEILING_FAN,
                    ModBlocks.JACARANDA_LIGHT_CEILING_FAN,
                    ModBlocks.PALM_LIGHT_CEILING_FAN,
                    ModBlocks.WILLOW_LIGHT_CEILING_FAN,
                    ModBlocks.DEAD_LIGHT_CEILING_FAN,
                    ModBlocks.MAGIC_LIGHT_CEILING_FAN,
                    ModBlocks.UMBRAN_LIGHT_CEILING_FAN,
                    ModBlocks.HELLBARK_LIGHT_CEILING_FAN,
                    ModBlocks.EMPYREAL_LIGHT_CEILING_FAN,
                    ModBlocks.FIR_DARK_CEILING_FAN,
                    ModBlocks.PINE_DARK_CEILING_FAN,
                    ModBlocks.MAPLE_DARK_CEILING_FAN,
                    ModBlocks.REDWOOD_DARK_CEILING_FAN,
                    ModBlocks.MAHOGANY_DARK_CEILING_FAN,
                    ModBlocks.JACARANDA_DARK_CEILING_FAN,
                    ModBlocks.PALM_DARK_CEILING_FAN,
                    ModBlocks.WILLOW_DARK_CEILING_FAN,
                    ModBlocks.DEAD_DARK_CEILING_FAN,
                    ModBlocks.MAGIC_DARK_CEILING_FAN,
                    ModBlocks.UMBRAN_DARK_CEILING_FAN,
                    ModBlocks.HELLBARK_DARK_CEILING_FAN,
                    ModBlocks.EMPYREAL_DARK_CEILING_FAN);

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
        event.registerBlockEntityRenderer(ModBlockEntities.CUSTOM_BASIN.get(), BasinBlockEntityRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CUSTOM_BATH.get(), BathBlockEntityRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CUSTOM_CEILING_FAN.get(), CustomCeilingFanBlockEntityRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CUSTOM_KITCHEN_SINK.get(), KitchenSinkBlockEntityRenderer::new);
        if (ModList.get().isLoaded("backpacked")) {
            BackpackedClientCompat.registerRenderer(event);
        }
        event.registerBlockEntityRenderer(ModBlockEntities.CUSTOM_STORAGE_JAR.get(), StorageJarRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CUSTOM_TOILET.get(), ToiletBlockEntityRenderer::new);
    }

    @SubscribeEvent
    public static void onRegisterAdditionalModels(ModelEvent.RegisterAdditional event) {
        ModExtraModels.registerAdditional(event::register);
    }

    private static void registerFanBlade(net.minecraft.world.level.block.Block block, ResourceLocation modelLocation) {
        CeilingFanBlockEntityRenderer.registerFanBlade(block,
                () -> Minecraft.getInstance().getModelManager().getModel(modelLocation));
        CustomCeilingFanBlockEntityRenderer.registerFanBlade(block, modelLocation);
    }

    @SafeVarargs
    @SuppressWarnings("removal")
    private static void registerRenderLayer(RenderType renderType, RegistrySupplier<Block>... blocks) {
        for (RegistrySupplier<Block> block : blocks) {
            ItemBlockRenderTypes.setRenderLayer(block.get(), renderType);
        }
    }
}
