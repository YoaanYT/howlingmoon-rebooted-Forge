package net.yoaan.howlingmoon_rebooted.world.features;

import net.minecraft.core.Registry;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.yoaan.howlingmoon_rebooted.block.ModBlocks;
import net.yoaan.howlingmoon_rebooted.config.HowlingmoonRebootedCommonConfigs;

import java.util.List;

public class ModConfiguredFeature {
    public static final Holder<? extends ConfiguredFeature<TreeConfiguration, ?>> DRIED_OAK_TREE =
            FeatureUtils.register("dried_oak", Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(ModBlocks.DRIED_OAK_LOG.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(ModBlocks.DRIED_OAK_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> DRIED_OAK_CHECKED = PlacementUtils.register("dried_oak_checked",
            DRIED_OAK_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.DRIED_OAK_SAPLING.get()));


    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DRIED_OAK_SPAWN =
            FeatureUtils.register("dried_ok_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(DRIED_OAK_CHECKED,
                            0.5F)), DRIED_OAK_CHECKED));


    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> WOLFSBANE =
            FeatureUtils.register("flower_wolfsbane", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WOLFSBANE.get())))));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILVER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));


    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE = FeatureUtils.register("silver_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES, HowlingmoonRebootedCommonConfigs.SILVER_ORE_VEIN_SIZE.get()));
}
