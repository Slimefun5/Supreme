package com.github.relativobr.supreme.util;

import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import org.bukkit.Material;

import javax.annotation.Nonnull;
import java.util.EnumMap;
import java.util.Map;

/**
 * Resolves {@link XMaterial} constants to a {@link Material} that exists on the running server.
 * Keeps Supreme loadable on legacy versions (e.g. 1.8.8) where modern constants (netherite, copper,
 * coral, colored concrete/wool/dye, 1.13+ woods, ...) are absent.
 * <p>
 * {@link XMaterial#parseMaterial()} already resolves pure renames (e.g. {@code END_STONE} -&gt;
 * legacy {@code ENDER_STONE}) by itself; {@link #LEGACY_SUBSTITUTES} only needs to cover materials
 * that genuinely did not exist before the 1.13+ flattening, so it maps them to a sensible
 * legacy-safe stand-in. Anything neither resolvable nor in the map falls back to
 * {@link Material#STONE} so this method never returns {@code null}.
 */
public final class MaterialCompat {

    private MaterialCompat() {
    }

    @Nonnull
    public static Material safe(@Nonnull XMaterial material) {
        Material resolved = material.parseMaterial();
        if (resolved == null) {
            resolved = substitute(material);
        }
        return resolved != null ? resolved : Material.STONE;
    }

    private static final Map<XMaterial, XMaterial> LEGACY_SUBSTITUTES = buildLegacySubstitutes();

    private static Map<XMaterial, XMaterial> buildLegacySubstitutes() {
        Map<XMaterial, XMaterial> m = new EnumMap<>(XMaterial.class);

        // Netherite (1.16+) -> Diamond equivalents.
        m.put(XMaterial.NETHERITE_BLOCK, XMaterial.DIAMOND_BLOCK);
        m.put(XMaterial.NETHERITE_INGOT, XMaterial.DIAMOND);
        m.put(XMaterial.NETHERITE_SCRAP, XMaterial.IRON_NUGGET);
        m.put(XMaterial.NETHERITE_SWORD, XMaterial.DIAMOND_SWORD);
        m.put(XMaterial.NETHERITE_AXE, XMaterial.DIAMOND_AXE);
        m.put(XMaterial.NETHERITE_PICKAXE, XMaterial.DIAMOND_PICKAXE);
        m.put(XMaterial.NETHERITE_SHOVEL, XMaterial.DIAMOND_SHOVEL);
        m.put(XMaterial.NETHERITE_HOE, XMaterial.DIAMOND_HOE);
        m.put(XMaterial.NETHERITE_HELMET, XMaterial.DIAMOND_HELMET);
        m.put(XMaterial.NETHERITE_CHESTPLATE, XMaterial.DIAMOND_CHESTPLATE);
        m.put(XMaterial.NETHERITE_LEGGINGS, XMaterial.DIAMOND_LEGGINGS);
        m.put(XMaterial.NETHERITE_BOOTS, XMaterial.DIAMOND_BOOTS);
        m.put(XMaterial.ANCIENT_DEBRIS, XMaterial.NETHERRACK);

        // Copper (1.17+) -> Iron equivalents.
        m.put(XMaterial.COPPER_BLOCK, XMaterial.IRON_BLOCK);
        m.put(XMaterial.COPPER_INGOT, XMaterial.IRON_INGOT);

        // Amethyst (1.17+).
        m.put(XMaterial.AMETHYST_BLOCK, XMaterial.QUARTZ_BLOCK);
        m.put(XMaterial.AMETHYST_SHARD, XMaterial.QUARTZ);

        // Colored wool/dye/glass (data-value colors on legacy - color info is lost, block/item kept).
        // XMaterial#parseMaterial() usually already resolves these to legacy WOOL/INK_SACK/etc by
        // itself; the entries below are a safety net in case a given color alias isn't in its table.
        for (XMaterial wool : new XMaterial[] {
            XMaterial.WHITE_WOOL, XMaterial.ORANGE_WOOL, XMaterial.MAGENTA_WOOL, XMaterial.LIGHT_BLUE_WOOL,
            XMaterial.YELLOW_WOOL, XMaterial.LIME_WOOL, XMaterial.PINK_WOOL, XMaterial.GRAY_WOOL,
            XMaterial.LIGHT_GRAY_WOOL, XMaterial.CYAN_WOOL, XMaterial.PURPLE_WOOL, XMaterial.BLUE_WOOL,
            XMaterial.BROWN_WOOL, XMaterial.GREEN_WOOL, XMaterial.RED_WOOL, XMaterial.BLACK_WOOL,
        }) {
            m.put(wool, XMaterial.WHITE_WOOL);
        }

        for (XMaterial dye : new XMaterial[] {
            XMaterial.WHITE_DYE, XMaterial.ORANGE_DYE, XMaterial.MAGENTA_DYE, XMaterial.LIGHT_BLUE_DYE,
            XMaterial.YELLOW_DYE, XMaterial.LIME_DYE, XMaterial.PINK_DYE, XMaterial.GRAY_DYE,
            XMaterial.LIGHT_GRAY_DYE, XMaterial.CYAN_DYE, XMaterial.PURPLE_DYE, XMaterial.BLUE_DYE,
            XMaterial.BROWN_DYE, XMaterial.GREEN_DYE, XMaterial.RED_DYE, XMaterial.BLACK_DYE,
            XMaterial.GLOW_INK_SAC,
        }) {
            m.put(dye, XMaterial.INK_SAC);
        }
        // Lapis Lazuli was itself represented as a dye (data value 4 on legacy INK_SACK) before 1.13.
        m.put(XMaterial.LAPIS_LAZULI, XMaterial.INK_SAC);

        for (XMaterial glass : new XMaterial[] {
            XMaterial.WHITE_STAINED_GLASS, XMaterial.ORANGE_STAINED_GLASS, XMaterial.PURPLE_STAINED_GLASS,
        }) {
            m.put(glass, XMaterial.GLASS);
        }
        for (XMaterial pane : new XMaterial[] {
            XMaterial.WHITE_STAINED_GLASS_PANE, XMaterial.ORANGE_STAINED_GLASS_PANE, XMaterial.BLUE_STAINED_GLASS_PANE,
            XMaterial.GREEN_STAINED_GLASS_PANE, XMaterial.RED_STAINED_GLASS_PANE, XMaterial.GRAY_STAINED_GLASS_PANE,
            XMaterial.CYAN_STAINED_GLASS_PANE, XMaterial.BLACK_STAINED_GLASS_PANE,
        }) {
            m.put(pane, XMaterial.GLASS);
        }
        for (XMaterial concrete : new XMaterial[] {
            XMaterial.WHITE_CONCRETE, XMaterial.ORANGE_CONCRETE, XMaterial.BLUE_CONCRETE, XMaterial.BROWN_CONCRETE,
        }) {
            m.put(concrete, XMaterial.WHITE_WOOL);
        }
        for (XMaterial terracotta : new XMaterial[] {
            XMaterial.WHITE_GLAZED_TERRACOTTA, XMaterial.ORANGE_GLAZED_TERRACOTTA, XMaterial.BLUE_GLAZED_TERRACOTTA,
            XMaterial.BROWN_GLAZED_TERRACOTTA, XMaterial.PURPLE_GLAZED_TERRACOTTA, XMaterial.BLACK_GLAZED_TERRACOTTA,
        }) {
            m.put(terracotta, XMaterial.WHITE_WOOL);
        }

        // 1.13+ per-species wood (data-value species on legacy) -> a plain legacy log/leaves/sapling.
        // Nether wood (Crimson/Warped, 1.16+) has no overworld-log predecessor at all, so it gets its
        // own netherrack fallback instead of being lumped in with the real species below.
        mapAll(m, XMaterial.ACACIA_LOG, XMaterial.BIRCH_LOG, XMaterial.DARK_OAK_LOG, XMaterial.JUNGLE_LOG,
            XMaterial.SPRUCE_LOG, XMaterial.OAK_LOG);
        mapAll(m, XMaterial.CRIMSON_STEM, XMaterial.WARPED_STEM, XMaterial.NETHERRACK);
        mapAll(m, XMaterial.ACACIA_LEAVES, XMaterial.BIRCH_LEAVES, XMaterial.DARK_OAK_LEAVES, XMaterial.JUNGLE_LEAVES,
            XMaterial.SPRUCE_LEAVES, XMaterial.OAK_LEAVES);
        mapAll(m, XMaterial.ACACIA_SAPLING, XMaterial.BIRCH_SAPLING, XMaterial.DARK_OAK_SAPLING, XMaterial.JUNGLE_SAPLING,
            XMaterial.SPRUCE_SAPLING, XMaterial.OAK_SAPLING);
        m.put(XMaterial.OAK_SLAB, XMaterial.OAK_PLANKS);

        // Stone variants (1.8 has plain STONE; polished/andesite/etc. is 1.8 as data but XMaterial
        // parseMaterial() usually resolves those via legacy names already - kept here as a safety net).
        mapAll(m, XMaterial.ANDESITE, XMaterial.DIORITE, XMaterial.GRANITE, XMaterial.POLISHED_ANDESITE,
            XMaterial.POLISHED_DIORITE, XMaterial.POLISHED_GRANITE, XMaterial.POLISHED_BLACKSTONE,
            XMaterial.BLACKSTONE, XMaterial.END_STONE_BRICKS, XMaterial.STONE);

        // Flowers (1.14 additions with no legacy predecessor at all -> a generic legacy flower/mushroom).
        mapAll(m, XMaterial.ALLIUM, XMaterial.BLUE_ORCHID, XMaterial.CORNFLOWER, XMaterial.LILY_OF_THE_VALLEY,
            XMaterial.ORANGE_TULIP, XMaterial.PINK_TULIP, XMaterial.WHITE_TULIP, XMaterial.WITHER_ROSE,
            XMaterial.POPPY);

        // Food (1.13+ fish/beetroot have no direct legacy predecessor).
        mapAll(m, XMaterial.COD, XMaterial.SALMON, XMaterial.PUFFERFISH, XMaterial.TROPICAL_FISH, XMaterial.PORKCHOP);
        m.put(XMaterial.BEETROOT, XMaterial.CARROT);
        m.put(XMaterial.BEETROOT_SEEDS, XMaterial.WHEAT_SEEDS);
        m.put(XMaterial.COCOA_BEANS, XMaterial.INK_SAC);
        m.put(XMaterial.SWEET_BERRIES, XMaterial.SUGAR);
        m.put(XMaterial.HONEY_BOTTLE, XMaterial.GLASS_BOTTLE);
        m.put(XMaterial.HONEYCOMB, XMaterial.SUGAR);
        m.put(XMaterial.HONEY_BLOCK, XMaterial.GLASS);

        // Misc modern blocks/items with no pre-1.13 predecessor -> closest functional stand-in.
        m.put(XMaterial.BAMBOO, XMaterial.SUGAR_CANE);
        m.put(XMaterial.BARREL, XMaterial.CHEST);
        m.put(XMaterial.BLAST_FURNACE, XMaterial.FURNACE);
        m.put(XMaterial.SMOKER, XMaterial.FURNACE);
        m.put(XMaterial.CAMPFIRE, XMaterial.NETHERRACK);
        m.put(XMaterial.SOUL_CAMPFIRE, XMaterial.NETHERRACK);
        m.put(XMaterial.SOUL_FIRE, XMaterial.NETHERRACK);
        m.put(XMaterial.CARVED_PUMPKIN, XMaterial.PUMPKIN);
        m.put(XMaterial.COMPOSTER, XMaterial.CHEST);
        m.put(XMaterial.CRIMSON_FUNGUS, XMaterial.RED_MUSHROOM);
        m.put(XMaterial.WARPED_FUNGUS, XMaterial.RED_MUSHROOM);
        m.put(XMaterial.STRIPPED_WARPED_HYPHAE, XMaterial.NETHERRACK);
        m.put(XMaterial.TWISTING_VINES, XMaterial.VINE);
        m.put(XMaterial.CRYING_OBSIDIAN, XMaterial.OBSIDIAN);
        m.put(XMaterial.RESPAWN_ANCHOR, XMaterial.OBSIDIAN);
        m.put(XMaterial.DARK_PRISMARINE, XMaterial.PRISMARINE);
        m.put(XMaterial.DRAGON_BREATH, XMaterial.GLASS_BOTTLE);
        m.put(XMaterial.EXPERIENCE_BOTTLE, XMaterial.GLASS_BOTTLE);
        m.put(XMaterial.ELYTRA, XMaterial.CHAINMAIL_CHESTPLATE);
        m.put(XMaterial.ENCHANTED_GOLDEN_APPLE, XMaterial.GOLDEN_APPLE);
        m.put(XMaterial.END_CRYSTAL, XMaterial.GLASS);
        mapAll(m, XMaterial.FIRE_CORAL, XMaterial.FIRE_CORAL_BLOCK, XMaterial.BRAIN_CORAL_BLOCK, XMaterial.BUBBLE_CORAL_BLOCK,
            XMaterial.HORN_CORAL, XMaterial.HORN_CORAL_BLOCK, XMaterial.TUBE_CORAL, XMaterial.TUBE_CORAL_BLOCK,
            XMaterial.DEAD_BRAIN_CORAL_BLOCK, XMaterial.DEAD_FIRE_CORAL_BLOCK, XMaterial.DEAD_HORN_CORAL_BLOCK,
            XMaterial.DEAD_TUBE_CORAL_BLOCK, XMaterial.SPONGE);
        m.put(XMaterial.GRINDSTONE, XMaterial.ANVIL);
        m.put(XMaterial.LOOM, XMaterial.CRAFTING_TABLE);
        m.put(XMaterial.MUSIC_DISC_PIGSTEP, XMaterial.MUSIC_DISC_CAT);
        m.put(XMaterial.NAUTILUS_SHELL, XMaterial.GHAST_TEAR);
        m.put(XMaterial.NETHER_GOLD_ORE, XMaterial.GOLD_ORE);
        m.put(XMaterial.OBSERVER, XMaterial.PISTON);
        m.put(XMaterial.PHANTOM_MEMBRANE, XMaterial.LEATHER);
        m.put(XMaterial.SHIELD, XMaterial.CHEST);
        m.put(XMaterial.SHROOMLIGHT, XMaterial.GLOWSTONE);
        m.put(XMaterial.SMITHING_TABLE, XMaterial.CRAFTING_TABLE);
        m.put(XMaterial.STONECUTTER, XMaterial.CRAFTING_TABLE);
        m.put(XMaterial.TOTEM_OF_UNDYING, XMaterial.EMERALD);
        m.put(XMaterial.TRIDENT, XMaterial.IRON_SWORD);
        m.put(XMaterial.WITHER_SKELETON_SKULL, XMaterial.SKELETON_SKULL);

        return m;
    }

    @SafeVarargs
    private static void mapAll(Map<XMaterial, XMaterial> m, XMaterial... entries) {
        // Last element is the target; everything before it maps to it.
        XMaterial target = entries[entries.length - 1];
        for (int i = 0; i < entries.length - 1; i++) {
            m.put(entries[i], target);
        }
    }

    private static Material substitute(XMaterial xMaterial) {
        XMaterial sub = LEGACY_SUBSTITUTES.get(xMaterial);
        return sub != null ? sub.parseMaterial() : null;
    }
}
