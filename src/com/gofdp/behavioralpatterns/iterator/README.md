## Iterator

> "*Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.*"<br>
[(source)](http://www.dofactory.com/net/iterator-design-pattern)

The implementation consists in a `MyLinkedQueue` and a `OddEvenIterableLinkedQueue` which implement the `MyQueue` interface:
they also implement the java interface `Iterable` and so they're able to create an iterator object which is used to traverse the
collection. The `OddEvenIterableLinkedQueue` class also has the possibility to create an iterator which accesses only the
odd-position elements and also an iterator which accesses only the even-position elements.
