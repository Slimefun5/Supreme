package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.util.CompatUtils;
import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.generic.machine.SimpleItemWithLargeContainerMachine;
import com.github.relativobr.supreme.machine.recipe.MobCollectorMachineRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.libraries.commons.lang.Validate;
import io.github.thebusybiscuit.slimefun5.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun5.utils.ChestMenuUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MobCollector extends SimpleItemWithLargeContainerMachine {

  public static final SlimefunItemStack MOB_COLLECTOR_MACHINE = new SupremeItemStack("SUPREME_MOB_COLLECTOR_MACHINE_I",
      MaterialCompat.safe(XMaterial.RESPAWN_ANCHOR), "&bMob Collector", "", "&fThis machine allows you to collect ",
      "&fitems from nearby mobs. (4 block)", "", "",
      "", "", "", "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_MACHINE = new ItemStack[]{SupremeComponents.RUSTLESS_MACHINE.item(),
      new ItemStack(MaterialCompat.safe(XMaterial.RESPAWN_ANCHOR)), SupremeComponents.RUSTLESS_MACHINE.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SupremeComponents.SYNTHETIC_RUBY.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(),
      SlimefunItems.PROGRAMMABLE_ANDROID_3_BUTCHER.item(), SupremeComponents.ADAMANTIUM_PLATE.item()};

  public static final SlimefunItemStack MOB_COLLECTOR_MACHINE_II = new SupremeItemStack(
      "SUPREME_MOB_COLLECTOR_MACHINE_II", MaterialCompat.safe(XMaterial.RESPAWN_ANCHOR), "&bMob Collector II", "",
      "&fThis machine allows you to collect", "&f items from nearby mobs. (8 block)", "",
      "", "",
      "", "", "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE.item(), SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeComponents.INDUCTOR_MACHINE.item(), MobCollector.MOB_COLLECTOR_MACHINE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeComponents.THORNERITE.item(), SupremeCetrus.CETRUS_IGNIS.item(), SupremeComponents.THORNERITE.item()};

  public static final SlimefunItemStack MOB_COLLECTOR_MACHINE_III = new SupremeItemStack(
      "SUPREME_MOB_COLLECTOR_MACHINE_III", MaterialCompat.safe(XMaterial.RESPAWN_ANCHOR), "&bMob Collector III", "",
      "&fThis machine allows you to collect", "&f items from nearby mobs. (16 block)", "",
      "", "",
      "", "", "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeAttribute.getBomb().item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      MobCollector.MOB_COLLECTOR_MACHINE_II.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

  public static Map<Block, MachineRecipe> processing = new HashMap<>();
  public static Map<Block, Integer> progress = new HashMap<>();
  private final Set<MobCollectorMachineRecipe> mobCollectorMachineRecipes = new HashSet();
  private int mobRange = 4;

  @ParametersAreNonnullByDefault
  public MobCollector(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }


  @Override
  protected void registerDefaultRecipes() {
    SupremeOptions supremeOptions = getSupremeOptions();
    boolean customBc = supremeOptions.isCustomBc();
    this.recipes.clear();
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), this.getSpeed()),
            new ItemStack(MaterialCompat.safe(XMaterial.HONEY_BOTTLE), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "BEE")));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), this.getSpeed()),
            new ItemStack(MaterialCompat.safe(XMaterial.INK_SAC), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "SQUID")));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), this.getSpeed()),
            new ItemStack(MaterialCompat.safe(XMaterial.GLOW_INK_SAC), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "GLOW_SQUID")));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), this.getSpeed()),
            new SlimefunItemStack(SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, this.getSpeed()).item(),
            (n) -> CompatUtils.isEntityType(n, "WITHER")));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), this.getSpeed()),
            new ItemStack(MaterialCompat.safe(XMaterial.DRAGON_BREATH), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "ENDER_DRAGON")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.HONEYCOMB), this.getSpeed()), (n) -> CompatUtils.isEntityType(n, "BEE")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.WHITE_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.WHITE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.ORANGE_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.ORANGE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.MAGENTA_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.MAGENTA));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.LIGHT_BLUE_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.LIGHT_BLUE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.YELLOW_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.YELLOW));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.LIME_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.LIME));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.PINK_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.PINK));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.GRAY_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.GRAY));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.LIGHT_GRAY_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.LIGHT_GRAY));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.CYAN_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.CYAN));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.PURPLE_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.PURPLE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.BLUE_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.BLUE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.BROWN_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.BROWN));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.GREEN_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.GREEN));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
            new ItemStack(MaterialCompat.safe(XMaterial.RED_WOOL), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.RED));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.BLACK_WOOL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SHEEP") && ((Sheep) n).getColor() == DyeColor.BLACK));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
            new ItemStack(MaterialCompat.safe(XMaterial.LEATHER), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "COW")));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
            new ItemStack(MaterialCompat.safe(XMaterial.FEATHER), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "CHICKEN")));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
            new ItemStack(MaterialCompat.safe(XMaterial.SPONGE), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "GUARDIAN")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new ItemStack(MaterialCompat.safe(XMaterial.SPIDER_EYE), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SPIDER")));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
            new ItemStack(MaterialCompat.safe(XMaterial.COAL), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "WITHER_SKELETON")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
        new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON, this.getSpeed()).item(),
        (n) -> CompatUtils.isEntityType(n, "WITHER")));
    if (!customBc) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.SHEARS)),
          new SlimefunItemStack(SlimefunItems.BASIC_CIRCUIT_BOARD, this.getSpeed()).item(),
          (n) -> CompatUtils.isEntityType(n, "IRON_GOLEM")));
    }
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.PHANTOM_MEMBRANE), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "PHANTOM")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.ROTTEN_FLESH), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "ZOMBIE")));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
            new ItemStack(MaterialCompat.safe(XMaterial.BONE), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "SKELETON")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.GUNPOWDER), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "CREEPER")));
    if (!customBc) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
          new ItemStack(MaterialCompat.safe(XMaterial.SLIME_BALL), this.getSpeed()),
          (n) -> CompatUtils.isEntityType(n, "SLIME")));
    }
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.STRING), this.getSpeed()), (n) -> CompatUtils.isEntityType(n, "SPIDER")));
    if (!customBc) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
          new ItemStack(MaterialCompat.safe(XMaterial.WITHER_SKELETON_SKULL), this.getSpeed()),
          (n) -> CompatUtils.isEntityType(n, "WITHER_SKELETON")));
    }
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.ENDER_PEARL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "ENDERMAN")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_ROD), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "BLAZE")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.MAGMA_CREAM), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "MAGMA_CUBE")));
    if (!customBc) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
          new ItemStack(MaterialCompat.safe(XMaterial.NETHER_STAR), this.getSpeed()),
          (n) -> CompatUtils.isEntityType(n, "WITHER")));
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
          new ItemStack(MaterialCompat.safe(XMaterial.GHAST_TEAR), this.getSpeed()),
          (n) -> CompatUtils.isEntityType(n, "GHAST")));
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
          new ItemStack(MaterialCompat.safe(XMaterial.TOTEM_OF_UNDYING), this.getSpeed()),
          (n) -> CompatUtils.isEntityType(n, "RAVAGER")));
    }
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
            new ItemStack(MaterialCompat.safe(XMaterial.BEEF), this.getSpeed()),
            (n) -> CompatUtils.isEntityType(n, "COW")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.PORKCHOP), this.getSpeed()), (n) -> CompatUtils.isEntityType(n, "PIG")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.CHICKEN), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "CHICKEN")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.MUTTON), this.getSpeed()), (n) -> CompatUtils.isEntityType(n, "SHEEP")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.SNOWBALL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "SNOWMAN")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "IRON_GOLEM")));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.NAUTILUS_SHELL), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "DROWNED")));
    if (!customBc) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
          new ItemStack(MaterialCompat.safe(XMaterial.PRISMARINE_SHARD), this.getSpeed()),
          (n) -> CompatUtils.isEntityType(n, "GUARDIAN")));
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
          new ItemStack(MaterialCompat.safe(XMaterial.PRISMARINE_CRYSTALS), this.getSpeed()),
          (n) -> CompatUtils.isEntityType(n, "ELDER_GUARDIAN")));
    }
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD)),
        new ItemStack(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), this.getSpeed()),
        (n) -> CompatUtils.isEntityType(n, "WITCH")));
    if (!customBc) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.GOLD_INGOT)),
              new SlimefunItemStack(SlimefunItems.STRANGE_NETHER_GOO, this.getSpeed()).item(),
              (n) -> CompatUtils.isEntityType(n, "PIGLIN")));
    }
  }


  public void addProduce(@Nonnull MobCollectorMachineRecipe produce) {
    Validate.notNull(produce, "A produce cannot be null");
    this.mobCollectorMachineRecipes.add(produce);
  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      public void tick(Block b, SlimefunItem sf, Config data) {
        MobCollector.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    return MobCollectorMachineRecipe.getAllRecipe();
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
      Iterator iterator = this.mobCollectorMachineRecipes.iterator();

      while (iterator.hasNext()) {
        MobCollectorMachineRecipe produce = (MobCollectorMachineRecipe) iterator.next();
        ItemStack itemInSlot = inv.getItemInSlot(slot);
        final ItemStack itemInInput = produce.getInput()[0];
        if (itemInSlot != null && itemInInput != null && (itemInSlot.getType() == itemInInput.getType())
            && InvUtils.fits(inv.toInventory(), produce.getOutput()[0], this.getOutputSlots())) {
          Block invBlock = inv.getBlock();
          produce.getClass();
          if (this.isAnimalNearby(invBlock, produce::test)) {
            if (itemInSlot.getType() == MaterialCompat.safe(XMaterial.GLASS_BOTTLE)) {
              inv.consumeItem(slot, this.getSpeed());
            } else {
              ItemMeta itemMeta = itemInSlot.getItemMeta();
              if(itemMeta != null && !CompatUtils.isUnbreakable(itemMeta)) {
                int current = CompatUtils.getItemDamage(itemInSlot);
                if (current + 2 >= itemInSlot.getType().getMaxDurability()) {
                  inv.consumeItem(slot);
                } else { //reduce
                  CompatUtils.setItemDamage(itemMeta, itemInSlot, current + 2);
                  itemInSlot.setItemMeta(itemMeta);
                  inv.replaceExistingItem(slot, itemInSlot);
                }
              }
            }
            return produce;
          }
        }
      }
    }

    return null;
  }

  @ParametersAreNonnullByDefault
  private boolean isAnimalNearby(Block b, Predicate<LivingEntity> predicate) {
    return !CompatUtils.getNearbyEntities(b.getWorld(), b.getLocation(), mobRange, mobRange, mobRange, (n) -> {
      return this.isValidAnimal(n, predicate);
    }).isEmpty();
  }

  @ParametersAreNonnullByDefault
  private boolean isValidAnimal(Entity n, Predicate<LivingEntity> predicate) {
    return n instanceof LivingEntity && predicate.test((LivingEntity) n);
  }

  public final MobCollector setMobRange(int value) {
    this.mobRange = value;
    return this;
  }

  @Override
  protected void tick(Block b) {
    BlockMenu inv = BlockStorage.getInventory(b);
    if (inv == null) {
      return;
    }

    if (isProcessing(b)) {

      ItemStack[] recipeOutput = processing.get(b).getOutput();
      if (notHasSpaceOutput(inv, recipeOutput)) {
        updateStatusOutputFull(inv);
        return;
      }

      if (getCharge(b.getLocation()) < getEnergyConsumption()) {
        updateStatusConnectEnergy(inv, recipeOutput[0]);
        return;
      }

      if (takeCharge(b.getLocation())) {
        int timeleft = progress.get(b);
        if (timeleft > 0) {
          ChestMenuUtils.updateProgressbar(inv, getStatusSlot(), timeleft, processing.get(b).getTicks(), getProgressBar());
          int time = timeleft - getSpeed();
          if (time < 0) {
            time = 0;
          }
          progress.put(b, time);
        } else {
          for (ItemStack output : recipeOutput) {
            if(output != null){
              ItemStack clone = output.clone();
              clone.setAmount(1);
              inv.pushItem(clone, getOutputSlots());
            }
          }
          progress.remove(b);
          processing.remove(b);
          updateStatusReset(inv);
        }
      }
    } else {
      MachineRecipe next = findNextRecipe(inv);
      if (next != null) {
        processing.put(b, next);
        progress.put(b, next.getTicks());
      } else {
        updateStatusReset(inv);
      }
    }
  }

  @Nonnull
  @Override
  public String getMachineIdentifier() {
    return "MOB_COLLECTOR";
  }

  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(MaterialCompat.safe(XMaterial.IRON_SWORD));
  }

  public MachineRecipe getProcessing(Block b) {
    return processing.get(b);
  }

  public boolean isProcessing(Block b) {
    return getProcessing(b) != null;
  }

}
