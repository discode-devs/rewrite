import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("java")
    application
}

group = "com.mazylol.discode"
version = "1.4"

val jdaVersion = "5.0.0-alpha.22"

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
}

dependencies {
    implementation("net.dv8tion:JDA:$jdaVersion") {
        exclude(module = "opus-java")
    }
    implementation("io.github.cdimascio:dotenv-java:2.2.4")
    implementation("ch.qos.logback:logback-classic:1.4.4")
}

application {
    mainClass.set("com.mazylol.discode.DiscordBot")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}