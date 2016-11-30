abstract class LibraryBook extends Book implements Comparable<LibraryBook> {

    private String callNumber;

    public LibraryBook(String author, String title, String ISBN, String callNumber){
	super(author,title,ISBN);
	this.callNumber = callNumber;
    }

    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();

    public String getAuthor(){
        super.getAuthor();
    }

    public String getTitle(){
        super.getTitle();
    }

    public String getISBN(){
	super.getISBN();
    }

    public String getCallNumber(){
	return callNumber;
    }

    public void setAuthor(String author){
        super.setAuthor(author);
    }

    public void setTitle(String title){
        super.setTitle(title);
    }

    public void setISBN(String ISBN){
        super.setISBN(ISBN);
    }

    public void setCallNumber(String callNumber){
	this.callNumber = callNumber;
    }

    public

}
