 public class WordSearch{
     
    private char[][] data;

    public WordSearch(int rows,int cols){
	data = new char[rows][cols];
	for (int i = 0; i < rows; i++){
	    for (int j = 0; j < cols; j++){
		data[i][j] = '_';
	    }
	}
    }

    private void clear(){
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		data[i][j] = '_';
	    }
	}
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

    public boolean addWordHorizontal(String word,int row, int col){
	if (col + word.length() > data[row].length){
	    return false;
	}
	
	for (int j = 0; j < word.length(); j++){
	    if ( data[row][col+j] == '_' || data[row][col+j] == word.charAt(j)){
		data[row][col+j] = word.charAt(j);
	    } else {
		return false;
	    }
	}
	
	return true;			    
    }
    public boolean addWordVertical(String word,int row, int col){
        if (row + word.length() > data.length){
	    return false;
	}
	
	for (int i = 0; i < word.length(); i++){
	    if (data[row+i][col] == '_' || data[row+i][col] == word.charAt(i)){
		data[row+i][col] = word.charAt(i);
	    } else {
		return false;
	    }
	}
	
	return true;
    }

}
