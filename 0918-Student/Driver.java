public class Driver{
    public static void main(String[]args){
	Greeter g1,g2,g3;
	g1 = new Greeter("Jason Kao", 16);
	g2 = new Greeter("Heidi Su", 47);

	g2.greet(g1.name, g1.age);
    }
}
