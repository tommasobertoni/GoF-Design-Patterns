## Mediator

> "*Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects
from referring to each other explicitly, and it lets you vary their interaction independently.*"<br>
[(source)](http://www.dofactory.com/net/mediator-design-pattern)

The implementation consists in a generic set of `Colleagues` which sends messages to each other, by specifying the receiver or
by specifying the authorityLevel or in broadcast: the `Mediator` object conrains all the colleagues *registered* and
is responsible for the delivery the message.
