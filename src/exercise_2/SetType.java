package exercise_2;


import java.util.LinkedHashSet;
import java.util.Set;



public class SetType {

	public static void main(String[] args) {
		

		Set<String> set = new LinkedHashSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Carrot");
		set.add("Lemon");
		set.add("Peach");
		set.add("Carrot");
		set.add("Lemon");
		
		for(String s: set) {
			System.out.println(s);
			
		}
	}

}

