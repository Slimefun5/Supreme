package com.github.relativobr.supreme.util;

import static com.github.relativobr.supreme.resource.SupremeComponents.SUPREME;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_BIT_SYNTHETIC;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_CARBONADO;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_DUST_SYNTHETIC;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_ENERGIZED;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_INGOT_SYNTHETIC;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_IGNIS;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_LUMIUM;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_LUX;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_VENTUS;

import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemTier {

  public static ItemStack[] getMagicRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_BIT_SYNTHETIC.item(), preItem.item(), THORNIUM_BIT_SYNTHETIC.item(),
        THORNIUM_BIT_SYNTHETIC.item(), CETRUS_IGNIS.item(), THORNIUM_BIT_SYNTHETIC.item(),
				THORNIUM_BIT_SYNTHETIC.item(), preItem.item(), THORNIUM_BIT_SYNTHETIC.item()};
  }

  public static ItemStack[] getRareRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_DUST_SYNTHETIC.item(), preItem.item(), THORNIUM_DUST_SYNTHETIC.item(),
				THORNIUM_DUST_SYNTHETIC.item(), CETRUS_VENTUS.item(), THORNIUM_DUST_SYNTHETIC.item(),
        THORNIUM_DUST_SYNTHETIC.item(), preItem.item(), THORNIUM_DUST_SYNTHETIC.item()};
  }

  public static ItemStack[] getEpicRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_INGOT_SYNTHETIC.item(), preItem.item(), THORNIUM_INGOT_SYNTHETIC.item(),
				THORNIUM_INGOT_SYNTHETIC.item(), CETRUS_LUX.item(), THORNIUM_INGOT_SYNTHETIC.item(),
        THORNIUM_INGOT_SYNTHETIC.item(), preItem.item(), THORNIUM_INGOT_SYNTHETIC.item()};
  }

  public static ItemStack[] getLegendaryRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_CARBONADO.item(), preItem.item(), THORNIUM_CARBONADO.item(),
        THORNIUM_CARBONADO.item(), CETRUS_LUMIUM.item(), THORNIUM_CARBONADO.item(),
				THORNIUM_CARBONADO.item(), preItem.item(), THORNIUM_CARBONADO.item()};
  }

  public static ItemStack[] getSupremeRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_ENERGIZED.item(), preItem.item(), THORNIUM_ENERGIZED.item(),
        THORNIUM_ENERGIZED.item(), SUPREME.item(), THORNIUM_ENERGIZED.item(),
        THORNIUM_ENERGIZED.item(), preItem.item(), THORNIUM_ENERGIZED.item()};
  }

}