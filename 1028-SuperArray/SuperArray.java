public class SuperArray{

    private int[] data;
    private int size;

    public SuperArray(){
	data = new int[10];
	size = 0;
    }
    
    public void grow(){
        int[] temp = new int[data.length*2];
	for (int i = 0; i < size; i++) {
	    temp[i] = data[i];
	}
	data = temp;
    }

    public boolean add(int element){
	if (size == data.length){
	    grow();
	}

	data[size] = element;
	size++;
	return true;
    }

    public int get(int index){

	return data[index];
    }

    public int size(){
	return size;
    }

    public String toString(){
	String out = "[ ";

	for (int i = 0; i < size; i++){
	    out += String.valueOf(data[i]) + ", ";
	}

	return out.substring(0,out.length()-2).concat("]");
    }

    public String toStringDebug(){
        String out = "[ ";

	for (int i = 0; i < data.length; i++){
	    if (i < size){
		out += String.valueOf(data[i]) + ", ";
	    } else {
		out += "_, ";
	    }
	}

	return out.substring(0,out.length()-2).concat("]");
    }

    public void clear(){
	size = 0;
    }

    public boolean isEmpty(){
	return size == 0;
    }

    public int set(int index, int element){
	int out = data[index];

	data[index] = element;

	if (index >= size){
	    size = index + 1;
	}

	return out;
    }

    public void add(int index, int element){
	
	for (int i = size-1; i > index; i--){
	    data[i] = data[i-1];
	}

	data[index] = element;

        size++;
    }

    public int remove(int index){
	int out = data[index];

	for (int i = index; i < size-1; i++){
	    data[i] = data[i+1];
	}

	size--;
	return out;
    }

    public int[] toArray(){
	int[] out = new int[size];

	for (int i = 0; i < size; i++){
	    out[i] = data[i];
	}

	return out;
    }

    public int indexOf(int i){
	for (int j = 0; j < size; j++){
	    if (data[j] == i){
		return j;
	    }
	}
	return -1;
    }

    public int lastIndexOf(int i){
	for (int j = size-1; j >= 0; j--){
	    if (data[j]==i){
		return j;
	    }
	}
	return -1;
    }

}
	
