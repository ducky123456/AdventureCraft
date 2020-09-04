package com.crayon_duck.adventurecraft;

import com.crayon_duck.adventurecraft.items.enchantments.EnchantHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("adventurecraft")
public class AdventureCraft
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "adventurecraft";

    public AdventureCraft() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        EnchantHandler.ENCHANTMENTS.register(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
    	
    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
    	
    }
}
