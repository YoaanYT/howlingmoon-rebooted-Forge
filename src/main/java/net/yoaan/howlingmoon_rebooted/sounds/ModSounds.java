package net.yoaan.howlingmoon_rebooted.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yoaan.howlingmoon_rebooted.howlingmoon_rebooted;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, howlingmoon_rebooted.MOD_ID);

    public static RegistryObject<SoundEvent> DEEPSLATE_SILVER_ORE_BREAK = registerSoundEvents("cobalt_lamp_break");
    public static RegistryObject<SoundEvent> DEEPSLATE_SILVER_ORE_STEP = registerSoundEvents("cobalt_lamp_step");
    public static RegistryObject<SoundEvent> DEEPSLATE_SILVER_ORE_PLACE = registerSoundEvents("cobalt_lamp_place");
    public static RegistryObject<SoundEvent> DEEPSLATE_SILVER_ORE_HIT = registerSoundEvents("cobalt_lamp_hit");
    public static RegistryObject<SoundEvent> DEEPSLATE_SILVER_ORE_FALL = registerSoundEvents("cobalt_lamp_fall");

    public static final ForgeSoundType DEEPSLATE_SILVER_ORE_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.DEEPSLATE_SILVER_ORE_BREAK, ModSounds.DEEPSLATE_SILVER_ORE_STEP, ModSounds.DEEPSLATE_SILVER_ORE_PLACE,
            ModSounds.DEEPSLATE_SILVER_ORE_HIT, ModSounds.DEEPSLATE_SILVER_ORE_FALL);



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        ResourceLocation id = new ResourceLocation(howlingmoon_rebooted.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> new SoundEvent(id));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
