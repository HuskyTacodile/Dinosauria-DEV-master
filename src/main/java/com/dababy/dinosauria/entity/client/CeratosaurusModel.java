package com.dababy.dinosauria.entity.client;

import com.dababy.dinosauria.DinosauriaMod;
import com.dababy.dinosauria.entity.custom.CeratosaurusEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CeratosaurusModel extends AnimatedGeoModel<CeratosaurusEntity> {
    @Override
    public ResourceLocation getModelResource(CeratosaurusEntity object) {
        return new ResourceLocation(DinosauriaMod.MOD_ID, "geo/ceratosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CeratosaurusEntity entity)    {
        return DilophosaurusRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(CeratosaurusEntity animatable) {
        return new ResourceLocation(DinosauriaMod.MOD_ID, "animations/ceratosaurus.animation.json");
    }
}
