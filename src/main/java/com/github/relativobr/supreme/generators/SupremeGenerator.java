package com.github.relativobr.supreme.generators;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import static com.github.relativobr.supreme.util.ItemUtil.getValueGeneratorsWithLimit;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun5.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeGenerator {

  public static final SlimefunItemStack BASIC_IGNIS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_IGNIS_GENERATOR",
      MaterialCompat.safe(XMaterial.ORANGE_CONCRETE), false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicIgnisBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicIgnisEnergy())));
  public static final ItemStack[] RECIPE_BASIC_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_AURUM.item(),
      SupremeCoreAlloy.RESOURCE_CORE_REDSTONE.item(), SupremeComponents.ALLOY_AURUM.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SlimefunItems.COAL_GENERATOR_2.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.CARRIAGE_MACHINE.item(),
      SlimefunItems.STAFF_FIRE.item(), SupremeComponents.CARRIAGE_MACHINE.item()};

  public static final SlimefunItemStack IGNIS_GENERATOR = new SupremeItemStack("SUPREME_IGNIS_GENERATOR",
      MaterialCompat.safe(XMaterial.ORANGE_GLAZED_TERRACOTTA), false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorIgnisBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorIgnisEnergy())));
  public static final ItemStack[] RECIPE_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.AURUM_PLATE.item(),
      SupremeCetrus.CETRUS_IGNIS.item(), SupremeComponents.AURUM_PLATE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeGenerator.BASIC_IGNIS_GENERATOR.item(), SupremeComponents.INDUCTOR_MACHINE.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SlimefunItems.STAFF_FIRE.item(), SupremeComponents.CONVEYANCE_MACHINE.item()};

  public static final SlimefunItemStack BASIC_VENTUS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_VENTUS_GENERATOR",
      MaterialCompat.safe(XMaterial.LIGHT_BLUE_CONCRETE), false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicVentusBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicVentusEnergy())));
  public static final ItemStack[] RECIPE_BASIC_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_IRIDIUM.item(),
      SupremeCoreAlloy.RESOURCE_CORE_LAPIS.item(), SupremeComponents.ALLOY_IRIDIUM.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SlimefunItems.BIO_REACTOR.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.CARRIAGE_MACHINE.item(),
      SlimefunItems.STAFF_WIND.item(), SupremeComponents.CARRIAGE_MACHINE.item()};

  public static final SlimefunItemStack VENTUS_GENERATOR = new SupremeItemStack("SUPREME_VENTUS_GENERATOR",
      MaterialCompat.safe(XMaterial.LIGHT_BLUE_GLAZED_TERRACOTTA), false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorVentusBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorVentusEnergy())));
  public static final ItemStack[] RECIPE_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.IRIDIUM_PLATE.item(),
      SupremeCetrus.CETRUS_VENTUS.item(), SupremeComponents.IRIDIUM_PLATE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeGenerator.BASIC_VENTUS_GENERATOR.item(), SupremeComponents.INDUCTOR_MACHINE.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SlimefunItems.STAFF_WIND.item(), SupremeComponents.CONVEYANCE_MACHINE.item()};

  public static final SlimefunItemStack BASIC_AQUA_GENERATOR = new SupremeItemStack("SUPREME_BASIC_AQUA_GENERATOR",
      MaterialCompat.safe(XMaterial.BLUE_CONCRETE), false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicAquaBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicAquaEnergy())));
  public static final ItemStack[] RECIPE_BASIC_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_MANGANESE.item(),
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.item(), SupremeComponents.ALLOY_MANGANESE.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SlimefunItems.MAGNESIUM_GENERATOR.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.CARRIAGE_MACHINE.item(),
      SlimefunItems.STAFF_WATER.item(), SupremeComponents.CARRIAGE_MACHINE.item()};

  public static final SlimefunItemStack AQUA_GENERATOR = new SupremeItemStack("SUPREME_AQUA_GENERATOR",
      MaterialCompat.safe(XMaterial.BLUE_GLAZED_TERRACOTTA), false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorAquaBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorAquaEnergy())), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.MANGANESE_PLATE.item(),
      SupremeCetrus.CETRUS_AQUA.item(), SupremeComponents.MANGANESE_PLATE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeGenerator.BASIC_AQUA_GENERATOR.item(), SupremeComponents.INDUCTOR_MACHINE.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SlimefunItems.STAFF_WATER.item(), SupremeComponents.CONVEYANCE_MACHINE.item()};

  public static final SlimefunItemStack BASIC_LUX_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUX_GENERATOR",
      MaterialCompat.safe(XMaterial.WHITE_CONCRETE), false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLuxBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLuxEnergy())));
  public static final ItemStack[] RECIPE_BASIC_LUX_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_TITANIUM.item(),
      SupremeCoreAlloy.RESOURCE_CORE_QUARTZ.item(), SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SlimefunItems.SOLAR_GENERATOR_4.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.CARRIAGE_MACHINE.item(),
      SlimefunItems.STAFF_STORM.item(), SupremeComponents.CARRIAGE_MACHINE.item()};

  public static final SlimefunItemStack LUX_GENERATOR = new SupremeItemStack("SUPREME_LUX_GENERATOR",
      MaterialCompat.safe(XMaterial.WHITE_GLAZED_TERRACOTTA), false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLuxBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLuxEnergy())));
  public static final ItemStack[] RECIPE_LUX_GENERATOR = new ItemStack[]{SupremeComponents.TITANIUM_PLATE.item(),
      SupremeCetrus.CETRUS_LUX.item(), SupremeComponents.TITANIUM_PLATE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeGenerator.BASIC_LUX_GENERATOR.item(), SupremeComponents.INDUCTOR_MACHINE.item(), SupremeComponents.CONVEYANCE_MACHINE.item(),
      SlimefunItems.STAFF_STORM.item(), SupremeComponents.CONVEYANCE_MACHINE.item()};

  public static final SlimefunItemStack BASIC_LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUMIUM_GENERATOR",
      MaterialCompat.safe(XMaterial.BROWN_CONCRETE), false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLumiumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLumiumEnergy())));
  public static final ItemStack[] RECIPE_BASIC_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_ADAMANTIUM.item(),
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE.item(), SupremeComponents.ALLOY_ADAMANTIUM.item(), SupremeComponents.INDUCTIVE_MACHINE.item(),
      SlimefunItems.LAVA_GENERATOR_2.item(), SupremeComponents.INDUCTIVE_MACHINE.item(), SupremeComponents.PETRIFIER_MACHINE.item(),
      SlimefunItems.GEO_MINER.item(), SupremeComponents.PETRIFIER_MACHINE.item()};

  public static final SlimefunItemStack LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_LUMIUM_GENERATOR",
      MaterialCompat.safe(XMaterial.BROWN_GLAZED_TERRACOTTA), false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLumiumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLumiumEnergy())));
  public static final ItemStack[] RECIPE_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE.item(),
      SupremeCetrus.CETRUS_LUMIUM.item(), SupremeComponents.ADAMANTIUM_PLATE.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeGenerator.BASIC_LUMIUM_GENERATOR.item(), SupremeComponents.INDUCTOR_MACHINE.item(),
      SupremeComponents.CRYSTALLIZER_MACHINE.item(), SlimefunItems.GEO_MINER.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

  public static final SlimefunItemStack THORNIUM_GENERATOR = new SupremeItemStack("SUPREME_THORNIUM_GENERATOR",
      MaterialCompat.safe(XMaterial.BLACK_GLAZED_TERRACOTTA), false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorThorniumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorThorniumEnergy())));
  public static final ItemStack[] RECIPE_THORNIUM_GENERATOR = new ItemStack[]{SupremeComponents.THORNIUM_ENERGIZED.item(),
      SupremeGenerator.IGNIS_GENERATOR.item(), SupremeComponents.THORNIUM_ENERGIZED.item(), SupremeComponents.THORNIUM_ENERGIZED.item(),
      SupremeGenerator.AQUA_GENERATOR.item(), SupremeComponents.THORNIUM_ENERGIZED.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeGenerator.VENTUS_GENERATOR.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

  public static final SlimefunItemStack SUPREME_GENERATOR = new SupremeItemStack("SUPREME_SUPREME_GENERATOR",
      MaterialCompat.safe(XMaterial.PURPLE_GLAZED_TERRACOTTA), false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorSupremeBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorSupremeEnergy())));
  public static final ItemStack[] RECIPE_SUPREME_GENERATOR = new ItemStack[]{SupremeComponents.SUPREME.item(),
      SupremeGenerator.LUX_GENERATOR.item(), SupremeComponents.SUPREME.item(), SupremeComponents.SUPREME.item(),
      SupremeGenerator.LUMIUM_GENERATOR.item(), SupremeComponents.SUPREME.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item(),
      SupremeGenerator.THORNIUM_GENERATOR.item(), SupremeComponents.CRYSTALLIZER_MACHINE.item()};

}
