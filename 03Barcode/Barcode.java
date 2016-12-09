import java.lang.RuntimeException;

public class Barcode implements Comparable<Barcode>{

    // instance variables
    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public Barcode(String zip) {
	if (!zip.matches("[0-9]{5}")) {
	    System.out.println("Invalid zipcode " + zip + ".");
	    throw new RuntimeException();
	}		
	_zip = zip;
	_checkDigit = checkSum() % 10;
    }

    // postcondition: Creates a copy of a bar code.
    public Barcode clone(Barcode x){
	return new Barcode(x._zip);      
    }

    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){
	int s = 0;
	for (int i = 0; i < _zip.length(); i++) {
	    s += _zip.charAt(i) - '0';
	}
	return s;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String o = _zip + _checkDigit + "  |";
	for (int i = 0; i <= _zip.length(); i++) {
	    char c = (_zip + _checkDigit).charAt(i) - '0';
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

    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	return (Integer.valueOf(_zip+_checkDigit)).compareTo(Integer.valueOf(other._zip+other._checkDigit));
    }
    
}
