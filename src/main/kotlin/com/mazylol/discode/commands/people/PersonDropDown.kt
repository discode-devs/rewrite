package com.mazylol.discode.commands.people

import com.mazylol.discode.commands.people.AdaLovelace.adalovelaceembed
import com.mazylol.discode.commands.people.DennisRitchie.dennisritchieembed
import net.dv8tion.jda.api.entities.emoji.Emoji
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.interactions.components.selections.SelectMenu
import net.dv8tion.jda.api.interactions.components.selections.SelectOption

class PersonDropDown : ListenerAdapter() {
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        if (event.name == "person") {
            val selectMenu = SelectMenu.create("choose-language")
                .addOptions(SelectOption.of("Ada Lovelace", "adalovelace")
                    .withEmoji(Emoji.fromFormatted("<:person_adalovelace:1007468964303077416>"))
                ).addOptions(SelectOption.of("Dennis Ritchie", "dennisritchie")
                    .withEmoji(Emoji.fromFormatted("<:person_dennisritchie:1007469018984218655>"))
                )
                .build()

            event.reply("Choose the person")
                .addActionRow(selectMenu)
                .setEphemeral(true)
                .queue()
        }
    }

    override fun onSelectMenuInteraction(event: SelectMenuInteractionEvent) {
        when(event.values[0]) {
            "adalovelace" -> adalovelaceembed(event)
            "dennisritchie" -> dennisritchieembed(event)
            else -> event.reply("Invalid (somehow)")
        }
    }
}