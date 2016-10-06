public class myUpper{

	public static void main(String[]args){
	
		System.out.println(myUpper("Jason Kao"));
		
	}
	
	public static String myUpper(String str) {
	
		String s = str;
		int i = 0;
		
		while (i < str.length()) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				str = str.substring(0,i) + ((char) (str.charAt(i) - ('a'-'A'))) + str.substring(i+1, str.length());
			}
			i += 1;
		}
		
		return str;
		
	}
	
}

    
