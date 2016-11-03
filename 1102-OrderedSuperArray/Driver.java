public class Driver{

    public static void main(String[]args){
	    
	SuperArray jefferson = new SuperArray();
        for (int i = 9; i >= 0; i--){
	    jefferson.add(i,i);
	}	    
	System.out.println(jefferson);
	    	    
        OrderedSuperArray burr = new OrderedSuperArray();
	for (int i = 0; i < 10; i++){
	    burr.add(i);
	}
	System.out.println(burr);
	for (int i = 0; i < 5; i++){
	    burr.add(i);
	}
	System.out.println(burr);

    }

}
