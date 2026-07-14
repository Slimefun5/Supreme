package com.github.relativobr.supreme.libs.guizhanlib.utils;

import com.google.common.base.Preconditions;

import javax.annotation.Nonnull;
import java.util.Locale;

/**
 * Java-8 port of (the subset of) GuizhanLib's {@code StringUtil} that Supreme actually used -
 * vendored for the same reason as {@link ChatUtil}/{@link
 * com.github.relativobr.supreme.libs.guizhanlib.localization.Localization}. Only {@link
 * #dehumanize(String)} is ported; upstream's {@code humanize(String)} is unused by Supreme and
 * dropped.
 *
 * @author ybw0014 (original), downleveled for Java 8
 */
public final class StringUtil {

    private StringUtil() {
    }

    /**
     * Converts a string into upper-case-with-underscores form, matching upstream GuizhanLib's
     * behaviour (spaces and hyphens become underscores, then upper-cased).
     */
    @Nonnull
    public static String dehumanize(@Nonnull String str) {
        Preconditions.checkArgument(str != null, "the string should not be null");

        return str.toUpperCase(Locale.ROOT)
            .replace(" ", "_")
            .replace("-", "_");
    }
}
