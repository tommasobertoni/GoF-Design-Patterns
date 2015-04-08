## Command

> "*Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests,
and support undoable operations.*"<br>
[(source)](http://www.dofactory.com/net/command-design-pattern)

The implementation consists in a simple cli game, in which you are in a maze and you have to find the treasure.
When you type the direction to which move, an appropriate command `IMove` is executed and stored in a list.
Once you find the treasure, you'll come back in the position where you start.
