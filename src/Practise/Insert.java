package Practise;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class Insert {
	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Pranali@123");
		Statement st = con.createStatement();
		st.executeUpdate("insert into emp values (1, 'deepan')");
		System.out.println("Row is inserted");		
	}

	
}
