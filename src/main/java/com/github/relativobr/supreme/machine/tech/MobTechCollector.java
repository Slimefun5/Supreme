package com.github.relativobr.supreme.machine.tech;

import com.github.relativobr.supreme.util.CompatUtils;
import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.generic.machine.SimpleItemWithLargeContainerMachine;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.tools.MobCollectorTools;
import com.github.relativobr.supreme.machine.recipe.MobTechCollectorMachineRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.resource.mobtech.ZombieTech;
import com.github.relativobr.supreme.util.ItemUtil;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun5.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun5.utils.SlimefunUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import io.github.thebusybiscuit.slimefun5.libraries.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

public class MobTechCollector extends SimpleItemWithLargeContainerMachine {

  public static final SlimefunItemStack MOB_TECH_COLLECTOR_MACHINE_I = new SupremeItemStack(
      "MOB_TECH_COLLECTOR_MACHINE", MaterialCompat.safe(XMaterial.NETHER_GOLD_ORE), "&bMobTech Collector I", "",
      "&fThis machine allows you to collect ", "&fMobTech head nearby mobs. (3 block)", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MOB_TECH_COLLECTOR_MACHINE_I = new ItemStack[]{
      SupremeComponents.RUSTLESS_MACHINE.item(), MobCollectorTools.MOB_COLLECTOR_I.item(), SupremeComponents.RUSTLESS_MACHINE.item(),
      SupremeComponents.INDUCTIVE_MACHINE.item(), MobCollectorTools.MOB_COLLECTOR_I.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SupremeComponents.AURUM_PLATE.item(), SlimefunItems.PROGRAMMABLE_ANDROID_3_BUTCHER.item(), SupremeComponents.AURUM_PLATE.item()};

  public static final SlimefunItemStack MOB_TECH_COLLECTOR_MACHINE_II = new SupremeItemStack(
      "SUPREME_MOB_TECH_COLLECTOR_MACHINE_II", MaterialCompat.safe(XMaterial.NETHER_GOLD_ORE), "&bMobTech Collector II", "",
      "&fThis machine allows you to collect ", "&fMobTech head nearby mobs. (6 block)", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MOB_TECH_COLLECTOR_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE.item(), SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeComponents.INDUCTOR_MACHINE.item(), MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_I.item(),
      SupremeComponents.INDUCTOR_MACHINE.item(), SupremeComponents.THORNERITE.item(), SupremeCetrus.CETRUS_IGNIS.item(),
      SupremeComponents.THORNERITE.item()};

  public static final SlimefunItemStack MOB_TECH_COLLECTOR_MACHINE_III = new SupremeItemStack(
      "SUPREME_MOB_TECH_COLLECTOR_MACHINE_III", MaterialCompat.safe(XMaterial.NETHER_GOLD_ORE), "&bMobTech Collector III", "",
      "&fThis machine allows you to collect ", "&fMobTech head nearby mobs. (9 block)", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MOB_TECH_COLLECTOR_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeCetrus.CETRUS_LUX.item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_II.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};


  private final Set<MobTechCollectorMachineRecipe> MobTechCollectorMachineRecipes = new HashSet();
  private int mobRange = 4;

  @ParametersAreNonnullByDefault
  public MobTechCollector(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }


  @Override
  protected void registerDefaultRecipes() {
    this.recipes.clear();
    SupremeOptions supremeOptions = Supreme.getSupremeOptions();
    if (supremeOptions.isMobTechEnableBee()) {
      this.addProduce(new MobTechCollectorMachineRecipe(SupremeComponents.EMPTY_MOBTECH,
          ItemUtil.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0), (n) -> CompatUtils.isEntityType(n, "BEE")));
    }
    if (supremeOptions.isMobTechEnableIronGolem()) {
      this.addProduce(new MobTechCollectorMachineRecipe(SupremeComponents.EMPTY_MOBTECH,
          ItemUtil.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0), (n) -> n instanceof IronGolem));
    }
    if (supremeOptions.isMobTechEnableZombie()) {
      this.addProduce(new MobTechCollectorMachineRecipe(SupremeComponents.EMPTY_MOBTECH,
          ItemUtil.buildItemFromMobTechDTO(ZombieTech.SIMPLE_ZOMBIE, 0), (n) -> n instanceof Zombie));
    }
  }


  public void addProduce(@Nonnull MobTechCollectorMachineRecipe produce) {
    Validate.notNull(produce, "A produce cannot be null");
    this.MobTechCollectorMachineRecipes.add(produce);
  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      public void tick(Block b, SlimefunItem sf, Config data) {
        MobTechCollector.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    return MobTechCollectorMachineRecipe.getAllRecipe();
  }

  @Nonnull
  @Override
  public String getRecipeSectionLabel(@Nonnull Player p) {
    return "&7Collects:";
  }


  @Override
  protected MachineRecipe findNextRecipe(@Nonnull BlockMenu inv) {
    int[] inputSlots = this.getInputSlots();

    for (int i = 0; i < inputSlots.length; ++i) {
      int slot = inputSlots[i];
      Iterator iterator = this.MobTechCollectorMachineRecipes.iterator();

      while (iterator.hasNext()) {
        MobTechCollectorMachineRecipe produce = (MobTechCollectorMachineRecipe) iterator.next();
        ItemStack itemInSlot = inv.getItemInSlot(slot);
        final ItemStack itemInInput = produce.getInput()[0];
        if (itemInSlot != null && itemInInput != null && SlimefunUtils.isItemSimilar(itemInSlot,
            SupremeComponents.EMPTY_MOBTECH.item(), false, false) && InvUtils.fits(inv.toInventory(), produce.getOutput()[0],
            this.getOutputSlots())) {
          Block invBlock = inv.getBlock();
          produce.getClass();
          if (this.isAnimalNearby(invBlock, produce::test)) {
            inv.consumeItem(slot, 1);
            return produce;
          }
        }
      }
    }

    return null;
  }

  @ParametersAreNonnullByDefault
  private boolean isAnimalNearby(Block b, Predicate<LivingEntity> predicate) {
    return !b.getWorld().getNearbyEntities(b.getLocation(), mobRange, mobRange, mobRange, (n) -> {
      final boolean validAnimal = this.isValidAnimal(n, predicate);
      if (validAnimal) {
        n.remove();
      }
      return validAnimal;
    }).isEmpty();
  }

  @ParametersAreNonnullByDefault
  private boolean isValidAnimal(Entity n, Predicate<LivingEntity> predicate) {
    return n instanceof LivingEntity && predicate.test((LivingEntity) n);
  }

  @Nonnull
  @Override
  public String getMachineIdentifier() {
    return "MOB_TECH_COLLECTOR";
  }

  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD));
  }

  public final MobTechCollector setMobRange(int value) {
    this.mobRange = value;
    return this;
  }

}
