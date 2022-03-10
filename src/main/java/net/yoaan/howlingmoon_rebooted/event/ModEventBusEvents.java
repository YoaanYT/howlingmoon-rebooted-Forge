package net.yoaan.howlingmoon_rebooted.event;

import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.yoaan.howlingmoon_rebooted.entity.ModEntityTypes;
import net.yoaan.howlingmoon_rebooted.entity.custom.WerewolfEntity;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = howlingmoon_rebooted.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll();
    }

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.WEREWOLF.get(), WerewolfEntity.setAttributes());
    }
}
