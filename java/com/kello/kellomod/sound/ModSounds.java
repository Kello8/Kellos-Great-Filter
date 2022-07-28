package com.kello.kellomod.sound;

import com.kello.kellomod.KelloMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, KelloMod.MOD_ID);

    public static RegistryObject<SoundEvent> AMETHYST_DISC = registerSoundEvent("amethyst_disc");
    public static RegistryObject<SoundEvent> AMETHYST1_DISC = registerSoundEvent("amethyst1_disc");
    public static RegistryObject<SoundEvent> AMETHYST2_DISC = registerSoundEvent("amethyst2_disc");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(KelloMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
