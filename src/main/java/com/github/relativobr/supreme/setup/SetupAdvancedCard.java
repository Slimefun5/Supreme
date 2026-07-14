package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.tech.TechGenerator;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.mobtech.AdvancedCard;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SetupAdvancedCard {

  public static void setup(Supreme plugin) {

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SOLDER_INGOT, SlimefunItems.SOLDER_INGOT.item(),
        SlimefunItems.SOLDER_INGOT.item());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BILLON_INGOT, SlimefunItems.BILLON_INGOT.item(),
        SlimefunItems.BILLON_INGOT.item());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BRONZE_INGOT, SlimefunItems.BRONZE_INGOT.item(),
        SlimefunItems.BRONZE_INGOT.item());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BRASS_INGOT, SlimefunItems.BRASS_INGOT.item(), SlimefunItems.BRASS_INGOT.item());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SULFATE, SlimefunItems.SULFATE.item(), SlimefunItems.SULFATE.item());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_CARBON, SlimefunItems.CARBON.item(), SlimefunItems.CARBON.item());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SILICON, SlimefunItems.SILICON.item(), SlimefunItems.SILICON.item());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_STEEL, SlimefunItems.STEEL_INGOT.item(), SlimefunItems.STEEL_INGOT.item());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_NICKEL, SlimefunItems.NICKEL_INGOT.item(), SlimefunItems.NICKEL_INGOT.item());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT.item(),
        SlimefunItems.DURALUMIN_INGOT.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_FERROSILICON, SlimefunItems.FERROSILICON.item(),
        SlimefunItems.FERROSILICON.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_DAMASCUS, SlimefunItems.DAMASCUS_STEEL_INGOT.item(),
        SlimefunItems.DAMASCUS_STEEL_INGOT.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_COBALT, SlimefunItems.COBALT_INGOT.item(), SlimefunItems.COBALT_INGOT.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT.item(),
        SlimefunItems.ALUMINUM_BRONZE_INGOT.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT.item(),
        SlimefunItems.ALUMINUM_BRASS_INGOT.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_CORINTHIAN_BRONZE_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT.item(),
        SlimefunItems.CORINTHIAN_BRONZE_INGOT.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_GOLD24K, SlimefunItems.GOLD_24K.item(), SlimefunItems.GOLD_24K.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_CARBON_PRESS, SlimefunItems.COMPRESSED_CARBON.item(),
        SlimefunItems.COMPRESSED_CARBON.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_SAPPHIRE.item(),
        SlimefunItems.SYNTHETIC_SAPPHIRE.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD.item(),
        SlimefunItems.SYNTHETIC_EMERALD.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_BATTERY, SlimefunItems.BATTERY.item(), SlimefunItems.BATTERY.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_MAGNET, SlimefunItems.MAGNET.item(), SlimefunItems.MAGNET.item());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET.item(),
        SlimefunItems.PLASTIC_SHEET.item());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_HARDENED_METAL_INGOT, SlimefunItems.HARDENED_METAL_INGOT.item(),
        SupremeComponents.TITANIUM_PLATE.item(), SlimefunItems.HARDENED_METAL_INGOT.item());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_REDSTONE_ALLOY, SlimefunItems.REDSTONE_ALLOY.item(),
        SupremeComponents.TITANIUM_PLATE.item(), SlimefunItems.REDSTONE_ALLOY.item());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_ELECTRO_MAGNET, SlimefunItems.ELECTRO_MAGNET.item(),
        SupremeComponents.IRIDIUM_PLATE.item(), SlimefunItems.ELECTRO_MAGNET.item());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_MOTOR.item(),
        SupremeComponents.AURUM_PLATE.item(), SlimefunItems.ELECTRIC_MOTOR.item());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_HEATING_COIL, SlimefunItems.HEATING_COIL.item(),
        SupremeComponents.AURUM_PLATE.item(), SlimefunItems.HEATING_COIL.item());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_DIAMOND.item(),
        SupremeComponents.ADAMANTIUM_PLATE.item(), SlimefunItems.SYNTHETIC_DIAMOND.item());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_CARBONADO, SlimefunItems.CARBONADO.item(),
        SupremeComponents.ADAMANTIUM_PLATE.item(), SlimefunItems.CARBONADO.item());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT.item(),
        SupremeComponents.ADAMANTIUM_PLATE.item(), SlimefunItems.REINFORCED_ALLOY_INGOT.item());

  }
}
