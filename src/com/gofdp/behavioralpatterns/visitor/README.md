## Visitor

> "*Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation
without changing the classes of the elements on which it operates.*"<br>
[(source)](http://www.dofactory.com/net/visitor-design-pattern)

> "*Do the right thing based on the type of two objects.*"<br>
[(source)](https://sourcemaking.com/design_patterns/visitor)

The implementation simulates a `Company` with `Employees` which have `Tasks` to do: each task has a `Category` and other
properties, and requires some `time` to be completed. The company runs some poll and statistics to know how the work is
proceeding: this is done by acquiring and parsing the informations from the employees about their current state of work.<br>
The main test uses a `Thread` to acquire some informations after some time.
