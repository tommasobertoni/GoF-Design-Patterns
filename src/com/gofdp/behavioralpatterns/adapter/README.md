## Adapter

> "*Allows the interface of an existing class to be used from another interface. It is often used to make existing classes
work with others without modifying their source code.*"<br>[(source)](http://en.wikipedia.org/wiki/Adapter_pattern)

> "*Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't
otherwise because of incompatible interfaces.*"<br>[(source)](http://www.dofactory.com/net/adapter-design-pattern)

The implementation simulates the adaptation of a robot to a meeting behavior (greeting and handshake).<br>
There are two ways to do that (and both are in the implementation):
- Create a class with the specific facade and the adaptee object as a private member, executing its functions
- Extend the adaptee class and implement the specific interface

*NOTICE*: The second method can be applied only if there's an interface to adapt, not an abstract class!<br>
(can't extend more than one classe)
