package java_One;

public class ForEach {

	public static void main(String[] args) {
		int [] numbers = {10, 20, 30, 40, 50};
		
		for (int x: numbers) {
			if (x==30) {
			    //continue;
				break;
			}
			System.out.println(" She said \"Hello!\" to me" + x);
		}

	}

}
