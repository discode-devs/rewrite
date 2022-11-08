package com.mazylol.discode.commands.langs

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent
import java.util.Date

object Asm {
    fun asmembed(event : StringSelectInteractionEvent) {
        val eb = EmbedBuilder()
        eb.setTitle("Assembly")
        eb.setDescription("Fast and painful.")
        eb.setThumbnail("https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/langs/asm.png")
        eb.addField("Overview", "Assembly Language, sometimes abbreviated as asm is any low-level programming language in which there is a very strong correspondence between the machine language instructions and the assembly language instructions. The first assembly language was created in 1947 by Kathleen Booth.", false)
        eb.addField("Features", "- Faster in speed as it will be extremely optimized to use only necessary resources\n- Efficient use of memory\n- High level of control\n- Access registers and memory in hardware\n- Don't need to rely on compilers to optimize the code\n- Assemmbler bugs are much easier to identify and fix compared to compiler bugs", false)
        eb.addField("Code Example", "```x86asm\norg  0x100\n\nmov dx, msg\nmov ah, 9\nint 0x21\n\nmov ah, 0x4c\nint 0x21\nmsg db 'Hello, World!, 0x0d, 0x0a, '$'\n```\n*(x86assembly)*", false)
        eb.addField("Learn", "https://www.tutorialspoint.com/assembly_programming/index.htm\nhttps://towardsdatascience.com/the-basics-of-writing-assembly-cf5f9e7989bc\nhttps://www.codecademy.com/learn/computer-architecture/modules/assembly-language", false)
        eb.addField("Sources", "https://en.wikipedia.org/wiki/Assembly_language", false)
        eb.setTimestamp(Date().toInstant())
        eb.setColor(5793266)
        eb.setFooter("Discode", "https://raw.githubusercontent.com/discode-devs/rewrite/master/src/main/resources/images/botatar.png")
        event.replyEmbeds(eb.build()).queue()
    }
}