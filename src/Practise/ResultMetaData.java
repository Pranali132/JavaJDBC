package Practise;
import java.sql.*;

public class ResultMetaData {
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Pranali@123");
	     Statement st=con.createStatement();
	     ResultSet rs=st.executeQuery("select * from emp");
	     ResultSetMetaData rd=rs.getMetaData();
	     System.out.println("total number of columns:"+rd.getColumnCount());
	     System.out.println("name of the column:"+rd.getColumnName(1));
	     System.out.println("name of the column:"+rd.getColumnName(2));
	     System.out.println("datatype of the column:"+rd.getColumnTypeName(1));
	     System.out.println("datatype of the column:"+rd.getColumnTypeName(2));
	
	}


}
