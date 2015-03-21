## Prototype

> "*This pattern is used to avoid subclasses of an object creator in the client application and to avoid the inherent cost of
creating a new object in the standard way (e.g., using the 'new' keyword) when it is prohibitively expensive
for a given application.*"<br>
[(source)](http://en.wikipedia.org/wiki/Prototype_pattern)

The implementation consists of a ColorPrototype class implementing the `Cloneable` interface, so on which
can be run the method `clone` inherited from `Object.

*NOTICE:* the cloned object has the same properties of its source, but they are not the same object!<br>
(look at the `asserts` in the `main` method).
