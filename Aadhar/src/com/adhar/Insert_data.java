package com.adhar;
import java.sql.*;
public class Insert_data {
   public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhar","root","root");
	    
	    Statement s=c.createStatement();
	    
	    s.execute("insert into person values(34567,'hima','11-05-2002','female',7843567570)");
	    
	    
	    c.close();
	    
	    System.out.println("values inserted successfuly");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}
}
