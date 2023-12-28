package com.jsp;
import java.sql.*;

import javax.swing.JSpinner;

public class Jdbc_Steps {
   public static void main(String[] args) {
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
		
		Statement s=c.createStatement();
		
		s.execute("create table emp(id int primary key,ename varchar(80), age int,phno bigint(10))");
		
		c.close();
		
		System.out.println("table created successfully");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		
	}
	   
	
 }
}
