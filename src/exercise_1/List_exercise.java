package exercise_1;

import java.util.ArrayList;
import java.util.List;

public class List_exercise {
	
	public static boolean contains(List<String> list, String value) {
		
		for(String str: list) {
			if (str.equals(value))
				return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		// use to test and launch your code
		List<String> testList = new ArrayList<String>();
		testList.add("ORANGE");
		testList.add("Apple");
		testList.add("Banana");
		testList.add("Avocado");
		
		boolean test = contains(testList, "orange".toUpperCase());
		
		if (test) {
			System.out.println("Success");
		}else {
			System.out.println("FAILED");
		}
		
	}

}
