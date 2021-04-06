	package jdbc;
	
	import java.sql.Connection;
	
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	public class JDBCExample {
	
		public static void main(String[] args) throws SQLException, ClassNotFoundException { 
			
			String url      = "/change";   //database specific url
			String user     = "sa";
			String password = "";
	
			Connection connection =  DriverManager.getConnection(url, user, password);
			
			//Statement statement = connection.createStatement();
			
			
			Statement statement = connection.createStatement();
			String    sql       = "update Student set nameStudent ='John' where idStudent=123";
			int rowsAffected    = statement.executeUpdate(sql);
			
			String sql1 = "select * from people";
			
			//connection.close();
			Class.forName("driverClassName");
		}
	
	}
