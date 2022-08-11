package com.mazylol.discode.commands.info

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import java.util.*

class Help : ListenerAdapter() {
    override fun onSlashCommandInteraction(event : SlashCommandInteractionEvent) {
        if (event.name == "help") {
            val eb = EmbedBuilder()
            eb.setTitle("Help")
            eb.addField("framework", "Send the command and then select a framework from the menu. You will then get some info about the framework.", false)
            eb.addField("language", "Send the command and then select a language from the menu. You will then get some info about the language.", false)
            eb.addField("person", "Send the command and then select a person from the menu. You will then get some info about the person.", false)
            eb.setTimestamp(Date().toInstant())
            eb.setColor(5793266)
            eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
            event.replyEmbeds(eb.build()).queue()
        }
    }
}