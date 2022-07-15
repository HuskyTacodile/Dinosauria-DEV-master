package com.dababy.dinosauria.entity;

import com.dababy.dinosauria.DinosauriaMod;
import com.dababy.dinosauria.entity.custom.CeratosaurusEntity;
import com.dababy.dinosauria.entity.custom.DaspletosaurusEntity;
import com.dababy.dinosauria.entity.custom.DilophosaurusEntity;
import com.dababy.dinosauria.entity.custom.IrritatorEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DinosauriaMod.MOD_ID);

    public static final RegistryObject<EntityType<DilophosaurusEntity>> DILOPHOSAURUS = ENTITY_TYPES.register("dilophosaurus",
            () -> EntityType.Builder.of(DilophosaurusEntity::new, MobCategory.CREATURE)
                    .sized(1.2f, 2.0f)
                    .build(new ResourceLocation(DinosauriaMod.MOD_ID, "dilophosaurus").toString()));

    public static final RegistryObject<EntityType<CeratosaurusEntity>> CERATOSAURUS = ENTITY_TYPES.register("ceratosaurus",
            () -> EntityType.Builder.of(CeratosaurusEntity::new, MobCategory.CREATURE)
                    .sized(1.4f, 2.2f)
                    .build(new ResourceLocation(DinosauriaMod.MOD_ID, "ceratosaurus").toString()));

    public static final RegistryObject<EntityType<IrritatorEntity>> IRRITATOR = ENTITY_TYPES.register("irritator",
            () -> EntityType.Builder.of(IrritatorEntity::new, MobCategory.CREATURE)
                    .sized(1.4f, 2.2f)
                    .build(new ResourceLocation(DinosauriaMod.MOD_ID, "irritator").toString()));

    public static final RegistryObject<EntityType<DaspletosaurusEntity>> DASPLETOSAURUS = ENTITY_TYPES.register("daspletosaurus",
            () -> EntityType.Builder.of(DaspletosaurusEntity::new, MobCategory.CREATURE)
                    .sized(1.6f, 2.5f)
                    .build(new ResourceLocation(DinosauriaMod.MOD_ID, "daspletosaurus").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
