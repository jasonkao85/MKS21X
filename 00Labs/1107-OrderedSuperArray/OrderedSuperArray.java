public class OrderedSuperArray extends SuperArray{

    public OrderedSuperArray(){
	super();
    }

    public OrderedSuperArray(int capacity){
	super(capacity);
    }

    public OrderedSuperArray(String[] ary){
	super(ary.length);
	for (int i = 0; i < ary.length; i++){
	    add(ary[i]);
	}	   
    }		

    private int placeIndex(String n){

	for (int i = 0; i < size(); i++){
	    if (get(i).compareTo(n) >= 0){
		return i;
	    }
	}
	return size();
    }

    public boolean add(String i){
	super.add(placeIndex(i),i);
	return true;
    }

    public void add(int index, int element){
	throw new UnsupportedOperationException();
    }

    public int set(int index, int element){
	throw new UnsupportedOperationException();
    }

}
