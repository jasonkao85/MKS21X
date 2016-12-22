import java.util.*;

public class SuperArrayIterator implements Iterator<String>{

    private SuperArray ary;
    private int current = 0;

    public SuperArrayIterator(SuperArray ary){
	this.ary = ary;
    }

    public boolean hasNext(){
	return current < ary.size();
    }

    public String next(){
	if (hasNext()){
	    String o = ary.get(current);
	    current++;
	    return o;
	} else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }

}
