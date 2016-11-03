public class OrderedSuperArray extends SuperArray{

    public OrderedSuperArray(){
	super();
    }

    public OrderedSuperArray(int capacity){
	super();
    }

    public OrderedSuperArray(int[] ary){
	super();
    }

    private int placeIndex(int n){
	
	for (int i = 0; i < size()-1; i++){
	    if (get(i) <= n && n <= get(i+1)){
		return i;
	    }
	}

	if (n > get(size()-1)){
	    return size();
	}
	return 0;
    }

    public boolean add(int i){
	super.add(i,placeIndex(i));
	return true;
    }

}
