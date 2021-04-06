package java_One;

public class CharDemo {

	public static void main(String[] args) {
		//given an array of character
		char[] helloArray = {'H', 'e', 'l', 'l', 'o', '.'};
		char[] mamboArray = {'M', 'a', 'm','b','o','.'};
		// create a string using the given characters 
		String helloString = new String(helloArray);
		String mamboString = new String(mamboArray);
		int len = helloString.length();
		
		// print the string 
		System.out.println(helloString.concat(mamboString));
		System.out.println(len);

	}

}
