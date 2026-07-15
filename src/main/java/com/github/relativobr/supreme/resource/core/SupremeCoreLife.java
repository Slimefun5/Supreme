package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreLife {

  public static final SlimefunItemStack RESOURCE_CORE_POTATO = new SupremeItemStack("SUPREME_CORE_POTATO", "cf4624ebf7d419a11e43ed0c2038d32cd09ad1d7a6c6e20f6339cbcfe386fd1c");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_POTATO = new CustomCoreRecipe(RESOURCE_CORE_POTATO,
      MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.POTATO));

  public static final SlimefunItemStack RESOURCE_CORE_APPLE = new SupremeItemStack("SUPREME_CORE_APPLE", "4abd703e5b8c88d4b1fcfa94a936a0d6a4f6aba44569663d3391d4883223c5");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_APPLE = new CustomCoreRecipe(RESOURCE_CORE_APPLE,
      MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.APPLE));

  public static final SlimefunItemStack RESOURCE_CORE_BEETROOT = new SupremeItemStack("SUPREME_CORE_BEETROOT", "18f36ea228c4fd9afed5add6d0526de71b7ac0559eabfc2f60de6c4aa733f5");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BEETROOT = new CustomCoreRecipe(RESOURCE_CORE_BEETROOT,
      MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.BEETROOT));

  public static final SlimefunItemStack RESOURCE_CORE_WHEAT = new SupremeItemStack("SUPREME_CORE_WHEAT", "2c680149ad17e46fbbf7606b284cc83a03b1a67cd8a52717b44bfa3ad5914f14");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_WHEAT = new CustomCoreRecipe(RESOURCE_CORE_WHEAT,
      MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.WHEAT));

  public static final SlimefunItemStack RESOURCE_CORE_SUGAR_CANE = new SupremeItemStack("SUPREME_CORE_SUGAR_CANE", "8624bacb5f1986e6477abce4ae7dca1820a5260b6233b55ba1d9ba936c84b");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SUGAR_CANE = new CustomCoreRecipe(RESOURCE_CORE_SUGAR_CANE,
      MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.SUGAR_CANE));

  public static final SlimefunItemStack RESOURCE_CORE_SWEET_BERRIES = new SupremeItemStack("SUPREME_CORE_SWEET_BERRIES", "b4ec3fcd557269a1a0b9bfa8a02dae1a39fa0ee8ff40e0cb8a96479be04b6609");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SWEET_BERRIES = new CustomCoreRecipe(
      RESOURCE_CORE_SWEET_BERRIES, MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.SWEET_BERRIES));

  public static final SlimefunItemStack RESOURCE_CORE_MELON = new SupremeItemStack("SUPREME_CORE_MELON", "84df0bfe450f0b8623f3accbc0d606f72891a6cfa9667898251ae73ebdd2646a");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_MELON = new CustomCoreRecipe(RESOURCE_CORE_MELON,
      MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.MELON));

  public static final SlimefunItemStack RESOURCE_CORE_CARROT = new SupremeItemStack("SUPREME_CORE_CARROT", "4d3a6bd98ac1833c664c4909ff8d2dc62ce887bdcf3cc5b3848651ae5af6b");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CARROT = new CustomCoreRecipe(RESOURCE_CORE_CARROT,
      MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.CARROT));

  public static final SlimefunItemStack RESOURCE_CORE_PUMPKIN = new SupremeItemStack("SUPREME_CORE_PUMPKIN", "b41ad148e33c81dca3f1a6ce13aa70e4fe6bc2c79e87185d8d176bdda1c98a3");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_PUMPKIN = new CustomCoreRecipe(RESOURCE_CORE_PUMPKIN,
      MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.PUMPKIN));
}
