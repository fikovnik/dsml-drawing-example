# doc: https://docs.python.org/2/library/turtle.html
# tutorial: http://interactivepython.org/runestone/static/thinkcspy/PythonTurtle/OurFirstTurtleProgram.html

# load turtles library
import turtle

# setup the window
turtle.setup(800, 600)

# create a pen
p = turtle.Turtle()

for i in range(4):
    p.forward(100)
    p.left(90)

input("press a key to continue")
