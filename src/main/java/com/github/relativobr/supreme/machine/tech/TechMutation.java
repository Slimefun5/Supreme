package com.github.relativobr.supreme.machine.tech;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.generic.machine.SimpleItemContainerMachine;
import com.github.relativobr.supreme.generic.recipe.InventoryRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import com.github.relativobr.supreme.util.UtilMachine;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun5.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun5.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun5.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun5.utils.SlimefunUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TechMutation extends SimpleItemContainerMachine implements Radioactive {

  public static final SlimefunItemStack TECH_MUTATION_I = new SupremeItemStack("SUPREME_TECH_MUTATION_I",
      MaterialCompat.safe(XMaterial.SLIME_BLOCK), "&bTech Mutation", "", "&fUse generator mutation ", "&fto progress to higher levels", "",
      LoreBuilder.radioactive(Radioactivity.VERY_HIGH), "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), UtilEnergy.energyPowerPerSecond(500), "",
      "&3Supreme Machine");
  public static final ItemStack[] RECIPE_TECH_MUTATION_I = {SupremeComponents.INDUCTIVE_MACHINE.item(),
      SupremeComponents.SYNTHETIC_RUBY.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SlimefunItems.REINFORCED_PLATE.item(),
      SlimefunItems.NUCLEAR_REACTOR.item(), SlimefunItems.REINFORCED_PLATE.item(), SupremeComponents.RUSTLESS_MACHINE.item(),
      SupremeCore.CORE_OF_DEATH.item(), SupremeComponents.RUSTLESS_MACHINE.item()};

  public static final SlimefunItemStack TECH_MUTATION_II = new SupremeItemStack("SUPREME_TECH_MUTATION_II",
      MaterialCompat.safe(XMaterial.SLIME_BLOCK), "&bTech Mutation II", "", "&fUse generator mutation ", "&fto progress to higher levels", "",
      "&fChance factor multiplied by 2x", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), UtilEnergy.energyPowerPerSecond(500), "",
      "&3Supreme Machine");
  public static final ItemStack[] RECIPE_TECH_MUTATION_II = new ItemStack[]{SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CONVEYANCE_MACHINE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      TechMutation.TECH_MUTATION_I.item(), SupremeComponents.INDUCTOR_MACHINE.item(), SupremeComponents.THORNERITE.item(),
      SupremeCetrus.CETRUS_IGNIS.item(), SupremeComponents.THORNERITE.item()};

  public static final SlimefunItemStack TECH_MUTATION_III = new SupremeItemStack("SUPREME_TECH_MUTATION_III",
      MaterialCompat.safe(XMaterial.SLIME_BLOCK), "&bTech Mutation III", "", "&fUse generator mutation ", "&fto progress to higher levels",
      "", "&fChance factor multiplied by 4x", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), UtilEnergy.energyPowerPerSecond(500), "",
      "&3Supreme Machine");
  public static final ItemStack[] RECIPE_TECH_MUTATION_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeAttribute.getImpetus().item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      TechMutation.TECH_MUTATION_II.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};
  public static final List<MobTechMutationGeneric> recipes = new ArrayList<>();
  private Map<Block, MobTechMutationGeneric> processing = new HashMap<Block, MobTechMutationGeneric>();
  private Map<Block, Integer> progressTime = new HashMap<Block, Integer>();
  private int speed = 1;
  private int upgradeLuck = 1;
  public TechMutation(SlimefunItemStack item, ItemStack[] recipe) {
    super(ItemGroups.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void addRecipeTechMutation(SlimefunItemStack recipe1, SlimefunItemStack recipe2, int chance,
      SlimefunItemStack item) {
    recipes.add(new MobTechMutationGeneric(recipe1, recipe2, chance, item));
  }

  @ParametersAreNonnullByDefault
  public static void addRecipeTechMutation(SlimefunItemStack itemStack1, SlimefunItemStack itemStack2,
      SlimefunItemStack output) {
    TechMutation.addRecipeTechMutation(itemStack1, itemStack2, 100, output);
  }

  private static void invalidProgressBar(BlockMenu menu, String txt) {
    for (int i : InventoryRecipe.TECH_MUTATION_PROGRESS_BAR_SLOT) {
      menu.replaceExistingItem(i, CustomItemStack.create(MaterialCompat.safe(XMaterial.RED_STAINED_GLASS_PANE), txt));
    }
  }

  private static void invalidProgressBar(BlockMenu menu, Material material, String txt) {
    for (int i : InventoryRecipe.TECH_MUTATION_PROGRESS_BAR_SLOT) {
      menu.replaceExistingItem(i, CustomItemStack.create(material, txt));
    }
  }

  @Override
  public int[] getInputSlots() {
    return InventoryRecipe.TECH_MUTATION_INPUT_SLOTS;
  }

  @Override
  public int[] getOutputSlots() {
    return InventoryRecipe.TECH_MUTATION_OUTPUT_SLOTS;
  }

  @Override
  protected void constructMenu(BlockMenuPreset preset) {

    for (int i : InventoryRecipe.TECH_MUTATION_BORDER) {
      preset.addItem(i, CustomItemStack.create(MaterialCompat.safe(XMaterial.GRAY_STAINED_GLASS_PANE), " "),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_MUTATION_BORDER_IN) {
      preset.addItem(i, CustomItemStack.create(MaterialCompat.safe(XMaterial.BLUE_STAINED_GLASS_PANE), " "),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_MUTATION_BORDER_OUT) {
      preset.addItem(i, CustomItemStack.create(MaterialCompat.safe(XMaterial.ORANGE_STAINED_GLASS_PANE), " "),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_MUTATION_PROGRESS_BAR_SLOT) {
      preset.addItem(i, CustomItemStack.create(MaterialCompat.safe(XMaterial.BLACK_STAINED_GLASS_PANE), " "),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_MUTATION_OUTPUT_SLOTS) {
      preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {
        @Override
        public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
          return false;
        }

        @Override
        public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor, ClickAction action) {
          if (cursor == null) {
            return true;
          }
          return cursor.getType() == MaterialCompat.safe(XMaterial.AIR);
        }
      });
    }

  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      @Override
      public void tick(Block b, SlimefunItem sf, Config data) {
        TechMutation.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  @Override
  public void tick(Block b) {

    BlockMenu inv = BlockStorage.getInventory(b);

    final MobTechMutationGeneric itemRecipe = validRecipeItem(inv);
    final MobTechMutationGeneric itemProcessing = processing.get(b);
    if (itemProcessing == null) {

      if (itemRecipe != null) {

        inv.consumeItem(getInputSlots()[0], 1);
        inv.consumeItem(getInputSlots()[1], 1);

        invalidProgressBar(inv, itemRecipe.getOutput().getType(), " ");

        processing.put(b, itemRecipe);
        progressTime.put(b, (getTimeProcess() * 2));

      } else {

        invalidProgressBar(inv, "&cTechMutation unidentified recipe");

      }

    } else {

      if (this.getProgressTime(b) <= 0) {

        if (UtilMachine.getRandomInt() <= (itemProcessing.getChance() * getUpgradeLuck())) {
          inv.pushItem(((ItemStack) itemProcessing.getOutput().item()).clone(), this.getOutputSlots());
          invalidProgressBar(inv, MaterialCompat.safe(XMaterial.BLACK_STAINED_GLASS_PANE), " Success! ");
        } else {
          invalidProgressBar(inv, MaterialCompat.safe(XMaterial.BLACK_STAINED_GLASS_PANE), " Fail! ");
        }

        processing.put(b, null);
        progressTime.put(b, 0);

      } else {

        this.processTicks(b, inv, itemProcessing.getOutput().item());

      }

    }

  }

  public int getProgressTime(Block b) {
    return progressTime.get(b) != null ? progressTime.get(b) : (getTimeProcess() * 2);
  }

  private void processTicks(Block b, BlockMenu inv, ItemStack result) {
    int ticksTotal = getTimeProcess() * 2;
    int ticksLeft = this.getProgressTime(b);
    if (ticksLeft > 0) {

      if (this.takeCharge(b.getLocation())) {

        int time = ticksLeft - this.getSpeed();
        if (time < 0) {
          time = 0;
        }
        progressTime.put(b, time);

        //todo adjust for partial progression in the 3 slots dynamically
        for (int i : InventoryRecipe.TECH_MUTATION_PROGRESS_BAR_SLOT) {
          ChestMenuUtils.updateProgressbar(inv, i, Math.round(ticksLeft / this.getSpeed()),
              Math.round(ticksTotal / this.getSpeed()), result);
        }
      } else {
        invalidProgressBar(inv, "&cNo power to machine");
      }
    } else {
      invalidProgressBar(inv, "&cMachine time failure");
    }
  }

  private MobTechMutationGeneric validRecipeItem(BlockMenu inv) {

    for (MobTechMutationGeneric produce : this.recipes) {
      ItemStack input1 = produce.getInput1().item();
      ItemStack input2 = produce.getInput2().item();
      if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(getInputSlots()[0]), input1, false, false)
          && SlimefunUtils.isItemSimilar(inv.getItemInSlot(getInputSlots()[1]), input2, false, false)) {
        return produce;
      }

    }
    return null;
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    final ItemStack separator = CustomItemStack.create(MaterialCompat.safe(XMaterial.BLACK_STAINED_GLASS_PANE), " ");
    List<ItemStack> displayRecipes = new ArrayList();
    this.recipes
        .stream().filter(Objects::nonNull)
        .forEach(recipe -> {
      int chance = recipe.getChance() * getUpgradeLuck();
      if (chance > 100) {
        chance = 100;
      }
      displayRecipes.add(recipe.getInput1().item());
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.NAME_TAG), " " + chance + "% chance"));
      displayRecipes.add(recipe.getInput2().item());
      displayRecipes.add(recipe.getOutput().item());
      displayRecipes.add(separator);
      displayRecipes.add(separator);
    });
    return displayRecipes;
  }

  public int getSpeed() {
    return speed;
  }

  public TechMutation setSpeed(int speed) {
    this.speed = speed;
    return this;
  }

  public int getUpgradeLuck() {
    return upgradeLuck;
  }

  public TechMutation setUpgradeLuck(int upgradeLuck) {
    if (upgradeLuck < 1) {
      upgradeLuck = 1;
    } else if (upgradeLuck > 4) {
      upgradeLuck = 4;
    }
    this.upgradeLuck = upgradeLuck;
    return this;
  }

  @Nonnull
  @Override
  public Radioactivity getRadioactivity() {
    return Radioactivity.VERY_HIGH;
  }

}