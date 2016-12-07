public class CirculatingBook extends LibraryBook {

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
