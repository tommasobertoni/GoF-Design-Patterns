## Bridge

> "*The Bridge pattern is designed to separate a class's interface from its implementation so you can vary or replace
the implementation without changing the client code.*"<br>[(source)](http://www.informit.com/articles/article.aspx?p=30297)

The implementation simulates a miner who uses a generic mining tool to work. This tool breaks after some use
so it needs to be replaced (in this case, the only concrete tool implementation is `Pickaxe`).<br>
The miner doesn't know which type of tool he's using.
