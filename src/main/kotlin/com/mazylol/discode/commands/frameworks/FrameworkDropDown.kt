package com.mazylol.discode.commands.frameworks

import com.mazylol.discode.commands.frameworks.Angular.angularembed
import com.mazylol.discode.commands.frameworks.Next.nextembed
import com.mazylol.discode.commands.frameworks.React.reactembed
import com.mazylol.discode.commands.frameworks.Svelte.svelteembed
import com.mazylol.discode.commands.frameworks.SvelteKit.sveltekitembed
import com.mazylol.discode.commands.frameworks.Vue.vueembed
import net.dv8tion.jda.api.entities.emoji.Emoji
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.interactions.components.selections.SelectOption
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu

class FrameworkDropDown : ListenerAdapter() {
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        if (event.name == "framework") {
            val selectMenu = StringSelectMenu.create("choose-language")
                .addOptions(SelectOption.of("Angular", "angular")
                    .withEmoji(Emoji.fromFormatted("<:framework_angular:1007363681350336612>"))
                ).addOptions(SelectOption.of("Next", "next")
                    .withEmoji(Emoji.fromFormatted("<:framework_next:1022680128163164224>"))
                ).addOptions(SelectOption.of("React", "react")
                    .withEmoji(Emoji.fromFormatted("<:framework_react:1007363752997421056>"))
                ).addOptions(SelectOption.of("Svelte", "svelte")
                    .withEmoji(Emoji.fromFormatted("<:framework_svelte:1013527172289409134>"))
                ).addOptions(SelectOption.of("SvelteKit", "sveltekit")
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

    override fun onStringSelectInteraction(event: StringSelectInteractionEvent) {
        when(event.values[0]) {
            "angular" -> angularembed(event)
            "next" -> nextembed(event)
            "react" -> reactembed(event)
            "svelte" -> svelteembed(event)
            "sveltekit" -> sveltekitembed(event)
            "vue" -> vueembed(event)
            else -> event.reply("Invalid (somehow)")
        }
    }
}