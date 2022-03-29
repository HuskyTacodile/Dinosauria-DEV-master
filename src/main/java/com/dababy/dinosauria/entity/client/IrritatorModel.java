package com.dababy.dinosauria.entity.client;

import com.dababy.dinosauria.DinosauriaMod;
import com.dababy.dinosauria.entity.custom.DilophosaurusEntity;
import com.dababy.dinosauria.entity.custom.IrritatorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IrritatorModel extends AnimatedGeoModel<IrritatorEntity> {
    @Override
    public ResourceLocation getModelLocation(IrritatorEntity object) {
        return new ResourceLocation(DinosauriaMod.MOD_ID, "geo/irritator.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(IrritatorEntity entity)    {
        return DilophosaurusRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(IrritatorEntity animatable) {
        return new ResourceLocation(DinosauriaMod.MOD_ID, "animations/irritator.animation.json");
    }
}
