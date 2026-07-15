package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class ArmorBasic {

  public static final SlimefunItemStack ADAMANTIUM_HELMET = new SupremeItemStack("SUPREME_ADAMANTIUM_HELMET",
      MaterialCompat.safe(XMaterial.DIAMOND_HELMET));
  public static final ItemStack[] RECIPE_ADAMANTIUM_HELMET = {SupremeComponents.ADAMANTIUM_PLATE.item(),
      SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), null,
      SupremeComponents.ADAMANTIUM_PLATE.item(), null, null, null};

  public static final SlimefunItemStack AURUM_HELMET = new SupremeItemStack("SUPREME_AURUM_HELMET",
      MaterialCompat.safe(XMaterial.DIAMOND_HELMET));
  public static final ItemStack[] RECIPE_AURUM_HELMET = {SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(),
      SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(), null, SupremeComponents.AURUM_PLATE.item(), null, null,
      null};

  public static final SlimefunItemStack TITANIUM_HELMET = new SupremeItemStack("SUPREME_TITANIUM_HELMET",
      MaterialCompat.safe(XMaterial.DIAMOND_HELMET));
  public static final ItemStack[] RECIPE_TITANIUM_HELMET = {SupremeComponents.TITANIUM_PLATE.item(),
      SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(), null,
      SupremeComponents.TITANIUM_PLATE.item(), null, null, null};

  public static final SlimefunItemStack ADAMANTIUM_CHESTPLATE = new SupremeItemStack("SUPREME_ADAMANTIUM_CHESTPLATE",
      MaterialCompat.safe(XMaterial.DIAMOND_CHESTPLATE));
  public static final ItemStack[] RECIPE_ADAMANTIUM_CHESTPLATE = {SupremeComponents.ADAMANTIUM_PLATE.item(), null,
      SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(),
      SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(),
      SupremeComponents.ADAMANTIUM_PLATE.item()};

  public static final SlimefunItemStack AURUM_CHESTPLATE = new SupremeItemStack("SUPREME_AURUM_CHESTPLATE",
      MaterialCompat.safe(XMaterial.DIAMOND_CHESTPLATE));
  public static final ItemStack[] RECIPE_AURUM_CHESTPLATE = {SupremeComponents.AURUM_PLATE.item(), null,
      SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(),
      SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(),
      SupremeComponents.AURUM_PLATE.item()};

  public static final SlimefunItemStack TITANIUM_CHESTPLATE = new SupremeItemStack("SUPREME_TITANIUM_CHESTPLATE",
      MaterialCompat.safe(XMaterial.DIAMOND_CHESTPLATE));
  public static final ItemStack[] RECIPE_TITANIUM_CHESTPLATE = {SupremeComponents.TITANIUM_PLATE.item(), null,
      SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(),
      SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(),
      SupremeComponents.TITANIUM_PLATE.item()};

  public static final SlimefunItemStack ADAMANTIUM_LEGGINGS = new SupremeItemStack("SUPREME_ADAMANTIUM_LEGGINGS",
      MaterialCompat.safe(XMaterial.DIAMOND_LEGGINGS));
  public static final ItemStack[] RECIPE_ADAMANTIUM_LEGGINGS = {SupremeComponents.ADAMANTIUM_PLATE.item(),
      SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), null,
      SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), null, SupremeComponents.ADAMANTIUM_PLATE.item()};

  public static final SlimefunItemStack AURUM_LEGGINGS = new SupremeItemStack("SUPREME_AURUM_LEGGINGS",
      MaterialCompat.safe(XMaterial.DIAMOND_LEGGINGS));
  public static final ItemStack[] RECIPE_AURUM_LEGGINGS = {SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(),
      SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(), null, SupremeComponents.AURUM_PLATE.item(),
      SupremeComponents.AURUM_PLATE.item(), null, SupremeComponents.AURUM_PLATE.item()};

  public static final SlimefunItemStack TITANIUM_LEGGINGS = new SupremeItemStack("SUPREME_TITANIUM_LEGGINGS",
      MaterialCompat.safe(XMaterial.DIAMOND_LEGGINGS));
  public static final ItemStack[] RECIPE_TITANIUM_LEGGINGS = {SupremeComponents.TITANIUM_PLATE.item(),
      SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(), null,
      SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(), null, SupremeComponents.TITANIUM_PLATE.item()};

  public static final SlimefunItemStack ADAMANTIUM_BOOTS = new SupremeItemStack("SUPREME_ADAMANTIUM_BOOTS", MaterialCompat.safe(XMaterial.DIAMOND_BOOTS));
  public static final ItemStack[] RECIPE_ADAMANTIUM_BOOTS = {null, null, null, SupremeComponents.ADAMANTIUM_PLATE.item(), null,
      SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), null, SupremeComponents.ADAMANTIUM_PLATE.item()};

  public static final SlimefunItemStack AURUM_BOOTS = new SupremeItemStack("SUPREME_AURUM_BOOTS",
      MaterialCompat.safe(XMaterial.DIAMOND_BOOTS));
  public static final ItemStack[] RECIPE_AURUM_BOOTS = {null, null, null, SupremeComponents.AURUM_PLATE.item(), null,
      SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(), null, SupremeComponents.AURUM_PLATE.item()};

  public static final SlimefunItemStack TITANIUM_BOOTS = new SupremeItemStack("SUPREME_TITANIUM_BOOTS",
      MaterialCompat.safe(XMaterial.DIAMOND_BOOTS));
  public static final ItemStack[] RECIPE_TITANIUM_BOOTS = {null, null, null, SupremeComponents.TITANIUM_PLATE.item(), null,
      SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(), null, SupremeComponents.TITANIUM_PLATE.item()};
}
