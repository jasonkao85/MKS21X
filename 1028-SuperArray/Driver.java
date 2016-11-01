public class Driver{

    public static void main(String[]args){
	SuperArray hamilton = new SuperArray();

	for (int i = 0; i < 10; i++) {
	    hamilton.add(58);
	    hamilton.set(i,85);
	}

	System.out.println(hamilton);
	
        hamilton.add(3,3);

	System.out.println(hamilton);

	for (int i = 0; i < hamilton.getSize(); i++) {
	    hamilton.indexOf(i);
	    hamilton.lastIndexOf(i);
	    hamilton.remove(i);
	}

	System.out.println(hamilton);

    }
}
