public class RunMe{

    public static void main(String[]args){

	Point p = new Point(8,3);
	Point q = new Point(16,5);;

	Rectangle r = new Rectangle();
	Rectangle s = new Rectangle(p);
	r.move(3,5);
	System.out.println(s);
    }
}
