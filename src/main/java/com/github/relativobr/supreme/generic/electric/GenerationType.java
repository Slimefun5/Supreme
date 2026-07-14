package com.github.relativobr.supreme.generic.electric;

import com.github.relativobr.supreme.util.MaterialCompat;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import javax.annotation.Nonnull;

import lombok.AllArgsConstructor;
import lombok.Getter;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

@AllArgsConstructor
public enum GenerationType {

    SKY("Sky") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            switch (world.getEnvironment()) {
                case NORMAL: {
                    if (block.getLocation().add(0, 1, 0).getBlock().getLightFromSky() == 15) {
                        return def;
                    }
                    return 0;
                }
                case NETHER:
                case THE_END:
                default:
                    return 0;
            }
        }
    },
    FIRE("Fire") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            Material material = block.getLocation().add(0, -1, 0).getBlock().getType();
            if (material == MaterialCompat.safe(XMaterial.FIRE)
                    || material == MaterialCompat.safe(XMaterial.SOUL_FIRE)
                    || material == MaterialCompat.safe(XMaterial.LAVA)
                    || material == MaterialCompat.safe(XMaterial.CAMPFIRE)
                    || material == MaterialCompat.safe(XMaterial.SOUL_CAMPFIRE)) {
                return def;
            }
            return 0;
        }
    },
    WATER("Water") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            Material material = block.getLocation().add(0, -1, 0).getBlock().getType();
            if (material == MaterialCompat.safe(XMaterial.WATER)
                    || material == MaterialCompat.safe(XMaterial.WATER_CAULDRON)) {
                return def;
            }
            return 0;
        }
    },
    WIND("Wind") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            switch (world.getEnvironment()) {
                case NETHER:
                case NORMAL: {
                    if (block.getLocation().add(1, 0, 0).getBlock().getType() == MaterialCompat.safe(XMaterial.AIR)
                            || block.getLocation().add(-1, 0, 0).getBlock().getType() == MaterialCompat.safe(XMaterial.AIR)
                            || block.getLocation().add(0, 0, 1).getBlock().getType() == MaterialCompat.safe(XMaterial.AIR)
                            || block.getLocation().add(0, 0, -1).getBlock().getType() == MaterialCompat.safe(XMaterial.AIR)) {
                        return def;
                    }
                    return 0;
                }
                case THE_END:
                default:
                    return 0;
            }
        }
    },
    DARK("Dark") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            switch (world.getEnvironment()) {
                case NETHER:
                case THE_END:
                    return def;
                case NORMAL:
                    if (block.getLocation().add(0, 1, 0).getBlock().getLightFromSky() != 15) {
                        return def;
                    }
                    return 0;
                default:
                    return 0;
            }
        }
    },
    EVERY("Every") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            return def;
        }
    };

    @Getter
    private final String toString;

    protected abstract int generate(@Nonnull World world, @Nonnull Block block, int def);

}
