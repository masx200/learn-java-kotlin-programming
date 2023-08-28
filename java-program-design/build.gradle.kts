plugins {
    kotlin("jvm") version "1.9.0"
    application
    java
    id("com.github.johnrengelman.shadow") version "8.1.1"
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
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
tasks.shadowJar{
    manifest.attributes.put("Main-Class", "MainKt")
}
//tasks.jar {
//    //println(enabled)
////    copy{  eachFile { duplicatesStrategy = DuplicatesStrategy.INCLUDE }}
//    // enabled = true
//    manifest {
//        attributes(mapOf("Main-Class" to "MainKt"))
//    }
//    from(configurations.runtimeClasspath.get().map {
//        if (it.isDirectory) it else zipTree(it)
//    })
////    val sourcesMain = sourceSets.main.get()
////    sourcesMain.allSource.forEach { println("add from sources: ${it.name}") }
////    from(sourcesMain.output)
//}
//tasks.withType<Jar>() {
//
//    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
//}
