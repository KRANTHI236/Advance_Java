package com.adhar;
import java.sql.*;
public class Update_Data {
    public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhar","root","root");
			
			Statement s=c.createStatement();
			
			//s.execute("update person set gender='male' where name='prince'");
			
			s.execute("delete from person where name='kiran'");
			c.close();
			
			//System.out.println("updated successfully");
			
			System.out.println("deleted successfully");
			
			
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
		
		
	}
}
