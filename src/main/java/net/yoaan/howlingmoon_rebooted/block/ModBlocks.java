package net.yoaan.howlingmoon_rebooted.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yoaan.howlingmoon_rebooted.block.custom.ModFlammableRotatedPillarBlock;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import net.yoaan.howlingmoon_rebooted.item.ModCreativeModeTab;
import net.yoaan.howlingmoon_rebooted.item.ModItems;
import net.yoaan.howlingmoon_rebooted.world.features.tree.DriedOakTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, howlingmoon_rebooted.MOD_ID);

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.6f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_DOOR = registerBlock("silver_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_STAIRS = registerBlock("silver_stairs",
            () -> new StairBlock(() -> SILVER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_FENCE = registerBlock("silver_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_WALL = registerBlock("silver_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_FENCE_GATE = registerBlock("silver_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_SLAB = registerBlock("silver_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_BUTTON = registerBlock("silver_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.1f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_TRAPDOOR = registerBlock("silver_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3.5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> SILVER_PRESSURE_PLATE = registerBlock("silver_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)),
            ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> HUNTER_BANNER = registerBlock("hunter_banner",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> WOLFSBANE = registerBlock("wolfsbane",
            () -> new FlowerBlock(MobEffects.REGENERATION, 200,
                    BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> POTTED_WOLFSBANE = BLOCKS.register("potted_pink_rose",
            () -> new FlowerPotBlock(null, ModBlocks.WOLFSBANE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    public static final RegistryObject<Block> DRIED_OAK_LOG = registerBlock("dried_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_WOOD = registerBlock("dried_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> STRIPPED_DRIED_OAK_LOG = registerBlock("stripped_dried_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> STRIPPED_DRIED_OAK_WOOD = registerBlock("stripped_dried_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_PLANKS = registerBlock("dried_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_LEAVES = registerBlock("dried_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_SAPLING = registerBlock("dried_oak_sapling",
            () -> new SaplingBlock(new DriedOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_DOOR = registerBlock("dried_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_STAIRS = registerBlock("dried_oak_stairs",
            () -> new StairBlock(() -> DRIED_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_FENCE = registerBlock("dried_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_FENCE_GATE = registerBlock("dried_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_SLAB = registerBlock("dried_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_BUTTON = registerBlock("dried_oak_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.1f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_TRAPDOOR = registerBlock("dried_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    public static final RegistryObject<Block> DRIED_OAK_PRESSURE_PLATE = registerBlock("dried_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(0.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.HOWLINGMOONREBOOTED_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}