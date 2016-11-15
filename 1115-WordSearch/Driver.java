public class Driver{

    public static void main(String[]args){

	WordSearch hamilton = new WordSearch(8,8);
	hamilton.addWordHorizontal("hi",0,0);
	hamilton.addWordVertical("burr",1,0);
	System.out.println(hamilton);

    }
}
