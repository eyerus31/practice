package java_One;

public class MethodsOne {
	public static void main(String args[]) {
		MethodsOne.minFunction(2, 4);
		
	}
	public static void minFunction(int n1, int n2) {
		   int min;
		   if (n1 > n2)
		      min = n2;
		   else
		      min = n1;
		 //  return min; 
		   
		   System.out.println("Minimum is :" + min);
		}
	
}
