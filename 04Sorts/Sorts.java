public class Sorts {

    /**method matches name
     */
    public static String name() {
	return "06.Kao.Jason";
    }

    /**Selection sort of int array
     *postcondition: elements of the array will be in increasing order
     *@param data the elements to be sorted
     */
    public static void selectionSort(int[] data) {
	for (int i = 0; i < data.length - 1; i++) {
	    int min = data[i];
	    int minIndex = i;
	    for (int j = i+1; j < data.length; j++) {
		if (data[j] < min) {
		    min = data[j];
		    minIndex = j;
		}
	    }
	    int temp = data[i];
	    data[i] = min;
	    data[minIndex] = temp;
	}
    }

}
	
