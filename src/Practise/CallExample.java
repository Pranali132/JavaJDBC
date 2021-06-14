package Practise;
import java.sql.*;

public class CallExample {
	public static void main(String ar[])throws ClassNotFoundException,SQLException
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Pranali@123");
	
		CallableStatement cs=con.prepareCall("{call p1(?,?)}");
		cs.setInt(1,111110);
		cs.setString(2, "Rithik");
		cs.executeUpdate();
		System.out.println("call able statment is created");
	}


}
