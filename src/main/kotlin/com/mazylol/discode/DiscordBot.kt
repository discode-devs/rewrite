package com.mazylol.discode

import com.mazylol.discode.commands.frameworks.FrameworkDropDown
import com.mazylol.discode.commands.info.Help
import com.mazylol.discode.commands.langs.LangDropDown
import com.mazylol.discode.commands.people.PersonDropDown
import io.github.cdimascio.dotenv.Dotenv
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.interactions.commands.build.Commands
import javax.security.auth.login.LoginException

object DiscordBot {
    @Throws(LoginException::class, InterruptedException::class, Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val dotenv = Dotenv.configure().load()
        val bot = JDABuilder.createDefault(dotenv.get("DEVTOKEN"))
            .setActivity(Activity.watching("you copy/paste"))
            .addEventListeners(FrameworkDropDown() ,Help(), LangDropDown(), PersonDropDown())
            .build().awaitReady()
        val guild = bot.getGuildById(dotenv.get("GUILD"))
        guild?.updateCommands()?.addCommands(
            Commands.slash("framework", "Information about a framework"),
            Commands.slash("help", "Help screen"),
            Commands.slash("language", "Information about a language"),
            Commands.slash("person", "Information about a person")
        )?.queue()
        /*
        bot.updateCommands().addCommands(
            Commands.slash("framework", "Information about a framework"),
            Commands.slash("help", "Help screen"),
            Commands.slash("language", "Information about a language"),
            Commands.slash("person", "Information about a person")
        ).queue()

         */
    }
}