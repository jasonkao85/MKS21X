public class Driver {
    
    public static void main(String[] args) {
	
	int[] a = new int[Integer.parseInt(args[1])];
	for (int i = 0; i < Integer.parseInt(args[1]); i++) {
	    int randInt = (int) Math.random() * 100;
	    a.add(randInt);
	}

        int x = Integer.parseInt(args[0]);
	String sortType = "whoops";
	long startTime = System.currentTimeMillis();
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
