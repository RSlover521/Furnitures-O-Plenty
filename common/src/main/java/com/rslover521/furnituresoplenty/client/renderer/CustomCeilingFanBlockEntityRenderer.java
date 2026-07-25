package com.rslover521.furnituresoplenty.client.renderer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import com.mrcrayfish.furniture.refurbished.platform.ClientServices;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomCeilingFanBlockEntity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider.Context;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class CustomCeilingFanBlockEntityRenderer implements BlockEntityRenderer<CustomCeilingFanBlockEntity> {
	private static final Map<Block, Supplier<BakedModel>> BLADE_MODEL_MAP = new HashMap<>();

	public CustomCeilingFanBlockEntityRenderer(Context context) {
	}

	@Override
	public void render(CustomCeilingFanBlockEntity blockEntity, float partialTick, PoseStack poseStack,
			MultiBufferSource buffer, int packedLight, int packedOverlay) {
		poseStack.pushPose();
		poseStack.translate(0.5D, 0.5D, 0.5D);
		poseStack.mulPose(blockEntity.getDirection().getRotation());
		poseStack.mulPose(Axis.YP.rotationDegrees(blockEntity.getRotation(partialTick)));
		poseStack.translate(-0.5D, -0.5D, -0.5D);

		BakedModel model = getCeilingFanBladeModel(blockEntity.getBlockState());
		VertexConsumer consumer = buffer.getBuffer(RenderType.cutout());
		ClientServices.PLATFORM.drawBakedModel(model, poseStack, consumer, packedLight, packedOverlay);

		poseStack.popPose();
	}

	private BakedModel getCeilingFanBladeModel(BlockState state) {
		Supplier<BakedModel> model = BLADE_MODEL_MAP.get(state.getBlock());
		if (model != null) {
			return model.get();
		}
		return Minecraft.getInstance().getModelManager().getMissingModel();
	}

	public static void registerFanBlade(Block block, ResourceLocation modelLocation) {
		BLADE_MODEL_MAP.putIfAbsent(block,
				() -> Minecraft.getInstance().getModelManager().getModel(
						new ModelResourceLocation(modelLocation, "standalone")));
	}
}
