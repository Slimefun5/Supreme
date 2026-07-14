package com.github.relativobr.supreme.libs.guizhanlib.utils;

import com.google.common.base.Preconditions;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.text.MessageFormat;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java-8 port of GuizhanLib's {@code ChatUtil} - vendored for the same reason as
 * {@link com.github.relativobr.supreme.libs.guizhanlib.localization.Localization}.
 *
 * @author ybw0014 (original), downleveled for Java 8
 */
@SuppressWarnings({"ConstantConditions", "deprecation"})
public final class ChatUtil {

    private ChatUtil() {
    }

    @Nonnull
    public static String color(@Nonnull String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    @Nonnull
    public static List<String> color(@Nonnull List<String> strList) {
        Preconditions.checkArgument(strList != null, "String list cannot be null");

        return strList.stream().map(ChatUtil::color).collect(Collectors.toList());
    }

    @ParametersAreNonnullByDefault
    public static void send(CommandSender sender, String message, Object... args) {
        sender.sendMessage(color(MessageFormat.format(message, args)));
    }

    @ParametersAreNonnullByDefault
    public static void sendActionBar(Player player, String message, Object... args) {
        BaseComponent[] components = TextComponent.fromLegacyText(color(MessageFormat.format(message, args)));
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, components);
    }
}
