## Memento

> "*Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored
to this state later.*"<br>
[(source)](http://www.dofactory.com/net/memento-design-pattern)

> "*Promote undo or rollback to full object status.*"<br>
[(source)](https://sourcemaking.com/design_patterns/memento)

The implementation simulates a `Game` in which there's a `Player` who interacts with the environment: the game allows to save and
to load an old save, restoring the state of the system.<br><br>
NB: both `Game` and `Player` implements the *memento* pattern.
