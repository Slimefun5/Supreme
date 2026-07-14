package com.github.relativobr.supreme.resource;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeComponents {

  public static final SlimefunItemStack SUPREME_NUGGET = new SupremeItemStack("SUPREME_SUPREME_NUGGET",
      "cffc977cc7e10e564a09638a53bbc4c54c9c8dac7450ba3dfa3c9099d94f5", "&aNugget Supreme", "",
      "&7From the Quarry Nugget Supreme", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_SUPREME_NUGGET = {null, null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack SUPREME = new SupremeItemStack("SUPREME_SUPREME",
      "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d", "&aSupreme", "", "&7The Supreme", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_SUPREME = {SupremeComponents.SUPREME_NUGGET.item(), SupremeComponents.SUPREME_NUGGET.item(),
      SupremeComponents.SUPREME_NUGGET.item(), SupremeComponents.SUPREME_NUGGET.item(), SupremeComponents.SUPREME_NUGGET.item(),
      SupremeComponents.SUPREME_NUGGET.item(), SupremeComponents.SUPREME_NUGGET.item(), SupremeComponents.SUPREME_NUGGET.item(),
      SupremeComponents.SUPREME_NUGGET.item()};

  public static final SlimefunItemStack THORNIUM_BIT = new SupremeItemStack("SUPREME_THORNIUM_BIT",
      MaterialCompat.safe(XMaterial.IRON_NUGGET), "&aThornium Bit", "", "&7From the Quarry Thornium", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_BIT = {null, null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack THORNIUM_DUST = new SupremeItemStack("SUPREME_THORNIUM_DUST",
      MaterialCompat.safe(XMaterial.GUNPOWDER), "&aThornium Dust", "", "&7From the Thornium Bit", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_DUST = {SupremeComponents.THORNIUM_BIT.item(),
      SupremeComponents.THORNIUM_BIT.item(), SupremeComponents.THORNIUM_BIT.item(), SupremeComponents.THORNIUM_BIT.item(),
      SupremeComponents.THORNIUM_BIT.item(), SupremeComponents.THORNIUM_BIT.item(), SupremeComponents.THORNIUM_BIT.item(),
      SupremeComponents.THORNIUM_BIT.item(), SupremeComponents.THORNIUM_BIT.item()};

  public static final SlimefunItemStack THORNIUM_INGOT = new SupremeItemStack("SUPREME_THORNIUM_INGOT",
      MaterialCompat.safe(XMaterial.IRON_INGOT), "&aThornium Ingot", "", "&7From the Thornium Dust", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT = {SupremeComponents.THORNIUM_DUST.item(),
      SupremeComponents.THORNIUM_DUST.item(), SupremeComponents.THORNIUM_DUST.item(), SupremeComponents.THORNIUM_DUST.item(),
      SupremeComponents.THORNIUM_DUST.item(), SupremeComponents.THORNIUM_DUST.item(), SupremeComponents.THORNIUM_DUST.item(),
      SupremeComponents.THORNIUM_DUST.item(), SupremeComponents.THORNIUM_DUST.item()};

  public static final SlimefunItemStack THORNIUM_BIT_SYNTHETIC = new SupremeItemStack("SUPREME_THORNIUM_BIT_SYNTHETIC",
      MaterialCompat.safe(XMaterial.GOLD_NUGGET), "&aThornium Bit Synthetic", "", "&7From the Thornium Bit", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_BIT_SYNTHETIC = {SlimefunItems.SYNTHETIC_SAPPHIRE.item(),
      SlimefunItems.DAMASCUS_STEEL_INGOT.item(), SlimefunItems.SYNTHETIC_SAPPHIRE.item(), SlimefunItems.DAMASCUS_STEEL_INGOT.item(),
      SupremeComponents.THORNIUM_BIT.item(), SlimefunItems.DAMASCUS_STEEL_INGOT.item(), SlimefunItems.SYNTHETIC_SAPPHIRE.item(),
      SlimefunItems.DAMASCUS_STEEL_INGOT.item(), SlimefunItems.SYNTHETIC_SAPPHIRE.item()};

  public static final SlimefunItemStack THORNIUM_DUST_SYNTHETIC = new SupremeItemStack(
      "SUPREME_THORNIUM_DUST_SYNTHETIC", MaterialCompat.safe(XMaterial.GLOWSTONE_DUST), "&aThornium Dust Synthetic", "",
      "&7From the Thornium Dust", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_DUST_SYNTHETIC = {SlimefunItems.SYNTHETIC_EMERALD.item(),
      SlimefunItems.HARDENED_METAL_INGOT.item(), SlimefunItems.SYNTHETIC_EMERALD.item(), SlimefunItems.HARDENED_METAL_INGOT.item(),
      SupremeComponents.THORNIUM_DUST.item(), SlimefunItems.HARDENED_METAL_INGOT.item(), SlimefunItems.SYNTHETIC_EMERALD.item(),
      SlimefunItems.HARDENED_METAL_INGOT.item(), SlimefunItems.SYNTHETIC_EMERALD.item()};

  public static final SlimefunItemStack THORNIUM_INGOT_SYNTHETIC = new SupremeItemStack(
      "SUPREME_THORNIUM_INGOT_SYNTHETIC", MaterialCompat.safe(XMaterial.GOLD_INGOT), "&aThornium Ingot Synthetic", "",
      "&7From the Thornium Ingot", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT_SYNTHETIC = {SlimefunItems.SYNTHETIC_DIAMOND.item(),
      SlimefunItems.STEEL_PLATE.item(), SlimefunItems.SYNTHETIC_DIAMOND.item(), SlimefunItems.STEEL_PLATE.item(),
      SupremeComponents.THORNIUM_INGOT.item(), SlimefunItems.STEEL_PLATE.item(), SlimefunItems.SYNTHETIC_DIAMOND.item(),
      SlimefunItems.STEEL_PLATE.item(), SlimefunItems.SYNTHETIC_DIAMOND.item()};

  public static final SlimefunItemStack THORNIUM_CARBONADO = new SupremeItemStack("SUPREME_THORNIUM_CARBONADO",
      MaterialCompat.safe(XMaterial.NETHERITE_INGOT), "&aThornium Carbonado", "", "&7From the Thornium Ingot", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_CARBONADO = {SlimefunItems.CARBONADO.item(), SlimefunItems.REINFORCED_PLATE.item(),
      SlimefunItems.CARBONADO.item(), SlimefunItems.REINFORCED_PLATE.item(), SupremeComponents.THORNIUM_INGOT.item(),
      SlimefunItems.REINFORCED_PLATE.item(), SlimefunItems.CARBONADO.item(), SlimefunItems.REINFORCED_PLATE.item(), SlimefunItems.CARBONADO.item()};

  public static final SlimefunItemStack THORNIUM_ENERGIZED = new SupremeItemStack("SUPREME_THORNIUM_ENERGIZED",
      MaterialCompat.safe(XMaterial.NETHERITE_INGOT), "&aThornium Energized", "", "&7From the Thornium Ingot", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_ENERGIZED = {SlimefunItems.BLISTERING_INGOT_3.item(),
      SlimefunItems.REDSTONE_ALLOY.item(), SlimefunItems.BLISTERING_INGOT_3.item(), SlimefunItems.REDSTONE_ALLOY.item(),
      SupremeComponents.THORNIUM_CARBONADO.item(), SlimefunItems.REDSTONE_ALLOY.item(), SlimefunItems.BLISTERING_INGOT_3.item(),
      SlimefunItems.REDSTONE_ALLOY.item(), SlimefunItems.BLISTERING_INGOT_3.item()};

  public static final SlimefunItemStack ALLOY_ZIRCONIUM = new SupremeItemStack("SUPREME_ALLOY_ZIRCONIUM",
      MaterialCompat.safe(XMaterial.IRON_INGOT), "&aAlloy Zirconium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_ZIRCONIUM = {SlimefunItems.ZINC_DUST.item(), SlimefunItems.SOLDER_INGOT.item(),
      SlimefunItems.ZINC_INGOT.item(), null, null, null, null, null, null};

  public static final SlimefunItemStack ZIRCONIUM_PLATE = new SupremeItemStack("SUPREME_ZIRCONIUM_PLATE",
      MaterialCompat.safe(XMaterial.IRON_BLOCK), "&aZirconium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ZIRCONIUM_PLATE = {SupremeComponents.ALLOY_ZIRCONIUM.item(),
      SupremeComponents.ALLOY_ZIRCONIUM.item(), SupremeComponents.ALLOY_ZIRCONIUM.item(), SupremeCoreBlock.RESOURCE_CORE_DIORITE.item(),
      SupremeCoreBlock.RESOURCE_CORE_DIORITE.item(), SupremeCoreBlock.RESOURCE_CORE_DIORITE.item(), SupremeComponents.ALLOY_ZIRCONIUM.item(),
      SupremeComponents.ALLOY_ZIRCONIUM.item(), SupremeComponents.ALLOY_ZIRCONIUM.item()};

  public static final SlimefunItemStack ALLOY_TITANIUM = new SupremeItemStack("SUPREME_ALLOY_TITANIUM",
      MaterialCompat.safe(XMaterial.IRON_INGOT), "&aAlloy Titanium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_TITANIUM = {SlimefunItems.TIN_DUST.item(), SlimefunItems.DAMASCUS_STEEL_INGOT.item(),
      SlimefunItems.TIN_INGOT.item(), null, null, null, null, null, null};

  public static final SlimefunItemStack TITANIUM_PLATE = new SupremeItemStack("SUPREME_TITANIUM_PLATE",
      MaterialCompat.safe(XMaterial.IRON_BLOCK), "&aTitanium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_TITANIUM_PLATE = {SupremeComponents.ALLOY_TITANIUM.item(),
      SupremeComponents.ALLOY_TITANIUM.item(), SupremeComponents.ALLOY_TITANIUM.item(), SupremeCoreBlock.RESOURCE_CORE_ANDESITE.item(),
      SupremeCoreBlock.RESOURCE_CORE_ANDESITE.item(), SupremeCoreBlock.RESOURCE_CORE_ANDESITE.item(),
      SupremeComponents.ALLOY_TITANIUM.item(), SupremeComponents.ALLOY_TITANIUM.item(), SupremeComponents.ALLOY_TITANIUM.item()};

  public static final SlimefunItemStack ALLOY_IRIDIUM = new SupremeItemStack("SUPREME_ALLOY_IRIDIUM",
      MaterialCompat.safe(XMaterial.IRON_INGOT), "&aAlloy Iridium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_IRIDIUM = {SlimefunItems.SILVER_DUST.item(), SlimefunItems.BILLON_INGOT.item(),
      SlimefunItems.SILVER_INGOT.item(), null, null, null, null, null, null};

  public static final SlimefunItemStack IRIDIUM_PLATE = new SupremeItemStack("SUPREME_IRIDIUM_PLATE",
      MaterialCompat.safe(XMaterial.IRON_BLOCK), "&aIridium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_IRIDIUM_PLATE = {SupremeComponents.ALLOY_IRIDIUM.item(),
      SupremeComponents.ALLOY_IRIDIUM.item(), SupremeComponents.ALLOY_IRIDIUM.item(), SupremeCoreBlock.RESOURCE_CORE_GRAVEL.item(),
      SupremeCoreBlock.RESOURCE_CORE_GRAVEL.item(), SupremeCoreBlock.RESOURCE_CORE_GRAVEL.item(), SupremeComponents.ALLOY_IRIDIUM.item(),
      SupremeComponents.ALLOY_IRIDIUM.item(), SupremeComponents.ALLOY_IRIDIUM.item()};

  public static final SlimefunItemStack ALLOY_AURUM = new SupremeItemStack("SUPREME_ALLOY_AURUM", MaterialCompat.safe(XMaterial.GOLD_INGOT),
      "&aAlloy Aurum", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_AURUM = {SlimefunItems.GOLD_DUST.item(), SlimefunItems.COBALT_INGOT.item(),
      SlimefunItems.GOLD_24K.item(), null, null, null, null, null, null};

  public static final SlimefunItemStack AURUM_PLATE = new SupremeItemStack("SUPREME_AURUM_PLATE", MaterialCompat.safe(XMaterial.GOLD_BLOCK),
      "&aAurum Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_AURUM_PLATE = {SupremeComponents.ALLOY_AURUM.item(), SupremeComponents.ALLOY_AURUM.item(),
      SupremeComponents.ALLOY_AURUM.item(), SupremeCoreBlock.RESOURCE_CORE_SAND.item(), SupremeCoreBlock.RESOURCE_CORE_SAND.item(),
      SupremeCoreBlock.RESOURCE_CORE_SAND.item(), SupremeComponents.ALLOY_AURUM.item(), SupremeComponents.ALLOY_AURUM.item(),
      SupremeComponents.ALLOY_AURUM.item()};

  public static final SlimefunItemStack ALLOY_MANGANESE = new SupremeItemStack("SUPREME_ALLOY_MANGANESE",
      MaterialCompat.safe(XMaterial.GOLD_INGOT), "&aAlloy Manganese", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_MANGANESE = {SlimefunItems.MAGNESIUM_DUST.item(), SlimefunItems.DURALUMIN_INGOT.item(),
      SlimefunItems.MAGNESIUM_INGOT.item(), null, null, null, null, null, null};

  public static final SlimefunItemStack MANGANESE_PLATE = new SupremeItemStack("SUPREME_MANGANESE_PLATE",
      MaterialCompat.safe(XMaterial.GOLD_BLOCK), "&aManganese Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_MANGANESE_PLATE = {SupremeComponents.ALLOY_MANGANESE.item(),
      SupremeComponents.ALLOY_MANGANESE.item(), SupremeComponents.ALLOY_MANGANESE.item(), SupremeCoreBlock.RESOURCE_CORE_GRANITE.item(),
      SupremeCoreBlock.RESOURCE_CORE_GRANITE.item(), SupremeCoreBlock.RESOURCE_CORE_GRANITE.item(), SupremeComponents.ALLOY_MANGANESE.item(),
      SupremeComponents.ALLOY_MANGANESE.item(), SupremeComponents.ALLOY_MANGANESE.item()};

  public static final SlimefunItemStack ALLOY_PLATINUM = new SupremeItemStack("SUPREME_ALLOY_PLATINUM",
      MaterialCompat.safe(XMaterial.GOLD_INGOT), "&aAlloy Platinum", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_PLATINUM = {SlimefunItems.LEAD_DUST.item(), SlimefunItems.BRASS_INGOT.item(),
      SlimefunItems.LEAD_INGOT.item(), null, null, null, null, null, null};

  public static final SlimefunItemStack PLATINUM_PLATE = new SupremeItemStack("SUPREME_PLATINUM_PLATE",
      MaterialCompat.safe(XMaterial.GOLD_BLOCK), "&aPlatinum Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_PLATINUM_PLATE = {SupremeComponents.ALLOY_PLATINUM.item(),
      SupremeComponents.ALLOY_PLATINUM.item(), SupremeComponents.ALLOY_PLATINUM.item(), SupremeCoreBlock.RESOURCE_CORE_CLAY.item(),
      SupremeCoreBlock.RESOURCE_CORE_CLAY.item(), SupremeCoreBlock.RESOURCE_CORE_CLAY.item(), SupremeComponents.ALLOY_PLATINUM.item(),
      SupremeComponents.ALLOY_PLATINUM.item(), SupremeComponents.ALLOY_PLATINUM.item()};

  public static final SlimefunItemStack ALLOY_ADAMANTIUM = new SupremeItemStack("SUPREME_ALLOY_ADAMANTIUM",
      MaterialCompat.safe(XMaterial.NETHERITE_INGOT), "&aAlloy Adamantium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_ADAMANTIUM = {SlimefunItems.ALUMINUM_DUST.item(),
      SlimefunItems.REINFORCED_ALLOY_INGOT.item(), SlimefunItems.ALUMINUM_INGOT.item(), null, null, null, null, null, null};

  public static final SlimefunItemStack ADAMANTIUM_PLATE = new SupremeItemStack("SUPREME_ADAMANTIUM_PLATE",
      MaterialCompat.safe(XMaterial.NETHERITE_BLOCK), "&aAdamantium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ADAMANTIUM_PLATE = {SupremeComponents.ALLOY_ADAMANTIUM.item(),
      SupremeComponents.ALLOY_ADAMANTIUM.item(), SupremeComponents.ALLOY_ADAMANTIUM.item(), SupremeCoreBlock.RESOURCE_CORE_STONE.item(),
      SupremeCoreBlock.RESOURCE_CORE_STONE.item(), SupremeCoreBlock.RESOURCE_CORE_STONE.item(), SupremeComponents.ALLOY_ADAMANTIUM.item(),
      SupremeComponents.ALLOY_ADAMANTIUM.item(), SupremeComponents.ALLOY_ADAMANTIUM.item()};

  public static final SlimefunItemStack SYNTHETIC_AMETHYST = new SupremeItemStack("SUPREME_SYNTHETIC_AMETHYST",
      MaterialCompat.safe(XMaterial.PURPLE_DYE), "&aSynthetic Amethyst", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_SYNTHETIC_AMETHYST = {SlimefunItems.SYNTHETIC_SAPPHIRE.item(),
      SlimefunItems.MAGIC_LUMP_3.item(), SlimefunItems.SYNTHETIC_SAPPHIRE.item(), SlimefunItems.MAGIC_LUMP_3.item(),
      new ItemStack(MaterialCompat.safe(XMaterial.AMETHYST_SHARD)), SlimefunItems.MAGIC_LUMP_3.item(), SlimefunItems.SYNTHETIC_SAPPHIRE.item(),
      SlimefunItems.MAGIC_LUMP_3.item(), SlimefunItems.SYNTHETIC_SAPPHIRE.item()};

  public static final SlimefunItemStack SYNTHETIC_RUBY = new SupremeItemStack("SUPREME_SYNTHETIC_RUBY",
      MaterialCompat.safe(XMaterial.PINK_DYE), "&aSynthetic Ruby", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_SYNTHETIC_RUBY = {SlimefunItems.SYNTHETIC_EMERALD.item(),
      SlimefunItems.SYNTHETIC_DIAMOND.item(), SlimefunItems.SYNTHETIC_EMERALD.item(), SlimefunItems.SYNTHETIC_DIAMOND.item(),
      SupremeComponents.SYNTHETIC_AMETHYST.item(), SlimefunItems.SYNTHETIC_DIAMOND.item(), SlimefunItems.SYNTHETIC_EMERALD.item(),
      SlimefunItems.SYNTHETIC_DIAMOND.item(), SlimefunItems.SYNTHETIC_EMERALD.item()};

  public static final SlimefunItemStack THORNERITE = new SupremeItemStack("SUPREME_THORNERITE",
      MaterialCompat.safe(XMaterial.NETHERITE_INGOT), "&aThornerite", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNERITE = {SupremeComponents.THORNIUM_INGOT.item(),
      SupremeComponents.ALLOY_ADAMANTIUM.item(), SupremeComponents.ALLOY_IRIDIUM.item(), SupremeComponents.ALLOY_PLATINUM.item(),
      SupremeComponents.ALLOY_TITANIUM.item(), SupremeComponents.ALLOY_ZIRCONIUM.item(), null, null, null};

  public static final SlimefunItemStack INDUCTIVE_MACHINE = new SupremeItemStack("SUPREME_INDUCTIVE_MACHINE",
      MaterialCompat.safe(XMaterial.DEAD_FIRE_CORAL_BLOCK), "&aInductive Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_INDUCTIVE_MACHINE = {SlimefunItems.REDSTONE_ALLOY.item(),
      SupremeComponents.ALLOY_PLATINUM.item(), SlimefunItems.REDSTONE_ALLOY.item(), SupremeComponents.ALLOY_IRIDIUM.item(),
      SlimefunItems.ELECTRO_MAGNET.item(), SupremeComponents.ALLOY_IRIDIUM.item(), SlimefunItems.REDSTONE_ALLOY.item(),
      SupremeComponents.ALLOY_PLATINUM.item(), SlimefunItems.REDSTONE_ALLOY.item()};

  public static final SlimefunItemStack INDUCTOR_MACHINE = new SupremeItemStack("SUPREME_INDUCTOR_MACHINE",
      MaterialCompat.safe(XMaterial.FIRE_CORAL_BLOCK), "&aInductor Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_INDUCTOR_MACHINE = {SlimefunItems.REDSTONE_ALLOY.item(),
      SupremeComponents.PLATINUM_PLATE.item(), SlimefunItems.REDSTONE_ALLOY.item(), SupremeComponents.IRIDIUM_PLATE.item(),
      SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.IRIDIUM_PLATE.item(), SlimefunItems.REDSTONE_ALLOY.item(),
      SupremeComponents.PLATINUM_PLATE.item(), SlimefunItems.REDSTONE_ALLOY.item()};

  public static final SlimefunItemStack RUSTLESS_MACHINE = new SupremeItemStack("SUPREME_RUSTLESS_MACHINE",
      MaterialCompat.safe(XMaterial.DEAD_BRAIN_CORAL_BLOCK), "&aRustless Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_RUSTLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT.item(),
      SupremeComponents.ALLOY_ZIRCONIUM.item(), SlimefunItems.HARDENED_METAL_INGOT.item(), SupremeComponents.ALLOY_MANGANESE.item(),
      SlimefunItems.ELECTRO_MAGNET.item(), SupremeComponents.ALLOY_MANGANESE.item(), SlimefunItems.HARDENED_METAL_INGOT.item(),
      SupremeComponents.ALLOY_ZIRCONIUM.item(), SlimefunItems.HARDENED_METAL_INGOT.item()};

  public static final SlimefunItemStack STAINLESS_MACHINE = new SupremeItemStack("SUPREME_STAINLESS_MACHINE",
      MaterialCompat.safe(XMaterial.BRAIN_CORAL_BLOCK), "&aStainless Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_STAINLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT.item(),
      SupremeComponents.ZIRCONIUM_PLATE.item(), SlimefunItems.HARDENED_METAL_INGOT.item(), SupremeComponents.MANGANESE_PLATE.item(),
      SupremeComponents.RUSTLESS_MACHINE.item(), SupremeComponents.MANGANESE_PLATE.item(), SlimefunItems.HARDENED_METAL_INGOT.item(),
      SupremeComponents.ZIRCONIUM_PLATE.item(), SlimefunItems.HARDENED_METAL_INGOT.item()};

  public static final SlimefunItemStack CARRIAGE_MACHINE = new SupremeItemStack("SUPREME_CARRIAGE_MACHINE",
      MaterialCompat.safe(XMaterial.DEAD_HORN_CORAL_BLOCK), "&aCarriage Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_CARRIAGE_MACHINE = {SlimefunItems.GILDED_IRON.item(), SupremeComponents.ALLOY_AURUM.item(),
      SlimefunItems.GILDED_IRON.item(), SupremeComponents.ALLOY_TITANIUM.item(), SlimefunItems.ELECTRO_MAGNET.item(),
      SupremeComponents.ALLOY_TITANIUM.item(), SlimefunItems.GILDED_IRON.item(), SupremeComponents.ALLOY_AURUM.item(),
      SlimefunItems.GILDED_IRON.item()};

  public static final SlimefunItemStack CONVEYANCE_MACHINE = new SupremeItemStack("SUPREME_CONVEYANCE_MACHINE",
      MaterialCompat.safe(XMaterial.HORN_CORAL_BLOCK), "&aConveyance Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_CONVEYANCE_MACHINE = {SlimefunItems.GILDED_IRON.item(), SupremeComponents.AURUM_PLATE.item(),
      SlimefunItems.GILDED_IRON.item(), SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.CARRIAGE_MACHINE.item(),
      SupremeComponents.TITANIUM_PLATE.item(), SlimefunItems.GILDED_IRON.item(), SupremeComponents.AURUM_PLATE.item(),
      SlimefunItems.GILDED_IRON.item()};

  public static final SlimefunItemStack PETRIFIER_MACHINE = new SupremeItemStack("SUPREME_PETRIFIER_MACHINE",
      MaterialCompat.safe(XMaterial.DEAD_TUBE_CORAL_BLOCK), "&aPetrifier Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_PETRIFIER_MACHINE = {SupremeCoreAlloy.RESOURCE_CORE_COAL.item(),
      SupremeComponents.RUSTLESS_MACHINE.item(), SupremeCoreAlloy.RESOURCE_CORE_COAL.item(), SupremeComponents.ALLOY_ADAMANTIUM.item(),
      SupremeComponents.CARRIAGE_MACHINE.item(), SupremeComponents.ALLOY_ADAMANTIUM.item(), SupremeCoreBlock.RESOURCE_CORE_STONE.item(),
      SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeCoreBlock.RESOURCE_CORE_STONE.item()};

  public static final SlimefunItemStack CRYSTALLIZER_MACHINE = new SupremeItemStack("SUPREME_CRYSTALLIZER_MACHINE",
      MaterialCompat.safe(XMaterial.TUBE_CORAL_BLOCK), "&aCrystallizer Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_CRYSTALLIZER_MACHINE = {SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.item(),
      STAINLESS_MACHINE.item(), SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.item(), SupremeComponents.SYNTHETIC_RUBY.item(),
      SupremeComponents.PETRIFIER_MACHINE.item(), SupremeComponents.SYNTHETIC_RUBY.item(), SupremeCoreAlloy.RESOURCE_CORE_EMERALD.item(),
      SupremeComponents.INDUCTOR_MACHINE.item(), SupremeCoreAlloy.RESOURCE_CORE_EMERALD.item()};

  public static final SlimefunItemStack BLEND_MACHINE = new SupremeItemStack("SUPREME_BLEND_MACHINE",
      MaterialCompat.safe(XMaterial.BUBBLE_CORAL_BLOCK), "&aBlend Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_BLEND_MACHINE = {SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeComponents.CRYSTALLIZER_MACHINE.item(), SupremeCoreAlloy.RESOURCE_CORE_EMERALD.item(),
      SupremeComponents.CRYSTALLIZER_MACHINE.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE.item(), SupremeComponents.CONVEYANCE_MACHINE.item()};

  public static final SlimefunItemStack CENTER_CARD_SIMPLE = new SupremeItemStack("SUPREME_CENTER_CARD_SIMPLE",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_11), "&aBasic Component for Card", "", "&fComponent for Machine to produce items", "",
      "&3Supreme Component");
  public static final ItemStack[] RECIPE_CENTER_CARD_SIMPLE = new ItemStack[]{SlimefunItems.BASIC_CIRCUIT_BOARD.item(),
      SlimefunItems.ELECTRO_MAGNET.item(), SlimefunItems.BASIC_CIRCUIT_BOARD.item(), SlimefunItems.ADVANCED_CIRCUIT_BOARD.item(),
      SupremeComponents.SYNTHETIC_AMETHYST.item(), SlimefunItems.ADVANCED_CIRCUIT_BOARD.item(), SlimefunItems.BASIC_CIRCUIT_BOARD.item(),
      SlimefunItems.ELECTRO_MAGNET.item(), SlimefunItems.BASIC_CIRCUIT_BOARD.item()};

  public static final SlimefunItemStack CENTER_CARD_ADVANCED = new SupremeItemStack("SUPREME_CENTER_CARD_ADVANCED",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_PIGSTEP), "&aAdvanced Component for Card", "", "&fComponent for Machine to produce items", "",
      "&3Supreme Component");
  public static final ItemStack[] RECIPE_CENTER_CARD_ADVANCED = new ItemStack[]{SlimefunItems.ADVANCED_CIRCUIT_BOARD.item(),
      SupremeComponents.CENTER_CARD_SIMPLE.item(), SlimefunItems.ADVANCED_CIRCUIT_BOARD.item(), SupremeComponents.CENTER_CARD_SIMPLE.item(),
      SupremeComponents.SYNTHETIC_RUBY.item(), SupremeComponents.CENTER_CARD_SIMPLE.item(), SlimefunItems.HEATING_COIL.item(),
      SupremeComponents.CENTER_CARD_SIMPLE.item(), SlimefunItems.HEATING_COIL.item()};

  public static final SlimefunItemStack CENTER_CARD_ULTIMATE = new SupremeItemStack("SUPREME_CENTER_CARD_ULTIMATE",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MALL), "&aUltimate Component for Card", "", "&fComponent for Machine to produce items", "",
      "&3Supreme Component");
  public static final ItemStack[] RECIPE_CENTER_CARD_ULTIMATE = new ItemStack[]{SupremeComponents.SYNTHETIC_RUBY.item(),
      SupremeComponents.CENTER_CARD_ADVANCED.item(), SupremeComponents.SYNTHETIC_RUBY.item(), SupremeComponents.CENTER_CARD_ADVANCED.item(),
      SupremeComponents.PETRIFIER_MACHINE.item(), SupremeComponents.CENTER_CARD_ADVANCED.item(), SlimefunItems.REINFORCED_PLATE.item(),
      SupremeComponents.CENTER_CARD_ADVANCED.item(), SlimefunItems.REINFORCED_PLATE.item()};

  public static final SlimefunItemStack DUST_NETHERITE = new SupremeItemStack("SUPREME_DUST_NETHERITE",
      MaterialCompat.safe(XMaterial.MELON_SEEDS), "&aNetherite Dust", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_DUST_NETHERITE = new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.NETHERITE_INGOT)), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack DUST_GLOW_INK = new SupremeItemStack("SUPREME_DUST_GLOW_INK",
      MaterialCompat.safe(XMaterial.PUMPKIN_SEEDS), "&aGlow Ink Dust", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_DUST_GLOW_INK = new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.GLOW_INK_SAC)), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack DUST_AMETHYST = new SupremeItemStack("SUPREME_DUST_AMETHYST",
      MaterialCompat.safe(XMaterial.BEETROOT_SEEDS), "&aAmethyst Dust", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_DUST_AMETHYST = new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.AMETHYST_SHARD)), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack EMPTY_MOBTECH = new SupremeItemStack("SUPREME_EMPTY_MOBTECH",
      MaterialCompat.safe(XMaterial.FIRE_CHARGE), "&aEmpty MobTech", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_EMPTY_MOBTECH = new ItemStack[]{SlimefunItems.MAGIC_LUMP_2.item(),
      SlimefunItems.STONE_CHUNK.item(), SlimefunItems.ENDER_LUMP_2.item(), null, null, null, null, null, null};

  public static final SlimefunItemStack GENE_BERSERK = new SupremeItemStack("SUPREME_GENE_BERSERK", MaterialCompat.safe(XMaterial.FIRE_CORAL),
      "&aBerserk Gene", "", "&3Supreme Component");

  public static final SlimefunItemStack GENE_INTELLIGENCE = new SupremeItemStack("SUPREME_GENE_INTELLIGENCE",
      MaterialCompat.safe(XMaterial.TUBE_CORAL), "&fIntelligence Gene", "", "&3Supreme Component");

  public static final SlimefunItemStack GENE_LUCK = new SupremeItemStack("SUPREME_GENE_LUCK", MaterialCompat.safe(XMaterial.HORN_CORAL),
      "&aLuck Gene", "", "&3Supreme Component");

}
