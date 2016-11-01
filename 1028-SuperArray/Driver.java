public class Driver{

    public static void main(String[]args){

	SuperArray hamilton = new SuperArray();

	for (int i = 0; i < 10; i++){
	    hamilton.add(i);
	    hamilton.set(i,85);
	}

        for (int i = 0; i < hamilton.size(); i++){
	    hamilton.add(i,i);
	}
	

	System.out.println(hamilton.size());
	System.out.println(hamilton);
	System.out.println(hamilton.toStringDebug());
	System.out.println(hamilton.indexOf(4));
	System.out.println(hamilton.lastIndexOf(3));


    }

}
