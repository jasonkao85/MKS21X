public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(){
	width = 1.0;
	length = 1.0;
    }

    public Rectangle(double w, double l){
	width = w;
	length = l;
    }

    public double getArea(){
	return width * length;
    }

    public double getPerimeter(){
	return 2 * (width + length);
    }
    
    public void setWidth(double w){
	if (w >= 0){
	    width = w;
	}
    }
    public void setLength(double l){
	if (l >= 0){
	    length = l;
	}
    }

    public double getWidth(){
	return width;
    }
    public double getLength(){
	return length;
    }

    public String toString(){
        return "A Rectangle with width=" + getWidth() + " and length=" + getLength() + ", which is a subclass of " + super.toString();
    }
}    
