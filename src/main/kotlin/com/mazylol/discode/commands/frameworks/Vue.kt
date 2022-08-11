package com.mazylol.discode.commands.frameworks

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent
import java.util.Date

object Vue {
    fun vueembed(event : SelectMenuInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Vue")
        eb.setDescription("A progressive framework.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/frameworks/vue.png")
        eb.addField("Overview", "Vue is an open-source model-view-viewmodel front end JavaScript framework for buiilding user interfaces and single-page applications. It was created by Evan You and is maintained by him.", false)
        eb.addField("Features", "- Simplicity\n- Component Based\n- Reusability\n- High Performance\n- Cross-Platform\n- Virtual Dom", false)
        eb.addField("Learn", "https://vuejs.org/tutorial/#step-1\nhttps://www.codecademy.com/learn/learn-vue-js", false)
        eb.addField("Sources", "https://vuejs.org\nhttps://en.wikipedia.org/wiki/Vue.js\nhttps://www.monocubed.com/blog/advantages-of-vue-js/", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}