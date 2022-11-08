package com.mazylol.discode.commands.frameworks

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import java.util.Date

object SvelteKit {
    fun sveltekitembed(event : StringSelectInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("SvelteKit")
        eb.setDescription("Svelte on steroids.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/frameworks/svelte.png")
        eb.addField("Overview", "Refer to Svelte. It adds extra features such as file based routing, server side rendering, and search engine optimization.", false)
        eb.addField("Features", "- Refer to Svelte\n- File Based Routing\n- Server Side Rendering\n- Search Engine Optimization", false)
        eb.addField("Learn", "https://kit.svelte.dev/docs/introduction", false)
        eb.addField("Sources", "https://kit.svelte.dev", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}