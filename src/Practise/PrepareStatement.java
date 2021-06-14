package Practise;
import java.sql.*;

public class PrepareStatement {
	public static void main(String ar[])throws ClassNotFoundException,SQLException
	{

		Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Pranali@123");
	
PreparedStatement ps=con.prepareStatement("insert into emp values(?,?)");
ps.setInt(1,10);
ps.setString(2, "Shraddha");
ps.executeUpdate();
System.out.println("prepared statement is created");
}


}
