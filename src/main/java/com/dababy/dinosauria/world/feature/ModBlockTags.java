package com.dababy.dinosauria.world.feature;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags  {
    public static final TagKey<Block> SEDIMENTARY_ORE_REPLACEABLES = create("sedimentary_ore_replaceables");
    public static final TagKey<Block> METAMORPHIC_ORE_REPLACEABLES = create("metamorphic_ore_replaceables");



    private ModBlockTags() {
    }

    private static TagKey<Block> create(String pName) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(pName));
    }

    public static TagKey<Block> create(ResourceLocation name) {
        return TagKey.create(Registry.BLOCK_REGISTRY, name);
    }

}
