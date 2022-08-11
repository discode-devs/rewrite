package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object PHP {
    fun phpembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("PHP")
        eb.setDescription("Make websites go brrr, with added pain.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/php.png")
        eb.addField("Overview", "PHP is a general-purpose scripting language that is geared towards web development. It was originally created by Rasmus Lerdorf in 1994.", false)
        eb.addField("Features", "- Platform independent\n- Simple and straightforward to use\n- Great for interactive web applications\n- Very stable\n- Very flexible", false)
        eb.addField("Code Example", "```php\n<?php\necho \"Hello, World!\";\n?>```", false)
        eb.addField("Learn", "https://www.codecademy.com/learn/learn-php\nhttps://www.w3schools.com/php/\nhttps://www.learn-php.org/\nhttps://www.sololearn.com/learning/1059", false)
        eb.addField("Sources", "https://www.php.net/\nhttps://en.wikipedia.org/wiki/PHP\nhttps://www.geeksforgeeks.org/advantages-and-disadvantages-of-php/\nhttps://light-it.net/blog/why-use-php-main-advantages-and-disadvantages/", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}