public class Driver {

    public static void main(String[]args) {

	String[] goodStuffs = {
	    "|||:::|::|::|::|:|:|::::|||::|:|",
	    "|||:::|::|::|::|:|:|::::|||::|:|",
	    "|||:::|::|::|::|:|:|::::|||::|:|",
	    "|||:::|::|::|::|:|:|::::|||::|:|",
	};

	for (String gs : goodStuffs) {
	    System.out.println("\n# SHOULD BE OK -------");
	    System.out.println(Barcode.toZip(gs));
	}	

	String[] errors = {
	    "|||:::|::|::|::|:|:|::::|||:|::|", //checksum
	    "|||:::|::|::|::|:|:|::::|:|::|:|", //encoded ints or checksum
	    "|||:::|::|::|?:|:|:|::::|||::|:|", //invalid char
	    "|||:::|::|::|::|:|:|:::|||::|:|", //length
	    ":||:::|::|::|::|:|:|::::|||::|:|", // left/rightmost
	};

	for (String error : errors) {
	    System.out.println("\n# SHOULD BE ERROR ---------");
	    try { System.out.println(Barcode.toZip(error)); }
	    catch (IllegalArgumentException e) {
		e.printStackTrace();
	    }
	}
	    
    }

}
