package com.rslover521.furnituresoplenty.client.model;

import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;

public class ExtraModel {
	private final ResourceLocation resourceLocation;
	private BakedModel bakedModel;

	public ExtraModel(ResourceLocation resourceLocation) {
		this.resourceLocation = resourceLocation;
	}

	public ResourceLocation getResourceLocation() {
		return resourceLocation;
	}

	public void setBakedModel(BakedModel bakedModel) {
		this.bakedModel = bakedModel;
	}

	public BakedModel getBakedModel() {
		return bakedModel;
	}
}