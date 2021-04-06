package exercise_2;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Orange");
		stack.push("Apple");
		stack.push("Banana");
		
		System.out.println("Before" + stack);
		
		stack.pop();
		
		System.out.println("After" + stack);
		

	}

}
