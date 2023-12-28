package Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete_Dao {
 
	public static void delete(Delete_Dto d1) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first?user=root&password=root");
			
			PreparedStatement ps=c.prepareStatement("delete from student where age=?");
			
			int n=d1.getAge();
			
			ps.setInt(1, n);
			
			ps.executeUpdate();
			
			c.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
