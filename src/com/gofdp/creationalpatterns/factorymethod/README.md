## Factory Method

> "This design pattern is used to deal with the problem of creating objects without specifying the exact class of object that will
be created. This is done by creating objects via calling a factory method."<br>
[(source)](http://en.wikipedia.org/wiki/Factory_method_pattern)

The implementation consists of a `PetCreator` which, of course, creates a `Pet`: the concrete classes are
`DogCreator`, `CatCreator` and `BirdCreator`.

<br>
**legitimate question:**<br>
**q:** *What's the difference between Abstract Factory and _Factory Method_?
I mean, in both cases I create an object without specifying the class..*

**a:** *Redirect --> [Design Patterns: Abstract Factory vs Factory Method](http://stackoverflow.com/questions/4209791/design-patterns-abstract-factory-vs-factory-method)*
