package com.rslover521.furnituresoplenty.client;

import com.mrcrayfish.furniture.refurbished.client.audio.AudioManager;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomCeilingFanBlockEntity;

/** Client-only bridge; loaded through Architectury's environment executor. */
public final class CeilingFanAudio {
    private CeilingFanAudio() {
    }

    public static void play(CustomCeilingFanBlockEntity blockEntity) {
        AudioManager.get().playLevelAudio(blockEntity);
    }
}
