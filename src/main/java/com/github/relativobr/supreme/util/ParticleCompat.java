package com.github.relativobr.supreme.util;

import io.github.thebusybiscuit.slimefun5.libraries.xseries.particles.XParticle;
import org.bukkit.Location;

import javax.annotation.Nonnull;

/**
 * Isolated home for every reference to {@code org.bukkit.Particle} (1.9+). This class is loaded
 * <em>only</em> from behind a {@code CompatUtils.particlesSupported()} version guard, so on 1.8.8 the
 * JVM never loads/links it and therefore never has to resolve {@code org.bukkit.Particle}.
 * <p>
 * The reason this lives in its own class rather than a guarded private method of {@link CompatUtils}:
 * loading/verifying a class forces resolution of the Bukkit types named anywhere in its method
 * bodies/signatures, so a post-1.8 type mentioned inside {@code CompatUtils} would blow up
 * {@code CompatUtils} itself the moment any of its (unrelated) methods is called on 1.8.8.
 */
final class ParticleCompat {

    private ParticleCompat() {
    }

    static void spawn(@Nonnull Location location, @Nonnull String name, int count) {
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
}
