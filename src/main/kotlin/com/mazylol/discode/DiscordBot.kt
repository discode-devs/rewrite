package com.mazylol.discode

import com.mazylol.discode.commands.frameworks.FrameworkDropDown
import com.mazylol.discode.commands.info.About
import com.mazylol.discode.commands.info.Help
import com.mazylol.discode.commands.langs.LangDropDown
import com.mazylol.discode.commands.people.PersonDropDown
import io.github.cdimascio.dotenv.dotenv
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.interactions.commands.build.Commands
import javax.security.auth.login.LoginException

object DiscordBot {
    @Throws(LoginException::class, InterruptedException::class, Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val dotenv = dotenv()
        val bot = JDABuilder.createDefault(dotenv["TOKEN"])
            .setActivity(Activity.watching("you copy/paste"))
            .addEventListeners(About(), FrameworkDropDown(), Help(), LangDropDown(), PersonDropDown())
            .build().awaitReady()
        bot.updateCommands().addCommands(
            Commands.slash("about", "General information about the bot"),
            Commands.slash("framework", "Information about a framework"),
            Commands.slash("help", "Help screen"),
            Commands.slash("language", "Information about a language"),
            Commands.slash("person", "Information about a person")
        ).queue()
    }
}