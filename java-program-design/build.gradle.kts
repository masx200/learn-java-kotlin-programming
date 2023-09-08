plugins {
    kotlin("jvm") version "1.9.0"
    application
    java
    id("com.github.johnrengelman.shadow") version "8.1.1"
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed", "STARTED", "STANDARD_OUT", "STANDARD_ERROR")
    }
}

kotlin {
    jvmToolchain(11)

    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
    }
}
val AppMainClass = "chapter.one.two.two.one.MainKt"
application {
    mainClass.set(AppMainClass)
}
tasks.shadowJar {
    manifest.attributes["Main-Class"] = AppMainClass
}
