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

import static com.kello.kellomod.item.ModTiers.AMETHYST;
import static com.kello.kellomod.item.ModTiers.AMETHYSTAXE;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KelloMod.MOD_ID);

    public static final RegistryObject<Item> AMETHYSTBOW = ITEMS.register("amethystbow",
            () -> new BowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(456)));
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
    public static final RegistryObject<Item> AMETHYSTCLOCK = ITEMS.register("amethystclock",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_BREAD = ITEMS.register("amethyst_bread",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.AMETHYST_BREAD)));
    public static final RegistryObject<Item> AMETHYST_COAL = ITEMS.register("amethyst_coal",
            () -> new AmethystCoalItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> AMETHYST_DISC_FRAGMENT = ITEMS.register("amethyst_disc_fragment",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> AMETHYST_MUSIC_DISC = ITEMS.register("amethyst_music_disc",
            () -> new RecordItem(4, ModSounds.AMETHYST_DISC,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
