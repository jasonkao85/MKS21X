public class Driver {
    
    public static void main(String[] args) {
	
	int[] a = { 10, 3, 1, 5, 19, 10 };
        int x = Integer.parseInt(args[0]);
	String sortType = "whoops";
	switch (x) {
	case 0: Sorts.selectionSort(a);
	    sortType = "SELECTION"; break;
	case 1: Sorts.insertionSort(a);
	    sortType = "INSERTION"; break;
	case 2: Sorts.bubbleSort(a);
	    sortType = "BUBBLE"; break;
    }
	System.out.println("-----"+sortType+" SORT-----");
	System.out.println(toString(a));
    }

    public static String toString(int[] ary) {
	String o = "[ ";
	for (int i : ary) {
	    o += i + ", ";
	}
	return o.substring(0,o.length()-2) + " ]";
    }

}
