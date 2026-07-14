package com.github.relativobr.supreme.tools;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class ToolsBasic {

  public static final SlimefunItemStack ADAMANTIUM_AXE = new SupremeItemStack("SUPREME_ADAMANTIUM_AXE",
      MaterialCompat.safe(XMaterial.DIAMOND_AXE));
  public static final ItemStack[] RECIPE_ADAMANTIUM_AXE = {SupremeComponents.ADAMANTIUM_PLATE.item(),
      SupremeComponents.ADAMANTIUM_PLATE.item(), null, SupremeComponents.ADAMANTIUM_PLATE.item(), new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null,
      null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null};

  public static final SlimefunItemStack AURUM_AXE = new SupremeItemStack("SUPREME_AURUM_AXE", MaterialCompat.safe(XMaterial.DIAMOND_AXE));
  public static final ItemStack[] RECIPE_AURUM_AXE = {SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(),
      null, SupremeComponents.AURUM_PLATE.item(), new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null, null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)),
      null};

  public static final SlimefunItemStack TITANIUM_AXE = new SupremeItemStack("SUPREME_TITANIUM_AXE",
      MaterialCompat.safe(XMaterial.DIAMOND_AXE));
  public static final ItemStack[] RECIPE_TITANIUM_AXE = {SupremeComponents.TITANIUM_PLATE.item(),
      SupremeComponents.TITANIUM_PLATE.item(), null, SupremeComponents.TITANIUM_PLATE.item(), new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null,
      null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null};

  public static final SlimefunItemStack ADAMANTIUM_PICKAXE = new SupremeItemStack("SUPREME_ADAMANTIUM_PICKAXE",
      MaterialCompat.safe(XMaterial.DIAMOND_PICKAXE));
  public static final ItemStack[] RECIPE_ADAMANTIUM_PICKAXE = {SupremeComponents.ADAMANTIUM_PLATE.item(),
      SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null,
      null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null};

  public static final SlimefunItemStack AURUM_PICKAXE = new SupremeItemStack("SUPREME_AURUM_PICKAXE",
      MaterialCompat.safe(XMaterial.DIAMOND_PICKAXE));
  public static final ItemStack[] RECIPE_AURUM_PICKAXE = {SupremeComponents.AURUM_PLATE.item(), SupremeComponents.AURUM_PLATE.item(),
      SupremeComponents.AURUM_PLATE.item(), null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null, null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)),
      null};

  public static final SlimefunItemStack TITANIUM_PICKAXE = new SupremeItemStack("SUPREME_TITANIUM_PICKAXE",
      MaterialCompat.safe(XMaterial.DIAMOND_PICKAXE));
  public static final ItemStack[] RECIPE_TITANIUM_PICKAXE = {SupremeComponents.TITANIUM_PLATE.item(),
      SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.TITANIUM_PLATE.item(), null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null,
      null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null};

  public static final SlimefunItemStack ADAMANTIUM_SHOVEL = new SupremeItemStack("SUPREME_ADAMANTIUM_SHOVEL",
      MaterialCompat.safe(XMaterial.DIAMOND_SHOVEL));
  public static final ItemStack[] RECIPE_ADAMANTIUM_SHOVEL = {null, SupremeComponents.ADAMANTIUM_PLATE.item(), null, null,
      new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null, null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null};

  public static final SlimefunItemStack AURUM_SHOVEL = new SupremeItemStack("SUPREME_AURUM_SHOVEL",
      MaterialCompat.safe(XMaterial.DIAMOND_SHOVEL));
  public static final ItemStack[] RECIPE_AURUM_SHOVEL = {null, SupremeComponents.AURUM_PLATE.item(), null, null,
      new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null, null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null};

  public static final SlimefunItemStack TITANIUM_SHOVEL = new SupremeItemStack("SUPREME_TITANIUM_SHOVEL",
      MaterialCompat.safe(XMaterial.DIAMOND_SHOVEL));
  public static final ItemStack[] RECIPE_TITANIUM_SHOVEL = {null, SupremeComponents.TITANIUM_PLATE.item(), null, null,
      new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null, null, new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null};
}
