public class Driver{

    public static void main(String[]args){

	SuperArray hamilton = new SuperArray();

	for (int i = 0; i < 10; i++){
	    hamilton.add(i);
	    hamilton.set(i,85);
	}
	    
	System.out.println(hamilton);
	    
	SuperArray jefferson = new SuperArray();

        for (int i = 9; i >= 0; i--){
	    jefferson.add(i,i);
	}
	    
	System.out.println(jefferson);
	    
	SuperArray burr = new SuperArray(100000);
	    
	for (int i = 0; i < 9999; i++){
	    burr.
	

	System.out.println(hamilton.size());
	System.out.println(hamilton);
	System.out.println(hamilton.toStringDebug());
	System.out.println(hamilton.indexOf(4));
	System.out.println(hamilton.lastIndexOf(3));


    }

}
