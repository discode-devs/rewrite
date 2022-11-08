package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import java.util.Date

object Javascript {
    fun javascriptembed(event : StringSelectInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Javascript")
        eb.setDescription("Makes websites go weeeeee.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/js.png")
        eb.addField("Overview", "Javascript is a programming language that is one of the core technologies of the web, alongside HTML and CSS. Over 97% of sites use JavaScript for web page behavior. With software such as NodeJS, it can be extended for much wider use. It was created by Brendan Eich in 1995.", false)
        eb.addField("Features", "- Simplicity\n- Flexibility\n- Support\n- Interoperability", false)
        eb.addField("Code Example", "```js\nconsole.log(\"Hello, World!\");\n```", false)
        eb.addField("Learn", "https://www.codecademy.com/learn/introduction-to-javascript\nhttps://www.w3schools.com/js/\nhttps://www.freecodecamp.org/news/learn-javascript-free-js-courses-for-beginners/\nhttps://www.sololearn.com/learning/1024", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/JavaScript\nhttps://www.javascript.com/\nhttps://www.freecodecamp.org/news/the-advantages-and-disadvantages-of-javascript/\nhttps://data-flair.training/blogs/advantages-disadvantages-javascript/", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}