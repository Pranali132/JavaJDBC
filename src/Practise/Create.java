package Practise;
import java.sql.*;

public class Create {
	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Creating connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Pranali@123");
		//Creating query
		Statement st = con.createStatement();
		st.execute("create table emp(eid int, ename varchar(10))");
		System.out.println("Table is created");		
	}

}
