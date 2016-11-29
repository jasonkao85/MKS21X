public abstract class Shape{

    abstract double getArea();
    abstract double getPerimeter();

    public double getSemiPerimeter(){
	return getPerimeter() / 2;
    }
    
    public String toString(){
	return "Shape";
    }
}
