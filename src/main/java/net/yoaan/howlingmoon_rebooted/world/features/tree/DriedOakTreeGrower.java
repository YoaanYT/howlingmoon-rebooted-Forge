package net.yoaan.howlingmoon_rebooted.world.features.tree;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yoaan.howlingmoon_rebooted.world.features.ModConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class DriedOakTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
        protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
            return ModConfiguredFeature.DRIED_OAK_TREE;
        }
    }