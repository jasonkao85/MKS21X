import java.lang.Math;

public class Point {
   
    public double x, y;

    public Point(){
    }

    public Point(double x, double y){
	this.x = x;
	this.y = y;
    }

    public String toString(){
	return (" ("+x+","+y+")");
    }

    public double distance(Point p){
	return Math.sqrt(Math.pow(x - p.x,2) + Math.pow(y - p.y,2));
    }
}
