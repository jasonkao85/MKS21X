import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class WordSearch{
     
    private char[][] data;
    private Random randgen;
    private ArrayList<String> wordsToAdd;
    private ArrayList<String> wordsAdded;

    public WordSearch(int rows,int cols){
	data = new char[rows][cols];
	wordsToAdd = new ArrayList<String>();
	wordsAdded = new ArrayList<String>();
        clear();
    }
    
    private void clear(){
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		data[i][j] = '_';
	    }
	}
    }

    public void loadWords(String fileName){
	try{
	     Scanner in = new Scanner(new File(fileName));
	     while (in.hasNextLine()){
		 wordsToAdd.add(in.nextLine().toUpperCase());
	     }
	}catch (FileNotFoundException e){
	    System.out.println("File Not Found");
	    System.exit(1);
	}		
    }

    public String printWordList(){
	String out = "[ ";

	for (int i = 0; i < wordsToAdd.size(); i++){
	    out += wordsToAdd.get(i) + ", ";	 
	}

	return out.substring(0,out.length()-2).concat("]");
    }

    public String toString(){
	String o = "";
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		o += data[i][j] + " ";
	    }
	    o += "\n";
	}
	return o;
    }

    public void fillWithWords(){
	randgen = new Random();
	int row, col, dRow, dCol;

        int len = wordsToAdd.size();
	int i = 0;
	while (i < len){
	    row = randgen.nextInt(data.length);
	    col = randgen.nextInt(data[0].length);
	    dRow = randgen.nextInt(3)-1;
	    dCol = randgen.nextInt(3)-1;	    
	    
	    while (!canAdd(wordsToAdd.get(0),row,col,dRow,dCol)){
		row = randgen.nextInt(data.length);
		col = randgen.nextInt(data[0].length);
		dRow = randgen.nextInt(3)-1;
		dCol = randgen.nextInt(3)-1;		 
	    }
	    addWord(wordsToAdd.get(0),row,col,dRow,dCol);
	    wordsAdded.add(wordsToAdd.get(0));
	    wordsToAdd.remove(0);
	    i++;
	}
    }

    public boolean canAdd(String word,int row,int col,int dRow,int dCol){
	try { 
	    for (int j = 0; j < word.length(); j++){
		if (data[row+j*dRow][col+j*dCol] != '_' && data[row+j*dRow][col+j*dCol] != word.charAt(j)){
		    return false;
		}
	    }
	} catch (ArrayIndexOutOfBoundsException e){ 
	    return false;
	}
	return true;
    }

    public void addWord(String word,int row,int col,int dRow,int dCol){
	for (int j = 0; j < word.length(); j++){
	    data[row+j*dRow][col+j*dCol] = word.charAt(j);
	}
    } 
}
