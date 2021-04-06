	package jdbc;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	
	public class ConnectDB {
		
		 static Connection connection = null;
		 static String databasename = "";
		 static String url      = "jdbc:mysql://localhost:3306/" + databasename;
		 
		 static String username = "root";
		 static String password = "";
		 
		
		 
		 
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			 Class.forName("com.mysql.jdbc.driver");
			 connection =  DriverManager.getConnection(url, username, password);
			
		}
	
	}
