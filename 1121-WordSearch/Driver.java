import java.io.*;

public class Driver{
    
    public static void main(String[]args) throws FileNotFoundException { // should simply terminate if any exception occurs.
	WordSearch badminton = new WordSearch(10,10);
	badminton.loadWords("words.txt");
	badminton.fillWithWords();
	System.out.println(badminton);

    }

}
