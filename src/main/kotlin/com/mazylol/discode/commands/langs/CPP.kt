package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.*

object CPP {
    fun cppembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("C++")
        eb.setDescription("The grandfather of everything else. But with extra things.")
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/cpp.png")
        eb.addField("Overview", "C++ is a general-purpose programming language that is a superset of C. It is well suited for games and desktop applications. It was created in 1985 by Bjarne Stroustrup.", false)
        eb.addField("Features", "- Powerful and efficient\n- Built-in functions\n- Great for system programming\n- Building block for many other languages\n- Portable\n- Middle-level language\n- Very fast\n- Very extensible\n- Memory efficient\n- Object oriented programming", false)
        eb.addField("Code Example", "```cpp\n#include <iostream>\n\nint main(void){\n std::cout << \"Hello, World!\";\n return 0;\n}\n```", false)
        eb.addField("Learn", "https://www.codecademy.com/learn/learn-c-plus-plus\nhttps://www.w3schools.com/CPP/default.asp\nhttps://www.programiz.com/cpp-programming\nhttps://www.sololearn.com/learning/1051", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/C%2B%2B\nhttps://techvidvan.com/tutorials/cpp-pros-and-cons/", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        event.replyEmbeds(eb.build()).queue()
    }
}