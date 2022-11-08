package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import java.util.Date

object CSS {
    fun cssembed(event : StringSelectInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("CSS")
        eb.setDescription("Makes website pretty.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/css.png")
        eb.addField("Overview", "CSS is a style sheet language that is used for styling HTML web pages. It was made by Håkon Wium Lie in 1994.", false)
        eb.addField("Features", "- Easy to learn\n- Easy to use\n- Lightweight\n- User-friendly", false)
        eb.addField("Code Example", "```css\n<style type=\"text/css\">\nh1 {\n color: red;\n}\n</style>\n<h1>Hello, World</h1>\n```", false)
        eb.addField("Learn", "https://www.w3schools.com/css/\nhttps://web.dev/learn/css/\nhttps://www.codecademy.com/learn/learn-css\nhttps://www.sololearn.com/learning/1023", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/CSS\nhttps://css3-tutorial.net/introduction/hello-css-world/\nhttps://dare2compete.com/blog/advantages-and-disadvantages-of-css", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}