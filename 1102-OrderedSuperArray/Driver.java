public class Driver{

    public static void main(String[]args){


	int[]param = new int[10];
        for(int i = 0; i < param.length;i++){
            param[i] = (int)(Math.random() * 500);
        }
        OrderedSuperArray test2 = new OrderedSuperArray(param);
        System.out.println(test2);
	/*
	SuperArray jefferson = new SuperArray();

	for (int i = 0; i < 10; i++){
	    jefferson.add(i);
	    jefferson.get(i);
	    jefferson.set(i, i+10);
	    jefferson.add(i, i-10);
	    System.out.println(jefferson);
	    System.out.println(jefferson.toStringDebug());
	}

	for (int i = 0; i < jefferson.size(); i++){
	    jefferson.remove(i);
	    jefferson.add(i, 85);
	    System.out.println(jefferson);
	}

	System.out.println("\nOrdered Super Array:");
	
	int[] tyler = new int[10];
	for (int i = 0; i < tyler.length; i++){
	    tyler[i] = i;
	}
	OrderedSuperArray harrison = new OrderedSuperArray(tyler);
	System.out.println(harrison);
	*/
    }

}
