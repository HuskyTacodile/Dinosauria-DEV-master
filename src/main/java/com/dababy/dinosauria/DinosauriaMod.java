package com.dababy.dinosauria;

import com.dababy.dinosauria.block.ModBlocks;
import com.dababy.dinosauria.effect.ModEffect;
import com.dababy.dinosauria.entity.ModEntityTypes;
import com.dababy.dinosauria.entity.client.CeratosaurusRenderer;
import com.dababy.dinosauria.entity.client.DaspletosaurusRenderer;
import com.dababy.dinosauria.entity.client.DilophosaurusRenderer;
import com.dababy.dinosauria.entity.client.IrritatorRenderer;
import com.dababy.dinosauria.item.ModItems;
import com.dababy.dinosauria.world.feature.ModConfiguredFeatures;
import com.dababy.dinosauria.world.feature.ModPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DinosauriaMod.MOD_ID)
public class DinosauriaMod {
    public static final String MOD_ID = "dinosauria";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public DinosauriaMod() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModEffect.register(eventBus);

        ModEntityTypes.register(eventBus);
        ModConfiguredFeatures.register(eventBus);
        ModPlacedFeatures.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);
        GeckoLib.initialize();
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntityTypes.DILOPHOSAURUS.get(), DilophosaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.CERATOSAURUS.get(), CeratosaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.IRRITATOR.get(), IrritatorRenderer::new);
        EntityRenderers.register(ModEntityTypes.DASPLETOSAURUS.get(), DaspletosaurusRenderer::new);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

}
