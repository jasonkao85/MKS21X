import java.util.*;

public class SuperArrayIterator implements Iterator<String>{

    private SuperArray ary;
    private int current;
    
    public SuperArrayIterator(){
	ary = null;
	current = 0;
    }

    public SuperArrayIterator(SuperArray ary,int current){
	this.ary = ary;
	this.current = current;
    }

    public boolean hasNext(){
	return current < ary.size();
    }

    public String next(){
	if (hasNext()){
	    current++;
	    return ary.get(current);
	} else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }

}

class SuperArray{

    private String[] data;
    private int size;

    public SuperArray(){
	data = new String[10];
	size = 0;
    }

    public SuperArray(int initialCapacity){
	if (initialCapacity < 0){
	    throw new IllegalArgumentException();
	}
	data = new String[initialCapacity];
	size = 0;
    }
	
    public SuperArray(String[] ary){
	data = new String[ary.length];
		
        for (int i = 0; i < ary.length; i++){
            data[i] = ary[i];
        }
    }
    
    public void grow(){
        String[] temp = new String[data.length*2];
	for (int i = 0; i < size(); i++) {
	    temp[i] = data[i];
	}
	data = temp;
    }

    public boolean add(String element){
	if (size() == data.length){
	    grow();
	}

	data[size()] = element;
	size++;
	return true;
    }

    public String get(int index){
	if (index < 0 || index >= data.length){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }

    public int size(){
	return size;
    }

    public String toString(){
	if (isEmpty()){
	    return "";
	}
	
	String out = "[ ";

	for (int i = 0; i < size(); i++){
	    out += data[i] + ", ";
	}

	return out.substring(0,out.length()-2).concat("]");
    }

    public String toStringDebug(){
	if (isEmpty()){
	    return "";
	}
    
        String out = "[ ";

	for (int i = 0; i < data.length; i++){
	    if (i < size()){
		out += data[i] + ", ";
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
	return size() == 0;
    }

    public String set(int index, String element){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String out = data[index];

	data[index] = element;

	return out;
    }

    public void add(int index, String element){
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	if (size() == data.length){
		grow();
	    }
	for (int i = size(); i > index; i--){
	    data[i] = data[i-1];
	}

	data[index] = element;

        size++;
    }

    public String remove(int index){
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	String out = data[index];
	System.out.println(String.valueOf(index));
	
	for (int i = index; i < size(); i++){
	    if (size() == data.length){
		grow();
	    }
	    data[i] = data[i+1];
	}

	size--;
	return out;
    }

    public String[] toArray(){
	String[] out = new String[size()];

	for (int i = 0; i < size(); i++){
	    out[i] = data[i];
	}

	return out;
    }

    public int indexOf(String i){
	for (int j = 0; j < size(); j++){
	    if (data[j].equals(i)){
		return j;
	    }
	}
	return -1;
    }

    public int lastIndexOf(String i){
	for (int j = size()-1; j >= 0; j--){
	    if (data[j].equals(i)){
		return j;
	    }
	}
	return -1;
    }

}
 
