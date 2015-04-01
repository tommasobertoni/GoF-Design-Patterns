## Chain of responsibility

> "*An object-oriented linked list with recursive traversal.*"<br>
[(source)](http://sourcemaking.com/design_patterns/chain_of_responsibility)

> "*The objects become parts of a chain and the request is sent from one object to another across the chain until one of the
objects will handle it.*"<br>
[(source)](http://www.oodesign.com/chain-of-responsibility-pattern.html)

> "*Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.*"<br>
[(source)](http://www.dofactory.com/net/chain-of-responsibility-design-pattern)

The implementations simulates a moving company in which each employee has a *buddy* which helps if the furniture is too heavy
to move. The removal men are divided in `WeakRemovalMan`, `NormalRemovalMan` and `StrongRemovalMan`.
