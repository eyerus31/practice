package interfac_examplw;

public class Triangle extends Shape implements Draw{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
