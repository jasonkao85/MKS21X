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
	_zip = zip;
    }
  

    // postcondition: Creates a copy of a bar code.
    public Barcode clone(Barcode x){
	return new Barcode(_zip);
    }


    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){
	int s = 0;
	for (char c : _zip){
	    s += c - '0';
	}
	return s;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String o = _zip + "   ";
	for (char c : _zip) {
	    switch (c - '0') {
	    case 1: o += ":::||";
	    case 2: o += "::|:|";
	    case 3: o += "::||:";
	    case 4: o += ":|::|";
	    case 5: o += ":|:|:";
	    case 6: o += ":||::";
	    case 7: o += "|:::|":
	    case 8: o += "|::|:";
	    case 9: o += "|:|::";
	    case 0: o += "||:::";
		    break;
	    default: break;
	    }
	}
	return o;
    }

    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	return _zip.compareTo(other);
    }
    
}
