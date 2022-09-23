package com.mazylol.discode.commands.frameworks

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object Next {
    fun nextembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Next")
        eb.setDescription("React on steroids.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/frameworks/next.png")
        eb.addField("Overview", "Next.js is an open-source web development framework created by Vecel. It supercharges React with server-side rendering and static site generation.", false)
        eb.addField("Features", "- Page based routing\n- Pre-rendering\n- Buildin CSS and Sass support\n- Full-stack capabilities\n- Static Exports\n- Prefetching\n- CSS Modules", false)
        eb.addField("Learn", "https://nextjs.org/learn/foundations/about-nextjs\nhttps://www.freecodecamp.org/news/nextjs-tutorial/", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/Next.js\nhttps://www.xenonstack.com/blog/next.js-features", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}