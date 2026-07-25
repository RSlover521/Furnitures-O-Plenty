package com.rslover521.furnituresoplenty.forge.compat.backpacked;

import com.mrcrayfish.backpacked.client.renderer.entity.layers.ShelfRenderer;
import com.rslover521.furnituresoplenty.compat.backpacked.BackpackedCompat;
import net.minecraftforge.client.event.EntityRenderersEvent;

/** Client-only Backpacked references, isolated from normal mod class loading. */
public final class BackpackedClientCompat {
    private BackpackedClientCompat() {
    }

    public static void registerRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(BackpackedCompat.CUSTOM_SHELF.get(), ShelfRenderer::new);
    }
}
