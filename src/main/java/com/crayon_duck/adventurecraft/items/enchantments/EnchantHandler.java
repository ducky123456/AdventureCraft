package com.crayon_duck.adventurecraft.items.enchantments;

import com.crayon_duck.adventurecraft.AdventureCraft;
import com.crayon_duck.adventurecraft.items.enchantments.enchantments.SpeedEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantHandler {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister(ForgeRegistries.ENCHANTMENTS, AdventureCraft.MOD_ID);


    //
    public static final RegistryObject<Enchantment> SPEED = ENCHANTMENTS.register("speed", () -> new SpeedEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET}));
}
