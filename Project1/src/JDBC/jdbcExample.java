package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcExample {

	private static final String URL = "jdbc:mysql://localhost:3306/tcsdb";
	private static final String USER = "root";
	private static final String PASSWORD = "Root123$";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	public static void main (String args[]) {
		try(Connection connection = getConnection()){
			if(connection != null) {
		System.out.println("Connected to the database");
		Statement stm = connection.createStatement();
		ResultSet rs = stm.executeQuery("Select * from student");
		
		PreparedStatement ps = connection.prepareStatement("insert into Student (ID,Name,Fees,Subject) values(1,'raj',20000,'SQL')");
		
			}
		}catch(SQLException e) {
			e.printStackTrace();         
		}
	}
}
