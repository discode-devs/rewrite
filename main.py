import discord
from discord.ext import commands
import os
from dotenv import load_dotenv
load_dotenv()

intents = discord.Intents.default()
bot = commands.Bot(command_prefix=">>", intents=intents, debug_guilds=[os.getenv("TESTID")])

for filename in os.listdir("cogs"):
  if filename.endswith(".py"):
    bot.load_extension(f"cogs.{filename[:-3]}")

@bot.event
async def on_ready():
  game = discord.Game("with code")
  await bot.change_presence(status=discord.Status.online, activity=game)
  print("Logged in as {0.user}!".format(bot))

bot.run(os.getenv("TEST"))