package com.mazylol.discode.commands.people

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object KenThompson {
    fun kenthompsonembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Ken Thompson")
        eb.setDescription("B, Unix, and Go God")
        eb.addField("Oveview", "", false)
        event.replyEmbeds(eb.build()).queue()
    }
}
