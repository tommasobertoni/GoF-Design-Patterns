## Template Method

> "*Defines the program skeleton of an algorithm in a method, called template method, which defers some steps to subclasses.*"<br>
[(source)](http://en.wikipedia.org/wiki/Template_method_pattern#cite_note-1)

> "*It lets one redefine certain steps of an algorithm without changing the algorithm's structure.*"<br>
[(source)](http://en.wikipedia.org/wiki/Template_method_pattern#cite_note-2)

> "*Base class declares algorithm 'placeholders', and derived classes implement the placeholders.*"<br>
[(source)](https://sourcemaking.com/design_patterns/template_method)

The implementation simulates the cooking process of different `cooks` with different experience.<br>
The tools and recipes can change, but the process's steps are always the same: *preparation*, *cooking*, *service*.
