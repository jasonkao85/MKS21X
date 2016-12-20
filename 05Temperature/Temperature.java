public class Temperature {

    public static void main(String[] args) {
	System.out.println(CtoF(100.0));
	System.out.println(FtoC(212.0));
    }

    public static double CtoF(double cels) {
	return (9.0 / 5) * cels + 32;
    }

    public static double FtoC(double fahr) {
	return (5.0 / 9) * (fahr - 32);
    }

}
