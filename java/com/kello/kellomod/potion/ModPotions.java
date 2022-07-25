package com.kello.kellomod.potion;

import com.kello.kellomod.KelloMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, KelloMod.MOD_ID);

    public static final RegistryObject<Potion> GLOWING_POTION = POTIONS.register("glowing_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 1200, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}