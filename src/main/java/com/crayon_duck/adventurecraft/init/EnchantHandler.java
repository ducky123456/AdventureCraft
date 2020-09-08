package com.crayon_duck.adventurecraft.init;

import com.crayon_duck.adventurecraft.AdventureCraft;
import com.crayon_duck.adventurecraft.items.enchants.SpeedEnchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantHandler {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, AdventureCraft.MOD_ID);
    
    public static final RegistryObject<Enchantment> SPEED = ENCHANTMENTS.register("speed", () -> new SpeedEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> ACROBATICS = ENCHANTMENTS.register("acrobatics", () -> new SpeedEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET}));
}