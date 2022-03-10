package net.yoaan.howlingmoon_rebooted.world.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.yoaan.howlingmoon_rebooted.config.HowlingmoonRebootedCommonConfigs;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> DRIED_OAK_PLACED =
            PlacementUtils.register("dried_oak_placed",
                    ModConfiguredFeature.DRIED_OAK_SPAWN, VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(1, 0.1f, 2)));


    public static final Holder<PlacedFeature> WOLFSBANE_PLACED = PlacementUtils.register("wolfsbane_placed",
            ModConfiguredFeature.WOLFSBANE, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> SILVER_ORE_PLACED = PlacementUtils.register("silver_ore_placed",
            ModConfiguredFeature.SILVER_ORE, ModOrePlacement
                    .commonOrePlacement(HowlingmoonRebootedCommonConfigs.SILVER_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-180), VerticalAnchor.aboveBottom(180))));
}

