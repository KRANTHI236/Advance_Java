package prepared_statement;

import java.sql.*;
import java.util.Scanner;
public class Update_Table_By_Using_Prepared_Statement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhar", "root", "root");
		
		//Statement s=c.createStatement();
		//creating table
		//s.execute("create table kranthi(id int(10), name varchar(46),age int(8))");
		//insert into table
		//PreparedStatement ps=c.prepareStatement("insert into kranthi values(?,?,?)");
		
		//ps.setInt(1, 01);
		
		//ps.setString(2, "kiran");
		
		//ps.setInt(3, 21);
		
		//ps.execute();
		//update into table
		//PreparedStatement ps=c.prepareStatement("update  kranthi set id=?,age=? where name='kiran'");
		PreparedStatement ps=c.prepareStatement("update kranthi set id=?,name=?where age=45");
		
		System.out.println("enter id");
		int n=sc.nextInt();
		ps.setInt(1, n);
		System.out.println("enter the name");
		String str=sc.next();
		
		
		ps.setString(2, str);
		
		//ps.setInt(2, 30);
		
		ps.executeUpdate();
		//delete from table
		//PreparedStatement ps=c.prepareStatement("delete from kranthi where id=?");
		
		//ps.setInt(1, 3);
		
		//ps.execute();
		
		
		
		c.close();
		
		System.out.println("deleted  successfully");
		
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}
}
