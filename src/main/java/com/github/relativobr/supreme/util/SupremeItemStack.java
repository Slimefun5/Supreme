package com.github.relativobr.supreme.util;

import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.getOldIdSupremeLegacy;

import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Material;

/**
 * Constructs every Supreme item name-less (2-arg SlimefunItemStack). The display name and lore now
 * live in {@code languages/<lang>/items.yml} and are rendered per-viewer by the core
 * {@code ItemTranslationService} (see {@code Supreme#onEnable} -> {@code registerTranslations}); the
 * legacy {@code name}/{@code lore} constructor arguments are accepted for source compatibility but
 * ignored. This is what lets Supreme's items be translated (and keeps them off the deprecated
 * hardcoded-lore path). Ids still pass through {@link CompatibilySupremeLegacy} for the optional
 * SupremeExpansion legacy-id remap.
 */
public class SupremeItemStack extends SlimefunItemStack {

  public SupremeItemStack(@Nonnull String id, @Nonnull Material material, @Nullable String name, String... lor) {
    super(getOldIdSupremeLegacy(id), material);
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull Material material) {
    super(getOldIdSupremeLegacy(id), material);
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull Material material, boolean suffixLore, String... lor) {
    super(getOldIdSupremeLegacy(id), material);
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull String texture, @Nullable String name, String... lor) {
    super(getOldIdSupremeLegacy(id), texture);
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull String texture) {
    super(getOldIdSupremeLegacy(id), texture);
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull String texture, boolean suffixLore, String... lor) {
    super(getOldIdSupremeLegacy(id), texture);
  }

}
