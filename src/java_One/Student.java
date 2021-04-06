package java_One;

import java.util.Date;

public class Student {
	
	//define the state - things we know about student objects using 
	//instance variables
	private int id;
	private String firstName;
	private String lastName;
	private Date dob;
	
	// Constractor
	public Student(int id, String firstName, String lastName) {
		this.id= id;
		this.firstName = firstName;
		this.lastName= lastName;
		//this.dob = dob;
	}
	
	// define the behavior - things the student object does
	
	public void studying () {
		System.out.println(this.firstName + this.lastName +  " is Studying");
	}
	public void registeredforcourse() {
		System.out.println(this.id + " has registered for Java programming course");
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Student student = new Student( 1234, "A", "B");
	
	
	//student.dob = ;
	
	student.registeredforcourse();
	student.studying();
	

}
}