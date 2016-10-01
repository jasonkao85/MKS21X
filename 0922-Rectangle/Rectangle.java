public class Rectangle{
    private int width = 0;
    private int height = 0;
    private Point origin;

    public Rectangle(){
	origin = new Point(0,0);
    }

    public Rectangle(Point p){
	origin = p;
    }

    public Rectangle(int w, int h){
	width = w;
	height = h;
    }

    public Rectangle(Point p, int w, int h){
	origin = p;
	width = w;
	height = h;
    }

    public void move(int x, int y){
	origin.setX(x);
	origin.setY(y);
    }

    public int getArea() {
	return width * height;
    }

    public String toString() {
	return "Rectangle at " +origin+ " with width "+width+" and height "+height+".";
    }
}
