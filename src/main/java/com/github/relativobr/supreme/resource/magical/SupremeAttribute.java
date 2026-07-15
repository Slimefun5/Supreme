package com.github.relativobr.supreme.resource.magical;

import com.github.relativobr.supreme.util.CompatUtils;
import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeAttribute {

  public static final SlimefunItemStack ATTRIBUTE_MAGIC = new SupremeItemStack("SUPREME_ATTRIBUTE_MAGIC", "16d1c19b0dabdf7360fbd18df9dfd1c615da2f8d2c84fc4216565d9c5dd");
  public static final ItemStack[] RECIPE_ATTRIBUTE_MAGIC = {new SlimefunItemStack(SupremeCetrus.CETRUS_LUX, 1).item(),
      new SlimefunItemStack(SupremeCetrus.CETRUS_VENTUS, 1).item(), new SlimefunItemStack(SupremeCetrus.CETRUS_LUX, 1).item(),
      new SlimefunItemStack(SupremeCetrus.CETRUS_AQUA, 1).item(), new ItemStack(MaterialCompat.safe(XMaterial.NETHER_WART), 64),
      new SlimefunItemStack(SupremeCetrus.CETRUS_AQUA, 1).item(), new SlimefunItemStack(SupremeCore.CORE_OF_LIFE, 1).item(),
      new SlimefunItemStack(SupremeCetrus.CETRUS_VENTUS, 1).item(), new SlimefunItemStack(SupremeCore.CORE_OF_NATURE, 1).item()};

  public static final SlimefunItemStack ATTRIBUTE_BOMB = new SupremeItemStack("SUPREME_ATTRIBUTE_BOMB", "44253275e1b7757130a2d637d07f522fcc6686dc804346f0e71668d5ce6d5891");
  public static final ItemStack[] RECIPE_ATTRIBUTE_BOMB = {new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1).item(),
      new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1).item(), new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1).item(),
      new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1).item(), new ItemStack(MaterialCompat.safe(XMaterial.GUNPOWDER), 64),
      new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1).item(), new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1).item(),
      new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1).item(), new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1).item()};

  public static final SlimefunItemStack ATTRIBUTE_FORTUNE = new SupremeItemStack("SUPREME_ATTRIBUTE_FORTUNE", "81251d814bdea8fc4881aeb6e7d1f48a2edf9cdba9ab4e3fa7f7359c5b92");
  public static final ItemStack[] RECIPE_ATTRIBUTE_FORTUNE = {new ItemStack(MaterialCompat.safe(XMaterial.DIAMOND_BLOCK), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.GOLD_BLOCK), 64), new ItemStack(MaterialCompat.safe(XMaterial.NETHERITE_BLOCK), 64),
      new SlimefunItemStack(SupremeAttribute.getMagic(), 1).item(), new SlimefunItemStack(SupremeCore.CORE_OF_ALLOY, 1).item(),
      new SlimefunItemStack(SupremeAttribute.getMagic(), 1).item(), new ItemStack(MaterialCompat.safe(XMaterial.OBSIDIAN), 64),
      new ItemStack(MaterialCompat.safe(XMaterial.REDSTONE_BLOCK), 64), new ItemStack(MaterialCompat.safe(XMaterial.NETHER_STAR), 64)};

  public static final SlimefunItemStack ATTRIBUTE_IMPETUS = new SupremeItemStack("SUPREME_ATTRIBUTE_IMPETUS", "f2d27936be90709046d9b4eec4e2a67d6ed583e4cf94f53c0569431357423");
  public static final ItemStack[] RECIPE_ATTRIBUTE_IMPETUS = {new SlimefunItemStack(SupremeAttribute.getMagic(), 1).item(),
      new SlimefunItemStack(SupremeAttribute.getBomb(), 1).item(), new SlimefunItemStack(SupremeCetrus.CETRUS_AQUA, 1).item(),
      new SlimefunItemStack(SupremeCore.CORE_OF_DEATH, 1).item(), new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1).item(),
      new SlimefunItemStack(SupremeCore.CORE_OF_DEATH, 1).item(), new SlimefunItemStack(SupremeCetrus.CETRUS_VENTUS, 1).item(),
      new SlimefunItemStack(SupremeAttribute.getFortune(), 1).item(), new SlimefunItemStack(SupremeCetrus.CETRUS_LUMIUM, 1).item()};

  // Enchantments are resolved by name through XSeries (CompatUtils) rather than referenced as raw
  // org.bukkit Enchantment constants: MENDING is 1.9+ (NoSuchFieldError on 1.8.8), and routing every
  // one by name also keeps the addon safe on modern servers where the legacy constant names change.
  public static SlimefunItemStack getMagic() {
    final SlimefunItemStack attributeMagic = SupremeAttribute.ATTRIBUTE_MAGIC;
    CompatUtils.applyEnchantment(attributeMagic, "PROTECTION_ENVIRONMENTAL", getSupremeOptions().isCustomBc() ? 10 : 20);
    CompatUtils.applyEnchantment(attributeMagic, "DURABILITY", getSupremeOptions().isCustomBc() ? 10 : 20);
    CompatUtils.applyEnchantment(attributeMagic, "MENDING", getSupremeOptions().isCustomBc() ? 2 : 10);
    return attributeMagic;
  }

  public static SlimefunItemStack getBomb() {
    final SlimefunItemStack attributeBomb = SupremeAttribute.ATTRIBUTE_BOMB;
    CompatUtils.applyEnchantment(attributeBomb, "PROTECTION_EXPLOSIONS", getSupremeOptions().isCustomBc() ? 10 : 20);
    CompatUtils.applyEnchantment(attributeBomb, "PROTECTION_FIRE", getSupremeOptions().isCustomBc() ? 10 : 20);
    CompatUtils.applyEnchantment(attributeBomb, "PROTECTION_PROJECTILE", getSupremeOptions().isCustomBc() ? 10 : 20);
    CompatUtils.applyEnchantment(attributeBomb, "THORNS", getSupremeOptions().isCustomBc() ? 5 : 10);
    return attributeBomb;
  }

  public static SlimefunItemStack getFortune() {
    final SlimefunItemStack attributeFortune = SupremeAttribute.ATTRIBUTE_FORTUNE;
    CompatUtils.applyEnchantment(attributeFortune, "DIG_SPEED", getSupremeOptions().isCustomBc() ? 10 : 20);
    CompatUtils.applyEnchantment(attributeFortune, "LOOT_BONUS_BLOCKS", getSupremeOptions().isCustomBc() ? 3 : 10);
    return attributeFortune;
  }

  public static SlimefunItemStack getImpetus() {
    final SlimefunItemStack attributeImpetus = SupremeAttribute.ATTRIBUTE_IMPETUS;
    CompatUtils.applyEnchantment(attributeImpetus, "DAMAGE_ALL", getSupremeOptions().isCustomBc() ? 10 : 20);
    CompatUtils.applyEnchantment(attributeImpetus, "FIRE_ASPECT", getSupremeOptions().isCustomBc() ? 5 : 10);
    CompatUtils.applyEnchantment(attributeImpetus, "LOOT_BONUS_MOBS", getSupremeOptions().isCustomBc() ? 3 : 10);
    return attributeImpetus;
  }
}
