package net.yoaan.howlingmoon_rebooted.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import net.yoaan.howlingmoon_rebooted.world.gen.ModFlowerGeneration;
import net.yoaan.howlingmoon_rebooted.world.gen.ModOreGeneration;
import net.yoaan.howlingmoon_rebooted.world.gen.ModTreeGeneration;

@Mod.EventBusSubscriber(modid = howlingmoon_rebooted.MOD_ID)
public class WorldGenerationEvents {
    @SubscribeEvent
    public static void ModWorldGeneration(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
   }
}
