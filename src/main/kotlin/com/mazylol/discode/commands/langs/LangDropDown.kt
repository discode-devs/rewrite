package com.mazylol.discode.commands.langs

import com.mazylol.discode.commands.langs.Asm.asmembed
import com.mazylol.discode.commands.langs.Basic.basicembed
import com.mazylol.discode.commands.langs.C.cembed
import com.mazylol.discode.commands.langs.CPP.cppembed
import com.mazylol.discode.commands.langs.CSS.cssembed
import com.mazylol.discode.commands.langs.Fortran.fortranembed
import com.mazylol.discode.commands.langs.HTML.htmlembed
import com.mazylol.discode.commands.langs.Java.javaembed
import com.mazylol.discode.commands.langs.Javascript.javascriptembed
import com.mazylol.discode.commands.langs.Kotlin.kotlinembed
import com.mazylol.discode.commands.langs.PHP.phpembed
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
                    .withEmoji(Emoji.fromFormatted("<:lang_asm:1006662018083856447>"))
                ).addOptions(SelectOption.of("BASIC", "basic")
                    .withEmoji(Emoji.fromFormatted("<:lang_basic:1006663781318934659>"))
                ).addOptions(SelectOption.of("C", "c")
                    .withEmoji(Emoji.fromFormatted("<:lang_c:1006057229922869308>"))
                ).addOptions(SelectOption.of("C++", "cpp")
                    .withEmoji(Emoji.fromFormatted("<:lang_cpp:1006057883496095865>"))
                ).addOptions(SelectOption.of("CSS", "css")
                    .withEmoji(Emoji.fromFormatted("<:lang_css:1006788608235163679>"))
                ).addOptions(SelectOption.of("Fortran", "fortran")
                    .withEmoji(Emoji.fromFormatted("<:lang_fortran:1007006657064214639>"))
                ).addOptions(SelectOption.of("HTML", "html")
                    .withEmoji(Emoji.fromFormatted("<:lang_html:1007015250387804200>"))
                ).addOptions(SelectOption.of("Java", "java")
                    .withEmoji(Emoji.fromFormatted("<:lang_java:1007349779740758151>"))
                ).addOptions(SelectOption.of("Javascript", "javascript")
                    .withEmoji(Emoji.fromFormatted("<:lang_js:1007350063862911067>"))
                ).addOptions(SelectOption.of("Kotlin", "kotlin")
                    .withEmoji(Emoji.fromFormatted("<:lang_kotlin:1007350156666081280>"))
                ).addOptions(SelectOption.of("PHP", "php")
                    .withEmoji(Emoji.fromFormatted("<:lang_php:1007350214530711624>"))
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
            "fortran" -> fortranembed(event)
            "html" -> htmlembed(event)
            "java" -> javaembed(event)
            "javascript" -> javascriptembed(event)
            "kotlin" -> kotlinembed(event)
            "php" -> phpembed(event)
            else -> event.reply("Invalid (somehow)")
        }
    }
}