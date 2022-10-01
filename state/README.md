# State pattern
State pattern has been implemented using interface and abstract class.

#Interface implementation
Let's say we need to develop a drawing software like paint with a canvas in the center and tool panel in the left. The user selects the painter from tool panel 
and starts drawing. He can choose another painting tool form tool panel at any time. The drawing on the canvas depends on the selected tool.
This is state pattern.

#Abstract class implementation
Let's say we have a Game software and user plays different types of game based on subscription. User selected game is played in the playground screen based on the state of
user selection. The common behaviour has been defined in the Game abstract class and child class overrides the behaviour as their needs.

