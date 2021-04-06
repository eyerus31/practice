package java_One;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		String dirname = "/Users/eyerusalem/eclipse-workspace/ADG";
	      File d = new File(dirname);
	      
	      // Create directory now.
	      d.mkdir();

	}

}
