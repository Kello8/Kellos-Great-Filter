package com.kello.kellomod.item;

import com.kello.kellomod.KelloMod;
import com.kello.kellomod.item.custom.AmethystCoalItem;
import com.kello.kellomod.item.custom.GlowingSwordItem;
import com.kello.kellomod.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.kello.kellomod.item.ModTiers.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KelloMod.MOD_ID);

    public static final RegistryObject<Item> AMETHYSTBOW = ITEMS.register("amethystbow",
            () -> new BowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(456)));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_SWORD = ITEMS.register("amethystnetherite_sword",
            () ->  new SwordItem(AMETHYSTNETHERITE, 5, -2.4F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_HOE = ITEMS.register("amethystnetherite_hoe",
            () -> new HoeItem(AMETHYSTNETHERITE, 1, -2.1F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_AXE = ITEMS.register("amethystnetherite_axe",
            () -> new AxeItem(AMETHYSTNETHERITEAXE, 1, -3.0F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_SHOVEL = ITEMS.register("amethystnetherite_shovel",
            () -> new ShovelItem(AMETHYSTNETHERITE, 1, -2.1F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_PICKAXE = ITEMS.register("amethystnetherite_pickaxe",
            () -> new PickaxeItem(AMETHYSTNETHERITE, 1, -2.2F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () ->  new GlowingSwordItem(AMETHYST, 2, -2F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(AMETHYST, 1, -2.1F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(AMETHYSTAXE, 1, -3.0F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(AMETHYST, 1, -2.1F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(AMETHYST, 1, -2.2F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () ->  new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () ->  new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_LEGGING = ITEMS.register("amethyst_leggings",
            () ->  new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () ->  new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_HELMET = ITEMS.register("amethystnetherite_helmet",
            () ->  new ArmorItem(ModAmethystNetheriteArmorMaterials.AMETHYSTNETHERITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_CHESTPLATE = ITEMS.register("amethystnetherite_chestplate",
            () ->  new ArmorItem(ModAmethystNetheriteArmorMaterials.AMETHYSTNETHERITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_LEGGING = ITEMS.register("amethystnetherite_leggings",
            () ->  new ArmorItem(ModAmethystNetheriteArmorMaterials.AMETHYSTNETHERITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_BOOTS = ITEMS.register("amethystnetherite_boots",
            () ->  new ArmorItem(ModAmethystNetheriteArmorMaterials.AMETHYSTNETHERITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTCLOCK = ITEMS.register("amethystclock",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).fireResistant()));
    public static final RegistryObject<Item> AMETHYSTSHEARS = ITEMS.register("amethystshears",
            () -> new ShearsItem(new Item.Properties().stacksTo(1).durability(576).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_BREAD = ITEMS.register("amethyst_bread",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_BREAD)));
    public static final RegistryObject<Item> AMETHYST_CHICKEN = ITEMS.register("amethyst_chicken",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_CHICKEN)));
    public static final RegistryObject<Item> AMETHYST_MUTTON = ITEMS.register("amethyst_mutton",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_MUTTON)));
    public static final RegistryObject<Item> AMETHYST_BEETROOT = ITEMS.register("amethyst_beetroot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_BEETROOT)));
    public static final RegistryObject<Item> AMETHYST_POTATO = ITEMS.register("amethyst_potato",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_POTATO)));
    public static final RegistryObject<Item> AMETHYST_CARROT = ITEMS.register("amethyst_carrot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_CARROT)));
    public static final RegistryObject<Item> AMETHYST_BEEF = ITEMS.register("amethyst_beef",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_BEEF)));
    public static final RegistryObject<Item> AMETHYST_COOKIE = ITEMS.register("amethyst_cookie",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_COOKIE)));
    public static final RegistryObject<Item> AMETHYST_MELON_SLICE = ITEMS.register("amethyst_melon_slice",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_MELON_SLICE)));
    public static final RegistryObject<Item> AMETHYST_POISONOUS_POTATO = ITEMS.register("amethyst_poisonous_potato",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_POISONOUS_POTATO)));
    public static final RegistryObject<Item> AMETHYST_RABBIT = ITEMS.register("amethyst_rabbit",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_RABBIT)));
    public static final RegistryObject<Item> AMETHYST_ROTTEN_FLESH = ITEMS.register("amethyst_rotten_flesh",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_ROTTEN_FLESH)));
    public static final RegistryObject<Item> AMETHYST_SWEET_BERRIES = ITEMS.register("amethyst_sweet_berries",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_SWEET_BERRIES)));
    public static final RegistryObject<Item> AMETHYST_APPLE = ITEMS.register("amethyst_apple",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_APPLE).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> AMETHYST_GOD_APPLE = ITEMS.register("amethyst_god_apple",
            () -> new EnchantedGoldenAppleItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_GOD_APPLE).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AMETHYST_COAL = ITEMS.register("amethyst_coal",
            () -> new AmethystCoalItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> AMETHYSTNETHERITE_INGOT = ITEMS.register("amethystnetherite_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant()));
    public static final RegistryObject<Item> AMETHYST_DISC_FRAGMENT = ITEMS.register("amethyst_disc_fragment",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> AMETHYST_MUSIC_DISC = ITEMS.register("amethyst_music_disc",
            () -> new RecordItem(4, ModSounds.AMETHYST_DISC,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> AMETHYST_MUSIC_DISC_1 = ITEMS.register("amethyst_music_disc_1",
            () -> new RecordItem(2, ModSounds.AMETHYST1_DISC,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> AMETHYST_MUSIC_DISC_2 = ITEMS.register("amethyst_music_disc_2",
            () -> new RecordItem(0, ModSounds.AMETHYST2_DISC,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
