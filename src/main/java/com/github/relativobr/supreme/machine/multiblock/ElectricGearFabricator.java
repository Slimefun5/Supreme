package com.github.relativobr.supreme.machine.multiblock;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.generic.machine.GenericMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.gear.ArmorThornium;
import com.github.relativobr.supreme.gear.WeaponsThornium;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.tools.ToolsThornium;
import com.github.relativobr.supreme.util.ItemTier;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ElectricGearFabricator extends GenericMachine {

  public static final SlimefunItemStack ELECTRIC_GEAR_MACHINE = new SupremeItemStack("SUPREME_ELECTRIC_GEAR_I",
      MaterialCompat.safe(XMaterial.SMITHING_TABLE), "&bElectric Gear Machine", "", "&fCraft tier of gear", "",
      "", "",
      UtilEnergy.energyPowerPerSecond(20), "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_ELECTRIC_GEAR_MACHINE = new ItemStack[]{
      new ItemStack(MaterialCompat.safe(XMaterial.ENCHANTING_TABLE)), new ItemStack(MaterialCompat.safe(XMaterial.ANVIL)), new ItemStack(MaterialCompat.safe(XMaterial.SMITHING_TABLE)),
      SupremeComponents.PETRIFIER_MACHINE.item(), SupremeComponents.SYNTHETIC_RUBY.item(), SupremeComponents.PETRIFIER_MACHINE.item(),
      SlimefunItems.ELECTRIC_MOTOR.item(), SlimefunItems.CARBONADO_EDGED_CAPACITOR.item(), SlimefunItems.ELECTRIC_MOTOR.item()};

  public static final SlimefunItemStack ELECTRIC_GEAR_MACHINE_II = new SupremeItemStack("SUPREME_ELECTRIC_GEAR_II",
      MaterialCompat.safe(XMaterial.SMITHING_TABLE), "&bElectric Gear Machine II", "", "&fAdvanced craft tier of gear", "",
      "", "",
      UtilEnergy.energyPowerPerSecond(100), "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_ELECTRIC_GEAR_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE.item(), SupremeCetrus.CETRUS_LUX.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeComponents.INDUCTOR_MACHINE.item(), ElectricGearFabricator.ELECTRIC_GEAR_MACHINE.item(),
      SupremeComponents.INDUCTOR_MACHINE.item(), SupremeComponents.BLEND_MACHINE.item(), SupremeCetrus.CETRUS_IGNIS.item(),
      SupremeComponents.BLEND_MACHINE.item()};

  public static final SlimefunItemStack ELECTRIC_GEAR_MACHINE_III = new SupremeItemStack("SUPREME_ELECTRIC_GEAR_III",
      MaterialCompat.safe(XMaterial.SMITHING_TABLE), "&bElectric Gear Machine III", "", "&fAdvanced craft tier of gear", "",
      "", "",
      UtilEnergy.energyPowerPerSecond(300), "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_ELECTRIC_GEAR_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeCetrus.CETRUS_LUX.item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      ElectricGearFabricator.ELECTRIC_GEAR_MACHINE_II.item(), SupremeComponents.SUPREME.item(),
      SupremeComponents.CRYSTALLIZER_MACHINE.item(), SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

  @ParametersAreNonnullByDefault
  public ElectricGearFabricator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_TITANIUM_HELMET, ArmorBasic.TITANIUM_HELMET));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_AURUM_HELMET, ArmorBasic.AURUM_HELMET));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_ADAMANTIUM_HELMET, ArmorBasic.ADAMANTIUM_HELMET));
//    list.add(new AbstractItemRecipe(ArmorThornium.RECIPE_THORNIUM_HELMET, ArmorThornium.THORNIUM_HELMET));
    list.add(
        new AbstractItemRecipe(ItemTier.getMagicRecipe(ArmorThornium.THORNIUM_HELMET), ArmorThornium.THORNIUM_HELMET_MAGIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(ArmorThornium.THORNIUM_HELMET_MAGIC),
        ArmorThornium.THORNIUM_HELMET_RARE.item()));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(ArmorThornium.THORNIUM_HELMET_RARE),
        ArmorThornium.THORNIUM_HELMET_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(ArmorThornium.THORNIUM_HELMET_EPIC),
        ArmorThornium.THORNIUM_HELMET_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(ArmorThornium.THORNIUM_HELMET_LEGENDARY),
        ArmorThornium.THORNIUM_HELMET_SUPREME.item()));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_TITANIUM_CHESTPLATE, ArmorBasic.TITANIUM_CHESTPLATE));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_AURUM_CHESTPLATE, ArmorBasic.AURUM_CHESTPLATE));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_ADAMANTIUM_CHESTPLATE, ArmorBasic.ADAMANTIUM_CHESTPLATE));
//    list.add(new AbstractItemRecipe(ArmorThornium.RECIPE_THORNIUM_CHESTPLATE, ArmorThornium.THORNIUM_CHESTPLATE));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(ArmorThornium.THORNIUM_CHESTPLATE),
        ArmorThornium.THORNIUM_CHESTPLATE_MAGIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(ArmorThornium.THORNIUM_CHESTPLATE_MAGIC),
        ArmorThornium.THORNIUM_CHESTPLATE_RARE.item()));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(ArmorThornium.THORNIUM_CHESTPLATE_RARE),
        ArmorThornium.THORNIUM_CHESTPLATE_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(ArmorThornium.THORNIUM_CHESTPLATE_EPIC),
        ArmorThornium.THORNIUM_CHESTPLATE_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(ArmorThornium.THORNIUM_CHESTPLATE_LEGENDARY),
        ArmorThornium.THORNIUM_CHESTPLATE_SUPREME.item()));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_TITANIUM_LEGGINGS, ArmorBasic.TITANIUM_LEGGINGS));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_AURUM_LEGGINGS, ArmorBasic.AURUM_LEGGINGS));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_ADAMANTIUM_LEGGINGS, ArmorBasic.ADAMANTIUM_LEGGINGS));
//    list.add(new AbstractItemRecipe(ArmorThornium.RECIPE_THORNIUM_LEGGINGS, ArmorThornium.THORNIUM_LEGGINGS));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(ArmorThornium.THORNIUM_LEGGINGS),
        ArmorThornium.THORNIUM_LEGGINGS_MAGIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(ArmorThornium.THORNIUM_LEGGINGS_MAGIC),
        ArmorThornium.THORNIUM_LEGGINGS_RARE.item()));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(ArmorThornium.THORNIUM_LEGGINGS_RARE),
        ArmorThornium.THORNIUM_LEGGINGS_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(ArmorThornium.THORNIUM_LEGGINGS_EPIC),
        ArmorThornium.THORNIUM_LEGGINGS_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(ArmorThornium.THORNIUM_LEGGINGS_LEGENDARY),
        ArmorThornium.THORNIUM_LEGGINGS_SUPREME.item()));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_TITANIUM_BOOTS, ArmorBasic.TITANIUM_BOOTS));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_AURUM_BOOTS, ArmorBasic.AURUM_BOOTS));
//    list.add(new AbstractItemRecipe(ArmorBasic.RECIPE_ADAMANTIUM_BOOTS, ArmorBasic.ADAMANTIUM_BOOTS));
//    list.add(new AbstractItemRecipe(ArmorThornium.RECIPE_THORNIUM_BOOTS, ArmorThornium.THORNIUM_BOOTS));
    list.add(
        new AbstractItemRecipe(ItemTier.getMagicRecipe(ArmorThornium.THORNIUM_BOOTS), ArmorThornium.THORNIUM_BOOTS_MAGIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(ArmorThornium.THORNIUM_BOOTS_MAGIC),
        ArmorThornium.THORNIUM_BOOTS_RARE.item()));
    list.add(
        new AbstractItemRecipe(ItemTier.getEpicRecipe(ArmorThornium.THORNIUM_BOOTS_RARE), ArmorThornium.THORNIUM_BOOTS_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(ArmorThornium.THORNIUM_BOOTS_EPIC),
        ArmorThornium.THORNIUM_BOOTS_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(ArmorThornium.THORNIUM_BOOTS_LEGENDARY),
        ArmorThornium.THORNIUM_BOOTS_SUPREME.item()));
//    list.add(new AbstractItemRecipe(WeaponsThornium.RECIPE_THORNIUM_BOW, WeaponsThornium.THORNIUM_BOW));
    list.add(
        new AbstractItemRecipe(ItemTier.getMagicRecipe(WeaponsThornium.THORNIUM_BOW), WeaponsThornium.THORNIUM_BOW_MAGIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(WeaponsThornium.THORNIUM_BOW_MAGIC),
        WeaponsThornium.THORNIUM_BOW_RARE.item()));
    list.add(
        new AbstractItemRecipe(ItemTier.getEpicRecipe(WeaponsThornium.THORNIUM_BOW_RARE), WeaponsThornium.THORNIUM_BOW_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(WeaponsThornium.THORNIUM_BOW_EPIC),
        WeaponsThornium.THORNIUM_BOW_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(WeaponsThornium.THORNIUM_BOW_LEGENDARY),
        WeaponsThornium.THORNIUM_BOW_SUPREME.item()));
//    list.add(new AbstractItemRecipe(WeaponsBasic.RECIPE_TITANIUM_SWORD, WeaponsBasic.TITANIUM_SWORD));
//    list.add(new AbstractItemRecipe(WeaponsBasic.RECIPE_AURUM_SWORD, WeaponsBasic.AURUM_SWORD));
//    list.add(new AbstractItemRecipe(WeaponsBasic.RECIPE_ADAMANTIUM_SWORD, WeaponsBasic.ADAMANTIUM_SWORD));
//    list.add(new AbstractItemRecipe(WeaponsThornium.RECIPE_THORNIUM_SWORD, WeaponsThornium.THORNIUM_SWORD));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(WeaponsThornium.THORNIUM_SWORD),
        WeaponsThornium.THORNIUM_SWORD_MAGIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(WeaponsThornium.THORNIUM_SWORD_MAGIC),
        WeaponsThornium.THORNIUM_SWORD_RARE.item()));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(WeaponsThornium.THORNIUM_SWORD_RARE),
        WeaponsThornium.THORNIUM_SWORD_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(WeaponsThornium.THORNIUM_SWORD_EPIC),
        WeaponsThornium.THORNIUM_SWORD_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(WeaponsThornium.THORNIUM_SWORD_LEGENDARY),
        WeaponsThornium.THORNIUM_SWORD_SUPREME.item()));
//    list.add(new AbstractItemRecipe(WeaponsThornium.RECIPE_THORNIUM_SHIELD, WeaponsThornium.THORNIUM_SHIELD));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(WeaponsThornium.THORNIUM_SHIELD),
        WeaponsThornium.THORNIUM_SHIELD_MAGIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(WeaponsThornium.THORNIUM_SHIELD_MAGIC),
        WeaponsThornium.THORNIUM_SHIELD_RARE.item()));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(WeaponsThornium.THORNIUM_SHIELD_RARE),
        WeaponsThornium.THORNIUM_SHIELD_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(WeaponsThornium.THORNIUM_SHIELD_EPIC),
        WeaponsThornium.THORNIUM_SHIELD_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(WeaponsThornium.THORNIUM_SHIELD_LEGENDARY),
        WeaponsThornium.THORNIUM_SHIELD_SUPREME.item()));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_TITANIUM_AXE, ToolsBasic.TITANIUM_AXE));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_AURUM_AXE, ToolsBasic.AURUM_AXE));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_ADAMANTIUM_AXE, ToolsBasic.ADAMANTIUM_AXE));
//    list.add(new AbstractItemRecipe(ToolsThornium.RECIPE_THORNIUM_AXE, ToolsThornium.THORNIUM_AXE));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(ToolsThornium.THORNIUM_AXE), ToolsThornium.THORNIUM_AXE_MAGIC.item()));
    list.add(
        new AbstractItemRecipe(ItemTier.getRareRecipe(ToolsThornium.THORNIUM_AXE_MAGIC), ToolsThornium.THORNIUM_AXE_RARE.item()));
    list.add(
        new AbstractItemRecipe(ItemTier.getEpicRecipe(ToolsThornium.THORNIUM_AXE_RARE), ToolsThornium.THORNIUM_AXE_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(ToolsThornium.THORNIUM_AXE_EPIC),
        ToolsThornium.THORNIUM_AXE_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(ToolsThornium.THORNIUM_AXE_LEGENDARY),
        ToolsThornium.THORNIUM_AXE_SUPREME.item()));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_TITANIUM_PICKAXE, ToolsBasic.TITANIUM_PICKAXE));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_AURUM_PICKAXE, ToolsBasic.AURUM_PICKAXE));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_ADAMANTIUM_PICKAXE, ToolsBasic.ADAMANTIUM_PICKAXE));
//    list.add(new AbstractItemRecipe(ToolsThornium.RECIPE_THORNIUM_PICKAXE, ToolsThornium.THORNIUM_PICKAXE));
    list.add(new AbstractItemRecipe(ItemTier.getMagicRecipe(ToolsThornium.THORNIUM_PICKAXE),
        ToolsThornium.THORNIUM_PICKAXE_MAGIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(ToolsThornium.THORNIUM_PICKAXE_MAGIC),
        ToolsThornium.THORNIUM_PICKAXE_RARE.item()));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(ToolsThornium.THORNIUM_PICKAXE_RARE),
        ToolsThornium.THORNIUM_PICKAXE_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(ToolsThornium.THORNIUM_PICKAXE_EPIC),
        ToolsThornium.THORNIUM_PICKAXE_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(ToolsThornium.THORNIUM_PICKAXE_LEGENDARY),
        ToolsThornium.THORNIUM_PICKAXE_SUPREME.item()));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_TITANIUM_SHOVEL, ToolsBasic.TITANIUM_SHOVEL));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_AURUM_SHOVEL, ToolsBasic.AURUM_SHOVEL));
//    list.add(new AbstractItemRecipe(ToolsBasic.RECIPE_ADAMANTIUM_SHOVEL, ToolsBasic.ADAMANTIUM_SHOVEL));
//    list.add(new AbstractItemRecipe(ToolsThornium.RECIPE_THORNIUM_SHOVEL, ToolsThornium.THORNIUM_SHOVEL));
    list.add(
        new AbstractItemRecipe(ItemTier.getMagicRecipe(ToolsThornium.THORNIUM_SHOVEL), ToolsThornium.THORNIUM_SHOVEL_MAGIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getRareRecipe(ToolsThornium.THORNIUM_SHOVEL_MAGIC),
        ToolsThornium.THORNIUM_SHOVEL_RARE.item()));
    list.add(new AbstractItemRecipe(ItemTier.getEpicRecipe(ToolsThornium.THORNIUM_SHOVEL_RARE),
        ToolsThornium.THORNIUM_SHOVEL_EPIC.item()));
    list.add(new AbstractItemRecipe(ItemTier.getLegendaryRecipe(ToolsThornium.THORNIUM_SHOVEL_EPIC),
        ToolsThornium.THORNIUM_SHOVEL_LEGENDARY.item()));
    list.add(new AbstractItemRecipe(ItemTier.getSupremeRecipe(ToolsThornium.THORNIUM_SHOVEL_LEGENDARY),
        ToolsThornium.THORNIUM_SHOVEL_SUPREME.item()));

    return list;

  }

}
