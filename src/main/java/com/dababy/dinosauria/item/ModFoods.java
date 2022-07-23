package com.dababy.dinosauria.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

public class ModFoods extends Foods {
    public static final FoodProperties BIG_THEROPOD_MEAT_COOKED = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).meat().build();

}
