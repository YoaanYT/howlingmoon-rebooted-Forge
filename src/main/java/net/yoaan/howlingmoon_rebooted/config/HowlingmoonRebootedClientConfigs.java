package net.yoaan.howlingmoon_rebooted.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class HowlingmoonRebootedClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for MCCourseMod");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}