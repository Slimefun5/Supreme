package com.github.relativobr.supreme.util;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockCoreFabricator;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockMagicalFabricator;
import com.github.relativobr.supreme.machine.tech.TechMutation;
import io.github.thebusybiscuit.slimefun5.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.inventory.ItemStack;

public class RegisterItem {

  // All items funnelled through here are crafted materials/components/cores; the guide's
  // material/type heuristic files head-textured items under "Misc", so declare "resources".
  private static final String GUIDE_RESOURCES = "resources";

  @ParametersAreNonnullByDefault
  public static void registerSmeltery(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerSmeltery(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void registerSmeltery(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    SlimefunItem item = new UnplaceableBlock(itemGroup, itemStack, RecipeType.SMELTERY, recipe);
    item.setGuideType(GUIDE_RESOURCES);
    item.register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerEnhancedCraft(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerEnhancedCraft(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void registerEnhancedCraft(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    SlimefunItem item = new UnplaceableBlock(itemGroup, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    item.setGuideType(GUIDE_RESOURCES);
    item.register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerNullRecipe(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerNullRecipe(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void registerNullRecipe(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    SlimefunItem item = new UnplaceableBlock(itemGroup, itemStack, RecipeType.NULL, recipe);
    item.setGuideType(GUIDE_RESOURCES);
    item.register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerGrindStone(SlimefunItemStack itemStack, ItemStack[] recipe, int amount) {
    registerGrindStone(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe, amount);
  }

  @ParametersAreNonnullByDefault
  public static void registerGrindStone(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe,
      int amount) {
    SlimefunItem item = new SlimefunItem(itemGroup, itemStack, RecipeType.GRIND_STONE, recipe,
        new SlimefunItemStack(itemStack, amount).item());
    item.setGuideType(GUIDE_RESOURCES);
    item.register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerMagicalFabricator(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerMagicalFabricator(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe, GUIDE_RESOURCES);
  }

  @ParametersAreNonnullByDefault
  public static void registerMagicalFabricator(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerMagicalFabricator(itemGroup, itemStack, recipe, GUIDE_RESOURCES);
  }

  // Magical-fabricator products that are themed magic items (cetrus/attribute/core) rather than crafting stock.
  @ParametersAreNonnullByDefault
  public static void registerMagicalFabricatorMagic(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerMagicalFabricator(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe, "magic");
  }

  @ParametersAreNonnullByDefault
  private static void registerMagicalFabricator(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe,
      String guideType) {
    SlimefunItem item = new UnplaceableBlock(itemGroup, itemStack, MultiBlockMagicalFabricator.getMachine(), recipe);
    item.setGuideType(guideType);
    item.register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerCoreFabricator(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerCoreFabricator(ItemGroups.RESOURCE_CATEGORY, itemStack, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void registerCoreFabricator(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    SlimefunItem item = new UnplaceableBlock(itemGroup, itemStack, MultiBlockCoreFabricator.getMachine(), recipe);
    item.setGuideType(GUIDE_RESOURCES);
    item.register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerTechMutation(SlimefunItemStack itemStack) {
    SlimefunItem item = new UnplaceableBlock(ItemGroups.COMPONENTS_CATEGORY, itemStack, RecipeType.NULL,
        new ItemStack[]{TechMutation.TECH_MUTATION_I.item()});
    item.setGuideType(GUIDE_RESOURCES);
    item.register(Supreme.inst());
  }

}
