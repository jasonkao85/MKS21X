public class SuperArray{
    private int[] data;
    private int size;
  
    //constructor make an empty superArray should make size 0, but the data capacity 10.
    public SuperArray() {
	data = new int[10];
	size = 0;
    }
    
    public int size(){
	return size;
    }

    //1

    /**add the value n to the next available slot in the superArray.

     *this will change the size. This function should always work

     *And will resize the SuperArray if needed./**/

     public void add(int n){
	 if (size == data.length) {
	     grow();
	 } else {
	     data[size] = n;
	     size++;
	 }
     }

     //2

     /**Resize the data, by making a new array, then copying over elements, use this as your data.

    */

    private void grow(){
	int[] temp = new int[data.length+1];
	for (int i = 0; i < data.length; i++) {
	    temp[i] = data[i];
	}
	data = temp;
	size++;
    }

    //3

    /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
     *commas between... square bracket start/end and no comma at end.*/

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

    //4

    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
     *(capacity is 10, but only 6 are used)
     *commas between... square bracket start/end and no comma at end.
     *unused slots should be printed as _ (underscores) */

    public String toStringDebug(){
	
    }
}
