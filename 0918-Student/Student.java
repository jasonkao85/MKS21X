public class Student {

    private String firstName, lastName;
    private int osis, age;
    private double gpa;
    
    // since we could only submit one file, the driver is this main function.
    public static void main(String[]args){
	Student me = new Student("Jason","Kao",208908533,16,3.8);
	me.printStudent();
	me.raiseGPA(0.3);
	me.printStudent();
    }

    public Student(String firstName, String lastName, int osis, int age, double gpa) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.osis = osis;
	this.age = age;
	this.gpa = gpa;
    }

    public void printStudent() {
	System.out.println("This student is "+firstName+' '+lastName+". He or she is "+age+" years old and has an osis of "+osis+" and a gpa of "+gpa+'.');
    }

    public void lowerGPA(double x) {
	this.gpa -= x;
    }

    public void raiseGPA(double x) {
	this.gpa += x;
    }

}