package com.dababy.dinosauria.effect;

import com.dababy.dinosauria.DinosauriaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffect{
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create( ForgeRegistries.MOB_EFFECTS, DinosauriaMod.MOD_ID);

    public static final RegistryObject<MobEffect> SLEEP_EFFECT = MOB_EFFECTS.register("sleep",
            () -> new SleepEffect(MobEffectCategory.HARMFUL, 3124687));



    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}

