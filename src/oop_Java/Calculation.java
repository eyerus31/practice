package oop_Java;

 class Calculation {
	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers: " + z);	
	}
	
	public void Subtraction(int x, int y) {
		z = y -x;
		System.out.println("The difference betwen the given numbers: " + z);
	}
	
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers: " + z);
	}
	
}

