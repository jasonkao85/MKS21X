public class Arrays{

    private int [][] ary;
    
    public Arrays(){
	ary = new int[2][2];
    }

    public Arrays(int rows, int cols){
	ary = new int[rows][cols];
    }

    public String toString(){
	String o = "[ ";
	
	for (int i = 0; i < ary.length; i++){
	    o += "[";
	    for (int j = 0; j < ary[i].length; j++){
		o += ary[i][j] + ", ";
	    }
	    o = o.substring(0, o.length()-2) + "], ";
	}

	o = o.substring(0, o.length()-2) + " ]";
	return o;
    }
}
