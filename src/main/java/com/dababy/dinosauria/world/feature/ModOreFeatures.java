package com.dababy.dinosauria.world.feature;

import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModOreFeatures extends OreFeatures {
    public static final RuleTest SEDIMENTARY_ORE_REPLACEABLES = new TagMatchTest(ModBlockTags.SEDIMENTARY_ORE_REPLACEABLES);
    public static final RuleTest METAMORPHIC_ORE_REPLACEABLES = new TagMatchTest(ModBlockTags.METAMORPHIC_ORE_REPLACEABLES);


}
