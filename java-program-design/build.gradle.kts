plugins {
    kotlin("jvm") version "1.9.0"
    application
    java
    id("com.github.johnrengelman.shadow") version "8.1.1"
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
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
    jvmToolchain(17)

    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}
val AppMainClass = "chapter.one.two.two.one.MainKt"
application {
    mainClass.set(AppMainClass)
}
tasks.shadowJar {
    manifest.attributes["Main-Class"] = AppMainClass
}
