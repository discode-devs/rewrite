package com.mazylol.discode.commands.langs

import com.mazylol.discode.commands.langs.Asm.asmembed
import com.mazylol.discode.commands.langs.Basic.basicembed
import com.mazylol.discode.commands.langs.C.cembed
import com.mazylol.discode.commands.langs.CPP.cppembed
import com.mazylol.discode.commands.langs.CSS.cssembed
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
                .addOptions(SelectOption.of("Assembly", "asm")
                    .withDescription("The Assembly language")
                    .withEmoji(Emoji.fromFormatted("<:lang_asm:1006662018083856447>"))
                ).addOptions(SelectOption.of("BASIC", "basic")
                    .withDescription("The Basic language")
                    .withEmoji(Emoji.fromFormatted("<:lang_basic:1006663781318934659>"))
                ).addOptions(SelectOption.of("C", "c")
                    .withDescription("The C language")
                    .withEmoji(Emoji.fromFormatted("<:lang_c:1006057229922869308>"))
                ).addOptions(SelectOption.of("C++", "cpp")
                    .withDescription("The C++ language")
                    .withEmoji(Emoji.fromFormatted("<:lang_cpp:1006057883496095865>"))
                ).addOptions(SelectOption.of("CSS", "css")
                    .withDescription("The CSS language")
                    .withEmoji(Emoji.fromFormatted("<:lang_css:1006788608235163679>"))
                )
                .build()

            event.reply("Choose the language")
                .addActionRow(selectMenu)
                .setEphemeral(true)
                .queue()
        }
    }

    override fun onSelectMenuInteraction(event: SelectMenuInteractionEvent) {
        when(event.values[0]) {
            "asm" -> asmembed(event)
            "basic" -> basicembed(event)
            "c" -> cembed(event)
            "cpp" -> cppembed(event)
            "css" -> cssembed(event)
            else -> event.reply("Invalid (somehow)")
        }
    }
}