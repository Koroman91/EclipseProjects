package paket1;

import java.sql.*;

public class DemoConn {



		
		public static void main(String [] args) throws Exception
		{
			String url = "ime";
			String uname = "username";
			String password = "sifra";
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


