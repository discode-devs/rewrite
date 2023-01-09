import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("java")
    application
}

group = "com.mazylol.discode"
version = "1.4.1"

val jdaVersion = "5.0.0-beta.2"

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
}

dependencies {
    implementation("net.dv8tion:JDA:$jdaVersion") {
        exclude(module = "opus-java")
    }
    implementation("io.github.cdimascio:dotenv-kotlin:6.3.1")
    implementation("ch.qos.logback:logback-classic:1.4.5")
}

application {
    mainClass.set("com.mazylol.discode.DiscordBot")
}

distributions {
    main {
        contents {
            from(".env")
        }
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}