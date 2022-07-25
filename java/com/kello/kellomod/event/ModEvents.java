package com.kello.kellomod.event;

import com.kello.kellomod.block.ModBlocks;
import com.kello.kellomod.villager.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import com.kello.kellomod.KelloMod;
import com.kello.kellomod.item.ModItems;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = KelloMod.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.AMETHYST_SHARD, 26),
                    stack,32,16,0.035F));
        }

        if(event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.AMETHYST_SHARD, 24),
                    stack, 32, 16, 0.035F));
        }

        if(event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.DIORITE, 16),
                    stack, 32, 16, 0.2F));
        }

        if(event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_PICKAXE.get(), 1);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 36),
                    stack,2,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_PICKAXE.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,2,36,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_AXE.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,2,36,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_SHOVEL.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,2,36,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_HOE.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,2,36,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_SWORD.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    stack,2,36,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.AMETHYST_SHARD, 26);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 19),
                    stack,12,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.AMETHYST_SHARD, 30),
                    stack,12,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.AMETHYST_SHARD, 21);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    stack,12,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.AMETHYST_SHARD, 32),
                    stack,12,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.AMETHYST_SHARD, 31);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    stack,12,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.AMETHYST_SHARD, 29),
                    stack,12,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.CALCITE, 8);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack,12,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.CALCITE, 8);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack,12,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.SMOOTH_BASALT, 8);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack,12,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.CALCITE, 8);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack,16,12,0.045F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYSTBOW.get(), 1);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 29),
                    stack,2,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_PICKAXE.get(), 1);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 27),
                    stack,2,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_SWORD.get(), 1);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 24),
                    stack,2,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.AMETHYST_BLOCK, 23),
                    stack,16,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.AMETHYST_BLOCK, 21),
                    stack,16,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_DISC_FRAGMENT.get(), 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 52),
                    stack,16,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModBlocks.POLISHED_CALCITE_BRICKS.get(), 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,16,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModBlocks.CHISELED_AMETHYST_BLOCK.get(), 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,16,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModBlocks.CALCITE_TILES.get(), 1);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,16,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_BREAD.get(), 3);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 13),
                    stack,16,16,0.10F));
        }

        if(event.getType() == ModVillagers.GEMOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.AMETHYST_CARROT.get(), 3);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 21),
                    stack,16,16,0.10F));
        }
    }
}