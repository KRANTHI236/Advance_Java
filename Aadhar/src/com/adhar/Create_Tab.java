package com.adhar;
import java.sql.*;
public class Create_Tab {
   public static void main(String[] args) {
	
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhar", "root", "root");
		
		Statement s=c.createStatement();
		
		s.execute("create table person (id bigint primary key,name varchar(45) not null ,DOB varchar(10) not null, Gender varchar(10), Phno bigint)");
		
		c.close();
		
		System.out.println("table created successfully");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	   
}
}
