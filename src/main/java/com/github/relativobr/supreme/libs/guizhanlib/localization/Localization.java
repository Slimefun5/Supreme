package com.github.relativobr.supreme.libs.guizhanlib.localization;

import com.google.common.base.Preconditions;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/**
 * Localization service. Should be initialized after loading config file and before registering items.
 * <p>
 * Java-8 port of GuizhanLib's {@code Localization}. Vendored under this addon's own package because
 * GuizhanLib 0.9.0's published jar is class-file version 60 (Java 16), which a Java-8 javac cannot
 * even read as a compile dependency ("class file has wrong version 60.0, should be 52.0"), and its
 * other classes (AbstractAddon/AddonConfig/SlimefunLocalization) hard-bind to the pre-fork
 * {@code io.github.thebusybiscuit.slimefun5} API. Only the Slimefun-independent pieces Supreme
 * actually used (this class + {@link Language}, {@code ChatUtil}, {@code StringUtil}, and the
 * {@code MenuBlock}/{@code MenuBlockPreset} machine wrapper) are vendored as plain Java-8 source.
 *
 * @author ybw0014 (original), downleveled for Java 8
 */
@SuppressWarnings("ConstantConditions")
public class Localization {

    private final JavaPlugin plugin;
    private final String langFolderName;
    private final File langFolder;
    private final List<String> languages = new LinkedList<>();
    private final Map<String, Language> langMap = new LinkedHashMap<>();

    @ParametersAreNonnullByDefault
    public Localization(JavaPlugin plugin) {
        this(plugin, "lang");
    }

    @ParametersAreNonnullByDefault
    public Localization(JavaPlugin plugin, String folderName) {
        Preconditions.checkArgument(plugin != null, "The plugin instance should not be null");
        Preconditions.checkArgument(folderName != null, "The folder name should not be null");

        this.plugin = plugin;

        if (!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();
        }

        this.langFolderName = folderName;
        langFolder = new File(plugin.getDataFolder(), folderName);
        if (!langFolder.exists()) {
            langFolder.mkdir();
        }
    }

    @ParametersAreNonnullByDefault
    public Localization(JavaPlugin plugin, String folderName, String langFile) {
        this(plugin, folderName);
        addLanguage(langFile);
    }

    protected final JavaPlugin getPlugin() {
        return plugin;
    }

    /**
     * Load a language file to configuration.
     *
     * @param langFilename the filename of language file without extension .yml
     */
    public final void addLanguage(@Nonnull String langFilename) {
        Preconditions.checkArgument(langFilename != null, "The language file name should not be null");

        File langFile = new File(langFolder, langFilename + ".yml");
        String resourcePath = langFolderName + "/" + langFilename + ".yml";
        if (!langFile.exists()) {
            try {
                plugin.saveResource(resourcePath, false);
            } catch (IllegalArgumentException ex) {
                plugin.getLogger().log(Level.SEVERE, "The default language file {0} does not exist in jar file!", resourcePath);
                return;
            }
        }

        languages.add(langFilename);

        InputStreamReader defaultReader = new InputStreamReader(plugin.getResource(resourcePath), StandardCharsets.UTF_8);
        FileConfiguration defaultConfig = YamlConfiguration.loadConfiguration(defaultReader);
        langMap.put(langFilename, new Language(langFilename, langFile, defaultConfig));
    }

    @Nonnull
    public String getString(@Nonnull String path) {
        Preconditions.checkArgument(path != null, "path cannot be null");

        for (String lang : languages) {
            String localization = langMap.get(lang).getLang().getString(path);
            if (localization != null) {
                return localization;
            }
        }
        return "";
    }

    @Nonnull
    public List<String> getStringList(@Nonnull String path) {
        Preconditions.checkArgument(path != null, "path cannot be null");

        for (String lang : languages) {
            List<String> localization = langMap.get(lang).getLang().getStringList(path);
            if (!localization.isEmpty()) {
                return localization;
            }
        }
        return new ArrayList<>();
    }

    @Nonnull
    public String[] getStringArray(@Nonnull String path) {
        return getStringList(path).toArray(new String[0]);
    }
}
