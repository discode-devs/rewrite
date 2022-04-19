import discord
from discord.ext import commands
from discord.commands import (
  slash_command,
  SlashCommandGroup,
  Option
)
from discord import (
  Embed
)
import datetime

class lang(commands.Cog):
  def __init__(self, bot):
    self.bot=bot

  lang = SlashCommandGroup("languages", "Commands related to languages.")
  
  @lang.command()
  async def assembly(self, ctx):
    """Information on the Assembly language."""
    embed = Embed(
      title="Assembly",
      description="Super, duper old.",
      color=0x404eed,
      timestamp=datetime.datetime.now()
    )
    file = discord.File("assets/langs/asm.png")
    embed.set_thumbnail(url="attachment://asm.png")
    embed.set_footer(icon_url=self.bot.user.display_avatar.url, text="Discode")
    embed.add_field(
      name="What is it?",
      value="Assembly Language, sometimes abbreviated as asm is any low-level programming language in which there is a very strong correspondence between the machine language instructions and the assembly language instructions. The first assembly language was created in 1947 by Kathleen Booth.",
      inline=False
    )
    embed.add_field(
      name="Advantages",
      value="""
      - Faster in speed
      - Extremely optimized to use only necessary resources
      - Efficient use of memory
      - High level of control
      - Access registers and memory in hardware
      - Don't need to rely on compilers to optimize the code
      - Assemmbler bugs are much easier to identify and fix compared to compiler bugs
      """,
      inline=False
    )
    embed.add_field(
      name="Code Example",
      value="""
      ```x86asm
.globl  _start

.text
_start:
  movl    $len, %edx
  movl    $msg, %ecx
  movl    $1, %ebx
  movl    $4, %eax
  int     $0x80

  movl    $0, %ebx
  movl    $1, %eax
  int     $0x80
.data
msg:
  .ascii  "Hello, World!\\n"
  len =   . - msg
```
*(x86asm)*
      """,
      inline=False
    )
    embed.add_field(
      name="Learn",
      value="""
      https://www.tutorialspoint.com/assembly_programming/index.htm
      https://towardsdatascience.com/the-basics-of-writing-assembly-cf5f9e7989bc
      https://www.codecademy.com/learn/computer-architecture/modules/assembly-language
      """,
      inline=False
    )
    embed.add_field(
      name="Sources",
      value="https://en.wikipedia.org/wiki/Assembly_language",
      inline=False
    )
    await ctx.respond(file=file, embed=embed)

def setup(bot):
  bot.add_cog(lang(bot))