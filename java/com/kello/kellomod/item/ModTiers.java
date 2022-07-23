package com.kello.kellomod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier AMETHYST = new ForgeTier(2, 5600, 3.5F, 2F, 45, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD));
    public static final ForgeTier AMETHYSTAXE = new ForgeTier(2, 480, 3.5F, 7F, 45, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD));
}
