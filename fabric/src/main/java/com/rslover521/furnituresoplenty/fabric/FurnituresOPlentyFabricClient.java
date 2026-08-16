package com.rslover521.furnituresoplenty.fabric;

import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.BasinBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.BathBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.CuttingBoardBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.KitchenSinkBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.StorageJarRenderer;
import com.mrcrayfish.furniture.refurbished.client.renderer.blockentity.ToiletBlockEntityRenderer;
import com.mrcrayfish.furniture.refurbished.blockentity.BasinBlockEntity;
import com.mrcrayfish.furniture.refurbished.blockentity.BathBlockEntity;
import com.mrcrayfish.furniture.refurbished.blockentity.KitchenSinkBlockEntity;
import com.mrcrayfish.furniture.refurbished.blockentity.ToiletBlockEntity;
import com.rslover521.furnituresoplenty.client.renderer.CustomCeilingFanBlockEntityRenderer;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;
import com.rslover521.furnituresoplenty.core.ModExtraModels;
import com.rslover521.furnituresoplenty.compat.backpacked.BackpackedCompat;
import com.mrcrayfish.backpacked.client.renderer.entity.layers.ShelfRenderer;
import com.mrcrayfish.backpacked.blockentity.ShelfBlockEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;

public final class FurnituresOPlentyFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BuiltInRegistries.BLOCK.entrySet().stream()
                .filter(entry -> entry.getKey().location().getNamespace().equals("furnituresoplenty"))
                .forEach(entry -> {
                    String path = entry.getKey().location().getPath();
                    if (path.endsWith("_hedge")) {
                        BlockRenderLayerMap.INSTANCE.putBlock(entry.getValue(), RenderType.cutoutMipped());
                    } else if (path.endsWith("_lattice_fence") || path.endsWith("_lattice_fence_gate")
                            || path.endsWith("_storage_jar") || path.endsWith("_toilet")) {
                        BlockRenderLayerMap.INSTANCE.putBlock(entry.getValue(), RenderType.cutout());
                    } else if (path.endsWith("_ceiling_fan")) {
                        BlockRenderLayerMap.INSTANCE.putBlock(entry.getValue(), RenderType.translucent());
                        CustomCeilingFanBlockEntityRenderer.registerFanBlade(entry.getValue(),
                                new ResourceLocation("furnituresoplenty", "extra/" + path + "_blade"));
                    }
                });

        BlockEntityRendererRegistry.register(ModBlockEntities.CUSTOM_BASIN.get(),
                narrow((BlockEntityRendererProvider<BasinBlockEntity>) BasinBlockEntityRenderer::new));
        BlockEntityRendererRegistry.register(ModBlockEntities.CUSTOM_BATH.get(),
                narrow((BlockEntityRendererProvider<BathBlockEntity>) BathBlockEntityRenderer::new));
        BlockEntityRendererRegistry.register(ModBlockEntities.CUSTOM_CEILING_FAN.get(), CustomCeilingFanBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.CUSTOM_CUTTING_BOARD.get(), CuttingBoardBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.CUSTOM_KITCHEN_SINK.get(),
                narrow((BlockEntityRendererProvider<KitchenSinkBlockEntity>) KitchenSinkBlockEntityRenderer::new));
        BlockEntityRendererRegistry.register(ModBlockEntities.CUSTOM_STORAGE_JAR.get(), StorageJarRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.CUSTOM_TOILET.get(),
                narrow((BlockEntityRendererProvider<ToiletBlockEntity>) ToiletBlockEntityRenderer::new));

        if (FabricLoader.getInstance().isModLoaded("backpacked") && BackpackedCompat.CUSTOM_SHELF != null) {
            BlockEntityRendererRegistry.register(BackpackedCompat.CUSTOM_SHELF.get(), ShelfRenderer::new);
        }

        ModelLoadingPlugin.register(context -> context.addModels(ModExtraModels.MODELS.values()));
    }

    // Refurbished Furniture renderers are declared for their base block entity
    // classes; FOP's entities are strict subclasses and are safe to narrow.
    @SuppressWarnings({"unchecked", "rawtypes"})
    private static <T extends BlockEntity> BlockEntityRendererProvider<T> narrow(BlockEntityRendererProvider<?> provider) {
        return (BlockEntityRendererProvider) provider;
    }
}
