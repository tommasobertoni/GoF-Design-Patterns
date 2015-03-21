## Builder

> "*Sometimes the increase of object constructor parameter combination leads to an exponential list of constructors.
Instead of using numerous constructors, the builder pattern uses another object, a builder, that receives each initialization
parameter step by step and then returns the resulting constructed object at once.*<br>
[(source)](http://en.wikipedia.org/wiki/Builder_pattern)

The implementation consists of two weather forecast objects which we can assume they would take a lot of parameters.
Then, two *Directors* construct the weather forecast objects by setting those parameters and executing several and complex
algorithms (that's not the case! :smile:).<br>
After the directors have built the objects, you can use them (in our case `getResult()`, *hoping for a good weather!*).
