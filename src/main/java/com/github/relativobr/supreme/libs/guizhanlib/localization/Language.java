package com.github.relativobr.supreme.libs.guizhanlib.localization;

import com.google.common.base.Preconditions;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.io.File;
import java.io.IOException;

/**
 * This class represents a language, which holds the localization {@link FileConfiguration}.
 * <p>
 * Java-8 port of GuizhanLib's {@code Language} - see the note on {@link Localization}. Vendored
 * because GuizhanLib 0.9.0's jar is class-file version 60 (Java 16), unreadable by a Java-8 javac.
 *
 * @author ybw0014 (original), downleveled for Java 8
 */
@SuppressWarnings("ConstantConditions")
public final class Language {

    private final String lang;
    private final File currentFile;
    private final FileConfiguration currentConfig;

    @ParametersAreNonnullByDefault
    public Language(String lang, File currentFile, FileConfiguration defaultConfig) {
        Preconditions.checkArgument(lang != null, "Language key cannot be null");
        Preconditions.checkArgument(currentFile != null, "Current file cannot be null");
        Preconditions.checkArgument(defaultConfig != null, "default config cannot be null");

        this.lang = lang;
        this.currentFile = currentFile;
        this.currentConfig = YamlConfiguration.loadConfiguration(currentFile);
        this.currentConfig.setDefaults(defaultConfig);

        for (String key : defaultConfig.getKeys(true)) {
            if (!currentConfig.contains(key)) {
                currentConfig.set(key, defaultConfig.get(key));
            }
        }

        save();
    }

    @Nonnull
    public String getName() {
        return lang;
    }

    @Nonnull
    public FileConfiguration getLang() {
        return currentConfig;
    }

    public void save() {
        try {
            currentConfig.save(currentFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
