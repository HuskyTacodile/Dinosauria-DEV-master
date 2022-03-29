package com.dababy.dinosauria.entity.client;

import com.dababy.dinosauria.entity.custom.DilophosaurusEntity;
import com.dababy.dinosauria.entity.variant.QuintupleVariant;
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

public class DilophosaurusRenderer extends GeoEntityRenderer<DilophosaurusEntity> {
    public DilophosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DilophosaurusModel());
        this.shadowRadius = 1.0f;
    }

    public static final Map<QuintupleVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(QuintupleVariant.class), (p_114874_) -> {
                p_114874_.put(QuintupleVariant.VARIANT1, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_1.png"));
                p_114874_.put(QuintupleVariant.VARIANT2, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_2.png"));
                p_114874_.put(QuintupleVariant.VARIANT3, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_3.png"));
                p_114874_.put(QuintupleVariant.VARIANT4, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_1.png"));
                p_114874_.put(QuintupleVariant.VARIANT5, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_2.png"));
                p_114874_.put(QuintupleVariant.VARIANT6, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_3.png"));
                p_114874_.put(QuintupleVariant.VARIANT7, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_1.png"));
                p_114874_.put(QuintupleVariant.VARIANT8, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_2.png"));
                p_114874_.put(QuintupleVariant.VARIANT9, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_3.png"));
                p_114874_.put(QuintupleVariant.VARIANT10, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_1.png"));
                p_114874_.put(QuintupleVariant.VARIANT11, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_2.png"));
                p_114874_.put(QuintupleVariant.VARIANT12, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_3.png"));
                p_114874_.put(QuintupleVariant.VARIANT13, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_1.png"));
                p_114874_.put(QuintupleVariant.VARIANT14, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_2.png"));
                p_114874_.put(QuintupleVariant.VARIANT15, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_3.png"));
                p_114874_.put(QuintupleVariant.VARIANT16, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_1.png"));
                p_114874_.put(QuintupleVariant.VARIANT17, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_2.png"));
                p_114874_.put(QuintupleVariant.VARIANT18, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/dilophosaurus_morph_3.png"));
                p_114874_.put(QuintupleVariant.MELON, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/melanistic_dilophosaurus.png"));
                p_114874_.put(QuintupleVariant.MELON2, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/melanistic_dilophosaurus.png"));
                p_114874_.put(QuintupleVariant.ALBINO, new ResourceLocation("dinosauria:textures/entity/dilophosaurus/albino_dilophosaurus.png"));
            });
    @Override
    public ResourceLocation getTextureLocation(DilophosaurusEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public RenderType getRenderType(DilophosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource multiBufferSource, VertexConsumer vertexConsumer, int packedLightIn,
                                    ResourceLocation textureLocation)
    {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

}