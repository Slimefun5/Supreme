package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeQuarry {


  public static final SlimefunItemStack STONE_QUARRY = new SupremeItemStack("SUPREME_STONE_QUARRY", "139ac257f4e04adc6ab3e46fd3b28749e866faa9ce6a1d6d526e0e3864d9222");
  public static final ItemStack[] RECIPE_STONE_QUARRY = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE.item(),
      SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), new ItemStack(MaterialCompat.safe(XMaterial.DIAMOND_PICKAXE)),
      SlimefunItems.PROGRAMMABLE_ANDROID_MINER.item(), new ItemStack(MaterialCompat.safe(XMaterial.DIAMOND_PICKAXE)),
      SupremeComponents.ADAMANTIUM_PLATE.item(), SlimefunItems.COAL_GENERATOR.item(), SupremeComponents.ADAMANTIUM_PLATE.item()};

  public static final SlimefunItemStack COAL_QUARRY = new SupremeItemStack("SUPREME_COAL_QUARRY", "579ee734b739c0d19546d5b4b049c01a055506cc00b0cfcbf177883d2c814c04");
  public static final ItemStack[] RECIPE_COAL_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_IGNIS.item(),
      SupremeComponents.ALLOY_PLATINUM.item(), SupremeCetrus.CETRUS_IGNIS.item(), new ItemStack(MaterialCompat.safe(XMaterial.DIAMOND_PICKAXE)),
      SupremeQuarry.STONE_QUARRY.item(), new ItemStack(MaterialCompat.safe(XMaterial.DIAMOND_PICKAXE)), SlimefunItems.COAL_GENERATOR.item(),
      SlimefunItems.GEO_MINER.item(), SlimefunItems.LARGE_CAPACITOR.item()};

  public static final SlimefunItemStack IRON_QUARRY = new SupremeItemStack("SUPREME_IRON_QUARRY", "f8eecae423359d3f5efd1063a9a7bcfaa43839d75d3b223c808df7961dd173d0");
  public static final ItemStack[] RECIPE_IRON_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_VENTUS.item(),
      SupremeComponents.ALLOY_IRIDIUM.item(), SupremeCetrus.CETRUS_VENTUS.item(), SupremeComponents.STAINLESS_MACHINE.item(),
      SupremeQuarry.COAL_QUARRY.item(), SupremeComponents.STAINLESS_MACHINE.item(), SlimefunItems.ELECTRO_MAGNET.item(),
      SlimefunItems.IRON_GOLEM_ASSEMBLER.item(), SlimefunItems.ELECTRO_MAGNET.item()};

  public static final SlimefunItemStack GOLD_QUARRY = new SupremeItemStack("SUPREME_GOLD_QUARRY", "6c07d48fd8764bc8d01a10cc6426578862090d9e856f3a8dd7f974a7521efc43");
  public static final ItemStack[] RECIPE_GOLD_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUX.item(),
      SupremeComponents.ALLOY_AURUM.item(), SupremeCetrus.CETRUS_LUX.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeQuarry.IRON_QUARRY.item(), SupremeComponents.CONVEYANCE_MACHINE.item(), SlimefunItems.ELECTRO_MAGNET.item(),
      SlimefunItems.ELECTRIC_SMELTERY.item(), SlimefunItems.ELECTRO_MAGNET.item()};

  public static final SlimefunItemStack DIAMOND_QUARRY = new SupremeItemStack("SUPREME_DIAMOND_QUARRY", "666070ce03a545ee4d263bcf27f36338d249d7cb7a2376f92c1673ae134e04b6");
  public static final ItemStack[] RECIPE_DIAMOND_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_AQUA.item(),
      SupremeComponents.ALLOY_TITANIUM.item(), SupremeCetrus.CETRUS_AQUA.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeQuarry.GOLD_QUARRY.item(), SupremeComponents.INDUCTOR_MACHINE.item(), SlimefunItems.ELECTRIC_MOTOR.item(),
      SlimefunItems.HEATED_PRESSURE_CHAMBER.item(), SlimefunItems.ELECTRIC_MOTOR.item()};

  public static final SlimefunItemStack THORNIUM_QUARRY = new SupremeItemStack("SUPREME_THORNIUM_QUARRY", "6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0");
  public static final ItemStack[] RECIPE_THORNIUM_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUMIUM.item(),
      SupremeComponents.ALLOY_ADAMANTIUM.item(), SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeQuarry.DIAMOND_QUARRY.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(), SlimefunItems.ELECTRIC_MOTOR.item(),
      SlimefunItems.WITHER_ASSEMBLER.item(), SlimefunItems.ELECTRIC_MOTOR.item()};

  public static final SlimefunItemStack SUPREME_NUGGETS_QUARRY = new SupremeItemStack("SUPREME_SUPREME_NUGGETS_QUARRY", "ec7007d16abcfac9c6830c74d37cfd439a26373457d91452c1a96b8e04a6d");
  public static final ItemStack[] RECIPE_SUPREME_NUGGETS_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUMIUM.item(),
      SupremeComponents.THORNERITE.item(), SupremeCetrus.CETRUS_LUMIUM.item(), SupremeCore.CORE_OF_NATURE.item(),
      SupremeQuarry.THORNIUM_QUARRY.item(), SupremeCore.CORE_OF_BLOCK.item(), SupremeCore.CORE_OF_LIFE.item(), SlimefunItems.NUCLEAR_REACTOR.item(),
      SupremeCore.CORE_OF_DEATH.item()};

}
