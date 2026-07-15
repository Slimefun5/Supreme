package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreDeath {

  public static final SlimefunItemStack RESOURCE_CORE_PORKCHOP = new SupremeItemStack("SUPREME_CORE_PORKCHOP", "42e0bb88d8bd55d1f946461b3ee6c22f353ba74847ed2412856bb85cf9f63");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_PORKCHOP = new CustomCoreRecipe(RESOURCE_CORE_PORKCHOP,
      MaterialCompat.safe(XMaterial.PORKCHOP), MaterialCompat.safe(XMaterial.BLAZE_ROD));

  public static final SlimefunItemStack RESOURCE_CORE_BEEF = new SupremeItemStack("SUPREME_CORE_BEEF", "f660e91e1f5fc510b5f86520a5516a921f37657f965fdbb233dad8474029a96f");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BEEF = new CustomCoreRecipe(RESOURCE_CORE_BEEF,
      MaterialCompat.safe(XMaterial.BEEF), MaterialCompat.safe(XMaterial.BLAZE_ROD));

  public static final SlimefunItemStack RESOURCE_CORE_MUTTON = new SupremeItemStack("SUPREME_CORE_MUTTON", "f31f9ccc6b3e32ecf13b8a11ac29cd33d18c95fc73db8a66c5d657ccb8be70");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_MUTTON = new CustomCoreRecipe(RESOURCE_CORE_MUTTON,
      MaterialCompat.safe(XMaterial.MUTTON), MaterialCompat.safe(XMaterial.BLAZE_ROD));

  public static final SlimefunItemStack RESOURCE_CORE_CHICKEN = new SupremeItemStack("SUPREME_CORE_CHICKEN", "277695e697a2247377349fe8271d8e6b888aef354f8cc751f739c6b4c7f492d3");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CHICKEN = new CustomCoreRecipe(RESOURCE_CORE_CHICKEN,
      MaterialCompat.safe(XMaterial.CHICKEN), MaterialCompat.safe(XMaterial.BLAZE_ROD));

  public static final SlimefunItemStack RESOURCE_CORE_SALMON = new SupremeItemStack("SUPREME_CORE_SALMON", "8aeb21a25e46806ce8537fbd6668281cf176ceafe95af90e94a5fd84924878");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SALMON = new CustomCoreRecipe(RESOURCE_CORE_SALMON,
      MaterialCompat.safe(XMaterial.SALMON), MaterialCompat.safe(XMaterial.NETHER_STAR));

  public static final SlimefunItemStack RESOURCE_CORE_COD = new SupremeItemStack("SUPREME_CORE_COD", "7892d7dd6aadf35f86da27fb63da4edda211df96d2829f691462a4fb1cab0");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_COD = new CustomCoreRecipe(RESOURCE_CORE_COD, MaterialCompat.safe(XMaterial.COD),
      MaterialCompat.safe(XMaterial.NETHER_STAR));

  public static final SlimefunItemStack RESOURCE_CORE_STRING = new SupremeItemStack("SUPREME_CORE_STRING", "b5a1f7566f4b68227f90678100b3b09e2533731c2ce84dc2fdd1c851039f7a7");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_STRING = new CustomCoreRecipe(RESOURCE_CORE_STRING,
      MaterialCompat.safe(XMaterial.STRING), MaterialCompat.safe(XMaterial.ROTTEN_FLESH));

  public static final SlimefunItemStack RESOURCE_CORE_SPIDER_EYE = new SupremeItemStack("SUPREME_CORE_SPIDER_EYE", "442cf8ce487b78fa203d56cf01491434b4c33e5d236802c6d69146a51435b03d");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SPIDER_EYE = new CustomCoreRecipe(RESOURCE_CORE_SPIDER_EYE,
      MaterialCompat.safe(XMaterial.SPIDER_EYE), MaterialCompat.safe(XMaterial.BONE));

  public static final SlimefunItemStack RESOURCE_CORE_TEAR = new SupremeItemStack("SUPREME_CORE_TEAR", "78f77eeeef6ffb2f6818e57698794ae0351ab32ba234d621c22fe4ce8e1599d2");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_TEAR = new CustomCoreRecipe(RESOURCE_CORE_TEAR,
      MaterialCompat.safe(XMaterial.GHAST_TEAR), MaterialCompat.safe(XMaterial.SLIME_BALL));
}
