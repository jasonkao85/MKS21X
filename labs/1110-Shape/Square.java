public class Square extends Rectangle{

    private double width;
    private double length;

    public Square(){
	super();
    }
    public Square(double s){
	width = s;
	length = s;
    }

    public void setWidth(double w){
	if (w >= 0){
	    width = w;
	    length = w;
	}
    }
    public void setLength(double l){
	if (l >= 0){
	    width = l;
	    length = l;
	}
    }

    public String toString(){
	return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
