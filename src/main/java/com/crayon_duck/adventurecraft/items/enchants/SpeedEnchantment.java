package com.crayon_duck.adventurecraft.items.enchants;

import com.crayon_duck.adventurecraft.AdventureCraft;
import com.crayon_duck.adventurecraft.init.EnchantHandler;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ModIdArgument;

public class SpeedEnchantment extends Enchantment{


    public SpeedEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);


    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinLevel() {
        return 0;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }
    
    @Mod.EventBusSubscriber(modid = AdventureCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class SpeedEquip {
    	@SubscribeEvent
        public static void doStuff(TickEvent.PlayerTickEvent event) {
            PlayerEntity playerIn = event.player;
            if (EnchantmentHelper.getEnchantmentLevel(EnchantHandler.SPEED.get(), playerIn.getItemStackFromSlot(EquipmentSlotType.FEET)) == 1) {
                playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 10, 4,true,false));
            }
        }



    	}
    }
