package com.mazylol.discode.commands.info

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.interactions.components.buttons.Button
import java.util.Date

class About : ListenerAdapter() {
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        if (event.name == "about") {
            val eb = EmbedBuilder()
            eb.setTitle("About")
            eb.setDescription("Discode is a bot that gives information about Languages, Frameworks, Tools, People, and much more! However, that is only half of the story.")
            eb.addField("Origins", "This bot was initially created for a history project. It was made in C with the Concord library.", false)
            eb.addField("Today", "Today it is made with Kotlin and the JDA library. It also has more features than it's initial 2021 release. It is being worked on little by little and has lots of love going into it.", false)
            eb.addField("Future", "The plan is to start implementing information about more frameworks, libraries, tools, and people. In that order. The team consists of one person so work probably will not be the fastest.", false)
            eb.setTimestamp(Date().toInstant())
            eb.setColor(5793266)
            eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
            eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
            event.replyEmbeds(eb.build())
                .addActionRow(Button.link("https://discode.mazylol.com", "Website"))
                .addActionRow(Button.link("https://github.com/discode-devs/rewrite", "Source Code"))
                .queue()
        }
    }
}