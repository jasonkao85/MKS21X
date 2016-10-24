# apcs

###10-24-16: variable types

Hierarchy: Agent-->Ship-->Enemy,EnemyBomber
``` 
Agent orange = new Agent();  
Ship tipton = new Ship();  
Enemy mine = new Enemy();  
```
An object variable can refer to an instance of itself or one of its subclasses
```
Agent x, y;  
Ship z;

x = orange; // allowed, b/c referring to instance of itself
y = tipton; // allowed, b/c referring to instance of its subclass
z = orange // not allowed, b/c Agent is higher on the hierarchy
```
An object is the reference (type), but its instance can be a subclass
```
Agent y = tipton; // agent reference, but ship instance
(Ship) y; // legal, explained below
```
Typecasting: we can type cast y ONLY b/c it has info from Ship tipton.


###10-21-16: loops

**for** is used for basic counting.
```
for (init; boolean; increment) {
    // ...
}
```
If the init is declared inside the for loop, it only exists within the for loop. The opposite is true.
For v. While:
- for: easy to read limits, increments, and behavior (it's in the first line)
- for: increment **always called last**
- while: have to look through code for the increments, can be anywhere in body

###10-18-16: running archives of classes (jar)
Java allows the inclusion of other directories and archives of classes (jar files) with the -cp flag.
```
javac -cp  .<semi colon separated files/paths>  filename.java
example: javac -cp .:core.jar spaceInvaders.java (period is a comma on Windows)
```

