package com.mazylol.discode.commands.people

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object KenThompson {
    fun kenthompsonembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Ken Thompson")
        eb.setDescription("B, Unix, and Go God")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/people/kenthompson.png")
        eb.addField("Oveview", "Kenneth Lane Thompson is an American computer scientist. He designed and implemented the original Unix operating system. He also create the B language which was the predecessor to C. Since 2006 he has worked at Google where he has co-developed the Go programming language.", false)
        eb.addField("Life and Death", "Born: Feburary 4, 1943\nDied: N/A", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/Ken_Thompson", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}
