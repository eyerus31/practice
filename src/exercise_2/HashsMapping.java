package exercise_2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashsMapping {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		//add to map
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		
		System.out.println(map);
		//Iterate through map 
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys){
			String value = map.get(key);
			System.out.println(key + "-" + value );
				
		}

	}
		
}
