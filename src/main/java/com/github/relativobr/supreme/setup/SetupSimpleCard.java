package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.tech.TechGenerator;
import com.github.relativobr.supreme.resource.mobtech.SimpleCard;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SetupSimpleCard {

  public static void setup(Supreme plugin) {

    boolean customBc = getSupremeOptions().isCustomBc();

    // setup cards
    TechGenerator.preSetup(plugin, SimpleCard.CARD_STONE, MaterialCompat.safe(XMaterial.STONE), MaterialCompat.safe(XMaterial.COBBLESTONE));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GRANITE, MaterialCompat.safe(XMaterial.POLISHED_GRANITE), MaterialCompat.safe(XMaterial.GRANITE));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_DIORITE, MaterialCompat.safe(XMaterial.POLISHED_DIORITE), MaterialCompat.safe(XMaterial.DIORITE));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_ANDESITE, MaterialCompat.safe(XMaterial.POLISHED_ANDESITE), MaterialCompat.safe(XMaterial.ANDESITE));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GRAVEL, MaterialCompat.safe(XMaterial.GRAVEL), MaterialCompat.safe(XMaterial.GRAVEL));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_SAND, MaterialCompat.safe(XMaterial.SANDSTONE), MaterialCompat.safe(XMaterial.SAND));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_ENDSTONE, MaterialCompat.safe(XMaterial.END_STONE_BRICKS), MaterialCompat.safe(XMaterial.END_STONE));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_CLAY, MaterialCompat.safe(XMaterial.CLAY), MaterialCompat.safe(XMaterial.CLAY));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_SNOW, MaterialCompat.safe(XMaterial.SNOW_BLOCK), MaterialCompat.safe(XMaterial.SNOW_BLOCK));
    
    TechGenerator.preSetup(plugin, SimpleCard.CARD_APPLE, MaterialCompat.safe(XMaterial.APPLE), MaterialCompat.safe(XMaterial.APPLE));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_NETHER_STAR, MaterialCompat.safe(XMaterial.NETHER_STAR), MaterialCompat.safe(XMaterial.NETHER_STAR));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_WITHER_ROSE, MaterialCompat.safe(XMaterial.WITHER_ROSE), MaterialCompat.safe(XMaterial.WITHER_ROSE));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_SLIME_BALL, MaterialCompat.safe(XMaterial.SLIME_BALL), MaterialCompat.safe(XMaterial.SLIME_BALL));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_INK_SAC, MaterialCompat.safe(XMaterial.INK_SAC), MaterialCompat.safe(XMaterial.INK_SAC));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GLOW_INK_SAC, MaterialCompat.safe(XMaterial.GLOW_INK_SAC), MaterialCompat.safe(XMaterial.GLOW_INK_SAC));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_HONEY_BOTTLE, MaterialCompat.safe(XMaterial.HONEY_BOTTLE), MaterialCompat.safe(XMaterial.HONEY_BOTTLE));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_COAL, MaterialCompat.safe(XMaterial.COAL_BLOCK), MaterialCompat.safe(XMaterial.COAL));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_IRON, MaterialCompat.safe(XMaterial.IRON_BLOCK), MaterialCompat.safe(XMaterial.IRON_INGOT));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_COPPER, MaterialCompat.safe(XMaterial.COPPER_BLOCK), MaterialCompat.safe(XMaterial.COPPER_INGOT));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GOLD, MaterialCompat.safe(XMaterial.GOLD_BLOCK), MaterialCompat.safe(XMaterial.GOLD_INGOT));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_QUARTZ, MaterialCompat.safe(XMaterial.QUARTZ), MaterialCompat.safe(XMaterial.QUARTZ));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_QUARTZ_BLOCK, MaterialCompat.safe(XMaterial.QUARTZ_BLOCK), MaterialCompat.safe(XMaterial.QUARTZ_BLOCK));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_LAPIS, MaterialCompat.safe(XMaterial.LAPIS_LAZULI), MaterialCompat.safe(XMaterial.LAPIS_LAZULI));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_REDSTONE, MaterialCompat.safe(XMaterial.REDSTONE_BLOCK), MaterialCompat.safe(XMaterial.REDSTONE));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_DIAMOND, MaterialCompat.safe(XMaterial.DIAMOND_BLOCK), MaterialCompat.safe(XMaterial.DIAMOND));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_EMERALD, MaterialCompat.safe(XMaterial.EMERALD_BLOCK), MaterialCompat.safe(XMaterial.EMERALD));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_BLAZE_ROD, MaterialCompat.safe(XMaterial.BLAZE_ROD), MaterialCompat.safe(XMaterial.BLAZE_ROD));

    if(customBc){
      TechGenerator.preSetup(plugin, SimpleCard.CARD_NETHERITE, MaterialCompat.safe(XMaterial.NETHERITE_BLOCK), MaterialCompat.safe(XMaterial.NETHERITE_SCRAP));
    } else {
      TechGenerator.preSetup(plugin, SimpleCard.CARD_NETHERITE, MaterialCompat.safe(XMaterial.NETHERITE_BLOCK), MaterialCompat.safe(XMaterial.NETHERITE_INGOT));
    }

    TechGenerator.preSetup(plugin, SimpleCard.CARD_AMETHYST, MaterialCompat.safe(XMaterial.AMETHYST_BLOCK), MaterialCompat.safe(XMaterial.AMETHYST_SHARD));

    TechGenerator.preSetup(plugin, SimpleCard.CARD_IRON_DUST, SlimefunItems.IRON_DUST.item(), SlimefunItems.IRON_DUST.item());

    TechGenerator.preSetup(plugin, SimpleCard.CARD_LEAD_DUST, SlimefunItems.LEAD_DUST.item(), SlimefunItems.LEAD_DUST.item());

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GOLD_DUST, SlimefunItems.GOLD_DUST.item(), SlimefunItems.GOLD_DUST.item());

    TechGenerator.preSetup(plugin, SimpleCard.CARD_COPPER_DUST, SlimefunItems.COPPER_DUST.item(), SlimefunItems.COPPER_DUST.item());

    TechGenerator.preSetup(plugin, SimpleCard.CARD_MAGNESIUM_DUST, SlimefunItems.MAGNESIUM_DUST.item(),
        SlimefunItems.MAGNESIUM_DUST.item());

    TechGenerator.preSetup(plugin, SimpleCard.CARD_ALUMINUM_DUST, SlimefunItems.ALUMINUM_DUST.item(),
        SlimefunItems.ALUMINUM_DUST.item());

    TechGenerator.preSetup(plugin, SimpleCard.CARD_SILVER_DUST, SlimefunItems.SILVER_DUST.item(), SlimefunItems.SILVER_DUST.item());

    TechGenerator.preSetup(plugin, SimpleCard.CARD_TIN_DUST, SlimefunItems.TIN_DUST.item(), SlimefunItems.TIN_DUST.item());

    TechGenerator.preSetup(plugin, SimpleCard.CARD_ZINC_DUST, SlimefunItems.ZINC_DUST.item(), SlimefunItems.ZINC_DUST.item());
  }
}
