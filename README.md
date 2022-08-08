# Discode (rewrite)
My not so popular Discode bot. Rewritten in Kotlin.

## Why?
The original Discode bot is written in C. As much as I like the Concord library. I would have an easier time using Kotlin with the JDA library. Plus, I want to learn Java/Kotlin anyways.

## How to run

### Dependencies
* OpenJDK
* Kotlin
* Gradle

### Set up project
1. Clone and move into the repo (`git clone https://github.com/discode-devs/rewrite && rewrite`)
2. Create a .env file in the root of the project with the text: `TOKEN=YOUR-BOT-TOKEN`

### Run
There two things you could do here. You could run it with `gradle run`. Or you could run `gradle build`, copy the .env to `build/libs`, go to `build/libs`, and then run `discode-<VERSION>-standalone.jar`.