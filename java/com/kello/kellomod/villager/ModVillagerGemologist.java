package com.kello.kellomod.villager;

import com.google.common.collect.ImmutableSet;
import com.kello.kellomod.KelloMod;
import com.kello.kellomod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagerGemologist {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, KelloMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, KelloMod.MOD_ID);

    public static final RegistryObject<PoiType> AMETHYST_BENCH_POI = POI_TYPES.register("amethyst_bench_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.AMETHYST_BENCH.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> GEMOLOGIST = VILLAGER_PROFESSIONS.register("gemologist",
            () -> new VillagerProfession("gemologist", x -> x.get() == AMETHYST_BENCH_POI.get(),
                    x -> x.get() == AMETHYST_BENCH_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_TOOLSMITH));


    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, AMETHYST_BENCH_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}