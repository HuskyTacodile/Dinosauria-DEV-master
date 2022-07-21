package com.dababy.dinosauria.block;

import com.dababy.dinosauria.DinosauriaMod;
import com.dababy.dinosauria.block.custom.ModFlammableRotatedPillarBlock;
import com.dababy.dinosauria.item.ModCreativeModeTab;
import com.dababy.dinosauria.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DinosauriaMod.MOD_ID);

    public static final RegistryObject<Block> CYCAD_PLANKS = registerBlock("cycad_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.DINOSAURIA_BLOCKS);

    public static final RegistryObject<Block> CYCAD_LOG = registerBlock("cycad_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(3f)), ModCreativeModeTab.DINOSAURIA_BLOCKS);

    public static final RegistryObject<Block> CYCAD_WOOD = registerBlock("cycad_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(3f)), ModCreativeModeTab.DINOSAURIA_BLOCKS);

    public static final RegistryObject<Block> STRIPPED_CYCAD_LOG = registerBlock("stripped_cycad_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(3f)), ModCreativeModeTab.DINOSAURIA_BLOCKS);

    public static final RegistryObject<Block> STRIPPED_CYCAD_WOOD = registerBlock("stripped_cycad_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(3f)), ModCreativeModeTab.DINOSAURIA_BLOCKS);

    public static final RegistryObject<Block> METAMORPHIC_STONE = registerBlock("metamorphic_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DINOSAURIA_BLOCKS);

    public static final RegistryObject<Block> METAMORPHIC_STONE_FOSSIL = registerBlock("metamorphic_stone_fossil",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),UniformInt.of(3,7)),
            ModCreativeModeTab.DINOSAURIA_BLOCKS);

    public static final RegistryObject<Block> SEDIMENTARY_STONE = registerBlock("sedimentary_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DINOSAURIA_BLOCKS);

    public static final RegistryObject<Block> SEDIMENTARY_STONE_FOSSIL = registerBlock("sedimentary_stone_fossil",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),
            ModCreativeModeTab.DINOSAURIA_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                (new Item.Properties().tab(tab))));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
