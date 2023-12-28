package com.jsp;
import java.sql.*;
public class product {
  public static void main(String[] args) {
	
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
		
		Statement s= c.createStatement();
		
		s.execute("create table product(pid int primary key,pname varchar(45),price int)");
		
		c.close();
		
		System.out.println("table created successfully");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	  
}
}
