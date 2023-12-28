package Prepared_Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class Properties_File {

	public static void main(String[] args) {
		Connection c=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			FileInputStream f=new FileInputStream("C:\\Users\\rachh\\OneDrive\\Desktop\\ADV_JAVA_BY_ALTHAF_SIR\\JDBC\\CRUD_OPERATIONS\\src\\Prepared_Statement\\Data.properties");
			Properties p=new Properties();
			p.load(f);
					
		    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first",p);
			
			PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?)");
			
			ps.setInt(1, 10);
			ps.setString(2, "bindu");
			ps.setInt(3, 30);
			ps.executeUpdate();
			
			System.out.println("inserted sucessfully");
			
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
