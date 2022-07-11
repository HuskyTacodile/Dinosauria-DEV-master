package com.dababy.dinosauria.entity.client;

import com.dababy.dinosauria.DinosauriaMod;
import com.dababy.dinosauria.entity.custom.DilophosaurusEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DilophosaurusModel extends AnimatedGeoModel<DilophosaurusEntity> {
    @Override
    public ResourceLocation getModelResource(DilophosaurusEntity object) {
        return new ResourceLocation(DinosauriaMod.MOD_ID, "geo/dilophosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DilophosaurusEntity entity)    {
        return DilophosaurusRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(DilophosaurusEntity animatable) {
        return new ResourceLocation(DinosauriaMod.MOD_ID, "animations/dilo.animation.json");
    }
}
