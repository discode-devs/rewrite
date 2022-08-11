package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object Java {
    fun javaembed(event: SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Java")
        eb.setDescription("It make block game go brrr.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/java.png")
        eb.addField("Overview", "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is intended to allow programmers to write once and run everywhere. It was made by James Gosling in 1995.", false)
        eb.addField("Features", "- Object-oriented\n- Secure\n- Dynamic typing\n- Exception-handling\n- Multithreading\n- Bytecode\n- Virtual machine\n- Platform-independent", false)
        eb.addField("Code Example", "```java\nclass HelloWorld{\n public static void main(String[] args){\n  System.out.println(\"Hello, World!\");\n }\n}\n```", false)
        eb.addField("Learn", "https://www.codecademy.com/learn/learn-java\nhttps://www.coursera.org/specializations/core-java\nhttps://www.w3schools.com/java/default.asp\nhttps://www.programiz.com/java-programming\nhttps://www.sololearn.com/learning/1068", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/Java_(programming_language)\nhttps://www.ibm.com/docs/en/aix/7.1?topic=monitoring-advantages-java\nhttps://techvidvan.com/tutorials/pros-and-cons-of-java/", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}