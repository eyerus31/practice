package exercise_1;

public class Students {
	private String firstName;
	private String lastName;
	private int age;
	private String grade;
	

	
	
	
	public Students(String firstName, String lastName, int age, String grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grade = grade;
	}



	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public String getGrade() {
		return grade;
	}





	public void setGrade(String grade) {
		this.grade = grade;
	}




}
