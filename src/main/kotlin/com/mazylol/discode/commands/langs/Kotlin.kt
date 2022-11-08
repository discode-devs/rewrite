package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import java.util.Date

object Kotlin {
    fun kotlinembed(event : StringSelectInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Kotlin")
        eb.setDescription("Java but slightly less painful.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/kotlin.png")
        eb.addField("Overview", "Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. It is designs to interoperate fully with Java. Kotlin was designed by JetBrains and first appeared on July 22, 2011.", false)
        eb.addField("Features", "- Allows writing less code\n- Adopting Kotlin is easy\n- Fully compatible with Java\n- No runtime overhead\n- Strong community\n- Suited for multi-platform development\n- Kotlin development offers more safety", false)
        eb.addField("Code Example", "```kotlin\nfun main(args : Array<String>) {\n println(\"Hello, World!\")\n}\n```", false)
        eb.addField("Learn", "https://developer.android.com/kotlin/learn\nhttps://www.programiz.com/kotlin-programming\nhttps://www.w3schools.com/kotlin/index.php\nhttps://hackr.io/tutorials/learn-kotlin", false)
        eb.addField("Sources", "https://kotlinlang.org/\nhttps://en.wikipedia.org/wiki/Kotlin_(programming_language)\nhttps://www.appsbee.com/blog/kotlin-advantages-disadvantages-facts-you-should-know/\nhttps://sagaratechnology.medium.com/what-are-the-benefits-of-kotlin-d7fdcd1cfc0", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}