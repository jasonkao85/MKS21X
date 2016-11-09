public class Driver{

    public static void main(String[]args){

	Shape hamilton;
	hamilton = new Circle(8.5);
	System.out.println(hamilton);
	System.out.println("area: " + hamilton.getArea());
	System.out.println("perimeter: " + hamilton.getPerimeter());
	System.out.println("semiperimeter: " + hamilton.getSemiPerimeter());

	Rectangle burr = new Rectangle(8,5);
	System.out.println(burr);
	System.out.println("area: " + burr.getArea());
	System.out.println("perimeter: " + burr.getPerimeter());
	System.out.println("semiperimeter: " + burr.getSemiPerimeter());

	Square jefferson = new Square(8.5);
	System.out.println(jefferson);
	System.out.println("area: " + jefferson.getArea());
	System.out.println("perimeter: " + jefferson.getPerimeter());
	System.out.println("semiperimeter: " + jefferson.getSemiPerimeter());
    }
}
