package exercise_1;

import java.io.IOException;

import java.util.List;
import java.util.Map;


public class StudentController {

	static final String INPUT_FILE = "/Users/eyerusalem/eclipse-workspace/ADG/src/student.txt" ;
	static Map<Integer, Students> student;
	static StudentService service = new StudentServiceImplement();
	
	public static void main(String[] args) throws  IOException {
		// read
		System.out.println("Reading from file ...");
		student = service.readFromFile(INPUT_FILE);
		
		//print
		System.out.println("Printing from file ...");
		System.out.println(student);
		
		//search
		System.out.println("Searching from file ...");
		List<Students> result = service.searchByFirstName(student, "Henny");
		System.out.println(result);
		//service.printAll(result);
	}

}
