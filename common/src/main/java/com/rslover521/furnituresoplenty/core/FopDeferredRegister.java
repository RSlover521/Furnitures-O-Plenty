package com.rslover521.furnituresoplenty.core;

import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import java.util.function.Supplier;

/**
 * Small loader-neutral adapter that preserves FOP's original method-oriented
 * DeferredRegister syntax while using Architectury registrars underneath.
 */
public final class FopDeferredRegister<T> {
    private final String modId;
    private final Registrar<T> registrar;

    private FopDeferredRegister(ResourceKey<Registry<T>> registryKey, String modId) {
        this.modId = modId;
        this.registrar = RegistrarManager.get(modId).get(registryKey);
    }

    public static <T> FopDeferredRegister<T> create(ResourceKey<Registry<T>> registryKey, String modId) {
        return new FopDeferredRegister<>(registryKey, modId);
    }

    public <R extends T> RegistrySupplier<R> register(String name, Supplier<R> factory) {
        return registrar.register(new ResourceLocation(modId, name), factory);
    }
}
