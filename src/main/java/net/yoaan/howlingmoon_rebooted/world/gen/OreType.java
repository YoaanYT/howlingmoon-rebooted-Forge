package net.yoaan.howlingmoon_rebooted.world.gen;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;
import net.yoaan.howlingmoon_rebooted.block.ModBlocks;

public enum OreType {
    SILVER_ORE(Lazy.of(ModBlocks.SILVER_ORE), 8, 0, 150, 0),
    DEEPSLATE_SILVER_ORE(Lazy.of(ModBlocks.DEEPSLATE_SILVER_ORE), 8, -63, 0, 0);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
