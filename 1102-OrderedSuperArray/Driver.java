public class Driver{

    public static void main(String[]args){

        OrderedSuperArray test1 = new OrderedSuperArray();
test1.add("hello");
test1.add("there there");
test1.add("Waffles");
test1.add("Pancakes");
test1.add("French Toast");
//test1.add(2,"Cereal"); // Should return an error
System.out.println(test1);
//test1.set(3,"Sausage"); // Also should return an error
System.out.println(test1.get(4)); // "there there"
System.out.println(test1.indexOf("French Toast")); // "0"
test1.add("hello");
System.out.println(test1.lastIndexOf("hello")); // "4"

String[] tempTest = new String[7];
tempTest[0] = "Glock"; tempTest[1] = "Apple"; tempTest[2] = "Carrot"; tempTest[3] = "Eggplant"; tempTest[4] = "Firecracker"; tempTest[5] = "Bazinga"; tempTest[6] = "Donkey";
OrderedSuperArray test2 = new OrderedSuperArray(tempTest);
System.out.println(test2);       
    }

}
