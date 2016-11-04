public class OrderedSuperArray extends SuperArray{

    public OrderedSuperArray(){
	super();
    }

    public OrderedSuperArray(int capacity){
	super();
    }

    public OrderedSuperArray(int[] ary){
	super();

	for (int i = 0; i < ary.length; i++){
	    add(ary[i]);
	}
    }

    private int placeIndex(int n){
	
	for (int i = 0; i < size()-1; i++){
	    if (get(i) <= n && n <= get(i+1)){
		return i;
	    }
	}
	    
	if (size() > 0 && n > get(size()-1)){
	    return size();
	}
	return 0;
    }

    public boolean add(int i){
	super.add(i,placeIndex(i));
	return true;
    }

    public void add(int index, int element){
	throw new UnsupportedOperationException();
    }

    public int set(int index, int element){
	throw new UnsupportedOperationException();
    }

}
