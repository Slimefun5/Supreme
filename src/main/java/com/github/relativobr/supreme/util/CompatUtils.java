package com.github.relativobr.supreme.util;

import io.github.thebusybiscuit.slimefun5.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XEnchantment;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XPotion;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XSound;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

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
     * Applies an enchantment resolved by name (see {@link #resolveEnchantment(String)}). A no-op when
     * the enchantment doesn't exist on the running server, so e.g. {@code MENDING} (1.9+) simply isn't
     * added on 1.8.8 instead of triggering a {@code NoSuchFieldError} on the raw {@code
     * Enchantment.MENDING} constant. {@code name} is the Bukkit enchantment field name.
     */
    public static void applyEnchantment(@Nonnull SlimefunItemStack item, @Nonnull String name, int level) {
        Enchantment enchantment = resolveEnchantment(name);
        if (enchantment != null) {
            item.addUnsafeEnchantment(enchantment, level);
        }
    }

    /**
     * Plays a sound resolved by name through XSeries {@link XSound}, which maps the name to whatever
     * the running server actually supports (or no-ops if absent). Avoids referencing a raw {@code
     * Sound.X} constant: the whole {@code org.bukkit.Sound} enum was renamed in 1.9, so every modern
     * {@code BLOCK_*}/{@code ENTITY_*} name is a {@code NoSuchFieldError} on 1.8.8.
     */
    public static void playSound(@Nullable Location location, @Nonnull String name, float volume, float pitch) {
        if (location == null) {
            return;
        }
        Optional<XSound> match = XSound.matchXSound(name);
        if (match.isPresent() && match.get().isSupported()) {
            match.get().play(location, volume, pitch);
        }
    }

    /**
     * Version-safe replacement for a raw {@code entity.getType() == EntityType.X} comparison (and for
     * {@code entity instanceof Bee}-style subtype checks): compares the entity's own
     * {@link EntityType#name()} against the wanted name instead of referencing the enum constant or
     * subtype class, so the class file never resolves a type/field absent on the running server (e.g.
     * {@code EntityType.BEE}/{@code GLOW_SQUID}/{@code WITHER_SKELETON}, or {@code org.bukkit.entity.Bee}).
     * Simply returns {@code false} for a name the running server doesn't know.
     */
    public static boolean isEntityType(@Nonnull Entity entity, @Nonnull String typeName) {
        return entity.getType().name().equals(typeName);
    }

    /**
     * Reads an item's damage across versions (paired with {@link #setItemDamage}).
     *
     * @implNote Before 1.13 an item's damage lived on {@code ItemStack#getDurability()} directly;
     * {@code Damageable#getDamage()} on {@code ItemMeta} is the 1.13+ replacement. Reflection avoids
     * referencing the {@code Damageable} interface (and hence resolving it) on servers without it.
     */
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

    /**
     * Sets an item's unbreakable flag across versions (paired with {@link #isUnbreakable}).
     *
     * @implNote {@code ItemMeta#setUnbreakable(boolean)} is 1.11+; before that the same method lived on
     * {@code ItemMeta.spigot()}. Reflection avoids a direct 1.11 method reference
     * ({@code NoSuchMethodError} on 1.8.8), and the {@code Method} is resolved off the PUBLIC interface
     * ({@code ItemMeta}/{@code ItemMeta.Spigot}), never off the concrete non-public {@code CraftMetaItem},
     * so {@code invoke()} can't hit an {@code IllegalAccessException}.
     */
    public static void setUnbreakable(@Nonnull ItemMeta meta, boolean value) {
        try {
            ItemMeta.class.getMethod("setUnbreakable", boolean.class).invoke(meta, value);
            return;
        } catch (ReflectiveOperationException ignored) {
            // 1.8 - 1.10: fall through to ItemMeta.spigot().setUnbreakable(boolean)
        }
        try {
            Object spigot = ItemMeta.class.getMethod("spigot").invoke(meta);
            Class.forName("org.bukkit.inventory.meta.ItemMeta$Spigot")
                .getMethod("setUnbreakable", boolean.class).invoke(spigot, value);
        } catch (ReflectiveOperationException ignored) {
            // No unbreakable support resolvable - leave the item breakable.
        }
    }

    public static boolean isUnbreakable(@Nonnull ItemMeta meta) {
        try {
            return Boolean.TRUE.equals(ItemMeta.class.getMethod("isUnbreakable").invoke(meta));
        } catch (ReflectiveOperationException ignored) {
            // 1.8 - 1.10: fall through to ItemMeta.spigot().isUnbreakable()
        }
        try {
            Object spigot = ItemMeta.class.getMethod("spigot").invoke(meta);
            return Boolean.TRUE.equals(Class.forName("org.bukkit.inventory.meta.ItemMeta$Spigot")
                .getMethod("isUnbreakable").invoke(spigot));
        } catch (ReflectiveOperationException ignored) {
            return false;
        }
    }

    // --- Bukkit#getEntity(UUID) is 1.12+; reflect it, else scan loaded worlds (all 1.8.8-safe) ------

    @Nullable
    public static Entity getEntity(@Nonnull UUID uuid) {
        try {
            return (Entity) Bukkit.class.getMethod("getEntity", UUID.class).invoke(null, uuid);
        } catch (ReflectiveOperationException ignored) {
            // 1.8 - 1.11: no direct lookup, fall back to scanning loaded worlds' entities.
        }
        for (World world : Bukkit.getWorlds()) {
            for (Entity e : world.getEntities()) {
                if (uuid.equals(e.getUniqueId())) {
                    return e;
                }
            }
        }
        return null;
    }

    /**
     * Builds a {@link PotionEffect} across versions, resolving the type by name.
     *
     * @implNote The 6-arg {@code (type,dur,amp,ambient,particles,icon)} constructor is 1.13+ (the
     * {@code icon} boolean). The type is resolved by name via {@code XPotion} so a modern-only effect
     * name no-ops instead of NPEing, then built reflectively, falling back 6-arg &rarr; 5-arg &rarr; 4-arg.
     */
    @Nullable
    public static PotionEffect potionEffect(@Nonnull String typeName, int duration, int amplifier,
        boolean ambient, boolean particles, boolean icon) {
        Optional<XPotion> match = XPotion.matchXPotion(typeName);
        if (!match.isPresent() || !match.get().isSupported()) {
            return null;
        }
        PotionEffectType type = match.get().getPotionEffectType();
        if (type == null) {
            return null;
        }
        try {
            return PotionEffect.class
                .getConstructor(PotionEffectType.class, int.class, int.class, boolean.class, boolean.class, boolean.class)
                .newInstance(type, duration, amplifier, ambient, particles, icon);
        } catch (ReflectiveOperationException e6) {
            try {
                return PotionEffect.class
                    .getConstructor(PotionEffectType.class, int.class, int.class, boolean.class, boolean.class)
                    .newInstance(type, duration, amplifier, ambient, particles);
            } catch (ReflectiveOperationException e5) {
                return new PotionEffect(type, duration, amplifier, ambient);
            }
        }
    }

    // --- Material.isAir() is 1.13+ (multiple air types); name-based check works on every version ----

    public static boolean isAir(@Nullable Material material) {
        if (material == null) {
            return true;
        }
        String n = material.name();
        return n.equals("AIR") || n.endsWith("_AIR");
    }

    /**
     * @implNote {@code World#getNearbyEntities(Location, x, y, z, Predicate)} is post-1.8; the 4-arg
     * (no-predicate) overload exists on 1.8.8, so it is called here and the predicate applied in Java.
     */
    @Nonnull
    public static Collection<Entity> getNearbyEntities(@Nonnull World world, @Nonnull Location loc,
        double x, double y, double z, @Nullable Predicate<Entity> filter) {
        Collection<Entity> nearby = world.getNearbyEntities(loc, x, y, z);
        if (filter == null) {
            return nearby;
        }
        List<Entity> matched = new ArrayList<>();
        for (Entity e : nearby) {
            if (filter.test(e)) {
                matched.add(e);
            }
        }
        return matched;
    }

    /**
     * @implNote {@code Player.Spigot#sendMessage(ChatMessageType, BaseComponent[])} needs the
     * {@code net.md_5.bungee.api.ChatMessageType} class, which does NOT exist on 1.8.8. It is resolved
     * entirely by reflection ({@code Class.forName}) so this class never references
     * {@code ChatMessageType} directly, falling back to a plain spigot chat message where the
     * action-bar overload is unavailable.
     */
    public static void sendActionBar(@Nonnull Player player, @Nonnull BaseComponent[] components) {
        try {
            Class<?> chatMessageType = Class.forName("net.md_5.bungee.api.ChatMessageType");
            Object actionBar = null;
            for (Object constant : chatMessageType.getEnumConstants()) {
                if ("ACTION_BAR".equals(constant.toString())) {
                    actionBar = constant;
                    break;
                }
            }
            Class<?> spigotClass = Class.forName("org.bukkit.entity.Player$Spigot");
            Method send = spigotClass.getMethod("sendMessage", chatMessageType, BaseComponent[].class);
            send.invoke(player.spigot(), actionBar, components);
            return;
        } catch (ReflectiveOperationException | LinkageError ignored) {
            // Action-bar overload/type unavailable (e.g. 1.8.8) - degrade to a normal chat message.
        }
        player.spigot().sendMessage(components);
    }

    /** {@code World#spawnParticle} + {@code org.bukkit.Particle} are 1.9+. */
    public static boolean particlesSupported() {
        return Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_9);
    }

    /**
     * @implNote The actual {@code org.bukkit.Particle} reference lives in {@code ParticleCompat}, loaded
     * ONLY when {@link #particlesSupported()} passes. Naming a post-1.8 Bukkit type anywhere in THIS
     * class (even a guarded private method) would force its resolution when {@code CompatUtils} loads,
     * so it must stay out entirely.
     */
    public static void spawnParticle(@Nonnull Location location, @Nonnull String name, int count) {
        if (particlesSupported()) {
            ParticleCompat.spawn(location, name, count);
        }
    }

    public static boolean blockDataSupported() {
        return Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_13);
    }

    /**
     * Whether a block can carry a lit visual (paired with {@link #setLit}).
     *
     * @implNote {@code org.bukkit.block.data.BlockData}/{@code Lightable} are 1.13+, and a block's lit
     * visual has no pre-1.13 equivalent API at all, so on legacy servers this assumes the block is valid
     * (rather than failing the caller's validity check) and {@link #setLit} is a silent no-op. The
     * {@code BlockData}/{@code Lightable} references live in {@code ModernBlockCompat}, loaded ONLY
     * behind {@link #blockDataSupported()}.
     */
    public static boolean isLightable(@Nonnull Block block) {
        return !blockDataSupported() || ModernBlockCompat.isLightable(block);
    }

    public static void setLit(@Nonnull Block block, boolean lit) {
        if (blockDataSupported()) {
            ModernBlockCompat.setLit(block, lit);
        }
    }
}
