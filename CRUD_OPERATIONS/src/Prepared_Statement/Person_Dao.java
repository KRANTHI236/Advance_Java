package Prepared_Statement;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Person_Dao {
 
	public static void insert(Person_Dto p1) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhar", "root", "root");
			
			PreparedStatement ps=c.prepareStatement("insert  into kranthi values (?,?,?)");
			
			int n=p1.getId();
			String s1=p1.getName();
			int n1=p1.getAge();
			
			ps.setInt(1,n);
			ps.setString(2,s1);
			ps.setInt(3,n1);
			
			ps.executeUpdate();
			
			c.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
