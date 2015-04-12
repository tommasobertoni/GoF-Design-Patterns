## Observer

> "*Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified
and updated automatically.*"<br>
[(source)](http://www.dofactory.com/net/observer-design-pattern)

> "*An object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of
any state changes.*"<br>
[(source)](http://en.wikipedia.org/wiki/Observer_pattern)

> "*The "View" part of Model-View-Controller.*"<br>
[(source)](https://sourcemaking.com/design_patterns/observer)

The implementation consists of a `SecondsCounter` (the observable object), a `Clock` and a `UpdatesManager` (also a
`TerminateProgramAfterCount`, but that's only used to exit the program).

The `SecondsCounter` uses a `Thread` to count the seconds and every time notifies the observers: the clock when notified updates
the time (hours, minutes and seconds), the updates manager checks for new updates every *n* seconds.

To implement the pattern, the `SecondsCounter` class extends the
[`Observable`](https://docs.oracle.com/javase/7/docs/api/java/util/Observable.html)
abstract Java class, from which inherits the methods to manage the observers and to send the notification; the other classes
implements the [`Observer`](https://docs.oracle.com/javase/7/docs/api/java/util/Observer.html) Java interface, from which
inherit the `update` method.

NB: to speed up the test, the thread which counts the seconds actually sleeps for 10 milliseconds, so it will be 100 time faster
than a real seconds counter.
