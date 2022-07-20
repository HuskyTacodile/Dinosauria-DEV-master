package com.dababy.dinosauria.world.feature;

import com.dababy.dinosauria.DinosauriaMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
         DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, DinosauriaMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
