package com.github.relativobr.supreme.machine.recipe;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import com.github.relativobr.supreme.Supreme;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class VirtualAquariumMachineRecipe extends MachineRecipe {

  @ParametersAreNonnullByDefault
  public VirtualAquariumMachineRecipe(ItemStack input, ItemStack[] result) {
    super(Supreme.getSupremeOptions().getBaseTimeVirtualAquarium(), new ItemStack[]{input}, result);
  }

  public static List<ItemStack> getAllRecipe() {
    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.FISHING_ROD), null, "&fGive &bSponge &f2%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SPONGE)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.FISHING_ROD), null, "&fGive &bSea Lantern &f2%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SEA_LANTERN)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.FISHING_ROD), null, "&fGive &bCod &f20%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.COD)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.FISHING_ROD), null, "&fGive &bSalmon &f20%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SALMON)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.FISHING_ROD), null, "&fGive &bTropical Fish &f20%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.TROPICAL_FISH)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.FISHING_ROD), null, "&fGive &bInk Sac &f20%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.INK_SAC)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.FISHING_ROD), null, "&fGive &bNautilus &f6%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.NAUTILUS_SHELL)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.FISHING_ROD), null, "&fGive &bStick &f5%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.STICK)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.FISHING_ROD), null, "&fGive &bString &f5%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.STRING)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.TRIDENT), null, "&fGive &bSponge &f10%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SPONGE)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.TRIDENT), null, "&fGive &bSea Lantern &f10%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SEA_LANTERN)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.TRIDENT), null, "&fGive &bCod &f5%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.COD)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.TRIDENT), null, "&fGive &bSalmon &f5%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SALMON)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.TRIDENT), null, "&fGive &bTropical Fish &f5%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.TROPICAL_FISH)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.TRIDENT), null, "&fGive &bInk Sac &f5%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.INK_SAC)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.TRIDENT), null, "&fGive &bNautilus &f20%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.NAUTILUS_SHELL)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.TRIDENT), null, "&fGive &bStick &f20%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.STICK)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.TRIDENT), null, "&fGive &bString &f20%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.STRING)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLDEN_HOE), null, "&fGive &bSponge &f1%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SPONGE)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLDEN_HOE), null, "&fGive &bSea Lantern &f1%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SEA_LANTERN)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLDEN_HOE), null, "&fGive &bCod &f3%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.COD)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLDEN_HOE), null, "&fGive &bSalmon &f3%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.SALMON)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLDEN_HOE), null, "&fGive &bTropical Fish &f2%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.TROPICAL_FISH)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLDEN_HOE), null, "&fGive &bInk Sac &f2%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.INK_SAC)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLDEN_HOE), null, "&fGive &bNautilus &f5%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.NAUTILUS_SHELL)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLDEN_HOE), null, "&fGive &bStick &f50%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.STICK)));
    displayRecipes.add(CustomItemStack.create(MaterialCompat.safe(XMaterial.GOLDEN_HOE), null, "&fGive &bString &f33%"));
    displayRecipes.add(new ItemStack(MaterialCompat.safe(XMaterial.STRING)));
    return displayRecipes;
  }

}
