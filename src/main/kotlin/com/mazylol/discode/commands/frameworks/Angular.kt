package com.mazylol.discode.commands.frameworks

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object Angular {
    fun angularembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Angular")
        eb.setDescription("Google's child.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/frameworks/angular.png")
        eb.addField("Overview", "Angular is a TypeScript-based open-source web application framework. It is used as the frontend of the MEAN stack.", false)
        eb.addField("Features", "- MVC Architecture\n- Modules\n- TypeScript\n- Components\n- Comprehensive", false)
        eb.addField("Learn", "https://angular.io/tutorial\nhttps://www.w3schools.com/angular/\nhttps://www.tutorialspoint.com/learn-angular-from-scratch-2022-complete-beginner-guide-design-to-deploy/index.asp", false)
        eb.addField("Sources", "https://angular.io\nhttps://en.wikipedia.org/wiki/Angular_(web_framework)\nhttps://www.simplilearn.com/tutorials/angular-tutorial/what-is-angular\nhttps://www.edureka.co/blog/advantages-and-disadvantages-of-angular/", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}