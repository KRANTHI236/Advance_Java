package com.jsp;

import java.sql.*;
import java.lang.*;

public class employee {
	public static void main(String[] args) {
		ThreadGroup t = new ThreadGroup("firstthread");
		System.out.println(t.getParent().getName());

//	  try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root", "root");
//		
//		Statement s=c.createStatement();
//		
//		s.execute("create table employee(eid int primary key,ename varchar(45),esal int)");
//		
//		c.close();
//		
//		System.out.println("table created successfully");
//		
//		
//	} catch (ClassNotFoundException | SQLException e) {
//		e.printStackTrace();
//	}
//	  
//	  
	}
}
