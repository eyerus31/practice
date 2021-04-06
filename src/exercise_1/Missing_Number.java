package exercise_1;

public class Missing_Number {
	
	public static int missingNumber(int[] array) {
		int n = array.length + 1;
		int sum = ((n+1)* n)/ 2;
		
		for (int i = 0; i < array.length; i++) {
			sum-=array[i]; // sum = sum - array[i]
		}
		
		return sum;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,9,10};
		int result = missingNumber(array);
		
		System.out.println("Missing Number Is "+ result);
	}

}
