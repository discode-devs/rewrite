from dotenv import load_dotenv
load_dotenv()
import os

def initialize():
  global ids
  ids = [
    os.getenv("TESTID")
  ]