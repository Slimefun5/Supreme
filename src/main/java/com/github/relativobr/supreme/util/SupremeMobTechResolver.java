package com.github.relativobr.supreme.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.inventory.ItemStack;

import com.github.relativobr.supreme.machine.tech.MobTechGeneric;
import com.github.relativobr.supreme.machine.tech.MobTechGeneric.MobTechType;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.resource.mobtech.ZombieTech;

import io.github.thebusybiscuit.slimefun5.core.services.localization.ItemTextResolver;
import io.github.thebusybiscuit.slimefun5.core.services.localization.ItemTextBlocks;

/**
 * Resolves the runtime-generated mob-tech tier items ({@code SUPREME_<type>_<creature>_<tier>}) for
 * Slimefun's per-viewer packet translation. These can't live in a static {@code items.yml}: each tier
 * has its own colour and Roman-numeral suffix plus tier and type dependent lore. The display is derived
 * entirely from the id, so this is an id-keyed resolver ({@code item} unused).
 *
 * <p>
 * The text comes from {@code languages/<lang>/mobtech.yml} and the numbers are computed here exactly as
 * {@link ItemUtil#buildItemFromMobTechDTO} computes them, so the English rendering is unchanged.
 */
public final class SupremeMobTechResolver implements ItemTextResolver {

    private static final String[] TIER_SUFFIXES = { "_0", "_I", "_II", "_III", "_IV", "_V", "_VI", "_VII", "_VIII", "_IX" };
    private static final String[] TIER_NUMERALS = { "", " I", " II", " III", " IV", " V", " VI", " VII", " VIII", " IX" };
    private static final String[] TIER_COLOURS = { "&8", "&7", "&2", "&a", "&1", "&9", "&6", "&e", "&4", "&5" };

    private final Map<String, MobTechGeneric> byBaseId = new HashMap<>();
    private final ResolverTexts texts;
    private final int clonesPerStack;

    /**
     * @param clonesPerStack
     *            the operator's {@code getMaxAmountTechGenerator} setting, read once here because the
     *            resolver runs on the Netty thread where Supreme's live config is off limits
     */
    public SupremeMobTechResolver(@Nonnull ResolverTexts texts, int clonesPerStack) {
        this.texts = texts;
        this.clonesPerStack = clonesPerStack;

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

        int tier = tierOf(itemId.substring(split));
        MobTechGeneric tech = byBaseId.get(itemId.substring(0, split));

        if (tier < 0 || tech == null) {
            return null;
        }

        String baseName = text(languageId, "names." + tech.getId(), tech.getName());
        String name = TIER_COLOURS[tier] + baseName + TIER_NUMERALS[tier];
        List<String> type = Collections.singletonList(text(languageId, "lore.type", "&7&oComponent"));

        List<String> stats = new ArrayList<>();
        stats.add(radiationLine(languageId, tech.getMobTechType()));
        stats.add(effectLine(languageId, tech.getMobTechType(), tier));
        stats.add(valueLine(languageId, tech.getMobTechType(), tier));

        return ItemTextBlocks.of(name, type, null, stats, null);
    }

    private static int tierOf(@Nonnull String suffix) {
        for (int tier = 0; tier < TIER_SUFFIXES.length; tier++) {
            if (TIER_SUFFIXES[tier].equals(suffix)) {
                return tier;
            }
        }

        return -1;
    }

    @Nonnull
    private String radiationLine(@Nullable String languageId, @Nonnull MobTechType type) {
        switch (type) {
            case MUTATION_INTELLIGENCE:
            case MUTATION_BERSERK:
            case MUTATION_LUCK:
                return text(languageId, "lore.radiation-very-deadly", "&a☢&7 Radiation level: &4VERY DEADLY");
            case ROBOTIC_CLONING:
            case ROBOTIC_ACCELERATION:
            case ROBOTIC_EFFICIENCY:
                return text(languageId, "lore.radiation-high", "&a☢&7 Radiation level: &6HIGH");
            case SIMPLE:
            default:
                return text(languageId, "lore.radiation-low", "&a☢&7 Radiation level: &eLOW");
        }
    }

    @Nonnull
    private String effectLine(@Nullable String languageId, @Nonnull MobTechType type, int tier) {
        String multiplier = String.valueOf(tier + 1);
        String percent = String.valueOf((tier + 1) * 10);

        switch (type) {
            case MUTATION_BERSERK:
            case ROBOTIC_ACCELERATION:
                return fill(text(languageId, "lore.speed", "&a{0}x &7increase speed &c{1}% &7increase energy"), multiplier, percent);
            case MUTATION_LUCK:
            case ROBOTIC_CLONING:
                return fill(text(languageId, "lore.clone", "&a+{0} stack &7clone"), String.valueOf(cloneStacks(tier)));
            case MUTATION_INTELLIGENCE:
            case ROBOTIC_EFFICIENCY:
                return fill(text(languageId, "lore.energy", "&a{0}% &7decrease energy"), percent);
            case SIMPLE:
            default:
                return text(languageId, "lore.simple", "&7Increases processing speed");
        }
    }

    private static int cloneStacks(int tier) {
        if (tier >= 9) {
            return 4;
        } else if (tier >= 6) {
            return 3;
        } else if (tier >= 4) {
            return 2;
        }

        return 1;
    }

    @Nonnull
    private String valueLine(@Nullable String languageId, @Nonnull MobTechType type, int tier) {
        switch (type) {
            case MUTATION_BERSERK:
            case ROBOTIC_ACCELERATION:
            case MUTATION_INTELLIGENCE:
            case ROBOTIC_EFFICIENCY:
                return fill(text(languageId, "lore.value-tier", "&7Value process &e({0} * amount stack * 0.15625)"), String.valueOf(tier + 1));
            case MUTATION_LUCK:
            case ROBOTIC_CLONING:
                return fill(text(languageId, "lore.value-clone", "&7Value process &e({0}x per stack)"), String.valueOf(clonesPerStack));
            case SIMPLE:
            default:
                return text(languageId, "lore.value-simple", "&7Value process &e(amount stack * 0.15625)");
        }
    }

    @Nonnull
    private String text(@Nullable String languageId, @Nonnull String key, @Nonnull String english) {
        String found = texts.get(languageId, key);
        return found != null ? found : english;
    }

    /**
     * @implNote Plain replacement rather than {@code MessageFormat}, which treats an apostrophe as a
     *           quote and would swallow placeholders in French or Italian lines.
     */
    @Nonnull
    private static String fill(@Nonnull String template, @Nonnull String... values) {
        String filled = template;

        for (int index = 0; index < values.length; index++) {
            filled = filled.replace("{" + index + "}", values[index]);
        }

        return filled;
    }
}
