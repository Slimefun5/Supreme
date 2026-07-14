package com.github.relativobr.supreme.machine.recipe;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.util.SupremeOptions;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;

public class VirtualGardenMachineRecipe extends MachineRecipe {

  public static final AbstractItemRecipe RECIPE_GARDEN_WHITE_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.LILY_OF_THE_VALLEY),
      MaterialCompat.safe(XMaterial.WHITE_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_ORANGE_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.ORANGE_TULIP),
      MaterialCompat.safe(XMaterial.ORANGE_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_MAGENTA_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.ALLIUM),
      MaterialCompat.safe(XMaterial.MAGENTA_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_LIGHT_BLUE_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.BLUE_ORCHID),
      MaterialCompat.safe(XMaterial.LIGHT_BLUE_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_YELLOW_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.DANDELION),
      MaterialCompat.safe(XMaterial.YELLOW_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_LIME_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.BAMBOO),
      MaterialCompat.safe(XMaterial.LIME_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_PINK_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.PINK_TULIP),
      MaterialCompat.safe(XMaterial.PINK_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_GRAY_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.BROWN_MUSHROOM),
      MaterialCompat.safe(XMaterial.GRAY_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_LIGHT_GRAY_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.WHITE_TULIP),
      MaterialCompat.safe(XMaterial.LIGHT_GRAY_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_CYAN_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.TWISTING_VINES),
      MaterialCompat.safe(XMaterial.CYAN_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_PURPLE_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.CHORUS_FRUIT),
      MaterialCompat.safe(XMaterial.PURPLE_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_BLUE_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.CORNFLOWER),
      MaterialCompat.safe(XMaterial.BLUE_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_BROWN_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.COCOA_BEANS),
      MaterialCompat.safe(XMaterial.BROWN_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_GREEN_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.CACTUS),
      MaterialCompat.safe(XMaterial.GREEN_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_RED_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.POPPY),
      MaterialCompat.safe(XMaterial.RED_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_BLACK_DYE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.INK_SAC),
      MaterialCompat.safe(XMaterial.BLACK_DYE));
  public static final AbstractItemRecipe RECIPE_GARDEN_POTATO = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.POTATO),
      MaterialCompat.safe(XMaterial.POTATO));
  public static final AbstractItemRecipe RECIPE_GARDEN_CARROT = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.CARROT),
      MaterialCompat.safe(XMaterial.CARROT));
  public static final AbstractItemRecipe RECIPE_GARDEN_BEETROOT = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.BEETROOT_SEEDS),
      MaterialCompat.safe(XMaterial.BEETROOT));
  public static final AbstractItemRecipe RECIPE_GARDEN_WHEAT = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.WHEAT_SEEDS),
      MaterialCompat.safe(XMaterial.WHEAT));
  public static final AbstractItemRecipe RECIPE_GARDEN_SUGAR_CANE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.SUGAR_CANE),
      MaterialCompat.safe(XMaterial.SUGAR_CANE));
  public static final AbstractItemRecipe RECIPE_GARDEN_SWEET_BERRIES = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.SWEET_BERRIES),
      MaterialCompat.safe(XMaterial.SWEET_BERRIES));
  public static final AbstractItemRecipe RECIPE_GARDEN_MELON = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.MELON_SEEDS),
      MaterialCompat.safe(XMaterial.MELON));
  public static final AbstractItemRecipe RECIPE_GARDEN_PUMPKIN = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.PUMPKIN_SEEDS),
      MaterialCompat.safe(XMaterial.PUMPKIN));
  public static final AbstractItemRecipe RECIPE_GARDEN_CARVED_PUMPKIN = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.PUMPKIN),
      MaterialCompat.safe(XMaterial.CARVED_PUMPKIN));
  public static final AbstractItemRecipe RECIPE_GARDEN_APPLE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.APPLE), MaterialCompat.safe(XMaterial.APPLE));
  public static final AbstractItemRecipe RECIPE_GARDEN_DARK_OAK_SAPLING = new AbstractItemRecipe(
      MaterialCompat.safe(XMaterial.DARK_OAK_SAPLING), null, MaterialCompat.safe(XMaterial.DARK_OAK_LOG), MaterialCompat.safe(XMaterial.DARK_OAK_LEAVES));
  public static final AbstractItemRecipe RECIPE_GARDEN_JUNGLE_SAPLING = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.JUNGLE_SAPLING),
      null, MaterialCompat.safe(XMaterial.JUNGLE_LOG), MaterialCompat.safe(XMaterial.JUNGLE_LEAVES));
  public static final AbstractItemRecipe RECIPE_GARDEN_BIRCH_SAPLING = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.BIRCH_SAPLING),
      null, MaterialCompat.safe(XMaterial.BIRCH_LOG), MaterialCompat.safe(XMaterial.BIRCH_LEAVES));
  public static final AbstractItemRecipe RECIPE_GARDEN_SPRUCE_SAPLING = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.SPRUCE_SAPLING),
      null, MaterialCompat.safe(XMaterial.SPRUCE_LOG), MaterialCompat.safe(XMaterial.SPRUCE_LEAVES));
  public static final AbstractItemRecipe RECIPE_GARDEN_ACACIA_SAPLING = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.ACACIA_SAPLING),
      null, MaterialCompat.safe(XMaterial.ACACIA_LOG), MaterialCompat.safe(XMaterial.ACACIA_LEAVES));
  public static final AbstractItemRecipe RECIPE_GARDEN_OAK_SAPLING = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.OAK_SAPLING), null,
      MaterialCompat.safe(XMaterial.OAK_LOG), MaterialCompat.safe(XMaterial.OAK_LEAVES));
  public static final AbstractItemRecipe RECIPE_GARDEN_CRIMSON_FUNGUS = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.CRIMSON_FUNGUS),
      MaterialCompat.safe(XMaterial.CRIMSON_STEM));
  public static final AbstractItemRecipe RECIPE_GARDEN_WARPED_FUNGUS = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.WARPED_FUNGUS),
      MaterialCompat.safe(XMaterial.WARPED_STEM));
  public static final AbstractItemRecipe RECIPE_GARDEN_WITHER_ROSE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.WITHER_ROSE),
      MaterialCompat.safe(XMaterial.WITHER_ROSE));
  public static final AbstractItemRecipe RECIPE_GARDEN_NETHER_WART = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.NETHER_WART),
      MaterialCompat.safe(XMaterial.NETHER_WART));
  public static final AbstractItemRecipe RECIPE_GARDEN_HONEY_BOTTLE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.HONEY_BLOCK),
      MaterialCompat.safe(XMaterial.HONEY_BOTTLE));
  public static final AbstractItemRecipe RECIPE_GARDEN_CLAY_BALL = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.CLAY),
      MaterialCompat.safe(XMaterial.CLAY_BALL));
  public static final AbstractItemRecipe RECIPE_GARDEN_SNOWBALL = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.SNOW_BLOCK),
      MaterialCompat.safe(XMaterial.SNOWBALL));
  public static final AbstractItemRecipe RECIPE_GARDEN_END_STONE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.END_CRYSTAL),
      MaterialCompat.safe(XMaterial.END_STONE));
  public static final AbstractItemRecipe RECIPE_GARDEN_GRANITE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.POLISHED_GRANITE),
      MaterialCompat.safe(XMaterial.GRANITE));
  public static final AbstractItemRecipe RECIPE_GARDEN_DIORITE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.POLISHED_DIORITE),
      MaterialCompat.safe(XMaterial.DIORITE));
  public static final AbstractItemRecipe RECIPE_GARDEN_ANDESITE = new AbstractItemRecipe(MaterialCompat.safe(XMaterial.POLISHED_ANDESITE),
      MaterialCompat.safe(XMaterial.ANDESITE));

  @ParametersAreNonnullByDefault
  public VirtualGardenMachineRecipe(AbstractItemRecipe recipe) {
    super(Supreme.getSupremeOptions().getBaseTimeVirtualGarden(), recipe.getInput(), recipe.getOutput());
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_GARDEN_WHITE_DYE);
    list.add(RECIPE_GARDEN_ORANGE_DYE);
    list.add(RECIPE_GARDEN_MAGENTA_DYE);
    list.add(RECIPE_GARDEN_LIGHT_BLUE_DYE);
    list.add(RECIPE_GARDEN_YELLOW_DYE);
    list.add(RECIPE_GARDEN_LIME_DYE);
    list.add(RECIPE_GARDEN_PINK_DYE);
    list.add(RECIPE_GARDEN_GRAY_DYE);
    list.add(RECIPE_GARDEN_LIGHT_GRAY_DYE);
    list.add(RECIPE_GARDEN_CYAN_DYE);
    list.add(RECIPE_GARDEN_PURPLE_DYE);
    list.add(RECIPE_GARDEN_BLUE_DYE);
    list.add(RECIPE_GARDEN_BROWN_DYE);
    list.add(RECIPE_GARDEN_GREEN_DYE);
    list.add(RECIPE_GARDEN_RED_DYE);
    list.add(RECIPE_GARDEN_BLACK_DYE);
    list.add(RECIPE_GARDEN_POTATO);
    list.add(RECIPE_GARDEN_CARROT);
    list.add(RECIPE_GARDEN_BEETROOT);
    list.add(RECIPE_GARDEN_WHEAT);
    list.add(RECIPE_GARDEN_SUGAR_CANE);
    list.add(RECIPE_GARDEN_SWEET_BERRIES);
    list.add(RECIPE_GARDEN_MELON);
    list.add(RECIPE_GARDEN_PUMPKIN);
    list.add(RECIPE_GARDEN_CARVED_PUMPKIN);
    list.add(RECIPE_GARDEN_APPLE);
    list.add(RECIPE_GARDEN_DARK_OAK_SAPLING);
    list.add(RECIPE_GARDEN_JUNGLE_SAPLING);
    list.add(RECIPE_GARDEN_BIRCH_SAPLING);
    list.add(RECIPE_GARDEN_SPRUCE_SAPLING);
    list.add(RECIPE_GARDEN_ACACIA_SAPLING);
    list.add(RECIPE_GARDEN_OAK_SAPLING);
    list.add(RECIPE_GARDEN_CRIMSON_FUNGUS);
    list.add(RECIPE_GARDEN_WARPED_FUNGUS);
    list.add(RECIPE_GARDEN_WITHER_ROSE);
    list.add(RECIPE_GARDEN_NETHER_WART);
    list.add(RECIPE_GARDEN_SNOWBALL);
    list.add(RECIPE_GARDEN_HONEY_BOTTLE);
    list.add(RECIPE_GARDEN_CLAY_BALL);
    list.add(RECIPE_GARDEN_END_STONE);
    list.add(RECIPE_GARDEN_GRANITE);
    list.add(RECIPE_GARDEN_DIORITE);
    list.add(RECIPE_GARDEN_ANDESITE);
    return list;
  }

}
