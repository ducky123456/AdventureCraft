package com.crayon_duck.adventurecraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.crayon_duck.adventurecraft.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("adventurecraft")
public class AdventureCraft
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "adventurecraft";
    final AdventureCraft instance;

    public AdventureCraft() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        
        ItemInit.ITEMS.register(modEventBus);
        
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }

    /*private void doClientStuff(final FMLClientSetupEvent event) 
    {
    	We will have a clientEventBusSub class
    }*/
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
    	
    }
    
    public static final ItemGroup TAB = new ItemGroup("adventurecrafttab") {
		
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemInit.OAK_WOOD_BARK.get());
		}
	};
}
