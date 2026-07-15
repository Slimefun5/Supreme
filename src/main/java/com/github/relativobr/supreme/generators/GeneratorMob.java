package com.github.relativobr.supreme.generators;

import com.github.relativobr.supreme.util.CompatUtils;
import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.implementation.items.electric.AbstractEnergyProvider;
import io.github.thebusybiscuit.slimefun5.libraries.dough.blocks.BlockPosition;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Sheep;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;


public class GeneratorMob extends AbstractEnergyProvider {

  public static final int BASIC_GENERATOR_MOB_ENERGY = 50;
  public static final int BASIC_GENERATOR_MOB_BUFFER = 1000;
  public static final int MEDIUM_GENERATOR_MOB_ENERGY = 200;
  public static final int MEDIUM_GENERATOR_MOB_BUFFER = 4000;
  public static final int ADVANCED_GENERATOR_MOB_ENERGY = 800;
  public static final int ADVANCED_GENERATOR_MOB_BUFFER = 16000;

  public static final SlimefunItemStack GENERATOR_MOB_BASIC = new SupremeItemStack("SUPREME_GENERATOR_MOB_BASIC", MaterialCompat.safe(XMaterial.COMPOSTER));
  public static final ItemStack[] RECIPE_GENERATOR_MOB_BASIC = new ItemStack[]{SlimefunItems.SMALL_CAPACITOR.item(),
      SlimefunItems.SILICON.item(), SlimefunItems.SMALL_CAPACITOR.item(), SlimefunItems.ALUMINUM_INGOT.item(), SlimefunItems.ELECTRIC_MOTOR.item(),
      SlimefunItems.ALUMINUM_INGOT.item(), SlimefunItems.SMALL_CAPACITOR.item(), SlimefunItems.ALUMINUM_INGOT.item(),
      SlimefunItems.SMALL_CAPACITOR.item()};

  public static final SlimefunItemStack GENERATOR_MOB_MEDIUM = new SupremeItemStack("SUPREME_GENERATOR_MOB_MEDIUM", MaterialCompat.safe(XMaterial.COMPOSTER));
  public static final ItemStack[] RECIPE_GENERATOR_MOB_MEDIUM = new ItemStack[]{GeneratorMob.GENERATOR_MOB_BASIC.item(),
      SlimefunItems.FERROSILICON.item(), GeneratorMob.GENERATOR_MOB_BASIC.item(), SlimefunItems.REINFORCED_PLATE.item(),
      SupremeComponents.SYNTHETIC_RUBY.item(), SlimefunItems.REINFORCED_PLATE.item(), GeneratorMob.GENERATOR_MOB_BASIC.item(),
      SlimefunItems.ALUMINUM_BRONZE_INGOT.item(), GeneratorMob.GENERATOR_MOB_BASIC.item()};

  public static final SlimefunItemStack GENERATOR_MOB_ADVANCED = new SupremeItemStack("SUPREME_GENERATOR_MOB_ADVANCED", MaterialCompat.safe(XMaterial.COMPOSTER));
  public static final ItemStack[] RECIPE_GENERATOR_MOB_ADVANCED = new ItemStack[]{GeneratorMob.GENERATOR_MOB_MEDIUM.item(),
      SlimefunItems.CARBONADO.item(), GeneratorMob.GENERATOR_MOB_MEDIUM.item(), SlimefunItems.HEATING_COIL.item(), SlimefunItems.PLUTONIUM.item(),
      SlimefunItems.HEATING_COIL.item(), GeneratorMob.GENERATOR_MOB_MEDIUM.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      GeneratorMob.GENERATOR_MOB_MEDIUM.item()};
  protected static final Map<BlockPosition, UUID> cachedMob = new ConcurrentHashMap<>();

  private int energy;
  private int buffer;
  private int mobRange = 3;

  public GeneratorMob(SlimefunItemStack item, ItemStack[] recipe) {
    super(ItemGroups.ELECTRIC_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

  public final GeneratorMob setEnergy(int value) {
    this.energy = value;
    return this;
  }

  public final GeneratorMob setBuffer(int value) {
    this.buffer = value;
    return this;
  }

  public final GeneratorMob setMobRange(int value) {
    this.mobRange = value;
    return this;
  }

  @Nonnull
  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(MaterialCompat.safe(XMaterial.OBSERVER));
  }

  @Override
  public int getEnergyProduction() {
    return energy;
  }

  @Override
  protected void registerDefaultFuelTypes() {}

  @Override
  @ParametersAreNonnullByDefault
  public int getGeneratedOutput(Location l, Config config) {
    return isAnimalNearby(l) ? getEnergyProduction() : 0;
  }

  @Override
  public int getCapacity() {
    return this.buffer;
  }

  @Override
  public int[] getInputSlots() {
    return new int[0];
  }

  @Override
  public int[] getOutputSlots() {
    return new int[0];
  }

  @ParametersAreNonnullByDefault
  private boolean isAnimalNearby(@Nonnull Location l) {
    BlockPosition p = new BlockPosition(l);
    updateSet(p, l);
    return cachedMob.containsKey(p);
  }

  private boolean isAnimalNearby(@Nonnull Location l, @Nullable UUID uuid) {
    if (uuid == null) {
      return false;
    }
    Entity entity = CompatUtils.getEntity(uuid);
    return entity != null && l.distanceSquared(entity.getLocation()) <= Math.pow(mobRange, 2);
  }

  @ParametersAreNonnullByDefault
  private boolean isValidAnimal(Entity n) {
    return n instanceof Cow || n instanceof Sheep || n instanceof Pig;
  }

  private UUID locateNearbyMob(@Nonnull Location l) {
    return CompatUtils.getNearbyEntities(l.getWorld(), l, mobRange, mobRange, mobRange, this::isValidAnimal).stream().findFirst().map(Entity::getUniqueId).orElse(null);
  }

  @ParametersAreNonnullByDefault
  private void updateSet(@Nonnull BlockPosition p, @Nonnull Location l) {
    Slimefun.runSync(() -> {
      UUID uuid = cachedMob.getOrDefault(p, locateNearbyMob(l));
      if (isAnimalNearby(l, uuid)) {
        cachedMob.put(p, uuid);
      } else {
        cachedMob.remove(p);
      }
    });
  }
}
