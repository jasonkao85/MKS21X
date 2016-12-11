import java.lang.RuntimeException;

public class Barcode implements Comparable<Barcode>{

    private String _zip;
    private int _checkDigit;

    private static String[] scheme = { "||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::" };

    public Barcode(String zip) {
	if (!zip.matches("[0-9]{5}")) {
	    throw new IllegalArgumentException("Zipcode is not correct length or contains illegal characters.");
	}		
	_zip = zip;
	_checkDigit = this.checkSum(_zip) % 10;
    }

    private static int checkSum(String n){
	int s = 0;
	for (int i = 0; i < n.length(); i++) {
	    s += n.charAt(i) - '0';
	}
	return s;
    }

    public String toString(){
	String o = _zip + _checkDigit + "  |";
	for (int i = 0; i <= _zip.length(); i++) {
	    o += scheme[(_zip + _checkDigit).charAt(i) - '0'];
	}
	return o + "|";
    }

    public int compareTo(Barcode other) {
	return(_zip+_checkDigit).compareTo(other._zip+other._checkDigit);
    }

    public static String toCode(String zip) {
        if (!zip.matches("[0-9]{5}")) {
	    throw new IllegalArgumentException("Zipcode is not correct length or contains illegal characters.");
	}
	zip += checkSum(zip) % 10;
	
        String o = "|";
	for (int i = 0; i < zip.length(); i++) {
	    o += scheme[zip.charAt(i) - '0']; // doesn't need this.method() b/c method is static  
        }
	return o + "|";
    }

    private static int schemeDigit(String s) {	
	for (int i = 0; i < scheme.length; i++) {
	    if (scheme[i].equals(s)) return i;
	}
        throw new IllegalArgumentException("Encoded ints are invalid or non-barcode characters are used.");
    }

    private static int checkSumCode(String code) {
        int s = 0;
	for (int i = 0; i < code.length() - 4; i += 5) {
	    s += schemeDigit(code.substring(i,i+5));       
	}
	return s;
    }

    public static String toZip(String code) {
	if (code.charAt(0) != '|' || code.charAt(code.length()-1) != '|') {
	    throw new IllegalArgumentException("Left and rightmost characters are not '|'.");
	} else if (code.length() != 32) {
	    throw new IllegalArgumentException("Length of barcode is not 32.");
	} else if (checkSumCode(code.substring(1,26))%10 != schemeDigit(code.substring(26,31))) {
	    throw new IllegalArgumentException("Checksum is invalid.");
	}
	String o = "";
        for (int i = 1; i < code.length() - 6; i += 5) {
	    o += schemeDigit(code.substring(i,i+5));       
	}
	return o + checkSum(o) % 10;
    }

}
