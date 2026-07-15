package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.generic.machine.GenericMachine;
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
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MagicAltar extends GenericMachine {

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE = new SupremeItemStack("SUPREME_MAGIC_ALTAR_I", MaterialCompat.safe(XMaterial.SMOKER));
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE = new ItemStack[]{SlimefunItems.ANCIENT_PEDESTAL.item(),
      SupremeComponents.SYNTHETIC_RUBY.item(), SlimefunItems.ANCIENT_PEDESTAL.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SlimefunItems.ANCIENT_ALTAR.item(), SupremeComponents.CONVEYANCE_MACHINE.item(), SlimefunItems.ANCIENT_PEDESTAL.item(),
      SupremeComponents.INDUCTOR_MACHINE.item(), SlimefunItems.ANCIENT_PEDESTAL.item()};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_II = new SupremeItemStack("SUPREME_MAGIC_ALTAR_II", MaterialCompat.safe(XMaterial.SMOKER));
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_II = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeCetrus.CETRUS_AQUA.item(), SupremeComponents.THORNERITE.item(), SupremeCetrus.CETRUS_VENTUS.item(),
      MagicAltar.MAGIC_ALTAR_MACHINE.item(), SupremeCetrus.CETRUS_LUX.item(), SupremeComponents.THORNERITE.item(),
      SupremeCetrus.CETRUS_IGNIS.item(), SupremeComponents.THORNERITE.item()};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_III = new SupremeItemStack("SUPREME_MAGIC_ALTAR_III", MaterialCompat.safe(XMaterial.SMOKER));
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeAttribute.getMagic().item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      MagicAltar.MAGIC_ALTAR_MACHINE_II.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};
	
	public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.FEATHER)), SlimefunItems.MAGIC_LUMP_1.item(), new ItemStack(MaterialCompat.safe(XMaterial.FEATHER)),
					new ItemStack(MaterialCompat.safe(XMaterial.GHAST_TEAR)), SlimefunItems.BLANK_RUNE.item(), new ItemStack(MaterialCompat.safe(XMaterial.GHAST_TEAR)),
					new ItemStack(MaterialCompat.safe(XMaterial.FEATHER)), SlimefunItems.MAGIC_LUMP_1.item(), new ItemStack(MaterialCompat.safe(XMaterial.FEATHER))},
			new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4).item());
	public static final AbstractItemRecipe RECIPE_RUNE_EARTH = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.DIRT)), SlimefunItems.MAGIC_LUMP_1.item(), new ItemStack(MaterialCompat.safe(XMaterial.STONE)),
					new ItemStack(MaterialCompat.safe(XMaterial.OBSIDIAN)), SlimefunItems.BLANK_RUNE.item(), new ItemStack(MaterialCompat.safe(XMaterial.OBSIDIAN)),
					new ItemStack(MaterialCompat.safe(XMaterial.STONE)), SlimefunItems.MAGIC_LUMP_1.item(), new ItemStack(MaterialCompat.safe(XMaterial.DIRT))},
			new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 4).item());
	public static final AbstractItemRecipe RECIPE_RUNE_FIRE = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.FIRE_CHARGE)), SlimefunItems.MAGIC_LUMP_2.item(), new ItemStack(MaterialCompat.safe(XMaterial.FIRE_CHARGE)),
					new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_POWDER)), SlimefunItems.EARTH_RUNE.item(), new ItemStack(MaterialCompat.safe(XMaterial.FLINT_AND_STEEL)),
					new ItemStack(MaterialCompat.safe(XMaterial.FIRE_CHARGE)), SlimefunItems.MAGIC_LUMP_2.item(), new ItemStack(MaterialCompat.safe(XMaterial.FIRE_CHARGE))},
			new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 4).item());
	public static final AbstractItemRecipe RECIPE_RUNE_WATER = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.SALMON)), SlimefunItems.MAGIC_LUMP_2.item(), new ItemStack(MaterialCompat.safe(XMaterial.WATER_BUCKET)),
					new ItemStack(MaterialCompat.safe(XMaterial.SAND)), SlimefunItems.BLANK_RUNE.item(), new ItemStack(MaterialCompat.safe(XMaterial.SAND)),
					new ItemStack(MaterialCompat.safe(XMaterial.WATER_BUCKET)), SlimefunItems.MAGIC_LUMP_2.item(), new ItemStack(MaterialCompat.safe(XMaterial.COD))},
			new SlimefunItemStack(SlimefunItems.WATER_RUNE, 4).item());
	public static final AbstractItemRecipe RECIPE_RUNE_ENDER = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.ENDER_PEARL)), SlimefunItems.ENDER_LUMP_3.item(), new ItemStack(MaterialCompat.safe(XMaterial.ENDER_PEARL)),
					new ItemStack(MaterialCompat.safe(XMaterial.ENDER_EYE)), SlimefunItems.BLANK_RUNE.item(), new ItemStack(MaterialCompat.safe(XMaterial.ENDER_EYE)),
					new ItemStack(MaterialCompat.safe(XMaterial.ENDER_PEARL)), SlimefunItems.ENDER_LUMP_3.item(), new ItemStack(MaterialCompat.safe(XMaterial.ENDER_PEARL))},
			new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 6).item());
	public static final AbstractItemRecipe RECIPE_RUNE_LIGHTNING = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)), SlimefunItems.MAGIC_LUMP_3.item(), new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)),
					SlimefunItems.AIR_RUNE.item(), new ItemStack(MaterialCompat.safe(XMaterial.PHANTOM_MEMBRANE)), SlimefunItems.WATER_RUNE.item(),
					new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)), SlimefunItems.MAGIC_LUMP_3.item(), new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT))},
			new SlimefunItemStack(SlimefunItems.LIGHTNING_RUNE, 4).item());
	public static final AbstractItemRecipe RECIPE_RUNE_RAINBOW = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.RED_DYE)), SlimefunItems.MAGIC_LUMP_3.item(), new ItemStack(MaterialCompat.safe(XMaterial.CYAN_DYE)),
					new ItemStack(MaterialCompat.safe(XMaterial.WHITE_WOOL)), SlimefunItems.ENDER_RUNE.item(), new ItemStack(MaterialCompat.safe(XMaterial.WHITE_WOOL)),
					new ItemStack(MaterialCompat.safe(XMaterial.YELLOW_DYE)), SlimefunItems.ENDER_LUMP_3.item(), new ItemStack(MaterialCompat.safe(XMaterial.MAGENTA_DYE))},
			new SlimefunItemStack(SlimefunItems.RAINBOW_RUNE, 1).item());
	public static final AbstractItemRecipe RECIPE_RUNE_SOULBOUND = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_3.item(), SlimefunItems.ESSENCE_OF_AFTERLIFE.item(), SlimefunItems.MAGIC_LUMP_3.item(),
					SlimefunItems.ENDER_LUMP_3.item(), SlimefunItems.ENDER_RUNE.item(), SlimefunItems.ENDER_LUMP_3.item(),
					SlimefunItems.MAGIC_LUMP_3.item(), SlimefunItems.ESSENCE_OF_AFTERLIFE.item(), SlimefunItems.MAGIC_LUMP_3.item()},
			new SlimefunItemStack(SlimefunItems.SOULBOUND_RUNE, 1).item());
	public static final AbstractItemRecipe RECIPE_RUNE_ENCHANTMENT = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_3.item(), SlimefunItems.MAGICAL_GLASS.item(), SlimefunItems.MAGIC_LUMP_3.item(),
					SlimefunItems.MAGICAL_GLASS.item(), SlimefunItems.LIGHTNING_RUNE.item(), SlimefunItems.MAGICAL_GLASS.item(),
					SlimefunItems.MAGIC_LUMP_3.item(), SlimefunItems.MAGICAL_GLASS.item(), SlimefunItems.MAGIC_LUMP_3.item()},
			new SlimefunItemStack(SlimefunItems.ENCHANTMENT_RUNE, 1).item());
	public static final AbstractItemRecipe RECIPE_RUNE_VILLAGERS = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_3.item(), SlimefunItems.MAGICAL_GLASS.item(), new ItemStack(MaterialCompat.safe(XMaterial.CRYING_OBSIDIAN)),
					SlimefunItems.STRANGE_NETHER_GOO.item(), SlimefunItems.FIRE_RUNE.item(), SlimefunItems.STRANGE_NETHER_GOO.item(),
					new ItemStack(MaterialCompat.safe(XMaterial.CRYING_OBSIDIAN)), SlimefunItems.MAGICAL_GLASS.item(), SlimefunItems.MAGIC_LUMP_3.item()},
			new SlimefunItemStack(SlimefunItems.VILLAGER_RUNE, 3).item());
	public static final AbstractItemRecipe RECIPE_BLANK_RUNE = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.STONE)), SlimefunItems.MAGIC_LUMP_1.item(), new ItemStack(MaterialCompat.safe(XMaterial.STONE)),
					SlimefunItems.MAGIC_LUMP_1.item(), new ItemStack(MaterialCompat.safe(XMaterial.OBSIDIAN)), SlimefunItems.MAGIC_LUMP_1.item(),
					new ItemStack(MaterialCompat.safe(XMaterial.STONE)), SlimefunItems.MAGIC_LUMP_1.item(), new ItemStack(MaterialCompat.safe(XMaterial.STONE))},
			new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item());
	public static final AbstractItemRecipe RECIPE_ESSENCE_OF_AFTERLIFE = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.ENDER_LUMP_3.item(), SlimefunItems.AIR_RUNE.item(), SlimefunItems.ENDER_LUMP_3.item(),
					SlimefunItems.EARTH_RUNE.item(), SlimefunItems.NECROTIC_SKULL.item(), SlimefunItems.FIRE_RUNE.item(),
					SlimefunItems.ENDER_LUMP_3.item(), SlimefunItems.WATER_RUNE.item(), SlimefunItems.ENDER_LUMP_3.item()},
			new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item());
	public static final AbstractItemRecipe RECIPE_LAVA_CRYSTAL = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_1.item(), new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_POWDER)), SlimefunItems.MAGIC_LUMP_1.item(),
					new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_POWDER)), SlimefunItems.FIRE_RUNE.item(), new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_POWDER)),
					SlimefunItems.MAGIC_LUMP_1.item(), new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_POWDER)), SlimefunItems.MAGIC_LUMP_1.item()},
			new SlimefunItemStack(SlimefunItems.LAVA_CRYSTAL, 1).item());
	public static final AbstractItemRecipe RECIPE_MAGICAL_GLASS = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_2.item(), SlimefunItems.GOLD_DUST.item(), SlimefunItems.MAGIC_LUMP_2.item(),
					new ItemStack(MaterialCompat.safe(XMaterial.EXPERIENCE_BOTTLE)), new ItemStack(MaterialCompat.safe(XMaterial.GLASS_PANE)), new ItemStack(MaterialCompat.safe(XMaterial.EXPERIENCE_BOTTLE)),
					SlimefunItems.MAGIC_LUMP_2.item(), new ItemStack(MaterialCompat.safe(XMaterial.EXPERIENCE_BOTTLE)), SlimefunItems.MAGIC_LUMP_2.item()},
			new SlimefunItemStack(SlimefunItems.MAGICAL_GLASS, 1).item());
	public static final AbstractItemRecipe RECIPE_COMMON_TALISMAN = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_2.item(), SlimefunItems.GOLD_8K.item(), SlimefunItems.MAGIC_LUMP_2.item(),
					null, new ItemStack(MaterialCompat.safe(XMaterial.EMERALD)), null,
					SlimefunItems.MAGIC_LUMP_2.item(), SlimefunItems.GOLD_8K.item(), SlimefunItems.MAGIC_LUMP_2.item()},
			new SlimefunItemStack(SlimefunItems.COMMON_TALISMAN, 1).item());
	public static final AbstractItemRecipe RECIPE_MAGICAL_BOOK_COVER = new AbstractItemRecipe(
			new ItemStack[]{null, SlimefunItems.MAGIC_LUMP_2.item(), null,
					SlimefunItems.MAGIC_LUMP_2.item(), new ItemStack(MaterialCompat.safe(XMaterial.BOOK)), SlimefunItems.MAGIC_LUMP_2.item(),
					null, SlimefunItems.MAGIC_LUMP_2.item(), null},
			new SlimefunItemStack(SlimefunItems.MAGICAL_BOOK_COVER, 1).item());
	public static final AbstractItemRecipe RECIPE_POWER_CRYSTAL = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.REDSTONE)), SlimefunItems.SYNTHETIC_SAPPHIRE.item(), new ItemStack(MaterialCompat.safe(XMaterial.REDSTONE)),
					SlimefunItems.SYNTHETIC_SAPPHIRE.item(), SlimefunItems.SYNTHETIC_DIAMOND.item(), SlimefunItems.SYNTHETIC_SAPPHIRE.item(),
					new ItemStack(MaterialCompat.safe(XMaterial.REDSTONE)), SlimefunItems.SYNTHETIC_SAPPHIRE.item(), new ItemStack(MaterialCompat.safe(XMaterial.REDSTONE))},
			new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL, 1).item());
	public static final AbstractItemRecipe RECIPE_ELYTRA_SCALE = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.ENDER_LUMP_3.item(), SlimefunItems.AIR_RUNE.item(), SlimefunItems.ENDER_LUMP_3.item(),
					new ItemStack(MaterialCompat.safe(XMaterial.PHANTOM_MEMBRANE)), new ItemStack(MaterialCompat.safe(XMaterial.FEATHER)), new ItemStack(MaterialCompat.safe(XMaterial.PHANTOM_MEMBRANE)),
					SlimefunItems.ENDER_LUMP_3.item(), SlimefunItems.AIR_RUNE.item(), SlimefunItems.ENDER_LUMP_3.item()},
			new SlimefunItemStack(SlimefunItems.ELYTRA_SCALE, 1).item());
	public static final AbstractItemRecipe RECIPE_ELITROS = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.ELYTRA_SCALE.item(), SlimefunItems.AIR_RUNE.item(), SlimefunItems.ELYTRA_SCALE.item(),
					SlimefunItems.AIR_RUNE.item(), new ItemStack(MaterialCompat.safe(XMaterial.LEATHER_CHESTPLATE)), SlimefunItems.AIR_RUNE.item(),
					SlimefunItems.ELYTRA_SCALE.item(), SlimefunItems.AIR_RUNE.item(), SlimefunItems.ELYTRA_SCALE.item()},
			new ItemStack(MaterialCompat.safe(XMaterial.ELYTRA), 1));
	public static final AbstractItemRecipe RECIPE_INFUSED_ELYTRA = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.FLASK_OF_KNOWLEDGE.item(), SlimefunItems.ELYTRA_SCALE.item(), SlimefunItems.FLASK_OF_KNOWLEDGE.item(),
					SlimefunItems.FLASK_OF_KNOWLEDGE.item(), new ItemStack(MaterialCompat.safe(XMaterial.ELYTRA)), SlimefunItems.FLASK_OF_KNOWLEDGE.item(),
					SlimefunItems.FLASK_OF_KNOWLEDGE.item(), SlimefunItems.ELYTRA_SCALE.item(), SlimefunItems.FLASK_OF_KNOWLEDGE.item()},
			new SlimefunItemStack(SlimefunItems.INFUSED_ELYTRA, 1).item());
	
  public MagicAltar(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_RUNE_AIR);
    list.add(RECIPE_RUNE_EARTH);
    list.add(RECIPE_RUNE_FIRE);
    list.add(RECIPE_RUNE_WATER);
    list.add(RECIPE_RUNE_ENDER);
    list.add(RECIPE_RUNE_LIGHTNING);
    list.add(RECIPE_RUNE_RAINBOW);
    list.add(RECIPE_RUNE_SOULBOUND);
    list.add(RECIPE_RUNE_ENCHANTMENT);
    list.add(RECIPE_RUNE_VILLAGERS);
    list.add(RECIPE_BLANK_RUNE);
    list.add(RECIPE_ESSENCE_OF_AFTERLIFE);
    list.add(RECIPE_LAVA_CRYSTAL);
    list.add(RECIPE_MAGICAL_GLASS);
    list.add(RECIPE_COMMON_TALISMAN);
    list.add(RECIPE_MAGICAL_BOOK_COVER);
    list.add(RECIPE_POWER_CRYSTAL);
    list.add(RECIPE_ELYTRA_SCALE);
    list.add(RECIPE_ELITROS);
    list.add(RECIPE_INFUSED_ELYTRA);
    return list;
  }

}
