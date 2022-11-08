package com.mazylol.discode.commands.people

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import java.util.Date

object DennisRitchie {
    fun dennisritchieembed(event : StringSelectInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Dennis Ritchie")
        eb.setDescription("C and Unix God")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/people/dennisritchie.jpg")
        eb.addField("Overview", "Dennis MacAllistair Ritchie was an American computer scientist. He created the C programming language, and with long-time colleague Ken Thompson, the Unix operating system.", false)
        eb.addField("Life and Death", "Born: September 9, 1941\nDied: October 12, 2011", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/Dennis_Ritchie", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}