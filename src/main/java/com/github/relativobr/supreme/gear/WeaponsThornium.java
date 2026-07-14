package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class WeaponsThornium {

  public static final SlimefunItemStack THORNIUM_BOW = new SupremeItemStack("SUPREME_BOW_THORNIUM", MaterialCompat.safe(XMaterial.BOW));
  public static final ItemStack[] RECIPE_THORNIUM_BOW = {null, SupremeComponents.THORNIUM_INGOT.item(),
      SupremeCoreDeath.RESOURCE_CORE_STRING.item(), SupremeCetrus.CETRUS_LUMIUM.item(), null, SupremeCoreDeath.RESOURCE_CORE_STRING.item(),
      null, SupremeComponents.THORNIUM_INGOT.item(), SupremeCoreDeath.RESOURCE_CORE_STRING.item()};

  public static final SlimefunItemStack THORNIUM_BOW_MAGIC = new SupremeItemStack("SUPREME_BOW_MAGIC", MaterialCompat.safe(XMaterial.BOW));

  public static final SlimefunItemStack THORNIUM_BOW_RARE = new SupremeItemStack("SUPREME_BOW_RARE", MaterialCompat.safe(XMaterial.BOW));

  public static final SlimefunItemStack THORNIUM_BOW_EPIC = new SupremeItemStack("SUPREME_BOW_EPIC", MaterialCompat.safe(XMaterial.BOW));

  public static final SlimefunItemStack THORNIUM_BOW_LEGENDARY = new SupremeItemStack("SUPREME_BOW_LEGENDARY",
      MaterialCompat.safe(XMaterial.BOW));

  public static final SlimefunItemStack THORNIUM_BOW_SUPREME = new SupremeItemStack("SUPREME_BOW_SUPREME",
      MaterialCompat.safe(XMaterial.BOW));

  public static final SlimefunItemStack THORNIUM_SHIELD = new SupremeItemStack("SUPREME_SHIELD_THORNIUM",
      MaterialCompat.safe(XMaterial.SHIELD));
  public static final ItemStack[] RECIPE_THORNIUM_SHIELD = {SupremeCoreNature.RESOURCE_CORE_OAK_LOG.item(),
      SupremeComponents.THORNIUM_INGOT.item(), SupremeCoreNature.RESOURCE_CORE_OAK_LOG.item(),
      SupremeCoreNature.RESOURCE_CORE_OAK_LOG.item(), SupremeCetrus.CETRUS_LUX.item(), SupremeCoreNature.RESOURCE_CORE_OAK_LOG.item(), null,
      SupremeCoreNature.RESOURCE_CORE_OAK_LOG.item(), null};

  public static final SlimefunItemStack THORNIUM_SHIELD_MAGIC = new SupremeItemStack("SUPREME_SHIELD_MAGIC",
      MaterialCompat.safe(XMaterial.SHIELD));

  public static final SlimefunItemStack THORNIUM_SHIELD_RARE = new SupremeItemStack("SUPREME_SHIELD_RARE",
      MaterialCompat.safe(XMaterial.SHIELD));

  public static final SlimefunItemStack THORNIUM_SHIELD_EPIC = new SupremeItemStack("SUPREME_SHIELD_EPIC",
      MaterialCompat.safe(XMaterial.SHIELD));

  public static final SlimefunItemStack THORNIUM_SHIELD_LEGENDARY = new SupremeItemStack("SUPREME_SHIELD_LEGENDARY",
      MaterialCompat.safe(XMaterial.SHIELD));

  public static final SlimefunItemStack THORNIUM_SHIELD_SUPREME = new SupremeItemStack("SUPREME_SHIELD_SUPREME",
      MaterialCompat.safe(XMaterial.SHIELD));

  public static final SlimefunItemStack THORNIUM_SWORD = new SupremeItemStack("SUPREME_SWORD_THORNIUM",
      MaterialCompat.safe(XMaterial.NETHERITE_SWORD));
  public static final ItemStack[] RECIPE_THORNIUM_SWORD = {null, SupremeComponents.THORNIUM_INGOT.item(), null, null,
      SupremeComponents.THORNIUM_INGOT.item(), null, null, SupremeCetrus.CETRUS_LUMIUM.item(), null};

  public static final SlimefunItemStack THORNIUM_SWORD_MAGIC = new SupremeItemStack("SUPREME_SWORD_MAGIC",
      MaterialCompat.safe(XMaterial.NETHERITE_SWORD));

  public static final SlimefunItemStack THORNIUM_SWORD_RARE = new SupremeItemStack("SUPREME_SWORD_RARE",
      MaterialCompat.safe(XMaterial.NETHERITE_SWORD));

  public static final SlimefunItemStack THORNIUM_SWORD_EPIC = new SupremeItemStack("SUPREME_SWORD_EPIC",
      MaterialCompat.safe(XMaterial.NETHERITE_SWORD));

  public static final SlimefunItemStack THORNIUM_SWORD_LEGENDARY = new SupremeItemStack("SUPREME_SWORD_LEGENDARY",
      MaterialCompat.safe(XMaterial.NETHERITE_SWORD));

  public static final SlimefunItemStack THORNIUM_SWORD_SUPREME = new SupremeItemStack("SUPREME_SWORD_SUPREME",
      MaterialCompat.safe(XMaterial.NETHERITE_SWORD));
}
