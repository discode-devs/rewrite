package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent

object C {
    fun cembed(event: SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("C")
        eb.setDescription("The grandfather of everything else.")
        eb.setFooter("Discode")
        eb.addField("What is it?", "C is a general purpose, procedural programming language supporting structured programming, lexical variable scope, and recursion. It was developed by Dennis Ritchie between 1969 and 1973.", false)
        eb.setColor(5793266)
        event.replyEmbeds(eb.build()).queue()
    }
}