public class myUpper{

	public static void main(String[]args){
	
		System.out.println(myUpper("Jason Kao"));
		
	}
	
	public static String myUpper(String str) {
	
		String s = "";
		int i = 0;
		
		while (i < str.length()) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				s += (char) (str.charAt(i) - 'a' + 'A');
			} else {
				s += s.charAt(x);
			}
			i++;
		}
		
		return str;
		
	}
	
}

    
