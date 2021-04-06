package oop_Java;

public class MammalInt implements Animal{

	
	public void eat() {
		System.out.println("Mammals eat");
		
	}

	
	public void travel() {
		System.out.println("Mammals travel");
		
	}
	public int noOfLegs() {
		return 0;
		
	}
	public static void main(String [] args) {
		
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
	}
}
