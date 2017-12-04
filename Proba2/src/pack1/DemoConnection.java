package pack1;

import java.sql.*;

public class DemoConnection {
	
	public static void main(String [] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String password = "2580";
		String query = "Select studName from student where studentID = 3";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		
		rs.next();
		String name = rs.getString("studName");
		
		System.out.println(name);
		
		st.close();
		con.close();
		
	}

}
