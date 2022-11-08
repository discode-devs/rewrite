package com.mazylol.discode.commands.people

import com.mazylol.discode.commands.people.AdaLovelace.adalovelaceembed
import com.mazylol.discode.commands.people.DennisRitchie.dennisritchieembed
import com.mazylol.discode.commands.people.KenThompson.kenthompsonembed
import net.dv8tion.jda.api.entities.emoji.Emoji
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.interactions.components.selections.SelectOption
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu

class PersonDropDown : ListenerAdapter() {
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        if (event.name == "person") {
            val selectMenu = StringSelectMenu.create("choose-language")
                .addOptions(SelectOption.of("Ada Lovelace", "adalovelace")
                    .withEmoji(Emoji.fromFormatted("<:person_adalovelace:1007468964303077416>"))
                ).addOptions(SelectOption.of("Dennis Ritchie", "dennisritchie")
                    .withEmoji(Emoji.fromFormatted("<:person_dennisritchie:1007469018984218655>"))
                ).addOptions(SelectOption.of("Ken Thompson", "kenthompson")
                    .withEmoji(Emoji.fromFormatted("<:person_kenthompson:1035666250547855501>"))
                )
                .build()

            event.reply("Choose the person")
                .addActionRow(selectMenu)
                .setEphemeral(true)
                .queue()
        }
    }

    override fun onStringSelectInteraction(event: StringSelectInteractionEvent) {
        when(event.values[0]) {
            "adalovelace" -> adalovelaceembed(event)
            "dennisritchie" -> dennisritchieembed(event)
            "kenthompson" -> kenthompsonembed(event)
            else -> event.reply("Invalid (somehow)")
        }
    }
}