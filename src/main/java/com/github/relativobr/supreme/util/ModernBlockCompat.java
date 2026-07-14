package com.github.relativobr.supreme.util;

import org.bukkit.block.Block;
import org.bukkit.block.data.Lightable;

import javax.annotation.Nonnull;

/**
 * Isolated home for every reference to {@code org.bukkit.block.data.BlockData} / {@code Lightable}
 * (1.13+). Loaded <em>only</em> from behind a {@code CompatUtils.blockDataSupported()} version guard,
 * so on 1.8&ndash;1.12 the JVM never loads/links it and never resolves those absent types.
 * <p>
 * See {@link ParticleCompat} for why this must be a separate class rather than a guarded private
 * method of {@link CompatUtils}.
 */
final class ModernBlockCompat {

    private ModernBlockCompat() {
    }

    static boolean isLightable(@Nonnull Block block) {
        return block.getBlockData() instanceof Lightable;
    }

    static void setLit(@Nonnull Block block, boolean lit) {
        if (block.getBlockData() instanceof Lightable) {
            Lightable lightable = (Lightable) block.getBlockData();
            lightable.setLit(lit);
            block.setBlockData(lightable);
        }
    }
}
