package com.jsp;
import java.sql.*;
public class customer {
  public static void main(String[] args) {
	
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
		
		Statement s=c.createStatement();
		
		s.execute("create table customer(cno int primary key, cname varchar(45))");
		
		c.close();
		
		System.out.println("table created successfully");
		
		
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	  
}
}
