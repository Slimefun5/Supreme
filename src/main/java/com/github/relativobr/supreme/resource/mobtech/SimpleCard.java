package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SimpleCard {

  /**
   * MUSIC_DISC_STRAD       1 branco MUSIC_DISC_13          2 amarelo/branco MUSIC_DISC_MELLOHI     3 rosa/branco
   * MUSIC_DISC_FAR         4 verdeclaro MUSIC_DISC_CAT         5 verde MUSIC_DISC_WARD        6 verde/verdeclaro
   * MUSIC_DISC_WAIT        7 azul
   */

  // cards basicos
  public static final SlimefunItemStack CARD_STONE = new SupremeItemStack("SUPREME_CARD_STONE",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD), "&bCard Machine Stone", "", "&fChange to Production Stone", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_GRANITE = new SupremeItemStack("SUPREME_CARD_GRANITE",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD), "&bCard Machine Granite", "", "&fChange to Production Granite", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_DIORITE = new SupremeItemStack("SUPREME_CARD_DIORITE",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD), "&bCard Machine Diorite", "", "&fChange to Production Diorite", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_ANDESITE = new SupremeItemStack("SUPREME_CARD_ANDESITE",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD), "&bCard Machine Andesite", "", "&fChange to Production Andesite", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_GRAVEL = new SupremeItemStack("SUPREME_CARD_GRAVEL",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD), "&bCard Machine Gravel", "", "&fChange to Production Gravel", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_SAND = new SupremeItemStack("SUPREME_CARD_SAND", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
      "&bCard Machine Sand", "", "&fChange to Production Sand", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_ENDSTONE = new SupremeItemStack("SUPREME_CARD_ENDSTONE",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD), "&bCard Machine Endstone", "", "&fChange to Production Endstone", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_CLAY = new SupremeItemStack("SUPREME_CARD_CLAY", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
      "&bCard Machine Clay", "", "&fChange to Production Clay", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_SNOW = new SupremeItemStack("SUPREME_CARD_SNOW", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
      "&bCard Machine Snow", "", "&fChange to Production Snow", "",
      "", "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_APPLE = new SupremeItemStack("SUPREME_CARD_APPLE", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
      "&bCard Machine Apple", "", "&fChange to Production Apple", "",
      "", "", "&3Supreme Component");
  
  public static final SlimefunItemStack CARD_NETHER_STAR = new SupremeItemStack("SUPREME_CARD_NETHER_STAR", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
          "&bCard Machine Nether Star", "", "&fChange to Production Nether Star", "",
          "", "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_WITHER_ROSE = new SupremeItemStack("SUPREME_CARD_WITHER_ROSE", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
          "&bCard Machine Wither Rose", "", "&fChange to Production Wither Rose", "",
          "", "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_SLIME_BALL = new SupremeItemStack("SUPREME_CARD_SLIME_BALL", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
          "&bCard Machine Slime Ball", "", "&fChange to Production Slime Ball", "",
          "", "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_INK_SAC = new SupremeItemStack("SUPREME_CARD_INK_SAC", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
          "&bCard Machine Ink Sac", "", "&fChange to Production Ink Sac", "",
          "", "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_GLOW_INK_SAC = new SupremeItemStack("SUPREME_CARD_GLOW_INK_SAC", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
          "&bCard Machine Glow Ink Sac", "", "&fChange to Production Glow Ink Sac", "",
          "", "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_HONEY_BOTTLE = new SupremeItemStack("SUPREME_CARD_HONEY_BOTTLE", MaterialCompat.safe(XMaterial.MUSIC_DISC_STRAD),
          "&bCard Machine Honey Bottle", "", "&fChange to Production Honey Bottle", "",
          "", "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_COAL = new SupremeItemStack("SUPREME_CARD_COAL", MaterialCompat.safe(XMaterial.MUSIC_DISC_13),
      "&bCard Machine Coal", "", "&fChange to Production Coal", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_IRON = new SupremeItemStack("SUPREME_CARD_IRON", MaterialCompat.safe(XMaterial.MUSIC_DISC_13),
      "&bCard Machine Iron", "", "&fChange to Production Iron", "",
      "", "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_COPPER = new SupremeItemStack("SUPREME_CARD_COPPER",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_13), "&bCard Machine Copper", "", "&fChange to Production Copper", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_GOLD = new SupremeItemStack("SUPREME_CARD_GOLD", MaterialCompat.safe(XMaterial.MUSIC_DISC_13),
      "&bCard Machine Gold", "", "&fChange to Production Gold", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_QUARTZ = new SupremeItemStack("SUPREME_CARD_QUARTZ",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_13), "&bCard Machine Quartz", "", "&fChange to Production Quartz", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_QUARTZ_BLOCK = new SupremeItemStack("SUPREME_CARD_QUARTZ_BLOCK",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_13), "&bCard Machine Quartz Block", "", "&fChange to Production Quartz Block", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_LAPIS = new SupremeItemStack("SUPREME_CARD_LAPIS", MaterialCompat.safe(XMaterial.MUSIC_DISC_13),
      "&bCard Machine Lapiz", "", "&fChange to Production Lapiz", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_REDSTONE = new SupremeItemStack("SUPREME_CARD_REDSTONE",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_13), "&bCard Machine Redstone", "", "&fChange to Production Redstone", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_DIAMOND = new SupremeItemStack("SUPREME_CARD_DIAMOND",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_FAR), "&bCard Machine Diamond", "", "&fChange to Production Diamond", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_EMERALD = new SupremeItemStack("SUPREME_CARD_EMERALD",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_FAR), "&bCard Machine Emerald", "", "&fChange to Production Emerald", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_BLAZE_ROD = new SupremeItemStack("SUPREME_CARD_BLAZE_ROD",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_FAR), "&bCard Machine Blaze Rod", "", "&fChange to Production Blaze Rod", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_NETHERITE = new SupremeItemStack("SUPREME_CARD_NETHERITE",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_FAR), "&bCard Machine Netherite", "", "&fChange to Production Netherite", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_AMETHYST = new SupremeItemStack("SUPREME_CARD_AMETHYST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_FAR), "&bCard Machine Ametista", "", "&fChange to Production Ametista", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_IRON_DUST = new SupremeItemStack("SUPREME_CARD_IRON_DUST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MELLOHI), "&bCard Machine Iron Dust", "", "&fChange to Production Iron Dust", "",
      "", "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_LEAD_DUST = new SupremeItemStack("SUPREME_CARD_LEAD_DUST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MELLOHI), "&bCard Machine Lead Dust", "", "&fChange to Production Lead Dust", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_GOLD_DUST = new SupremeItemStack("SUPREME_CARD_GOLD_DUST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MELLOHI), "&bCard Machine Gold Dust", "", "&fChange to Production Gold Dust", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_COPPER_DUST = new SupremeItemStack("SUPREME_CARD_COPPER_DUST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MELLOHI), "&bCard Machine Copper Dust", "", "&fChange to Production Copper Dust", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_MAGNESIUM_DUST = new SupremeItemStack("SUPREME_CARD_MAGNESIUM_DUST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MELLOHI), "&bCard Machine Magnesium Dust", "", "&fChange to Production Magnesium Dust", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_ALUMINUM_DUST = new SupremeItemStack("SUPREME_CARD_ALUMINUM_DUST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MELLOHI), "&bCard Machine Aluminum Dust", "", "&fChange to Production Aluminum Dust", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_SILVER_DUST = new SupremeItemStack("SUPREME_CARD_SILVER_DUST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MELLOHI), "&bCard Machine Silver Dust", "", "&fChange to Production Silver Dust", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_TIN_DUST = new SupremeItemStack("SUPREME_CARD_TIN_DUST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MELLOHI), "&bCard Machine Tin Dust", "", "&fChange to Production Tin Dust", "",
      "", "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_ZINC_DUST = new SupremeItemStack("SUPREME_CARD_ZINC_DUST",
      MaterialCompat.safe(XMaterial.MUSIC_DISC_MELLOHI), "&bCard Machine Zinc Dust", "", "&fChange to Production Zinc Dust", "",
      "", "", "&3Supreme Component");

}
