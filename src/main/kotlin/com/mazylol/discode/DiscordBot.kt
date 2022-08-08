package com.mazylol.discode

import com.mazylol.discode.commands.langs.LangDropDown
import io.github.cdimascio.dotenv.Dotenv
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.interactions.commands.build.Commands
import javax.security.auth.login.LoginException

object DiscordBot {
    @Throws(LoginException::class, InterruptedException::class, Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val dotenv = Dotenv.configure().load();
        val bot = JDABuilder.createDefault(dotenv.get("TOKEN"))
            .setActivity(Activity.watching("you type in that stupid stackoverflow question"))
            .addEventListeners(LangDropDown())
            .build().awaitReady()
        val guild = bot.getGuildById("823309399317676083")
        guild?.updateCommands()?.addCommands(
            Commands.slash("language", "Information about a language")
        )?.queue()
    }
}