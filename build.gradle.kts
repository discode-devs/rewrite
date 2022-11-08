import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("java")
    application
}

group = "com.mazylol.discode"
version = "1.4"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:5.0.0-alpha.22") {
        exclude(module = "opus-java")
    }
    implementation("io.github.cdimascio:dotenv-java:2.2.4")
}

application {
    mainClass.set("com.mazylol.discode.DiscordBot")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}