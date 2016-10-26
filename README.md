# apcs

###10-25-16: arrays

Arrays are objects, not instances.  
*Instance variables* are primitives and are part of objects. (int bulletsLeft) **default value:** 0  
*Object variables* (static int flightNumber) **no default value**  
```
int[]varname = new int[10]; // instantiates array to specified size
// varname refers to 10 blocks of memory in the address
varname[n] = m; // "Varname sub n"
varname.length // returns length
```

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
(Ship) y; // legal
```
Some notes on typecasting upwards: 
```
class A has display() which prints "Hi".
class B extends A has display() which prints "Bye".

class demo {
    public static void main(String[]args) {
        B obj = new B();
        obj.display(); // Bye
        ( (A) obj ).display(); // Hi
    }
}
```
Although ((A) obj) is still an instance and still has the properties of class B, Java only reads the reference. Here, the reference is A. So even though A obj has the information of B, java will call the A method.

If you try to type cast upwards and access methods/variables from your original class, it will not work--they are hidden. This is because Java thinks you are a SuperClass, not a SubClass.
```
Superclass s1 = new Superclass(); // works
Superclass s2 = new Subclass(); // works b/c superclass is less specific than subclass
Subclass sub1 = new Superclass(); // COMPILE TIME ERROR b/c subclass is more specific than superclass
Subclass sub2 = new Subclass(); // works
```
You cannot store a class into a sub version of itself.

RUNTIME ERROR: errors of values (type casting sibling classes)  
COMPILE TIME ERROR: errors of type (Subclass sub1 = new Superclass();)

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

###09-15-16
Compiled Language
- Human readable source code is translated (compiled) into machine language run directly by computer. (binary)
- programs don't run on computer, they run on java virtual machine (JVM) which reads .class files
- JVM is an interpreter (translates from byte code to machine instructions)
- .class files are readable by the JVM, independent of platform

The primitive data types: (you need the ones underlined)
- int (32 bit, values from -2^31 to +2^31-1)
- double (64 bit)
- boolean
- char (16 bits)




