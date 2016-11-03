public class Driver{

    public static void main(String[]args){
	    
	int[] tyler = new int[10];
	for (int i = 0; i < tyler.length; i++){
	    tyler[i] = i;
	}
	OrderedSuperArray harrison = new OrderedSuperArray(tyler);
	System.out.println(harrison);

    }

}
