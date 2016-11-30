public class Book {

    private String author;
    private String title;
    private String ISBN;

    public Book() {
    }

    public Book(String author, String title, String ISBN){
	this.author = author;
	this.title = title;
	this.ISBN = ISBN;
    }

    public String getAuthor(){
	return author;
    }

    public String getTitle(){
	return title;
    }

    public String getISBN(){
	return ISBN;
    }

    public void setAuthor(String author){
	this.author = author;
    }

    public void setTitle(String title){
	this.title = title;
    }

    public void setISBN(String ISBN){
	this.ISBN = ISBN;
    }

    public String toString(){
	return "\n"+title+"\nby "+author+"\nISBN: "+ISBN+"\n";
    }

}

abstract class LibraryBook extends Book implements Comparable<LibraryBook> {

    private String callNumber;

    public LibraryBook(String author, String title, String ISBN, String callNumber){
	super(author,title,ISBN);
	this.callNumber = callNumber;
    }

    public String getCallNumber(){
	return callNumber;
    }

    public void setCallNumber(String callNumber){
	this.callNumber = callNumber;
    }

    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();

    public int compareTo(LibraryBook b){
        return callNumber.compareTo(b.getCallNumber());
    }

    public String toString(){
        return super.toString() + "circulation status: " + circulationStatus() + "call number: "+callNumber+"\n";
    }

}

class ReferenceBook extends LibraryBook {

    String collection;

    public ReferenceBook(String author, String title, String ISBN, String callNumber, String collection){
        super(author,title,ISBN,callNumber);
	this.collection = collection;
    }

    public String getCollection(){
	return collection;
    }

    public void setCollection(String collection){
	this.collection = collection;
    }

    public void checkout(String patron, String due){
	System.out.println("cannot check out a reference book.");
    }

    public void returned(){
	System.out.println("referece book could not have been checked out -- return impossible");
    }

    public String circulationStatus(){
	return "non-circulating reference book";
    }

    public String toString(){
	return super.toString() + "collection: "+collection+"\n";
    }

}

class CirculatingBook extends LibraryBook {

    String currentHolder;
    String dueDate;
    String patron;

    public CirculatingBook(String author, String title, String ISBN, String callNumber){
	super(author,title,ISBN,callNumber);
	currentHolder = null;
	dueDate = null;
    }

    public String getCurrentHolder(){
	return currentHolder;
    }

    public String getDueDate(){
	return dueDate;
    }

    public void setCurrentHolder(String currentHolder){
	this.currentHolder = currentHolder;
    }

    public void setDueDate(String dueDate){
	this.dueDate = dueDate;
    }

    public void checkout(String patron, String due){
	this.patron = patron;
	this.dueDate = due;
    }

    public void returned(){
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus(){
        if (currentHolder == null){
	    return "book available on shelves";
	} else {
	    return "current holder: "+currentHolder+"\ndue date: "+dueDate;
	}
    }

    public String toString(){
	return super.toString()+circulationStatus()+"\n";
    }
	

}
	
