package java_One;

public class SwichCondition {

	public static void main(String[] args) {
		//char grade = args[0].charAt(0)
		char grade = 'A';
		
		switch(grade) {
			case'A' :
				System.out.println("Excellent!");
				break;
			case 'B':
				System.out.println("Well Done!");
				break;
			case 'C':
				System.out.println("Passed!");
				break;
			case 'D':
				System.out.println("Failed!");
				break;
			default:
				System.out.println("Invalid grade");
		}
		System.out.println("Your grade is: "+ grade);
	}

}
