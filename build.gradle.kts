plugins {
    java
    id("com.gradleup.shadow") version "9.3.2"
    id("io.github.intisy.github-gradle") version "1.8.3"
}

group = "com.github.relativobr"
description = "Supreme is a Slimefun addon that adds high-tier machines, magic, and generic-machine tooling."

apply(from = "https://raw.githubusercontent.com/Slimefun5/gradle/stable/slimefun-addon.gradle")

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")

    // spring-context 6.1.10 (from the upstream pom) was removed entirely: its class files are Java-17
    // bytecode and cannot be loaded on a Java-8 runtime. It was only ever used superficially, as a
    // class-level @Async annotation on 12 machine classes with no Spring ApplicationContext/@EnableAsync
    // bootstrapped anywhere in the plugin - meaning @Async was already inert dead code (Spring's async
    // proxying requires a live container, which this plugin never created). The annotations were removed
    // outright; no scheduler replacement was needed since nothing was actually being scheduled by them.

    // GuizhanLib 0.9.0 (from the upstream pom) is NOT a dependency here: its jar is Java-16 class files,
    // unreadable by a Java-8 javac as a compile dependency. Supreme used only a handful of its pieces
    // (Localization/Language, ChatUtil, the MenuBlock/MenuBlockPreset slimefun-machine wrapper); those are
    // vendored as plain Java-8 source under com.github.relativobr.supreme.libs.guizhanlib instead.
}

tasks {
    shadowJar {
        minimize()
        exclude("io/github/thebusybiscuit/slimefun5/**")
    }
}
