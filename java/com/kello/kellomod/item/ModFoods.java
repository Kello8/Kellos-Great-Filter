package com.kello.kellomod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties AMETHYST_BREAD = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.9F).effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 0), 0.2F).fast().build();
}
