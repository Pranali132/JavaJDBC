package Practise;
import java.sql.*;

public class DatabaseMetadata {
public static void main(String args[]) throws SQLException,ClassNotFoundException
	
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Pranali@123");
		DatabaseMetaData dm=con.getMetaData();
		System.out.println("drivername:"+dm.getDriverName());
		System.out.println("username:"+dm.getUserName());
		System.out.println("driver version:"+dm.getDriverVersion());

		
	}


}
