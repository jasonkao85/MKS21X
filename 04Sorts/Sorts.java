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
   
    public static void insertionSort(int[] data) {
	for (int i = 1; i < data.length; i++) {
	    int temp = data[i];
	    int j = i;
	    while (j > 0 && temp < data[j-1]) {
		data[j] = data[j-1];
		j--;
	    }
	    data[j] = temp;
	}
    }
    
    public static void bubbleSort(int[] data) {
	for (int i = data.length; i > 0; i--) {
	    for (int j = 1; j < i; j++) {
		if (data[j] < data[j-1]) {
		    int temp = data[j-1];
		    data[j-1] = data[j];
		    data[j] = temp;
		}
	    }
	}
    }
}
	
