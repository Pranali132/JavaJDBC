package com.student.manage;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class InsertJDBC {
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
			String q="insert into table1(tName,tCity) values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values to query
			pstmt.setString(1,"Durgesh Tiwari");
			pstmt.setString(2,"Lucknow");
			pstmt.setString(1,"Pranali Uttekar");
			pstmt.setString(2,"Mumbai");
			pstmt.setString(1,"Ashlesha Rai");
			pstmt.setString(2,"New Delhi");
			pstmt.setString(1,"Pranit Patil");
			pstmt.setString(2,"Myanmar");

            pstmt.executeUpdate();
			System.out.println("inserted");
			con.close();
		}catch(Exception e)
		{
			   e.printStackTrace();	

		}
}
}
