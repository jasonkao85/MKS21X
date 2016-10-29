public class SuperArray{
    private int[] data;
    private int size;
  
    //constructor make an empty superArray should make size 0, but the data capacity 10.
    public SuperArray() {
	data = new int[10];
	size = 0;
    }

    // 1.  Appends the specified element to the end of this list. It returns true (add this part)

     public boolean add(int n){
	 if (size == data.length) {
	     grow();
	 } else {
	     data[size] = n;
	     size++;
	 }
	 return true;
     }

     // helper function to 1

    private void grow(){
	int[] temp = new int[data.length+1];
	for (int i = 0; i < data.length; i++) {
	    temp[i] = data[i];
	}
	data = temp;
	size++;
    }

    // 2. Returns the element at the specified position in this list.

    public int get(int n){
        return data[n];
    }
    
    
    // 3. Returns the number of elements in this list.

    public int size(){
	return size;
    }

    /* 4.
     * format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
     * commas between... square bracket start/end and no comma at end.
     */

    public String toString(){
        String out = "[ ";
	for (int i = 0; i < size; i++) {
	    if (i == 0) {
		out += String.valueOf(data[i]);
	    } else {
		out += ", " + String.valueOf(data[i]);
	    }
	}
	out += "]";
	return out;
    }

    /* 5.
     * format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
     * (capacity is 10, but only 6 are used)
     * commas between... square bracket start/end and no comma at end.
     * unused slots should be printed as _ (underscores) */

    public String toStringDebug(){
	String out = "[ ";
	for (int i = 0; i < size; i++) {
	    if (i == 0) {
		out += String.valueOf(data[i]);
	    } else {
		out += ", " + String.valueOf(data[i]);
	    }
	}
	for (int i = size; i < data.length; i++) {
	    if (i == 0) {
		out += " _";
	    } else {
		out += ", _";
	    }
	}
	out += "]";
	return out;
    }

    // 6. Remove all elements from the array.

    public void clear(){
	size = 0;
    }

    // 7. Returns true if this list contains no elements.

    public boolean isEmpty(){
	return size == 0;
    }

    // 8. Replaces the element at the specified position in this list with the specified element. Returns the value of the element replaced.

    public int set(int index, int element){
	int out = data[index];

	for (int i = 0; i < size; i++){
	    if (i == index){
	        data[i] = element;
	    }
	}

	return out;
    }

    // 9. Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).

    public void add(int index, int element){
	for (int i = size; i > index; i--){
	    data[i] = data[i-1];
	}
	data[index] = element;
	size++;
    }
	    
    // 10. Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices). The value returned is the value of the element removed.

    public int remove(int index){
	int out = data[index];
	for (int i = index; i < size; i++){
	    data[i] = data[i+1];
	}
	size--;
	return out;
    }

    // 11. Returns an array containing all of the elements in this list in proper sequence (from first to last element)

    public int[] toArray(){
	int[] out = new int[size];

	for (int i = 0; i < size; i++){
	    out[i] = data[i];
	}

	return out;
    }

    // 12. Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.

    public int indexOf(int i){
	for (int x = 0; x < size; x++) {
	    if (i == data[x]) {
		return x;
	    }
	}
	return -1;
    }

    // 13. Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

    public int lastIndexOf(int i){
	for (int x = size - 1; x >= 0; x--){
	    if (i == data[x]){
		return x;
	    }
	}
	return -1;
    }

}
