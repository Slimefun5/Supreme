package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.generic.machine.GenericMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ElectricCrafter extends GenericMachine {

  public static final SlimefunItemStack ELECTRIC_CRAFTER_MACHINE = new SupremeItemStack("SUPREME_ELECTRIC_CRAFTER_I",
      MaterialCompat.safe(XMaterial.CRAFTING_TABLE), "&bElectric Crafter", "", "&fCraft Items", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      UtilEnergy.energyPowerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_ELECTRIC_CRAFTER_MACHINE = new ItemStack[]{SupremeComponents.RUSTLESS_MACHINE.item(),
      SlimefunItems.VANILLA_AUTO_CRAFTER.item(), SupremeComponents.RUSTLESS_MACHINE.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SupremeComponents.SYNTHETIC_RUBY.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(),
      SlimefunItems.ENHANCED_AUTO_CRAFTER.item(), SupremeComponents.ADAMANTIUM_PLATE.item()};

  public static final SlimefunItemStack ELECTRIC_CRAFTER_MACHINE_II = new SupremeItemStack(
      "SUPREME_ELECTRIC_CRAFTER_II", MaterialCompat.safe(XMaterial.CRAFTING_TABLE), "&bElectric Crafter II", "", "&fAdvanced Craft Items", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      UtilEnergy.energyPowerPerSecond(100), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_ELECTRIC_CRAFTER_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE.item(), SupremeComponents.BLEND_MACHINE.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeComponents.INDUCTOR_MACHINE.item(), ElectricCrafter.ELECTRIC_CRAFTER_MACHINE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeComponents.CRYSTALLIZER_MACHINE.item(), SupremeCetrus.CETRUS_IGNIS.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

  public static final SlimefunItemStack ELECTRIC_CRAFTER_MACHINE_III = new SupremeItemStack(
      "SUPREME_ELECTRIC_CRAFTER_III", MaterialCompat.safe(XMaterial.CRAFTING_TABLE), "&bElectric Crafter III", "", "&fAdvanced Craft Items",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      UtilEnergy.energyPowerPerSecond(300), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_ELECTRIC_CRAFTER_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeCetrus.CETRUS_LUX.item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      ElectricCrafter.ELECTRIC_CRAFTER_MACHINE_II.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

  public static final AbstractItemRecipe RECIPE_BATTERY = new AbstractItemRecipe(
      new ItemStack[]{SlimefunItems.ZINC_INGOT.item(), SlimefunItems.SULFATE.item(),
          SlimefunItems.COPPER_INGOT.item(), SlimefunItems.ZINC_INGOT.item(),
          SlimefunItems.SULFATE.item(), SlimefunItems.COPPER_INGOT.item(),
          new ItemStack(MaterialCompat.safe(XMaterial.REDSTONE)), null, null}, new SlimefunItemStack(SlimefunItems.BATTERY, 1).item());
  public static final AbstractItemRecipe RECIPE_BLAZE_POWDER = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_ROD)), null, null, null, null, null, null, null, null},
      new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_POWDER), 2));
  public static final AbstractItemRecipe RECIPE_ENDER_EYE = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_POWDER)), new ItemStack(MaterialCompat.safe(XMaterial.ENDER_PEARL)), null, null, null, null,
          null, null, null}, new ItemStack(MaterialCompat.safe(XMaterial.ENDER_EYE), 1));
  public static final AbstractItemRecipe RECIPE_GLASS_BOTTLE = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.GLASS)), new ItemStack(MaterialCompat.safe(XMaterial.GLASS)), new ItemStack(MaterialCompat.safe(XMaterial.GLASS)), null,
          null, null, null, null, null}, new ItemStack(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), 3));
  public static final AbstractItemRecipe RECIPE_FISHING_ROD = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.STICK)), new ItemStack(MaterialCompat.safe(XMaterial.STRING)), new ItemStack(MaterialCompat.safe(XMaterial.STRING)),
          new ItemStack(MaterialCompat.safe(XMaterial.STICK)), null, null, null, null, null}, new ItemStack(MaterialCompat.safe(XMaterial.FISHING_ROD), 1));
  public static final AbstractItemRecipe RECIPE_FLINT_AND_STEEL = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)), new ItemStack(MaterialCompat.safe(XMaterial.FLINT)), null, null, null, null, null,
          null, null}, new ItemStack(MaterialCompat.safe(XMaterial.FLINT_AND_STEEL), 1));
  public static final AbstractItemRecipe RECIPE_SHEARS = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)), new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)),
          new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)), null, null, null, null, null, null}, new ItemStack(MaterialCompat.safe(XMaterial.SHEARS), 1));
  public static final AbstractItemRecipe RECIPE_IRON_SWORD = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.STICK)), new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)),
          new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)), null, null, null, null, null, null},
      new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD), 1));
  public static final AbstractItemRecipe RECIPE_BARREL = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.OAK_PLANKS)), new ItemStack(MaterialCompat.safe(XMaterial.OAK_SLAB)),
          new ItemStack(MaterialCompat.safe(XMaterial.OAK_PLANKS)), new ItemStack(MaterialCompat.safe(XMaterial.OAK_PLANKS)), null,
          new ItemStack(MaterialCompat.safe(XMaterial.OAK_PLANKS)), new ItemStack(MaterialCompat.safe(XMaterial.OAK_PLANKS)), new ItemStack(MaterialCompat.safe(XMaterial.OAK_SLAB)),
          new ItemStack(MaterialCompat.safe(XMaterial.OAK_PLANKS))}, new ItemStack(MaterialCompat.safe(XMaterial.BARREL), 1));
  public static final AbstractItemRecipe RECIPE_SYNTHETIC_AMETHYST = new AbstractItemRecipe(
      SupremeComponents.RECIPE_SYNTHETIC_AMETHYST, SupremeComponents.SYNTHETIC_AMETHYST.item());
  public static final AbstractItemRecipe RECIPE_SYNTHETIC_RUBY = new AbstractItemRecipe(
      SupremeComponents.RECIPE_SYNTHETIC_RUBY, SupremeComponents.SYNTHETIC_RUBY.item());

  public ElectricCrafter(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_BATTERY);
    list.add(RECIPE_BLAZE_POWDER);
    list.add(RECIPE_ENDER_EYE);
    list.add(RECIPE_GLASS_BOTTLE);
    list.add(RECIPE_FISHING_ROD);
    list.add(RECIPE_FLINT_AND_STEEL);
    list.add(RECIPE_IRON_SWORD);
    list.add(RECIPE_SHEARS);
    list.add(RECIPE_BARREL);
    list.add(RECIPE_SYNTHETIC_AMETHYST);
    list.add(RECIPE_SYNTHETIC_RUBY);
    return list;
  }

}
