package com.dababy.dinosauria.item;

import com.dababy.dinosauria.DinosauriaMod;
import com.dababy.dinosauria.entity.ModEntityTypes;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
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

    public static final RegistryObject<Item> ANKYLOSAURUS_SKULL = ITEMS.register("ankylosaurus_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> ANTEOSAURUS_SKULL = ITEMS.register("anteosaurus_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> CERATOSAURUS_SKULL = ITEMS.register("ceratosaurus_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> DASPLETOSAURUS_SKULL = ITEMS.register("daspletosaurus_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> DEINONYCHUS_SKULL = ITEMS.register("deinonychus_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> GRYPOSAURUS_SKULL = ITEMS.register("gryposaurus_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> IRRITATOR_SKULL = ITEMS.register("irritator_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> PENTACERATOPS_SKULL = ITEMS.register("pentaceratops_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> PLIOSAURUS_SKULL = ITEMS.register("pliosaurus_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> SINOSAUROPTERYX_SKULL = ITEMS.register("sinosauropteryx_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> ZYGOPHYSETER_SKULL = ITEMS.register("zygophyseter_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> BIG_THEROPOD_MEAT_COOKED = ITEMS.register("big_theropod_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_BEEF)));

    public static final RegistryObject<Item> BIG_LIZARD_MEAT = ITEMS.register("big_lizard_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.PORKCHOP)));

    public static final RegistryObject<Item> BIG_LIZARD_MEAT_COOKED = ITEMS.register("big_lizard_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_PORKCHOP)));

    public static final RegistryObject<Item> BIG_ORNITHICIAN_MEAT = ITEMS.register("big_ornithician_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.MUTTON)));

    public static final RegistryObject<Item> BIG_ORNITHICIAN_MEAT_COOKED = ITEMS.register("big_ornithician_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_MUTTON)));

    public static final RegistryObject<Item> BIG_SAURO_MEAT = ITEMS.register("big_sauro_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.BEEF)));

    public static final RegistryObject<Item> BIG_SAURO_MEAT_COOKED = ITEMS.register("big_sauro_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_BEEF)));

    public static final RegistryObject<Item> BIG_SYNAP_MEAT = ITEMS.register("big_synap_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.MUTTON)));

    public static final RegistryObject<Item> BIG_SYNAP_MEAT_COOKED = ITEMS.register("big_synap_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_MUTTON)));

    public static final RegistryObject<Item> BIG_THEROPOD_MEAT = ITEMS.register("big_theropod_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.BEEF)));

    public static final RegistryObject<Item> MID_THEROPOD_MEAT_COOKED = ITEMS.register("mid_theropod_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_BEEF)));

    public static final RegistryObject<Item> MID_LIZARD_MEAT = ITEMS.register("mid_lizard_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.PORKCHOP)));

    public static final RegistryObject<Item> MID_LIZARD_MEAT_COOKED = ITEMS.register("mid_lizard_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_PORKCHOP)));

    public static final RegistryObject<Item> MID_ORNITHICIAN_MEAT = ITEMS.register("mid_ornithician_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.MUTTON)));

    public static final RegistryObject<Item> MID_ORNITHICIAN_MEAT_COOKED = ITEMS.register("mid_ornithician_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_MUTTON)));

    public static final RegistryObject<Item> MID_SAURO_MEAT = ITEMS.register("mid_sauro_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.BEEF)));

    public static final RegistryObject<Item> MID_SAURO_MEAT_COOKED = ITEMS.register("mid_sauro_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_BEEF)));

    public static final RegistryObject<Item> MID_SYNAP_MEAT = ITEMS.register("mid_synap_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.MUTTON)));

    public static final RegistryObject<Item> MID_SYNAP_MEAT_COOKED = ITEMS.register("mid_synap_meat_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.COOKED_MUTTON)));

    public static final RegistryObject<Item> MID_THEROPOD_MEAT = ITEMS.register("mid_theropod_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).food(Foods.BEEF)));

    public static final RegistryObject<Item> LAND_FOSSIL = ITEMS.register("land_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(64)));

    public static final RegistryObject<Item> MARINE_FOSSIL = ITEMS.register("marine_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DINOSAURIA_ITEMS).stacksTo(64)));

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

    public static final RegistryObject<ForgeSpawnEggItem> DASPLETOSAURUS_SPAWN_EGG = ITEMS.register("daspletosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DASPLETOSAURUS,0x1C1D1F, 0x6397FF,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
