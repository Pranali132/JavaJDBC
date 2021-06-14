package com.student.manage;
import java.io.BufferedReader;
import java.io.InputStreamReader;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateJDBC {
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
			String q="update table1 set tName=?,tCity=? where tId=?";
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name:");
			String name=br.readLine();
			System.out.println("Enter city:");
			String city=br.readLine();
			System.out.println("Enter the Student Id:");
			int id=Integer.parseInt(br.readLine());
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,name);
			pstmt.setString(2,city);
			pstmt.setInt(3,id);
			pstmt.executeUpdate();
			System.out.println("Doneeee.....");
			con.close();

			
			

			}catch(Exception e)
		{
		   e.printStackTrace();	

	}
}
}



