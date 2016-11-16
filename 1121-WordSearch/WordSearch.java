import java.util.*;
import java.io.*;

public class WordSearch{
     
    private char[][] data;
    private Random randgen;
    private ArrayList<String> wordsToAdd;
    private ArrayList<String> wordsAdded;
  
    public static void main(String[]args){
	WordSearch w;
	int seed;
	if (args.length == 3){
	    seed = (int) (Math.random()*100000);
	    w = new WordSearch(args[0],args[1],args[2],seed,false);
	    System.out.println(w);
	}
	else if (args.length == 4){
	    try {
		seed = Integer.parseInt(args[3]);
		w = new WordSearch(args[0],args[1],args[2],seed,false);
		System.out.println(w);
	    } catch (NumberFormatException e) {
		System.out.println("Invalid input.");
		System.exit(1);
	    }	    
	}
	else if (args.length == 5){
	    try {
		seed = Integer.parseInt(args[3]);
		w = new WordSearch(args[0],args[1],args[2],seed,args[4].equals("key"));
		System.out.println(w);
	    } catch (NumberFormatException e) {
		System.out.println("Invalid input.");
		System.exit(1);
	    }	    
	}
	else {
	    w = new WordSearch();
	}	
    }

    public WordSearch(){
	System.out.println("usage: java WordSearch [rows cols filename [randomSeed [answers]]]");       
    }

    public WordSearch(String rowNum,String colNum,String filename,int seed,boolean key){
	int rows = Integer.parseInt(rowNum);
	int cols = Integer.parseInt(colNum);

	data = new char[rows][cols];
	wordsToAdd = new ArrayList<String>();
	wordsAdded = new ArrayList<String>();	

        clear();
	loadWords(filename);
	randgen = new Random(seed);
	fillWithWords();
	if (!key) fillWithTrash();
	System.out.println("seed: "+seed);
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
	    System.out.println("Invalid filename or path.");
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

    private void fillWithWords(){
	int row, col, dRow, dCol;

	while (wordsToAdd.size() > 0){

	    if (wordsToAdd.get(0).length() > data.length  && wordsToAdd.get(0).length() > data[0].length){
		System.out.println("Uh oh! Make sure your words can fit within your boundaries.");
		System.exit(0);
	    }
	    
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
	    //System.out.println(wordsToAdd.get(0));
	    //System.out.println(""+row+" "+col+" "+dRow+" "+dCol+"\n\n");
	    addWord(wordsToAdd.get(0),row,col,dRow,dCol);
	    wordsAdded.add(wordsToAdd.get(0));
	    wordsToAdd.remove(0);
	}
    }

    private void fillWithTrash(){
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		if (data[i][j] == '_'){
		    data[i][j] = (char) (65 + randgen.nextInt(26));
		}
	    }
	}
    }

    public boolean canAdd(String word,int row,int col,int dRow,int dCol){
	if (dRow == 0 && dCol == 0){
	    return false;
	}
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
