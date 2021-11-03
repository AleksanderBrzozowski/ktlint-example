import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jlleitschuh.gradle.ktlint.KtlintExtension

plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
}

group = "pl.brzozowski"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

configure<KtlintExtension> {
    version.set("0.43.0")
    enableExperimentalRules.set(true)
}
