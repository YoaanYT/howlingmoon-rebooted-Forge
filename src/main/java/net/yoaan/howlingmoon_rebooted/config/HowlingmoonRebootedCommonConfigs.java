package net.yoaan.howlingmoon_rebooted.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class HowlingmoonRebootedCommonConfigs{
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_ORE_VEIN_SIZE;

    static {
        BUILDER.push("Configs for MCCourseMod");

        SILVER_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Silver Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 3);
        SILVER_ORE_VEIN_SIZE = BUILDER.comment("How many Silver Ore Blocks spawn in one Vein!")
                .define("Vein Size", 9);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}