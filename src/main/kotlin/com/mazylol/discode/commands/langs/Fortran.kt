package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object Fortran {
    fun fortranembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Fortran")
        eb.setDescription("Really really old.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/fortran.png")
        eb.addField("Overview", "Fortran is a high-level programming language developed by IBM in the 1950s. It is a general-purpose programming language, with a strong focus on numerical computation and scientific computing. It was created by John Backus and IBM in 1957. It is one of the oldest languages still used today.", false)
        eb.addField("Features", "- Supports numerical analysis and scientific computation\n- Supports generic and structured programming\n- Supports array and modular programming\n- High performance\n- Object-oriented programming\n- Extremely optimized for vectorization\n- Extremely flexible\n- Readable and easy to understand\n- Very fast in Scientific Computing", false)
        eb.addField("Code Example", "```fortran\nprogram hello\n print *, 'Hello, World!'\nend program hello\n```", false)
        eb.addField("Learn", "https://fortran-lang.org/learn/\nhttps://www.tutorialspoint.com/fortran/index.htm\nhttps://www.udemy.com/course/fortran-for-beginners/", false)
        eb.addField("Sources", "https://fortran-lang.org/\nhttps://en.wikipedia.org/wiki/Fortran\nhttps://www.bestinterviewquestion.com/question/what-are-the-advantages-of-fortran-programming-language-gs22829707h", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}