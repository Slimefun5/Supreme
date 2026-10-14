package com.github.relativobr.supreme.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun5.core.services.localization.Language;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;

/**
 * One addon file's strings for every language, read once at enable so an {@link
 * io.github.thebusybiscuit.slimefun5.core.services.localization.ItemTextResolver} can look them up by
 * language id.
 *
 * @implNote A resolver runs on the Netty thread, where file I/O and per-player state are off limits,
 *           and core's message service only resolves by {@code Player}. Loading everything up front
 *           into immutable maps is what makes the lookup safe there.
 */
public final class ResolverTexts {

    private final Map<String, Map<String, String>> byLanguage;

    private ResolverTexts(@Nonnull Map<String, Map<String, String>> byLanguage) {
        this.byLanguage = byLanguage;
    }

    /** Main thread only. Reads {@code languages/<lang>/<fileName>} from the addon's jar. */
    @Nonnull
    public static ResolverTexts load(@Nonnull JavaPlugin addon, @Nonnull String fileName) {
        Map<String, Map<String, String>> byLanguage = new HashMap<>();
        load(addon, fileName, "en", byLanguage);

        for (Language language : Slimefun.getLocalization().getLanguages()) {
            load(addon, fileName, language.getId(), byLanguage);
        }

        return new ResolverTexts(Collections.unmodifiableMap(byLanguage));
    }

    private static void load(@Nonnull JavaPlugin addon, @Nonnull String fileName, @Nonnull String languageId,
                             @Nonnull Map<String, Map<String, String>> byLanguage) {
        InputStream stream = addon.getResource("languages/" + languageId + "/" + fileName);

        if (stream == null) {
            return;
        }

        byLanguage.put(languageId, Collections.unmodifiableMap(read(stream)));
    }

    @Nonnull
    private static Map<String, String> read(@Nonnull InputStream stream) {
        Map<String, String> strings = new HashMap<>();

        try {
            YamlConfiguration config = YamlConfiguration.loadConfiguration(new InputStreamReader(stream, StandardCharsets.UTF_8));

            for (String key : config.getKeys(true)) {
                if (config.isString(key)) {
                    strings.put(key, config.getString(key));
                }
            }
        } catch (RuntimeException malformed) {
            strings.clear();
        }

        return strings;
    }

    /** The string in this language, else English, else {@code null}. */
    @Nullable
    public String get(@Nullable String languageId, @Nonnull String key) {
        String found = languageId == null ? null : find(languageId, key);
        return found != null ? found : find("en", key);
    }

    @Nullable
    private String find(@Nonnull String languageId, @Nonnull String key) {
        Map<String, String> strings = byLanguage.get(languageId);
        return strings == null ? null : strings.get(key);
    }
}
