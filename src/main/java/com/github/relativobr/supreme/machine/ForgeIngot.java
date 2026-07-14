package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.generic.machine.SimpleItemWithLargeContainerMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
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

public class ForgeIngot extends SimpleItemWithLargeContainerMachine {

  public static final SlimefunItemStack FORGE_INGOT_MACHINE = new SupremeItemStack("SUPREME_FORGE_INGOT_I",
      MaterialCompat.safe(XMaterial.BLAST_FURNACE), "&bForge Ingot", "", "&fThis machine allows you to", "&fforge ingot resources.", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE = new ItemStack[]{SupremeComponents.RUSTLESS_MACHINE.item(),
      new ItemStack(MaterialCompat.safe(XMaterial.BLAST_FURNACE)), SupremeComponents.RUSTLESS_MACHINE.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SupremeComponents.PETRIFIER_MACHINE.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SlimefunItems.ELECTRIC_INGOT_FACTORY_3.item(),
      SlimefunItems.ELECTRIC_SMELTERY_2.item(), SlimefunItems.CARBON_PRESS_3.item()};

  public static final SlimefunItemStack FORGE_INGOT_MACHINE_II = new SupremeItemStack("SUPREME_FORGE_INGOT_II",
      MaterialCompat.safe(XMaterial.BLAST_FURNACE), "&bForge Ingot II", "", "&fThis machine allows you to", "&fforge ingot resources.", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      LoreBuilder.powerBuffer(5000), LoreBuilder.powerPerSecond(100), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE_II = new ItemStack[]{SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeCetrus.CETRUS_IGNIS.item(), SupremeComponents.CONVEYANCE_MACHINE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      ForgeIngot.FORGE_INGOT_MACHINE.item(), SupremeComponents.INDUCTOR_MACHINE.item(), SupremeComponents.THORNERITE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.THORNERITE.item()};

  public static final SlimefunItemStack FORGE_INGOT_MACHINE_III = new SupremeItemStack("SUPREME_FORGE_INGOT_III",
      MaterialCompat.safe(XMaterial.BLAST_FURNACE), "&bForge Ingot III", "", "&fThis machine allows you to", "&fforge ingot resources.", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      LoreBuilder.powerBuffer(15000), LoreBuilder.powerPerSecond(300), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeAttribute.getBomb().item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      ForgeIngot.FORGE_INGOT_MACHINE_II.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_LEAD = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.LEAD_DUST, 32).item(), new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_ALUMINUM = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 32).item(), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_SILVER = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.SILVER_DUST, 32).item(), new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_COPPER = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.COPPER_DUST, 32).item(), new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_MAGNESIUM = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 32).item(),
      new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_IRON = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.IRON_DUST, 32).item(), new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT), 32));
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_TIN = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.TIN_DUST, 32).item(), new SlimefunItemStack(SlimefunItems.TIN_INGOT, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_ZINC = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.ZINC_DUST, 32).item(), new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_4K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_DUST, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_4K, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_6K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_4K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_6K, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_8K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_6K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_8K, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_10K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_8K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_10K, 30).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_12K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_10K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_12K, 28).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_14K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_12K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_14K, 26).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_16K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_14K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_16K, 24).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_18K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_16K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_18K, 22).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_20K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_18K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_20K, 20).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_22K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_20K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_22K, 18).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_GOLD_24K = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_22K, 32).item(), new SlimefunItemStack(SlimefunItems.GOLD_24K, 16).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_COBALT_INGOT = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.NICKEL_INGOT, 32).item(), new SlimefunItemStack(SlimefunItems.COBALT_INGOT, 16).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_DAMASCUS_STEEL_INGOT = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 32).item(),
      new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT, 16).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_SILICON = new AbstractItemRecipe(
      new ItemStack(MaterialCompat.safe(XMaterial.QUARTZ_BLOCK), 32), new SlimefunItemStack(SlimefunItems.SILICON, 32).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_FERROSILICON = new AbstractItemRecipe(
      new SlimefunItemStack(SlimefunItems.SILICON, 32).item(), new SlimefunItemStack(SlimefunItems.FERROSILICON, 16).item());
  public static final AbstractItemRecipe RECIPE_FORGE_INGOT_SULFATE = new AbstractItemRecipe(
      new ItemStack(MaterialCompat.safe(XMaterial.NETHERRACK), 64), new SlimefunItemStack(SlimefunItems.SULFATE, 8).item());

  public ForgeIngot(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_FORGE_INGOT_LEAD);
    list.add(RECIPE_FORGE_INGOT_ALUMINUM);
    list.add(RECIPE_FORGE_INGOT_SILVER);
    list.add(RECIPE_FORGE_INGOT_COPPER);
    list.add(RECIPE_FORGE_INGOT_MAGNESIUM);
    list.add(RECIPE_FORGE_INGOT_IRON);
    list.add(RECIPE_FORGE_INGOT_TIN);
    list.add(RECIPE_FORGE_INGOT_ZINC);
    list.add(RECIPE_FORGE_INGOT_GOLD_4K);
    list.add(RECIPE_FORGE_INGOT_GOLD_6K);
    list.add(RECIPE_FORGE_INGOT_GOLD_8K);
    list.add(RECIPE_FORGE_INGOT_GOLD_10K);
    list.add(RECIPE_FORGE_INGOT_GOLD_12K);
    list.add(RECIPE_FORGE_INGOT_GOLD_14K);
    list.add(RECIPE_FORGE_INGOT_GOLD_16K);
    list.add(RECIPE_FORGE_INGOT_GOLD_18K);
    list.add(RECIPE_FORGE_INGOT_GOLD_20K);
    list.add(RECIPE_FORGE_INGOT_GOLD_22K);
    list.add(RECIPE_FORGE_INGOT_GOLD_24K);
    list.add(RECIPE_FORGE_INGOT_COBALT_INGOT);
    list.add(RECIPE_FORGE_INGOT_DAMASCUS_STEEL_INGOT);
    list.add(RECIPE_FORGE_INGOT_SILICON);
    list.add(RECIPE_FORGE_INGOT_FERROSILICON);
    list.add(RECIPE_FORGE_INGOT_SULFATE);
    return list;
  }

}
