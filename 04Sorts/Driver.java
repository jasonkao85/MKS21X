public class Driver {
    
    public static void main(String[] args) {	
	int[] a = { 10, 3, 1, 5, 19, 10 };
	System.out.println("-----SELECTION SORT-----");
	Sorts.selectionSort(a);
	System.out.println(toString(a));

	int[] b = { 10, 3, 1, 5, 19, 10 };
	System.out.println("-----INSERTION SORT-----");
	Sorts.insertionSort(b);    
        System.out.println(toString(b));

	int[] c = { 10, 3, 1, 5, 19, 10 };
	System.out.println("-----BUBBLE SORT-----");
	Sorts.bubbleSort(c);
	System.out.println(toString(c));
    }

    public static String toString(int[] ary) {
	String o = "[ ";
	for (int i : ary) {
	    o += i + ", ";
	}
	return o.substring(0,o.length()-2) + " ]";
    }

}
