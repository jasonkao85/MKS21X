public class Triangle{
    
    private Point v1, v2, v3;
    private double d1, d2, d3;
    private double m1, m2;

    public Triangle(){
	
	v1 = new Point(0,0);
	v2 = new Point(0,0);
	v3 = new Point(0,0);
	
    }
    
    public Triangle(Point a, Point b, Point c){
	
        //1. Explain why we want this, and how you will do it.
	// It's so we can retain the original value and not change the value of the parameter when modifying the instance variable.

	
        v1 = new Point(a.x, a.y);
	v2 = new Point(b.x, b.y);
	v3 = new Point(c.x, c.y);

	d1 = v1.distance(v2);
	d2 = v2.distance(v3);
	d3 = v3.distance(v1);

	m1 = (v1.y - v2.y) / (v1.x - v2.x);
       	m2 = (v2.y - v3.y) / (v2.x - v3.x);

	if (d1 * d2 * d3 == 0 || Math.abs((m1 - m2) / m1) < 0.00000001){
	    
	    System.out.println("Invalid Triangle: " + toString());

	    v1 = new Point(0,0);
	    v2 = new Point(0,1);
	    v3 = new Point(1,0);

	    d1 = v1.distance(v2);
	    d2 = v2.distance(v3);
	    d3 = v3.distance(v1);
	    
	    System.out.println("Triangle has been reassigned to default coordinates:");
	    System.out.println(toString());
	}
	    
    }
    
    public Triangle(double x1,double y1,double x2,double y2,double x3,double y3){
	
	v1 = new Point(x1, y1);
	v2 = new Point(x2, y2);
	v3 = new Point(x3, y3);

	d1 = v1.distance(v2);
	d2 = v2.distance(v3);
	d3 = v3.distance(v1);

	m1 = (v1.y - v2.y) / (v1.x - v2.x);
       	m2 = (v2.y - v3.y) / (v2.x - v3.x);

	if (d1 * d2 * d3 == 0 || Math.abs((m1 - m2) / m1) < 0.00000001){
	    
	    System.out.println("Invalid Triangle: " + toString());

	    v1 = new Point(0,0);
	    v2 = new Point(0,1);
	    v3 = new Point(1,0);

	    d1 = v1.distance(v2);
	    d2 = v2.distance(v3);
	    d3 = v3.distance(v1);
	    
	    System.out.println("Triangle has been reassigned to default coordinates:");
	    System.out.println(toString());
	}
	
    }
    
    public String toString(){
	return "Triangle @"+v1+v2+v3;
    }

    public double getPerimeter(){
	return d1 + d2 + d3;
    }

    public double getArea(){
	
	//2. Explain how to do this with the tools you have in Point/Triangle.
	//I used my three distances and plugged them into Heron's Formula for Triangular area.
	
	double s = getPerimeter() / 2.0;
	return Math.sqrt(s * (s - d1) * (s - d2)* (s - d3));
        
    }

    private boolean isCloseEnough(double a,double b){
	return Math.abs((a - b) / a) < .0000001;
	
        //3. Explain how to calculate. 
	//I deemed two doubles close if their percent error was less than .00001%

    }

    public boolean isRight(){
	
	if (d1 > d2) {
	    double kick = d1;
	    d1 = d2;
	    d2 = kick;
	}

	if (d2 > d3) {
	    double kick = d2;
	    d2 = d3;
	    d3 = kick;
	}

	if (d1 > d2) {
	    double kick = d1;
	    d1 = d2;
	    d1 = kick;
	}

	return isCloseEnough(Math.pow(d3, 2), Math.pow(d1, 2) + Math.pow(d2, 2));

    }

}
