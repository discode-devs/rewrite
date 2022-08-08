package com.mazylol.discode.commands.langs

import com.mazylol.discode.commands.langs.C.cembed
import net.dv8tion.jda.api.entities.emoji.Emoji
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.interactions.components.selections.SelectMenu
import net.dv8tion.jda.api.interactions.components.selections.SelectOption

class LangDropDown : ListenerAdapter() {
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        if (event.name == "language") {
            val selectMenu = SelectMenu.create("choose-language")
                .addOptions(SelectOption.of("C", "c")
                    .withDescription("The C language")
                    .withEmoji(Emoji.fromFormatted("<:lang_c:1006057229922869308>")),
                ).addOptions(SelectOption.of("C++", "cpp")
                    .withDescription("The C++ language")
                    .withEmoji(Emoji.fromFormatted("<:lang_cpp:1006057883496095865>"))
                )
                .build()

            event.reply("Choose the language")
                .addActionRow(selectMenu)
                .setEphemeral(true)
                .queue()
        }
    }

    override fun onSelectMenuInteraction(event: SelectMenuInteractionEvent) {
        val sel = event.values[0]

       if (sel.equals("c")) {
           cembed(event)
       } else if (sel.equals("cpp")) {
           event.reply("C++!!!!").queue()
       }
    }
}