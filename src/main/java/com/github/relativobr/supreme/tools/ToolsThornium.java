package com.github.relativobr.supreme.tools;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class ToolsThornium {

  public static final SlimefunItemStack THORNIUM_AXE = new SupremeItemStack("SUPREME_AXE_THORNIUM",
      MaterialCompat.safe(XMaterial.NETHERITE_AXE));
  public static final ItemStack[] RECIPE_THORNIUM_AXE = {SupremeComponents.THORNIUM_INGOT.item(), SupremeCetrus.CETRUS_VENTUS.item(),
      null, SupremeComponents.THORNIUM_INGOT.item(), SlimefunItems.STAFF_ELEMENTAL.item(), null, null, SlimefunItems.STAFF_ELEMENTAL.item(),
      null};

  public static final SlimefunItemStack THORNIUM_AXE_MAGIC = new SupremeItemStack("SUPREME_AXE_MAGIC",
      MaterialCompat.safe(XMaterial.NETHERITE_AXE));

  public static final SlimefunItemStack THORNIUM_AXE_RARE = new SupremeItemStack("SUPREME_AXE_RARE",
      MaterialCompat.safe(XMaterial.NETHERITE_AXE));

  public static final SlimefunItemStack THORNIUM_AXE_EPIC = new SupremeItemStack("SUPREME_AXE_EPIC",
      MaterialCompat.safe(XMaterial.NETHERITE_AXE));

  public static final SlimefunItemStack THORNIUM_AXE_LEGENDARY = new SupremeItemStack("SUPREME_AXE_LEGENDARY",
      MaterialCompat.safe(XMaterial.NETHERITE_AXE));

  public static final SlimefunItemStack THORNIUM_AXE_SUPREME = new SupremeItemStack("SUPREME_AXE_SUPREME",
      MaterialCompat.safe(XMaterial.NETHERITE_AXE));

  public static final SlimefunItemStack THORNIUM_PICKAXE = new SupremeItemStack("SUPREME_PICKAXE_THORNIUM",
      MaterialCompat.safe(XMaterial.NETHERITE_PICKAXE));
  public static final ItemStack[] RECIPE_THORNIUM_PICKAXE = {SupremeComponents.THORNIUM_INGOT.item(),
      SupremeCetrus.CETRUS_IGNIS.item(), SupremeComponents.THORNIUM_INGOT.item(), null, SlimefunItems.STAFF_ELEMENTAL.item(), null, null,
      SlimefunItems.STAFF_ELEMENTAL.item(), null};

  public static final SlimefunItemStack THORNIUM_PICKAXE_MAGIC = new SupremeItemStack("SUPREME_PICKAXE_MAGIC",
      MaterialCompat.safe(XMaterial.NETHERITE_PICKAXE));

  public static final SlimefunItemStack THORNIUM_PICKAXE_RARE = new SupremeItemStack("SUPREME_PICKAXE_RARE",
      MaterialCompat.safe(XMaterial.NETHERITE_PICKAXE));

  public static final SlimefunItemStack THORNIUM_PICKAXE_EPIC = new SupremeItemStack("SUPREME_PICKAXE_EPIC",
      MaterialCompat.safe(XMaterial.NETHERITE_PICKAXE));

  public static final SlimefunItemStack THORNIUM_PICKAXE_LEGENDARY = new SupremeItemStack("SUPREME_PICKAXE_LEGENDARY",
      MaterialCompat.safe(XMaterial.NETHERITE_PICKAXE));

  public static final SlimefunItemStack THORNIUM_PICKAXE_SUPREME = new SupremeItemStack("SUPREME_PICKAXE_SUPREME",
      MaterialCompat.safe(XMaterial.NETHERITE_PICKAXE));

  public static final SlimefunItemStack THORNIUM_SHOVEL = new SupremeItemStack("SUPREME_SHOVEL_THORNIUM",
      MaterialCompat.safe(XMaterial.NETHERITE_SHOVEL));
  public static final ItemStack[] RECIPE_THORNIUM_SHOVEL = {null, SupremeComponents.THORNIUM_INGOT.item(), null, null,
      SupremeCetrus.CETRUS_AQUA.item(), null, null, SlimefunItems.STAFF_ELEMENTAL.item(), null};

  public static final SlimefunItemStack THORNIUM_SHOVEL_MAGIC = new SupremeItemStack("SUPREME_SHOVEL_MAGIC",
      MaterialCompat.safe(XMaterial.NETHERITE_SHOVEL));

  public static final SlimefunItemStack THORNIUM_SHOVEL_RARE = new SupremeItemStack("SUPREME_SHOVEL_RARE",
      MaterialCompat.safe(XMaterial.NETHERITE_SHOVEL));

  public static final SlimefunItemStack THORNIUM_SHOVEL_EPIC = new SupremeItemStack("SUPREME_SHOVEL_EPIC",
      MaterialCompat.safe(XMaterial.NETHERITE_SHOVEL));

  public static final SlimefunItemStack THORNIUM_SHOVEL_LEGENDARY = new SupremeItemStack("SUPREME_SHOVEL_LEGENDARY",
      MaterialCompat.safe(XMaterial.NETHERITE_SHOVEL));

  public static final SlimefunItemStack THORNIUM_SHOVEL_SUPREME = new SupremeItemStack("SUPREME_SHOVEL_SUPREME",
      MaterialCompat.safe(XMaterial.NETHERITE_SHOVEL));
}
