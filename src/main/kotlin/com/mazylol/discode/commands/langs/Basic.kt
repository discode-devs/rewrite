package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import java.util.Date

object Basic {
    fun basicembed(event: StringSelectInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("BASIC")
        eb.setDescription("Code on easy mode.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/basic.jpg")
        eb.addField("Overview", "BASIC is a family of general-purpose, high-level programming languages whose design goal is to create programs that are simple to understand, and to be easy to modify or extend. BASIC was originally designed as a way to teach children to program, but it has since become a popular programming language for many years. It was created by John G. Kemeny and Thomas E. Kurtz in 1964.", false)
        eb.addField("Features", "- Easy to learn\n- Very easy to understand\n- Size is small\n- Imperative", false)
        eb.addField("Code Example", "```basic\nPRINT \"Hello, World!\"\nEND\n```", false)
        eb.addField("Learn", "https://www.youtube.com/watch?v=dwVAR6HClmI", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/BASIC\nhttps://www.uopeople.edu/blog/6-reasons-why-you-should-learn-basic-programming/", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}