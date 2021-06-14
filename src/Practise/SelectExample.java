package Practise;
import java.sql.*;

public class SelectExample {
	public static void main(String ar[])throws ClassNotFoundException,SQLException
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Pranali@123");		
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from emp");
		while(rs.next())
		{
			int eid=rs.getInt(1);
			String ename=rs.getString(2);
			System.out.println(eid+" "+ename);			
		}
}

}
