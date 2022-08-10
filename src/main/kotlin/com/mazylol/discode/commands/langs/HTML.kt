package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object HTML {
    fun htmlembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("HTML")
        eb.setDescription("What you see.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/html.png")
        eb.addField("Overview", "HTML is the markup language for laying out the structure and content of web pages. It was created Tim Berners-Lee in 1993.", false)
        eb.addField("Features", "- Very easy to understand\n- Easy to learn\n- Supported by all modern browsers\n- Lightweight\n- Easy integration with other languages\n- User-friendly", false)
        eb.addField("Code Example", "```html\n<!DOCTYPE html>\n<html>\n <head>\n  <title>Hello World</title>\n </head>\n <body>\n  <h1>Hello, World</h1>\n </body>\n</html>\n```", false)
        eb.addField("Learn", "https://www.codecademy.com/learn/learn-html\nhttps://www.w3schools.com/html/\nhttps://www.sololearn.com/learning/1014", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/HTML\nhttps://www.educba.com/advantages-of-html/\nhttps://www.learn-html.org/en/Hello,_World!", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}