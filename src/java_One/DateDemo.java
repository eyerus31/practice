package java_One;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	      System.out.println("Current Date: " + ft.format(dNow));

	}

}
