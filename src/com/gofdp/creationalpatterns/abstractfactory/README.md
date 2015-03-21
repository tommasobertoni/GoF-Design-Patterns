## Abstract Factory

> "*The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme
without specifying their concrete classes.*"<br>
[(source)](http://en.wikipedia.org/wiki/Abstract_factory_pattern#cite_note-abstract_factory-1)

The implementation consists of a `AbstractPresentFactory` which can create a `Container` or a `Candy`: the two concrete families
are *box* and *bag*, where the first one assumes that the containers are *boxes* and the candy are shaped as a <i>square</i>,
and the second one assumes that the containers are *bags* and the candy are shaped as a *sphere*.
