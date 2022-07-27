package com.dababy.dinosauria.entity.client;

import com.dababy.dinosauria.entity.custom.DilophosaurusEntity;
import com.dababy.dinosauria.entity.custom.IrritatorEntity;
import com.dababy.dinosauria.entity.variant.IrritatingVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;
import java.util.Map;

public class IrritatorRenderer extends GeoEntityRenderer<IrritatorEntity> {
    public IrritatorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new IrritatorModel());
        this.shadowRadius = 1.0f;
    }

    public static final Map<IrritatingVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(IrritatingVariant.class), (p_114874_) -> {
                p_114874_.put(IrritatingVariant.VARIANT1, new ResourceLocation("dinosauria:textures/entity/irritator/irritator_morph_1.png"));
                p_114874_.put(IrritatingVariant.VARIANT2, new ResourceLocation("dinosauria:textures/entity/irritator/irritator_morph_2.png"));
                p_114874_.put(IrritatingVariant.VARIANT3, new ResourceLocation("dinosauria:textures/entity/irritator/irritator_morph_3.png"));
                p_114874_.put(IrritatingVariant.VARIANT4, new ResourceLocation("dinosauria:textures/entity/irritator/irritator_morph_4.png"));
                p_114874_.put(IrritatingVariant.MELON, new ResourceLocation("dinosauria:textures/entity/irritator/melanistic_irritator.png"));
                p_114874_.put(IrritatingVariant.MELON2, new ResourceLocation("dinosauria:textures/entity/irritator/melanistic_irritator.png"));
                p_114874_.put(IrritatingVariant.ALBINO, new ResourceLocation("dinosauria:textures/entity/irritator/albino_irritator.png"));
            });
    @Override
    public ResourceLocation getTextureLocation(IrritatorEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public RenderType getRenderType(IrritatorEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource multiBufferSource, VertexConsumer vertexConsumer, int packedLightIn,
                                    ResourceLocation textureLocation)
    {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

}