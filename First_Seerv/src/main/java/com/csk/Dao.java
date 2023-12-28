package com.csk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.http.HttpServletRequest;

public class Dao {

	public static void insert(HttpServletRequest rq) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/yellow_army", "root", "root");

			PreparedStatement ps = c.prepareStatement("insert into msd values (?,?)");
//			PreparedStatement ps=c.prepareStatement("delete from msd where fname=?");

			String name = rq.getParameter("fname");
			int age = Integer.parseInt(rq.getParameter("age"));
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.executeUpdate();
			c.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
