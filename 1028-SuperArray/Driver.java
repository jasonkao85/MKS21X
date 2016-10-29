public class Driver{

    public static void main(String[]args){
	SuperArray hamilton = new SuperArray();
	hamilton.add(8);
	hamilton.add(5);
	System.out.println(hamilton.get(8));
	System.out.println(hamilton);
	System.out.println(hamilton.toStringDebug());

	hamilton.set(1,3);
	System.out.println(hamilton);

	hamilton.add(1,5);
	System.out.println(hamilton);

	hamilton.add(4);
	hamilton.add(4);
	hamilton.add(10);
	System.out.println(hamilton);

	hamilton.remove(1);
	System.out.println(hamilton);

	System.out.println(hamilton.indexOf(4));
	System.out.println(hamilton.lastIndexOf(4));
    }
}
