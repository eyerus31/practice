package exercise_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface StudentService {
	
	//List<Students> searchByFirstName(String firstName );
	//void printAll(List<Students> Student);
	
	Map <Integer, Students> readFromFile(String fileName) throws FileNotFoundException, IOException;
	List<Students> searchByFirstName(Map <Integer, Students> student, String firstName);
	Students searchById(Map <Integer, Students> student, int id);
	//void printAll(List<Students> Student);
	void printAll(Map<Integer, Students> map);
}
