package com.mazylol.discode.commands.frameworks

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import java.util.Date

object Svelte {
    fun svelteembed(event: StringSelectInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Svelte")
        eb.setDescription("The framework of champions!")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/frameworks/svelte.png")
        eb.addField("Overview", "Svelte is a free and open-source front end compiler created by Rich Harris and maintained by the Svelte core team members. Svelte compiles HTML templates to specialized code that manipulates the DOM directly, which can often reduce the size of files and give better performance. It also has an accompanying framework called SvelteKit.", false)
        eb.addField("Features", "- Speed \n- Ease of use\n- Flexibility\n- Simple to learn", false)
        eb.addField("Learn", "https://svelte.dev/tutorial/basics\nhttps://www.freecodecamp.org/news/the-svelte-handbook/", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/Svelte\nhttps://svelte.dev/", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}