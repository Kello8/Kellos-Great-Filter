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
    public static final RegistryObject<Potion> BLINDNESS_POTION = POTIONS.register("blindness_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0)));
    public static final RegistryObject<Potion> DARKNESS_POTION = POTIONS.register("darkness_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DARKNESS, 2400, 0)));
    public static final RegistryObject<Potion> RESISTANCE_POTION_1 = POTIONS.register("resistance_potion_1",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 1)));
    public static final RegistryObject<Potion> RESISTANCE_POTION_2 = POTIONS.register("resistance_potion_2",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2200, 2)));
    public static final RegistryObject<Potion> RESISTANCE_POTION_3 = POTIONS.register("resistance_potion_3",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2000, 3)));
    public static final RegistryObject<Potion> RESISTANCE_POTION_4 = POTIONS.register("resistance_potion_4",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 4)));
    public static final RegistryObject<Potion> CONDUIT_POWER_POTION = POTIONS.register("conduit_power_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 12000, 0)));
    public static final RegistryObject<Potion> BAD_OMEN_POTION = POTIONS.register("bad_omen_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.BAD_OMEN, 24000, 4)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}