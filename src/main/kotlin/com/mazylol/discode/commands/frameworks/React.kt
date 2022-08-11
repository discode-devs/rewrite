package com.mazylol.discode.commands.frameworks

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object React {
    fun reactembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("React")
        eb.setDescription("Facebook's attempt to do something good.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/frameworks/react.png")
        eb.addField("Overview", "React is a free and open-source front-end JavaScript library for building user interfaces based on UI components.", false)
        eb.addField("Features", "- Speed\n- Flexibility\n- Reusability\n- Testability\n- Performance\n- Ease of Migration\n- Easy to Learn\n- Strong Community", false)
        eb.addField("Learn", "https://reactjs.org/tutorial/tutorial.html\nhttps://www.w3schools.com/react/default.asp\nhttps://react-tutorial.app/", false)
        eb.addField("Sources", "https://www.ipraxa.com/blog/advantages-of-reactjs-reasons-to-use/", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}