package Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_Person_Dao {

	public static void update(Update_Person_Dto u1) {
	
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhar?user=root&password=root");
			
			PreparedStatement ps=c.prepareStatement("update kranthi set id=?,name=? where age=45");
			
			int n=u1.getId();
			String s=u1.getName();
			
			ps.setInt(1, n);
			ps.setString(2, s);
			
			ps.executeUpdate();
			
			c.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		 
		 
		
	}
	
	
	
}
