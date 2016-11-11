public class Circle extends Shape{

    private double radius;

    public Circle(){
	radius = 1.0;
    }
    public Circle(double r){
	radius = r;
    }

    public double getArea(){
	return Math.PI * Math.pow(radius,2.0);
    }

    public double getPerimeter(){
	return 2 * Math.PI * radius;
    }
    
    public void setRadius(double r){
	if (r >= 0){
	    radius = r;
	}
    }

    public double getRadius(){
	return radius;
    }

    public String toString(){
	return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}
