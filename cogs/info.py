import discord
from discord.ext import commands
from discord.commands import (
  slash_command,
  Option
)
from discord import (
  Embed
)
import datetime

class info(commands.Cog):
  def __init__(self, bot):
    self.bot=bot

  @slash_command()
  async def about(self, ctx):
    """About me and what I do"""
    embed = Embed(title="About Me!", color=0x404eed, timestamp=datetime.datetime.now(), description="This is a bot created for my history project. It contains information on a lot of technologies. It was origionally written in C. It is now being rewritten in Python. Cheers.")
    file = discord.File("assets/botatar.png")
    embed.set_footer(icon_url="attachment://botatar.png", text="Discode")
    await ctx.respond(file=file, embed=embed)

def setup(bot):
  bot.add_cog(info(bot))
