package com.github.relativobr.supreme.tools;

import com.github.relativobr.supreme.util.CompatUtils;
import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.gear.WeaponsBasic;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.resource.mobtech.ZombieTech;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemUtil;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun5.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun5.core.handlers.EntityInteractHandler;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.libraries.dough.protection.Interaction;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Golem;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

public class MobCollectorTools extends SlimefunItem implements Rechargeable, NotPlaceable {

  public static final SlimefunItemStack MOB_COLLECTOR_I = new SupremeItemStack("SUPREME_MOB_COLLECTOR_TOOL_I", MaterialCompat.safe(XMaterial.IRON_SHOVEL));
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_I = new ItemStack[]{null, SupremeComponents.SYNTHETIC_RUBY.item(), null,
      null, WeaponsBasic.AURUM_SWORD.item(), null, null, SlimefunItems.MEDIUM_CAPACITOR.item(), null};

  public static final SlimefunItemStack MOB_COLLECTOR_II = new SupremeItemStack("SUPREME_MOB_COLLECTOR_TOOL_II", MaterialCompat.safe(XMaterial.DIAMOND_SHOVEL));
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_II = new ItemStack[]{null, SupremeCore.CORE_OF_LIFE.item(), null, null,
      MobCollectorTools.MOB_COLLECTOR_I.item(), null, null, SupremeCetrus.CETRUS_VENTUS.item(), null};

  public static final SlimefunItemStack MOB_COLLECTOR_III = new SupremeItemStack("SUPREME_MOB_COLLECTOR_TOOL_III", MaterialCompat.safe(XMaterial.NETHERITE_SHOVEL));
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_III = new ItemStack[]{null, SupremeAttribute.getBomb().item(), null,
      null, MobCollectorTools.MOB_COLLECTOR_II.item(), null, null, SupremeCetrus.CETRUS_LUMIUM.item(), null};
  int charge;
  int maxCharge;
  public MobCollectorTools(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(itemGroup, item, recipeType, recipe);
    // head-textured tool misses the material-suffix heuristic; declare explicitly
    setGuideType("tools");
    addItemHandler(getItemHandler());
  }

  public static void setup(Supreme plugin) {

    new MobCollectorTools(ItemGroups.TOOLS_CATEGORY, MobCollectorTools.MOB_COLLECTOR_I,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollectorTools.RECIPE_MOB_COLLECTOR_I).setCharge(50).setMaxCharge(500)
        .register(plugin);

    new MobCollectorTools(ItemGroups.TOOLS_CATEGORY, MobCollectorTools.MOB_COLLECTOR_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollectorTools.RECIPE_MOB_COLLECTOR_II).setCharge(50).setMaxCharge(5000)
        .register(plugin);

    new MobCollectorTools(ItemGroups.TOOLS_CATEGORY, MobCollectorTools.MOB_COLLECTOR_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollectorTools.RECIPE_MOB_COLLECTOR_III).setCharge(50).setMaxCharge(5000)
        .register(plugin);

  }

  public int getCharge() {
    return this.charge;
  }

  public final MobCollectorTools setCharge(int value) {
    this.charge = value;
    return this;
  }

  public int getMaxCharge() {
    return this.maxCharge;
  }

  public final MobCollectorTools setMaxCharge(int value) {
    this.maxCharge = value;
    return this;
  }

  public EntityInteractHandler getItemHandler() {
    return (e, item, offhand) -> {
      if (getItemCharge(item) < getCharge()) {
        return;
      }
      Entity entity = e.getRightClicked();
      if (e.isCancelled() || !Slimefun.getProtectionManager()
          .hasPermission(e.getPlayer(), entity.getLocation(), Interaction.INTERACT_ENTITY)) {
        return;
      }
      Player p = e.getPlayer();
      if (CompatUtils.isEntityType(entity, "BEE")) {
        entity.getWorld()
            .dropItemNaturally(entity.getLocation(), ItemUtil.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0).item());
        entity.remove();
        removeItemCharge(item, getCharge());
        CompatUtils.playSound(p.getLocation(), "BLOCK_ANVIL_FALL", 1, 1);
      }
      if (entity instanceof Golem) {
        entity.getWorld()
            .dropItemNaturally(entity.getLocation(), ItemUtil.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0).item());
        entity.remove();
        removeItemCharge(item, getCharge());
        CompatUtils.playSound(p.getLocation(), "BLOCK_ANVIL_FALL", 1, 1);
      }
      if (entity instanceof Zombie) {
        entity.getWorld()
            .dropItemNaturally(entity.getLocation(), ItemUtil.buildItemFromMobTechDTO(ZombieTech.SIMPLE_ZOMBIE, 0).item());
        entity.remove();
        removeItemCharge(item, getCharge());
        CompatUtils.playSound(p.getLocation(), "BLOCK_ANVIL_FALL", 1, 1);
      }

    };

  }

  @Override
  public float getMaxItemCharge(ItemStack item) {
    return getMaxCharge();
  }

}
