package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;



public class SelectJDBC {
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
			String query="select * from table1";
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(query);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String city=set.getString(3);
				System.out.println(name+":"+id+":"+city);
              }
			con.close();
			
}catch(Exception e)
		{
	   e.printStackTrace();	
	}
}
}
