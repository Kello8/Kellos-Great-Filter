package com.kello.kellomod;

import com.kello.kellomod.block.ModBlocks;
import com.kello.kellomod.enchantment.ModEnchantments;
import com.kello.kellomod.item.ModItems;
import com.kello.kellomod.painting.ModPaintings;
import com.kello.kellomod.potion.ModPotions;
import com.kello.kellomod.sound.ModSounds;
import com.kello.kellomod.util.BetterBrewingRecipe;
import com.kello.kellomod.util.ModItemProperties;
import com.kello.kellomod.villager.ModVillagers;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(KelloMod.MOD_ID)
public class KelloMod
{
    public static final String MOD_ID = "kellomod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public KelloMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModPaintings.register(modEventBus);
        ModPotions.register(modEventBus);
        ModSounds.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModEnchantments.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ModItemProperties.addCustomItemProperties();
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.AMETHYST_SHARD, ModPotions.GLOWING_POTION.get()));
        };
    }
}