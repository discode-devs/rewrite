package com.mazylol.discode.commands.frameworks

import com.mazylol.discode.commands.frameworks.Angular.angularembed
import com.mazylol.discode.commands.frameworks.React.reactembed
import com.mazylol.discode.commands.frameworks.Svelte.svelteembed
import com.mazylol.discode.commands.frameworks.Vue.vueembed
import net.dv8tion.jda.api.entities.emoji.Emoji
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.interactions.components.selections.SelectMenu
import net.dv8tion.jda.api.interactions.components.selections.SelectOption

class FrameworkDropDown : ListenerAdapter() {
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        if (event.name == "framework") {
            val selectMenu = SelectMenu.create("choose-language")
                .addOptions(SelectOption.of("Angular", "angular")
                    .withEmoji(Emoji.fromFormatted("<:framework_angular:1007363681350336612>"))
                ).addOptions(SelectOption.of("React", "react")
                    .withEmoji(Emoji.fromFormatted("<:framework_react:1007363752997421056>"))
                ).addOptions(SelectOption.of("Svelte", "svelte")
                    .withEmoji(Emoji.fromFormatted("<:framework_svelte:1013527172289409134>"))
                ).addOptions(SelectOption.of("Vue", "vue")
                    .withEmoji(Emoji.fromFormatted("<:framework_vue:1007363822530605157>"))
                )
                .build()

            event.reply("Choose the framework")
                .addActionRow(selectMenu)
                .setEphemeral(true)
                .queue()
        }
    }

    override fun onSelectMenuInteraction(event: SelectMenuInteractionEvent) {
        when(event.values[0]) {
            "angular" -> angularembed(event)
            "react" -> reactembed(event)
            "svelte" -> svelteembed(event)
            "vue" -> vueembed(event)
            else -> event.reply("Invalid (somehow)")
        }
    }
}