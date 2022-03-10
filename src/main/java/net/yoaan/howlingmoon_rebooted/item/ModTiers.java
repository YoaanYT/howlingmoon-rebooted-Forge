package net.yoaan.howlingmoon_rebooted.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier SILVER = new ForgeTier(2, 1500, 4f,
            0f, 1, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.SILVER_INGOT.get()));
}
