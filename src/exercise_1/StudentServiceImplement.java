package exercise_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class StudentServiceImplement implements StudentService {

@Override
	public Map<Integer, Students> readFromFile(String fileName) throws IOException{
		// TODO Auto-generated method stub
		   Map <Integer, Students> map = new HashMap<Integer, Students>();
		
		//connect to the file
		FileReader filereader = new FileReader(fileName);
		//Read from the file
		BufferedReader bufferedReader = new BufferedReader(filereader);
		String line =  null;
		int key = 1;
		while((line=bufferedReader.readLine()) != null) {
			//create student object 
			String[] row = line.split(",");
			String firstName = row [0];
			String lastName = row [1];
			int age = Integer.parseInt(row [2]);
			String grade = row[3];
			
			//add to the list
			Students student = new Students(firstName, lastName, age, grade);
			map.put(key++, student);
			 
			
			
		}
		
		return map;
	}


	@Override
	public List<Students> searchByFirstName(Map <Integer, Students> map, String firstName) 
	{
		List<Students> result = new ArrayList<Students>();
		
		Set <Integer> keys = map.keySet();
		for (Integer key : keys) {
			Students student = map.get(key);
			
			if (student.getFirstName().equals(firstName))
			result.add(student);
		
	}
		return result;

}

	@Override
	public void printAll(Map<Integer, Students> map)  {
		Set <Integer> keys = map.keySet();
		for (Integer key : keys) {
		//Students student = map.get(key);
		System.out.println("Print all" + map.get(key));
	}
		}

	@Override
	public Students searchById(Map<Integer, Students> student, int id) {
		
		return student.get(id);
	}
}
