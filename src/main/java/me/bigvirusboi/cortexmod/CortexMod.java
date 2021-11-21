package me.bigvirusboi.cortexmod;

import me.bigvirusboi.cortexmod.init.ItemInit;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CortexMod.MOD_ID)
public class CortexMod {
    public static final String MOD_ID = "cortexmod";
    public static final Logger LOGGER = LogManager.getLogger();

    public CortexMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        // Here, we register items, blocks, entities, particles, biomes and more
        ItemInit.ITEMS.register(bus);

        // Here, we register events
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ItemInit.BANANA.get(), 0.5f);
        });
    }
}
