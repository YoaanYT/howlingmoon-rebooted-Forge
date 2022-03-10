package net.yoaan.howlingmoon_rebooted.world.gen;

import net.yoaan.howlingmoon_rebooted.world.features.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
                List<Holder<PlacedFeature>> base =
                        event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
        base.add(ModPlacedFeatures.SILVER_ORE_PLACED);
    }
}
