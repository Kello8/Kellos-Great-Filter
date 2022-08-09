package com.kello.kellomod;

import com.kello.kellomod.block.ModBlocks;
import com.kello.kellomod.enchantment.ModEnchantments;
import com.kello.kellomod.item.ModItems;
import com.kello.kellomod.painting.ModPaintings;
import com.kello.kellomod.potion.ModPotions;
import com.kello.kellomod.sound.ModSounds;
import com.kello.kellomod.util.BetterBrewingRecipe;
import com.kello.kellomod.util.ModItemPropertiesAmethystBow;
import com.kello.kellomod.util.ModItemPropertiesAmethystNetheriteBow;
import com.kello.kellomod.villager.ModVillagerGemologist;
import com.kello.kellomod.villager.ModVillagerRecordtrader;
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

import java.util.logging.LogManager;

@Mod(KelloMod.MOD_ID)
public class KelloMod
{
    public static final String MOD_ID = "kellomod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public KelloMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModPaintings.register(modEventBus);
        ModPotions.register(modEventBus);
        ModSounds.register(modEventBus);
        ModVillagerGemologist.register(modEventBus);
        ModVillagerRecordtrader.register(modEventBus);
        ModEnchantments.register(modEventBus);
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
            ModItemPropertiesAmethystBow.addCustomItemProperties();
            ModItemPropertiesAmethystNetheriteBow.addCustomItemProperties();
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.AMETHYST_SHARD, ModPotions.GLOWING_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.INK_SAC, ModPotions.BLINDNESS_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.OBSIDIAN, ModPotions.RESISTANCE_POTION_1.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.RESISTANCE_POTION_1.get(),
                    Items.ANCIENT_DEBRIS, ModPotions.RESISTANCE_POTION_2.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.RESISTANCE_POTION_2.get(),
                    Items.ANCIENT_DEBRIS, ModPotions.RESISTANCE_POTION_3.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.RESISTANCE_POTION_3.get(),
                    Items.NETHERITE_INGOT, ModPotions.RESISTANCE_POTION_4.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.WATER_BREATHING,
                    Items.NAUTILUS_SHELL, ModPotions.CONDUIT_POWER_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.LONG_WATER_BREATHING,
                    Items.NAUTILUS_SHELL, ModPotions.CONDUIT_POWER_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.CROSSBOW, ModPotions.BAD_OMEN_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.BLINDNESS_POTION.get(),
                    Items.GLOWSTONE_DUST, ModPotions.DARKNESS_POTION.get()));
        };
    }
}