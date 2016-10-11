public class StringDemo{

    public static void main(String[]args){
	
        String s = "Jason Kao";

	System.out.println("char @ index 6: " + s.charAt(6));
	System.out.println("length of s: " + s.length());
	System.out.println("s equals to 'Kevin Kao': " + s.equals("Kevin Kao"));
        System.out.println("s greater than 'Kevin Kao' by: " + s.compareTo("Kevin Kao"));
	System.out.println("index of 'Kao': " + s.indexOf("Kao"));
	System.out.println("substring of s: " + s.substring(s.indexOf("Kao"),s.length()));
        System.out.println("substring of s after space: " + s.substring(s.indexOf(' ')));

    }

}

	/*

Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -91
	at java.lang.String.substring(String.java:1931)
	at StringDemo.main(StringDemo.java:37)

The StringIndexOutOfBoundsException means that the index in the parameter of the string method is greater than the string length or less than 0. This is hard to recognize, especially if looping through a list of strings. Therefore, it is smart to code exception catches. But if it's too late, have no fear! If you try to compile flawed code, the error message will contain the line number the error is in.

-------------------------------------

StringDemo.java:37: error: no suitable method found for substring(int,int,int)
	System.out.println(s.substring(1,2,3));
	                    ^
    method String.substring(int) is not applicable
      (actual and formal argument lists differ in length)
    method String.substring(int,int) is not applicable
      (actual and formal argument lists differ in length)

This error says there is no suitable method found for substring(int,int,int), which means there is no method substring that takes three integer parameters. To recognize and fix this error, have knowledge on the string methods you are using. Know what what data types the method takes and the number of parameters it takes in. Again, the error message will help you find the error in your code.

-------------------------------------

StringDemo.java:59: error: incompatible types: String cannot be converted to int

This error occurs when a method receives a data type in its parameters that is not the data type it should receive. For example, you cannot compareTo() a string to a boolean. This error can also be prevented by knowledge of the method and what type of parameters it takes.

-------------------------------------

StringDemo.java:54: error: char cannot be dereferenced
	System.out.println('A'.length());

Dereferencing is the process of getting a value from a reference. But char is a primitive (already of a value), not an object, so it cannot be dereferenced. As a reference for the future: objects can reference values, not primitives.

-------------------------------------

StringDemo.java:61: error: method compareTo in class String cannot be applied to given types;
	System.out.println(s.compareTo("aas","sdf"));
	                    ^
  required: String
  found: String,String
  reason: actual and formal argument lists differ in length 

This error occurs when a method receives the wrong number of parameters. This error can be prevented by knowledge of the method and what type of parameters it takes.


	*/