package com.mazylol.discode.commands.people

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import java.util.Date

object AdaLovelace {
    fun adalovelaceembed(event : StringSelectInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Ada Lovelace")
        eb.setDescription("While not a language, still very very important to programming as a whole.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/people/adalovelace.jpg")
        eb.addField("Overview", "Ada lovelace was born in 1815. As an adult she worked under Charles Babbage. She worked on his Analytical Machine. The machine was kind of like the world's first computer. She figured out how to execute things on it. These basics became the base of how all languages work at their very core.", false)
        eb.addField("Life and Death", "Born: London, England, December 10, 1815\nDied: London England, November 27, 1852", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/Ada_Lovelace\nhttps://www.sdsc.edu/ScienceWomen/lovelace.html", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}