package com.dababy.dinosauria.event;

import com.dababy.dinosauria.DinosauriaMod;
import com.dababy.dinosauria.entity.ModEntityTypes;
import com.dababy.dinosauria.entity.custom.CeratosaurusEntity;
import com.dababy.dinosauria.entity.custom.DilophosaurusEntity;
import com.dababy.dinosauria.entity.custom.IrritatorEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = DinosauriaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegisterEvent event) {
        event.register(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, helper -> {
        });

        event.register(ForgeRegistries.Keys.RECIPE_TYPES, helper -> {
        });
    }


    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.DILOPHOSAURUS.get(), DilophosaurusEntity.attributes().build());
        event.put(ModEntityTypes.CERATOSAURUS.get(), CeratosaurusEntity.setAttributes());
        event.put(ModEntityTypes.IRRITATOR.get(), IrritatorEntity.setAttributes());
    }
}
