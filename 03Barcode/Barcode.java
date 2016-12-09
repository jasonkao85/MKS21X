import java.lang.RuntimeException;

public class Barcode implements Comparable<Barcode>{

    // instance variables
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip) {
	if (!zip.matches("[0-9]{5}")) {
	    System.out.println("Invalid zipcode " + zip + ".");
	    throw new RuntimeException();
	}		
	_zip = zip;
	_checkDigit = checkSum(_zip) % 10;
    }

    private int checkSum(String zip){
	int s = 0;
	for (int i = 0; i < _zip.length(); i++) {
	    s += _zip.charAt(i) - '0';
	}
	return s;
    }

    public String toString(){
	String o = _zip + _checkDigit + "  |";
	for (int i = 0; i <= _zip.length(); i++) {
	    char c = (_zip + _checkDigit).charAt(i);
	    switch (c) {
	    case '0': o += "||:::"; break;	           	    
	    case '1': o += ":::||"; break;
	    case '2': o += "::|:|"; break;
	    case '3': o += "::||:"; break;
	    case '4': o += ":|::|"; break;
	    case '5': o += ":|:|:"; break;
	    case '6': o += ":||::"; break;
	    case '7': o += "|:::|"; break;
	    case '8': o += "|::|:"; break;
	    case '9': o += "|:|::"; break;
	    default: break;
	    }
	}
	return o + "|";
    }

    public int compareTo(Barcode other) {
	return(_zip+_checkDigit).compareTo(other._zip+other._checkDigit);
    }

    public static String toCode(String zip) {
	String o = "|";
	int s = 0;
	zip += checkSum(zip) % 10;
	for (int i = 0; i < zip.length(); i++) {
	    char c = (zip).charAt(i);
	    switch (c) {
	    case '0': o += "||:::"; break;	           	    
	    case '1': o += ":::||"; break;
	    case '2': o += "::|:|"; break;
	    case '3': o += "::||:"; break;
	    case '4': o += ":|::|"; break;
	    case '5': o += ":|:|:"; break;
	    case '6': o += ":||::"; break;
	    case '7': o += "|:::|"; break;
	    case '8': o += "|::|:"; break;
	    case '9': o += "|:|::"; break;
	    default: break;
	    }
	    s += c - '0';
	}
	return o + "|";
    }

    public static String toZip(String code) {
	String o = "";
	for (int i = 0; i < code.length() - 5; i += 5) {
	    System.out.println(code.charAt(i));
	}
    }
}
