package com.github.relativobr.supreme.util;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.github.relativobr.supreme.machine.tech.MobTechGeneric;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.resource.mobtech.ZombieTech;

import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.core.services.localization.ItemTextResolver;
import io.github.thebusybiscuit.slimefun5.core.services.localization.ItemTextBlocks;

/**
 * Resolves the runtime-generated mob-tech tier items ({@code SUPREME_<type>_<creature>_<tier>}) for
 * Slimefun's per-viewer packet translation. These can't live in a static {@code items.yml}: each tier
 * has its own colour and Roman-numeral suffix ({@code buildNameTier}) plus tier/type-dependent lore.
 * The display is derived entirely from the id, so this is an id-keyed resolver ({@code item} unused).
 *
 * <p>
 * Rather than duplicate the composition, it re-runs {@link ItemUtil#buildItemFromMobTechDTO} - the same
 * builder that produced the item at registration - and reads back the exact name+lore. English baseline
 * for now; localization of the tier/type strings is a later content pass.
 */
public final class SupremeMobTechResolver implements ItemTextResolver {

    private static final Map<String, Integer> TIER_SUFFIX = new HashMap<>();

    static {
        TIER_SUFFIX.put("_0", 0);
        TIER_SUFFIX.put("_I", 1);
        TIER_SUFFIX.put("_II", 2);
        TIER_SUFFIX.put("_III", 3);
        TIER_SUFFIX.put("_IV", 4);
        TIER_SUFFIX.put("_V", 5);
        TIER_SUFFIX.put("_VI", 6);
        TIER_SUFFIX.put("_VII", 7);
        TIER_SUFFIX.put("_VIII", 8);
        TIER_SUFFIX.put("_IX", 9);
    }

    // Base id (e.g. SUPREME_EFFICIENCY_BEE) -> its MobTechGeneric, collected from the tech definition
    // classes. Built once at construction (called after Supreme's setup, so the static fields exist).
    private final Map<String, MobTechGeneric> byBaseId = new HashMap<>();

    public SupremeMobTechResolver() {
        for (Class<?> techClass : new Class<?>[] { BeeTech.class, IronGolemTech.class, ZombieTech.class }) {
            for (Field field : techClass.getDeclaredFields()) {
                if (!MobTechGeneric.class.isAssignableFrom(field.getType())) {
                    continue;
                }

                try {
                    MobTechGeneric tech = (MobTechGeneric) field.get(null);

                    if (tech != null && tech.getId() != null) {
                        byBaseId.put(tech.getId(), tech);
                    }
                } catch (ReflectiveOperationException ignored) {
                    // A single inaccessible field must not break resolver setup.
                }
            }
        }
    }

    @Override
    @Nullable
    public ItemTextBlocks resolve(@Nullable ItemStack item, String itemId, @Nullable String languageId) {
        int split = itemId.lastIndexOf('_');

        if (split <= 0) {
            return null;
        }

        Integer tier = TIER_SUFFIX.get(itemId.substring(split)); // suffix includes the leading '_'
        MobTechGeneric tech = byBaseId.get(itemId.substring(0, split));

        if (tier == null || tech == null) {
            return null;
        }

        SlimefunItemStack built = ItemUtil.buildItemFromMobTechDTO(tech, tier);
        ItemMeta meta = built.getItemMeta();

        if (meta == null) {
            return null;
        }

        String name = meta.hasDisplayName() ? meta.getDisplayName() : itemId;
        List<String> lore = meta.getLore() != null ? meta.getLore() : Collections.<String>emptyList();

        // The built lore is this tier's numbers - the one thing an items.yml entry cannot know - so it goes
        // in the Stats block and the item keeps its authored type and description.
        return ItemTextBlocks.of(name, null, null, lore, null);
    }
}
