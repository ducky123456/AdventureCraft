package com.crayon_duck.adventurecraft.init;

import com.crayon_duck.adventurecraft.AdventureCraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			AdventureCraft.MOD_ID);

	public static final RegistryObject<Item> OAK_WOOD_BARK = ITEMS.register("oak_wood_bark",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> DARK_OAK_WOOD_BARK = ITEMS.register("dark_oak_wood_bark",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> BIRCH_WOOD_BARK = ITEMS.register("birch_wood_bark",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> SPRUCE_WOOD_BARK = ITEMS.register("spruce_wood_bark",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> JUNGLE_WOOD_BARK = ITEMS.register("jungle_wood_bark",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> ACACIA_WOOD_BARK = ITEMS.register("acacia_wood_bark",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
}
