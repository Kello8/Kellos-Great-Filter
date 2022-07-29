package com.kello.kellomod.painting;
import com.kello.kellomod.KelloMod;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, KelloMod.MOD_ID);

    public static final RegistryObject<PaintingVariant> PYRAMID = PAINTING_VARIANTS.register("pyramid",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> DOG = PAINTING_VARIANTS.register("dog",
            () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> HAMPTER = PAINTING_VARIANTS.register("hampter",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> MIDMORNING = PAINTING_VARIANTS.register("midmorning",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> SANDALCONSUMER = PAINTING_VARIANTS.register("sandalconsumer",
            () -> new PaintingVariant(32, 32));
    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}