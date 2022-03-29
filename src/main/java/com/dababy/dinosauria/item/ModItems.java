package com.dababy.dinosauria.item;

import com.dababy.dinosauria.DinosauriaMod;
import com.dababy.dinosauria.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DinosauriaMod.MOD_ID);

    public static final RegistryObject<Item> DILOPHOSAURUS_SKULL = ITEMS.register("dilophosaurus_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> FOSSILIZED_DILOPHOSAURUS_SKULL = ITEMS.register("fossilized_dilophosaurus_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> DILOPHOSAURUS_CREST = ITEMS.register("dilophosaurus_crest",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(2)));

    public static final RegistryObject<ForgeSpawnEggItem> DILOPHOSAURUS_SPAWN_EGG = ITEMS.register("dilophosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DILOPHOSAURUS,0x526C4B, 0x565656,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> CERATOSAURUS_SPAWN_EGG = ITEMS.register("ceratosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CERATOSAURUS,0xB26D10, 0xB8C20F,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> IRRITATOR_SPAWN_EGG = ITEMS.register("irritator_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.IRRITATOR,0x535353, 0xB8A840,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
