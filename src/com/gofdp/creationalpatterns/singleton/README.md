## Singleton

> "*Used to restrict the instantiation of a class to one object. This is useful when exactly one object is needed to
coordinate actions across the system.*"<br>
[(source)](http://en.wikipedia.org/wiki/Singleton_pattern)

The implementation mimics a real situation where a database connection is shared between classes and functions:
usually, you don't want to create a new connection everytime.
That's where the *Singleton* comes in, ensuring that there will be one and only one connection open.

There are *two* singleton implementations, though:
- `DatabaseConnection` is the classical, thread-safe, well-known implementation
- `DatabaseConnectionEnum` instead, uses the `enum` type to ensure that new connections can't be created

Both are singletons, but the second one sometimes gains more *upvotes*
([*Why Enum Singleton are better in Java*]
(http://javarevisited.blogspot.se/2012/07/why-enum-singleton-are-better-in-java.html))
