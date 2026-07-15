package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_DIAMOND;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_EMERALD;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_GOLD;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_IRON;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_LAPIS;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_NETHERITE;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_QUARTZ;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_REDSTONE;
import static com.github.relativobr.supreme.resource.core.SupremeCoreBlock.RESOURCE_CORE_GRAVEL;
import static com.github.relativobr.supreme.resource.core.SupremeCoreColor.RESOURCE_CORE_BLACK;
import static com.github.relativobr.supreme.resource.core.SupremeCoreDeath.RESOURCE_CORE_STRING;
import static com.github.relativobr.supreme.resource.core.SupremeCoreLife.RESOURCE_CORE_APPLE;

import com.github.relativobr.supreme.generic.machine.GenericMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Foundry extends GenericMachine {

  public static final SlimefunItemStack FOUNDRY_MACHINE = new SupremeItemStack("SUPREME_FOUNDRY_I", MaterialCompat.safe(XMaterial.GRINDSTONE));
  public static final ItemStack[] RECIPE_FOUNDRY_MACHINE = new ItemStack[]{SlimefunItems.ELECTRIC_INGOT_FACTORY_3.item(),
      SlimefunItems.ELECTRIC_INGOT_FACTORY_3.item(), SlimefunItems.ELECTRIC_INGOT_FACTORY_3.item(),
      SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.SYNTHETIC_RUBY.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SlimefunItems.ELECTRIC_SMELTERY_2.item(), SlimefunItems.PROGRAMMABLE_ANDROID_3.item(), SlimefunItems.ELECTRIC_SMELTERY_2.item()};

  public static final SlimefunItemStack FOUNDRY_MACHINE_II = new SupremeItemStack("SUPREME_FOUNDRY_II", MaterialCompat.safe(XMaterial.GRINDSTONE));
  public static final ItemStack[] RECIPE_FOUNDRY_MACHINE_II = new ItemStack[]{SupremeComponents.BLEND_MACHINE.item(),
      SupremeCetrus.CETRUS_AQUA.item(), SupremeComponents.BLEND_MACHINE.item(), SupremeCetrus.CETRUS_VENTUS.item(), Foundry.FOUNDRY_MACHINE.item(),
      SupremeCetrus.CETRUS_LUX.item(), SupremeCore.CORE_OF_ALLOY.item(), SupremeCetrus.CETRUS_IGNIS.item(), SupremeCore.CORE_OF_ALLOY.item()};

  public static final SlimefunItemStack FOUNDRY_MACHINE_III = new SupremeItemStack("SUPREME_FOUNDRY_III", MaterialCompat.safe(XMaterial.GRINDSTONE));
  public static final ItemStack[] RECIPE_FOUNDRY_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeAttribute.getFortune().item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      Foundry.FOUNDRY_MACHINE_II.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};
	
  public static final AbstractItemRecipe RECIPE_BLISTERING_INGOT_3 = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_EMERALD.item(), RESOURCE_CORE_EMERALD.item(), RESOURCE_CORE_EMERALD.item(),
					RESOURCE_CORE_GOLD.item(), RESOURCE_CORE_GOLD.item(), RESOURCE_CORE_GOLD.item(),
					RESOURCE_CORE_EMERALD.item(), RESOURCE_CORE_EMERALD.item(), RESOURCE_CORE_EMERALD.item()},
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3, 64).item());
	public static final AbstractItemRecipe RECIPE_REDSTONE_ALLOY = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_REDSTONE.item(), RESOURCE_CORE_REDSTONE.item(), RESOURCE_CORE_REDSTONE.item(),
					RESOURCE_CORE_DIAMOND.item(), RESOURCE_CORE_DIAMOND.item(), RESOURCE_CORE_DIAMOND.item(),
					RESOURCE_CORE_REDSTONE.item(), RESOURCE_CORE_REDSTONE.item(), RESOURCE_CORE_REDSTONE.item()},
			new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY, 64).item());
	public static final AbstractItemRecipe RECIPE_HARDENED_METAL_INGOT = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_LAPIS.item(), RESOURCE_CORE_LAPIS.item(), RESOURCE_CORE_LAPIS.item(),
					RESOURCE_CORE_DIAMOND.item(), RESOURCE_CORE_DIAMOND.item(), RESOURCE_CORE_DIAMOND.item(),
					RESOURCE_CORE_LAPIS.item(), RESOURCE_CORE_LAPIS.item(), RESOURCE_CORE_LAPIS.item()},
			new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT, 64).item());
	public static final AbstractItemRecipe RECIPE_REINFORCED_ALLOY_INGOT = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_NETHERITE.item(), RESOURCE_CORE_NETHERITE.item(), RESOURCE_CORE_NETHERITE.item(),
					RESOURCE_CORE_DIAMOND.item(), RESOURCE_CORE_DIAMOND.item(), RESOURCE_CORE_DIAMOND.item(),
					RESOURCE_CORE_NETHERITE.item(), RESOURCE_CORE_NETHERITE.item(), RESOURCE_CORE_NETHERITE.item()},
			new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 64).item());
	public static final AbstractItemRecipe RECIPE_ENCHANTED_GOLDEN_APPLE = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_GOLD.item(), RESOURCE_CORE_GOLD.item(), RESOURCE_CORE_GOLD.item(),
					RESOURCE_CORE_APPLE.item(), RESOURCE_CORE_APPLE.item(), RESOURCE_CORE_APPLE.item(),
					RESOURCE_CORE_GOLD.item(), RESOURCE_CORE_GOLD.item(), RESOURCE_CORE_GOLD.item()},
			new ItemStack(MaterialCompat.safe(XMaterial.ENCHANTED_GOLDEN_APPLE), 64));
	public static final AbstractItemRecipe RECIPE_SOLAR_PANEL = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_QUARTZ.item(), RESOURCE_CORE_QUARTZ.item(), RESOURCE_CORE_QUARTZ.item(),
					RESOURCE_CORE_STRING.item(), RESOURCE_CORE_STRING.item(), RESOURCE_CORE_STRING.item(),
					RESOURCE_CORE_QUARTZ.item(), RESOURCE_CORE_QUARTZ.item(), RESOURCE_CORE_QUARTZ.item()},
			new SlimefunItemStack(SlimefunItems.SOLAR_PANEL, 64).item());
	public static final AbstractItemRecipe RECIPE_OIL_BUCKET = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_BLACK.item(), RESOURCE_CORE_BLACK.item(), RESOURCE_CORE_BLACK.item(),
					RESOURCE_CORE_IRON.item(), RESOURCE_CORE_IRON.item(), RESOURCE_CORE_IRON.item(),
					RESOURCE_CORE_BLACK.item(), RESOURCE_CORE_BLACK.item(), RESOURCE_CORE_BLACK.item()},
			new SlimefunItemStack(SlimefunItems.OIL_BUCKET, 64).item());
	public static final AbstractItemRecipe RECIPE_PLASTIC_SHEET = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_STRING.item(), RESOURCE_CORE_STRING.item(), RESOURCE_CORE_STRING.item(),
					RESOURCE_CORE_GRAVEL.item(), RESOURCE_CORE_GRAVEL.item(), RESOURCE_CORE_GRAVEL.item(),
					RESOURCE_CORE_STRING.item(), RESOURCE_CORE_STRING.item(), RESOURCE_CORE_STRING.item()},
			new SlimefunItemStack(SlimefunItems.PLASTIC_SHEET, 64).item());
	
  public Foundry(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_BLISTERING_INGOT_3);
    list.add(RECIPE_REDSTONE_ALLOY);
    list.add(RECIPE_HARDENED_METAL_INGOT);
    list.add(RECIPE_REINFORCED_ALLOY_INGOT);
    list.add(RECIPE_ENCHANTED_GOLDEN_APPLE);
    list.add(RECIPE_SOLAR_PANEL);
    list.add(RECIPE_OIL_BUCKET);
    list.add(RECIPE_PLASTIC_SHEET);
    return list;
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    List<ItemStack> displayRecipes = new ArrayList();
    machineRecipes
        .stream().filter(Objects::nonNull)
        .forEach(recipe -> {
      ItemStack itemStack1 = CustomItemStack.create(MaterialCompat.safe(XMaterial.WHITE_STAINED_GLASS_PANE), " ");
      ItemStack itemStack2 = CustomItemStack.create(MaterialCompat.safe(XMaterial.WHITE_STAINED_GLASS_PANE), " ");
      if (recipe.getItemInput(0) != null) {
        itemStack1 = recipe.getItemInput(0).clone();
        itemStack1.setAmount(6);
      }
      if (recipe.getItemInput(3) != null) {
        itemStack2 = recipe.getItemInput(3).clone();
        itemStack2.setAmount(3);
      }
      displayRecipes.add(itemStack1);
      displayRecipes.add(recipe.getFirstItemOutput());
      displayRecipes.add(itemStack2);
      displayRecipes.add(recipe.getFirstItemOutput());
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.BLACK_STAINED_GLASS_PANE), " "));
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.BLACK_STAINED_GLASS_PANE), " "));
    });
    return displayRecipes;
  }

}
