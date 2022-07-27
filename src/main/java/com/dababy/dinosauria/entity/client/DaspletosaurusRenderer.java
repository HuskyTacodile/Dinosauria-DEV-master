package com.dababy.dinosauria.entity.client;

import com.dababy.dinosauria.entity.custom.DaspletosaurusEntity;
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

public class DaspletosaurusRenderer extends GeoEntityRenderer<DaspletosaurusEntity> {
    public DaspletosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DaspletosaurusModel());
        this.shadowRadius = 1.0f;
    }

    public static final Map<QuintupleVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(QuintupleVariant.class), (resourceLocationEnumMap) -> {
                resourceLocationEnumMap.put(QuintupleVariant.VARIANT1, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_dark_oakmorph_1.png"));
                resourceLocationEnumMap.put(QuintupleVariant.VARIANT2, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_dark_oak_morph_2.png"));
                resourceLocationEnumMap.put(QuintupleVariant.VARIANT3, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_dark_oak_morph_3.png"));
                resourceLocationEnumMap.put(QuintupleVariant.VARIANT4, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_jungle_morph_1.png"));
                resourceLocationEnumMap.put(QuintupleVariant.VARIANT5, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_jungle_morph_2.png"));
                resourceLocationEnumMap.put(QuintupleVariant.VARIANT6, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_jungle_morph_3.png"));
                resourceLocationEnumMap.put(QuintupleVariant.VARIANT7, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_flower_forest_morph_1.png"));
                resourceLocationEnumMap.put(QuintupleVariant.VARIANT8, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_flower_forest_morph_2.png"));
                resourceLocationEnumMap.put(QuintupleVariant.VARIANT9, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_flower_forest_morph_3.png"));
                resourceLocationEnumMap.put(QuintupleVariant.MELON, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_melanistic_morph_1.png"));
                resourceLocationEnumMap.put(QuintupleVariant.MELON2, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_melanistic_morph_2.png"));
                resourceLocationEnumMap.put(QuintupleVariant.ALBINO, new ResourceLocation("dinosauria:textures/entity/daspletosaurus/daspletosaurus_albino.png"));
            });
    @Override
    public ResourceLocation getTextureLocation(DaspletosaurusEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public RenderType getRenderType(DaspletosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource multiBufferSource, VertexConsumer vertexConsumer, int packedLightIn,
                                    ResourceLocation textureLocation)
    {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

}