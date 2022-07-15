package com.dababy.dinosauria.entity.client;

import com.dababy.dinosauria.DinosauriaMod;
import com.dababy.dinosauria.entity.custom.CeratosaurusEntity;
import com.dababy.dinosauria.entity.custom.DaspletosaurusEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DaspletosaurusModel extends AnimatedGeoModel<DaspletosaurusEntity> {
    @Override
    public ResourceLocation getModelResource(DaspletosaurusEntity object) {
        return new ResourceLocation(DinosauriaMod.MOD_ID, "geo/daspletosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DaspletosaurusEntity entity)    {
        return DilophosaurusRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(DaspletosaurusEntity animatable) {
        return new ResourceLocation(DinosauriaMod.MOD_ID, "animations/daspleto.animation.json");
    }
}
