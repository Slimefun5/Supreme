package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.util.CompatUtils;
import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.generic.machine.SimpleItemWithLargeContainerMachine;
import com.github.relativobr.supreme.machine.recipe.VirtualAquariumMachineRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilMachine;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun5.utils.ChestMenuUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import io.github.thebusybiscuit.slimefun5.libraries.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class VirtualAquarium extends SimpleItemWithLargeContainerMachine {

  public static final SlimefunItemStack VIRTUAL_AQUARIUM_MACHINE = new SupremeItemStack("SUPREME_VIRTUAL_AQUARIUM_I", MaterialCompat.safe(XMaterial.DARK_PRISMARINE));
  public static final ItemStack[] RECIPE_VIRTUAL_AQUARIUM_MACHINE = new ItemStack[]{SupremeComponents.SYNTHETIC_RUBY.item(),
      new ItemStack(MaterialCompat.safe(XMaterial.FISHING_ROD)), SupremeComponents.SYNTHETIC_RUBY.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SupremeComponents.PETRIFIER_MACHINE.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.ADAMANTIUM_PLATE.item(),
      SlimefunItems.PROGRAMMABLE_ANDROID_2_FISHERMAN.item(), SupremeComponents.ADAMANTIUM_PLATE.item()};

  public static final SlimefunItemStack VIRTUAL_AQUARIUM_MACHINE_II = new SupremeItemStack("SUPREME_VIRTUAL_AQUARIUM_II", MaterialCompat.safe(XMaterial.DARK_PRISMARINE));
  public static final ItemStack[] RECIPE_VIRTUAL_AQUARIUM_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE.item(), SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SupremeComponents.INDUCTOR_MACHINE.item(), VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeComponents.THORNERITE.item(), SupremeCetrus.CETRUS_IGNIS.item(), SupremeComponents.THORNERITE.item()};

  public static final SlimefunItemStack VIRTUAL_AQUARIUM_MACHINE_III = new SupremeItemStack("SUPREME_VIRTUAL_AQUARIUM_III", MaterialCompat.safe(XMaterial.DARK_PRISMARINE));
  public static final ItemStack[] RECIPE_VIRTUAL_AQUARIUM_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.item(),
      SupremeAttribute.getMagic().item(), SupremeComponents.THORNERITE.item(), SupremeComponents.SUPREME.item(),
      VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_II.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

  public static Map<Block, MachineRecipe> processing = new HashMap<>();
  public static Map<Block, Integer> progress = new HashMap<>();
  private final Set<VirtualAquariumMachineRecipe> virtualAquariumMachineRecipe = new HashSet();

  @ParametersAreNonnullByDefault
  public VirtualAquarium(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  @Override
  protected void registerDefaultRecipes() {
    this.recipes.clear();
    this.addProduce(new VirtualAquariumMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.FISHING_ROD)),
        new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.SPONGE), 2), new ItemStack(MaterialCompat.safe(XMaterial.SEA_LANTERN), 2),
            new ItemStack(MaterialCompat.safe(XMaterial.COD), 20), new ItemStack(MaterialCompat.safe(XMaterial.SALMON), 20),
            new ItemStack(MaterialCompat.safe(XMaterial.TROPICAL_FISH), 20), new ItemStack(MaterialCompat.safe(XMaterial.INK_SAC), 20),
            new ItemStack(MaterialCompat.safe(XMaterial.NAUTILUS_SHELL), 6), new ItemStack(MaterialCompat.safe(XMaterial.STICK), 5),
            new ItemStack(MaterialCompat.safe(XMaterial.STRING), 5)}));
    this.addProduce(new VirtualAquariumMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.TRIDENT)),
        new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.SPONGE), 10), new ItemStack(MaterialCompat.safe(XMaterial.SEA_LANTERN), 10),
            new ItemStack(MaterialCompat.safe(XMaterial.COD), 5), new ItemStack(MaterialCompat.safe(XMaterial.SALMON), 5), new ItemStack(MaterialCompat.safe(XMaterial.TROPICAL_FISH), 5),
            new ItemStack(MaterialCompat.safe(XMaterial.INK_SAC), 5), new ItemStack(MaterialCompat.safe(XMaterial.NAUTILUS_SHELL), 20),
            new ItemStack(MaterialCompat.safe(XMaterial.STICK), 20), new ItemStack(MaterialCompat.safe(XMaterial.STRING), 20)}));
    this.addProduce(new VirtualAquariumMachineRecipe(new ItemStack(MaterialCompat.safe(XMaterial.GOLDEN_HOE)),
        new ItemStack[]{new ItemStack(MaterialCompat.safe(XMaterial.SPONGE), 1), new ItemStack(MaterialCompat.safe(XMaterial.SEA_LANTERN), 1),
            new ItemStack(MaterialCompat.safe(XMaterial.COD), 3), new ItemStack(MaterialCompat.safe(XMaterial.SALMON), 3), new ItemStack(MaterialCompat.safe(XMaterial.TROPICAL_FISH), 2),
            new ItemStack(MaterialCompat.safe(XMaterial.INK_SAC), 2), new ItemStack(MaterialCompat.safe(XMaterial.NAUTILUS_SHELL), 5),
            new ItemStack(MaterialCompat.safe(XMaterial.STICK), 50), new ItemStack(MaterialCompat.safe(XMaterial.STRING), 33)}));

  }


  public void addProduce(@Nonnull VirtualAquariumMachineRecipe produce) {
    Validate.notNull(produce, "A produce cannot be null");
    this.virtualAquariumMachineRecipe.add(produce);
  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      public void tick(Block b, SlimefunItem sf, Config data) {
        VirtualAquarium.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    return VirtualAquariumMachineRecipe.getAllRecipe();
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
      Iterator iterator = this.virtualAquariumMachineRecipe.iterator();

      while (iterator.hasNext()) {
        VirtualAquariumMachineRecipe produce = (VirtualAquariumMachineRecipe) iterator.next();
        ItemStack itemInSlot = inv.getItemInSlot(slot);
        final ItemStack itemInInput = produce.getInput()[0];
        if (itemInSlot != null && itemInInput != null && (itemInSlot.getType() == itemInInput.getType())
            && InvUtils.fits(inv.toInventory(), produce.getOutput()[0], this.getOutputSlots())) {

          ItemMeta itemMeta = itemInSlot.getItemMeta();

          if(itemMeta != null && !CompatUtils.isUnbreakable(itemMeta)){
            int current = CompatUtils.getItemDamage(itemInSlot);
            if (current + 2 >= itemInSlot.getType().getMaxDurability()) {
              inv.consumeItem(slot);
            } else {
              CompatUtils.setItemDamage(itemMeta, itemInSlot, current + 2);
              itemInSlot.setItemMeta(itemMeta);
              inv.replaceExistingItem(slot, itemInSlot);
            }
          }
          return produce;
        }
      }
    }

    return null;
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
          ChestMenuUtils.updateProgressbar(inv, this.getStatusSlot(), timeleft, processing.get(b).getTicks(), getProgressBar());
          int time = timeleft - getSpeed();
          if (time < 0) {
            time = 0;
          }
          progress.put(b, time);
        } else {
          ItemStack material = UtilMachine.getMaterial(recipeOutput, UtilMachine.getRandomInt());
          if (material != null) {
            final ItemStack itemStack = material.clone();
            itemStack.setAmount(1);
            inv.pushItem(itemStack, getOutputSlots());
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
    return "VIRTUAL_AQUARIUM";
  }

  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(MaterialCompat.safe(XMaterial.FISHING_ROD));
  }


  public MachineRecipe getProcessing(Block b) {
    return processing.get(b);
  }

  public boolean isProcessing(Block b) {
    return getProcessing(b) != null;
  }


}
