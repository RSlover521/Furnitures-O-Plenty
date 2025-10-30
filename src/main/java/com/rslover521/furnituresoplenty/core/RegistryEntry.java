package com.rslover521.furnituresoplenty.core;

import java.util.function.Supplier;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.RegistryObject;

public class RegistryEntry<T> {
	private final RegistryObject<T> object;
	private final Supplier<T> supplier;

	public RegistryEntry(RegistryObject<T> object, Supplier<T> supplier) {
		this.object = object;
		this.supplier = supplier;
	}

	public T get() {
		return this.object.get();
	}

	public ResourceLocation getId() {
		return this.object.getId();
	}

	public RegistryObject<T> getObject() {
		return this.object;
	}

	public Supplier<T> getSupplier() {
		return this.supplier;
	}
}
