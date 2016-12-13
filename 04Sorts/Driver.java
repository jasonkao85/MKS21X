public class Driver {

    public static void main(String[] args) {
	int[] hi = { 10, 2, 30, 14, 12, 200 };
	Sorts.selectionSort(hi);
	for (int i : hi) {
	    System.out.println(i);
	}
    }
}
