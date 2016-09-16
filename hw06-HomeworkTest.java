public class HomeworkTest{


    public static void main(String[]args){
    
    	System.out.println("The test for 100degC is:");
    	System.out.println(celsiusToFahrenheit(100.0));
    	System.out.println("The test for 212degF is:");
    	System.out.println(fahrenheitToCelsius(212.0));
    }

    public static double celsiusToFahrenheit(double x){
	    
	    return (1.8 * x) + 32;
    }

    public static double fahrenheitToCelsius(double x){
	    
	    return (x - 32) * 5 / 9;
    }

}
