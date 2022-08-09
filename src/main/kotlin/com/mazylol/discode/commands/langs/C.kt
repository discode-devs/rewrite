package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.*

object C {
    fun cembed(event: SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("C")
        eb.setDescription("The grandfather of everything else.")
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/c.jpg")
        eb.addField("What is it?", "C is a general purpose, procedural programming language supporting structured programming, lexical variable scope, and recursion. It was developed by Dennis Ritchie between 1969 and 1973.", false)
        eb.addField("Advantages", "- Powerful and efficient\n- Built-in functions\n- Great for system programming\n- Building block for many other languages\n- Portable\n- Middle-level language\n- Very fast\n- Very extensible", false)
        eb.addField("Code Example", "```c\n#include <stdio.h>\n\nint main(void){\n printf(\"Hello, World!\");\n return 0;\n}\n```", false)
        eb.addField("Learn", "https://www.codecademy.com/learn/learn-c\nhttps://www.programiz.com/c-programming\nhttps://www.w3schools.in/c-tutorial/\nhttps://www.sololearn.com/learning/1089", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/C_(programming_language)\nhttps://dare2compete.com/blog/advantages-and-disadvantages-of-c-programming-language", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        event.replyEmbeds(eb.build()).queue()
    }
}