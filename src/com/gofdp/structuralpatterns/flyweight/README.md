## Flyweight

> "*The intent of this pattern is to use sharing to support a large number of objects that have part of their internal state
in common where the other part of state can vary.*"<br>[(source)](http://www.oodesign.com/flyweight-pattern.html)

> "*The flyweight pattern was first coined and extensively explored to efficiently handle glyph information in a WYSIWYG
document editor.*"<br>[(source)](http://en.wikipedia.org/wiki/Flyweight_pattern#cite_ref-1)

The implementation simulates a `Garage` which contains `Cars`: each car has some fixed properties, but it can be used to perform
argument-dependent tasks (`secondsToTravel(meters)`).<br>
*Lazy initialization* is used to create the cars in the garage.
