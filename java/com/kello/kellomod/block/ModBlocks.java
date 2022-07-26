package com.kello.kellomod.block;

import com.kello.kellomod.KelloMod;
import com.kello.kellomod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, KelloMod.MOD_ID);

    public static final RegistryObject<Block> AMETHYST_STEM = registerBlock("amethyst_stem",
            () -> new Block(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(0.7f).sound(SoundType.WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> AMETHYST_BENCH = registerBlock("amethyst_bench",
            () -> new Block(BlockBehaviour.Properties.of(Material.NETHER_WOOD)
                    .strength(3f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> AMETHYST_SHARD_BLOCK = registerBlock("amethyst_shard_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(2.4f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_AMETHYST = registerBlock("polished_amethyst",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(2.1f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(2.1f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CUT_AMETHYST = registerBlock("cut_amethyst",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(2.1f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_AMETHYST_SLAB = registerBlock("polished_amethyst_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(2.1f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> AMETHYST_BRICKS_SLAB = registerBlock("amethyst_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(2.1f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CUT_AMETHYST_SLAB = registerBlock("cut_amethyst_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(2.1f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_AMETHYST_STAIRS = registerBlock("polished_amethyst_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_AMETHYST.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.AMETHYST).strength(2.1f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> AMETHYST_BRICKS_STAIRS = registerBlock("amethyst_bricks_stairs",
            () -> new StairBlock(() -> ModBlocks.AMETHYST_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.AMETHYST).strength(2.1f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CUT_AMETHYST_STAIRS = registerBlock("cut_amethyst_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_AMETHYST.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.AMETHYST).strength(2.1f).sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHISELED_AMETHYST_BLOCK = registerBlock("chiseled_amethyst_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.7f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICKS = registerBlock("polished_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CALCITE_TILES = registerBlock("calcite_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICKS_SLAB = registerBlock("polished_calcite_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CALCITE_TILES_SLAB = registerBlock("calcite_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);;
    public static final RegistryObject<Block> CALCITE_TILES_STAIRS = registerBlock("calcite_tiles_stairs",
            () -> new StairBlock(() -> ModBlocks.CALCITE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICKS_STAIRS = registerBlock("polished_calcite_bricks_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_CALCITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(0.8f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
