package com.kello.kellomod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier AMETHYST = new ForgeTier(7, 560, 3.5F, 2F, 45, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD));
    public static final ForgeTier AMETHYSTAXE = new ForgeTier(7, 560, 2.5F, 6F, 45, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD));
    public static final ForgeTier AMETHYSTNETHERITE = new ForgeTier(7, 3032, 3.5F, 2F, 50, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_INGOT));
    public static final ForgeTier AMETHYSTNETHERITEAXE = new ForgeTier(7, 3032, 2.5F, 8F, 50, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_INGOT));
    public static final ForgeTier GILDED_NETHERITE = new ForgeTier(7, 356, 2.0F, 7F, 40, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_INGOT));
}
