package com.github.relativobr.supreme.machine.recipe;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import io.github.thebusybiscuit.slimefun5.libraries.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobCollectorMachineRecipe extends MachineRecipe implements Predicate<LivingEntity> {

  private final Predicate<LivingEntity> predicate;

  @ParametersAreNonnullByDefault
  public MobCollectorMachineRecipe(ItemStack input, ItemStack result, Predicate<LivingEntity> predicate) {
    super(Supreme.getSupremeOptions().getBaseTimeMobCollector(), new ItemStack[]{input}, new ItemStack[]{result});
    Validate.notNull(predicate, "The Predicate must not be null");
    this.predicate = predicate;
  }

  public static List<ItemStack> getAllRecipe() {

    SupremeOptions supremeOptions = getSupremeOptions();

    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), null, "&fRequires &bBee &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.HONEY_BOTTLE)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), null, "&fRequires &bSquid &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.INK_SAC)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), null, "&fRequires &bGlowSquid &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.GLOW_INK_SAC)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), null, "&fRequires &bWither &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.EXPERIENCE_BOTTLE)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GLASS_BOTTLE), null, "&fRequires &bEnderDragon &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.DRAGON_BREATH)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.SHEARS), null, "&fRequires &bBee &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.HONEYCOMB)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.SHEARS), null, "&fRequires &bSheep &fnearby (with color)"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.WHITE_WOOL)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.SHEARS), null, "&fRequires &bCow &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.LEATHER)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.SHEARS), null, "&fRequires &bChicken &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.FEATHER)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.SHEARS), null, "&fRequires &bGuardian &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SPONGE)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.SHEARS), null, "&fRequires &bSpider &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SPIDER_EYE)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.SHEARS), null, "&fRequires &bWither Skeleton &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.COAL)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.SHEARS), null, "&fRequires &bWither &fnearby"));
    displayRecipes.add(SlimefunItems.COMPRESSED_CARBON.item());
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.SHEARS), null, "&fRequires &bIronGolem &fnearby"));
      displayRecipes.add(SlimefunItems.BASIC_CIRCUIT_BOARD.item());
    }
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bPhantom &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.PHANTOM_MEMBRANE)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bZombie &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.ROTTEN_FLESH)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bSkeleton &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.BONE)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bCreeper &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.GUNPOWDER)));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bSlime &fnearby"));
      displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SLIME_BALL)));
    }
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bSpider &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.STRING)));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bWither Skeleton &fnearby"));
      displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.WITHER_SKELETON_SKULL)));
    }
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bEnderman &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.ENDER_PEARL)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bBlaze &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.BLAZE_ROD)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bMagmaCube &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.MAGMA_CREAM)));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bWither &fnearby"));
      displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.NETHER_STAR)));
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bGhast &fnearby"));
      displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.GHAST_TEAR)));
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bRavager &fnearby"));
      displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.TOTEM_OF_UNDYING)));
    }
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bCow &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.BEEF)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bPig &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.PORKCHOP)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bChicken &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.CHICKEN)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bSheep &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.MUTTON)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bSnowman &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SNOWBALL)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bIronGolem &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.IRON_INGOT)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bDrowned &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.NAUTILUS_SHELL)));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bGuardian &fnearby"));
      displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.PRISMARINE_SHARD)));
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bElderGuardian &fnearby"));
      displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.PRISMARINE_CRYSTALS)));
    }
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.IRON_SWORD), null, "&fRequires &bWitch &fnearby"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.GLASS_BOTTLE)));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLD_INGOT), null, "&fRequires &bPiglin &fnearby"));
      displayRecipes.add(SlimefunItems.STRANGE_NETHER_GOO.item());
    }
    return displayRecipes;
  }

  public boolean test(@Nonnull LivingEntity entity) {
    return this.predicate.test(entity);
  }

}
