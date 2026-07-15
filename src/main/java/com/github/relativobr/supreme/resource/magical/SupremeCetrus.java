package com.github.relativobr.supreme.resource.magical;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeCetrus {

  public static final SlimefunItemStack CETRUS_LUX = new SupremeItemStack("SUPREME_CETRUS_LUX", "92cb6e51c461e7359526bea5e06209cddde7c6469a819f3405cf0a038c159502");
  public static final ItemStack[] RECIPE_CETRUS_LUX = {new ItemStack(MaterialCompat.safe(XMaterial.FLINT), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.GLOWSTONE), 64), new ItemStack(MaterialCompat.safe(XMaterial.TORCH), 64), new ItemStack(MaterialCompat.safe(XMaterial.CAMPFIRE), 64),
      new SlimefunItemStack(SupremeCore.CORE_OF_LIFE, 1).item(), new ItemStack(MaterialCompat.safe(XMaterial.SEA_LANTERN), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.REDSTONE_LAMP), 64), new ItemStack(MaterialCompat.safe(XMaterial.SOUL_CAMPFIRE), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.SHROOMLIGHT), 64)};

  public static final SlimefunItemStack CETRUS_VENTUS = new SupremeItemStack("SUPREME_CETRUS_VENTUS", "b28f1c0c5092e12d33770df45c5845a9610886039b34abe93a16c5e942dfc8e4");
  public static final ItemStack[] RECIPE_CETRUS_VENTUS = {new ItemStack(MaterialCompat.safe(XMaterial.FEATHER), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.LEATHER), 64), new ItemStack(MaterialCompat.safe(XMaterial.CHORUS_FRUIT), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.COBBLESTONE), 64), new SlimefunItemStack(SupremeCore.CORE_OF_NATURE, 1).item(),
      new ItemStack(MaterialCompat.safe(XMaterial.SAND), 64), new ItemStack(MaterialCompat.safe(XMaterial.ARROW), 64), new ItemStack(MaterialCompat.safe(XMaterial.PHANTOM_MEMBRANE), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.ENDER_PEARL), 16)};

  public static final SlimefunItemStack CETRUS_LUMIUM = new SupremeItemStack("SUPREME_CETRUS_LUMIUM", "4b1cce22de19ed6727abc5e6c2d57864c871a44c956bbe2eb3960269b686b8b3");
  public static final ItemStack[] RECIPE_CETRUS_LUMIUM = {new ItemStack(MaterialCompat.safe(XMaterial.DIRT), 64),
      new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1).item(), new ItemStack(MaterialCompat.safe(XMaterial.GRASS_BLOCK), 64),
      new SlimefunItemStack(SupremeCore.CORE_OF_LIFE, 1).item(), new ItemStack(MaterialCompat.safe(XMaterial.OBSIDIAN), 64),
      new SlimefunItemStack(SupremeCore.CORE_OF_DEATH, 1).item(), new ItemStack(MaterialCompat.safe(XMaterial.WITHER_SKELETON_SKULL), 64),
      new SlimefunItemStack(SupremeCore.CORE_OF_ALLOY, 1).item(), new ItemStack(MaterialCompat.safe(XMaterial.NETHER_STAR), 64)};

  public static final SlimefunItemStack CETRUS_AQUA = new SupremeItemStack("SUPREME_CETRUS_AQUA", "36161daa3589ec9c8187459ac36fd4dd2646c040678d3bfacb72a2210c6c801c");
  public static final ItemStack[] RECIPE_CETRUS_AQUA = {new ItemStack(MaterialCompat.safe(XMaterial.ICE), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.LILY_PAD), 64), new ItemStack(MaterialCompat.safe(XMaterial.SALMON), 64), new ItemStack(MaterialCompat.safe(XMaterial.COD), 64),
      new SlimefunItemStack(SupremeCore.CORE_OF_DEATH, 1).item(), new ItemStack(MaterialCompat.safe(XMaterial.TROPICAL_FISH), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.PUFFERFISH), 64), new ItemStack(MaterialCompat.safe(XMaterial.NAUTILUS_SHELL), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.WATER_BUCKET), 1)};

  public static final SlimefunItemStack CETRUS_IGNIS = new SupremeItemStack("SUPREME_CETRUS_IGNIS", "e672959028f274b379d430f068f0f15a4f793eac12afb94ae0b4e50cf895df0f");
  public static final ItemStack[] RECIPE_CETRUS_IGNIS = {new ItemStack(MaterialCompat.safe(XMaterial.NETHERRACK), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_ROD), 64), new ItemStack(MaterialCompat.safe(XMaterial.SOUL_SAND), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.QUARTZ_BLOCK), 64), new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1).item(),
      new ItemStack(MaterialCompat.safe(XMaterial.MAGMA_CREAM), 64), new ItemStack(MaterialCompat.safe(XMaterial.GUNPOWDER), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.OBSIDIAN), 64), new ItemStack(MaterialCompat.safe(XMaterial.LAVA_BUCKET), 1)};
}
