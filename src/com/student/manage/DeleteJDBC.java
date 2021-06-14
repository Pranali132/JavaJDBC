package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteJDBC {
	public static void main(String[] args) {
		try
		{
			//loading driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating a connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="Pranali@123";
			Connection con = DriverManager.getConnection(url,username,password);
			//create a query
			String q="delete from table1 where tId=3";
			PreparedStatement pstmt=con.prepareStatement(q);

			pstmt.executeUpdate(q);
			System.out.println("deleted");
			con.close();
		  
				


}		catch(Exception e)
{
	   e.printStackTrace();	

}
}
}

