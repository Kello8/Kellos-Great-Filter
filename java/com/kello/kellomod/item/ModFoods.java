package com.kello.kellomod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties AMETHYST_BREAD = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.9F).effect(new MobEffectInstance(MobEffects.REGENERATION, 20, 4), 0.01F).build();
    public static final FoodProperties AMETHYST_APPLE =
            (new FoodProperties.Builder()).nutrition(10).saturationMod(1F).effect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 0), 1F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 1600, 2), 1F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 2), 1F).alwaysEat().fast().build();
    public static final FoodProperties AMETHYST_CARROT = (new FoodProperties.Builder()).nutrition(7).saturationMod(15.5F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 0.05F).build();
    public static final FoodProperties AMETHYST_BEEF = (new FoodProperties.Builder()).nutrition(12).saturationMod(2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 20, 4), 0.02F).build();
    public static final FoodProperties AMETHYST_CHICKEN = (new FoodProperties.Builder()).nutrition(8).saturationMod(2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 20, 4), 0.01F).build();
    public static final FoodProperties AMETHYST_BEETROOT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.0F).effect(new MobEffectInstance(MobEffects.REGENERATION, 20, 4), 0.1F).build();
    public static final FoodProperties AMETHYST_MUTTON = (new FoodProperties.Builder()).nutrition(8).saturationMod(2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 20, 4), 0.01F).build();
    public static final FoodProperties AMETHYST_POTATO = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.9F).effect(new MobEffectInstance(MobEffects.REGENERATION, 20, 4), 0.01F).build();
    public static final FoodProperties AMETHYST_GOD_APPLE =
            (new FoodProperties.Builder()).nutrition(20).saturationMod(20F).effect(new MobEffectInstance(MobEffects.REGENERATION, 1800, 2), 1F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 3000, 9), 1F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 9), 1F).effect(new MobEffectInstance(MobEffects.GLOWING, 3000, 1), 1F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1F).effect(new MobEffectInstance(MobEffects.SATURATION, 1200, 9), 1F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 4), 1F).alwaysEat().fast().build();

}