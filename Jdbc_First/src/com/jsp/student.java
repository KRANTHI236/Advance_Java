package com.jsp;
import java.sql.*;
public class student {
 public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
		
		Statement s=c.createStatement();
		
		s.execute("create table student(sid int primary key,sname varchar(45),sgender varchar(65))");
		
		c.close();
		
		System.out.println("table created successfully");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}
}
