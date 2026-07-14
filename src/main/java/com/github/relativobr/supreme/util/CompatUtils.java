package com.github.relativobr.supreme.util;

import io.github.thebusybiscuit.slimefun5.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XEnchantment;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.particles.XParticle;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.Optional;

/**
 * Version-safety helpers so Supreme loads + enables on legacy servers (1.8&ndash;1.13) without a
 * {@code NoSuchMethodError}/{@code NoSuchFieldError} from post-1.13 (or otherwise newer-than-the-
 * compileOnly-baseline) API.
 * <p>
 * {@code Enchantment.getByKey(NamespacedKey.minecraft(name))} is 1.13+ only (legacy Bukkit only had
 * {@code Enchantment.getByName(String)}); resolving by name through the fork's relocated XSeries
 * {@link XEnchantment} wrapper works on every version and simply yields nothing for a name absent on
 * the running server, instead of referencing methods that don't exist there.
 */
public final class CompatUtils {

    private CompatUtils() {
    }

    @Nullable
    public static Enchantment resolveEnchantment(@Nonnull String name) {
        Optional<XEnchantment> match = XEnchantment.matchXEnchantment(name);
        if (match.isPresent() && match.get().isSupported()) {
            return match.get().getEnchant();
        }
        return null;
    }

    /**
     * Resolves an {@link EntityType} by name instead of referencing the enum constant directly, so a
     * type added after the addon's compileOnly spigot-api baseline (e.g. {@code GLOW_SQUID}, 1.17)
     * doesn't produce a {@code NoSuchFieldError} class-verification failure on older/newer runtime jars
     * that don't have it under that exact field. Returns {@code null} if the running server doesn't
     * know this entity type at all.
     */
    @Nullable
    public static EntityType resolveEntityType(@Nonnull String name) {
        try {
            return EntityType.valueOf(name);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /**
     * Version-safe replacement for {@code entity instanceof Bee} (or any other entity subtype added
     * after 1.8, e.g. {@code Golem} subclasses added later): compares the entity's own
     * {@link EntityType#name()} instead of referencing the possibly-absent subtype class, so the class
     * file never has to resolve a type such as {@code org.bukkit.entity.Bee} (added 1.15) at all.
     */
    public static boolean isEntityType(@Nonnull Entity entity, @Nonnull String typeName) {
        return entity.getType().name().equals(typeName);
    }

    // --- Item durability (org.bukkit.inventory.meta.Damageable is 1.13+; routed reflectively) -------
    // Before 1.13, an item's damage lived on ItemStack#getDurability()/#setDurability(short) directly;
    // Damageable#getDamage()/#setDamage(int) on ItemMeta is the 1.13+ replacement. Reflection avoids
    // referencing the Damageable interface (and hence resolving it) on servers where it doesn't exist.

    public static int getItemDamage(@Nonnull ItemStack item) {
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            try {
                Method getDamage = meta.getClass().getMethod("getDamage");
                Object result = getDamage.invoke(meta);
                if (result instanceof Integer) {
                    return (Integer) result;
                }
            } catch (ReflectiveOperationException ignored) {
                // fall through to legacy durability
            }
        }
        return item.getDurability();
    }

    public static void setItemDamage(@Nonnull ItemMeta meta, @Nonnull ItemStack item, int damage) {
        try {
            Method setDamage = meta.getClass().getMethod("setDamage", int.class);
            setDamage.invoke(meta, damage);
            return;
        } catch (ReflectiveOperationException ignored) {
            // fall through to legacy durability
        }
        item.setDurability((short) damage);
    }

    // --- Particles (1.9+; isolated so org.bukkit.Particle is never resolved on 1.8) -----------------

    /** {@code World#spawnParticle} + {@code org.bukkit.Particle} are 1.9+. */
    public static boolean particlesSupported() {
        return Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_9);
    }

    public static void spawnParticle(@Nonnull Location location, @Nonnull String name, int count) {
        if (particlesSupported()) {
            doSpawnParticle(location, name, count);
        }
    }

    /**
     * References {@code org.bukkit.Particle} (1.9+) via {@link XParticle#getParticle(String)} and
     * {@code World#spawnParticle}. MUST only be invoked behind {@link #particlesSupported()} so the JVM
     * never resolves {@code org.bukkit.Particle} on 1.8.
     */
    private static void doSpawnParticle(Location location, String name, int count) {
        if (location.getWorld() == null) {
            return;
        }
        try {
            org.bukkit.Particle particle = XParticle.getParticle(name);
            if (particle != null) {
                location.getWorld().spawnParticle(particle, location, count);
            }
        } catch (Throwable ignored) {
            // Particle absent on this version - skip silently rather than crash.
        }
    }

    // --- Block "lit" state (org.bukkit.block.data.BlockData/Lightable are 1.13+) --------------------
    // A block's lit visual (e.g. a lamp glowing) has no pre-1.13 equivalent API at all, so on legacy
    // servers isLightable() assumes the block is valid (rather than failing the caller's validity
    // check) and setLit() is a silent no-op - the feature keeps working, it just never lights up.

    public static boolean blockDataSupported() {
        return Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_13);
    }

    public static boolean isLightable(@Nonnull Block block) {
        return !blockDataSupported() || doIsLightable(block);
    }

    public static void setLit(@Nonnull Block block, boolean lit) {
        if (blockDataSupported()) {
            doSetLit(block, lit);
        }
    }

    private static boolean doIsLightable(Block block) {
        return block.getBlockData() instanceof org.bukkit.block.data.Lightable;
    }

    private static void doSetLit(Block block, boolean lit) {
        if (block.getBlockData() instanceof org.bukkit.block.data.Lightable) {
            org.bukkit.block.data.Lightable lightable = (org.bukkit.block.data.Lightable) block.getBlockData();
            lightable.setLit(lit);
            block.setBlockData(lightable);
        }
    }
}
