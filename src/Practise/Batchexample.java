package Practise;
import java.sql.*;

public class Batchexample {
	public static void main(String args[]) throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Pranali@123");
		Statement st=con.createStatement();
		con.setAutoCommit(false);
		st.addBatch("insert into emp values(11,'ajay')");
		st.addBatch("insert into emp values(12,'deva')");
		st.addBatch("insert into emp values(13,'anoto')");
		st.executeBatch();
		ResultSet rs=st.executeQuery("select * from emp");
		con.commit();
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +"       "   +rs.getString(2));
			
		}
		rs.close();
		st.close();
		con.close();
		
	}



}
