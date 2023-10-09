package com.sathguru.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductInsert {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dbUrl = "jdbc:oracle:thin:@//10.0.0.5:15212/rvpdb1.sub08140900360.rvtestvcn.oraclevcn.com";
			String dbun = "TEST_ALL";
			String dbPwd = "test_all";

			Connection connection = DriverManager.getConnection(dbUrl, dbun, dbPwd);

			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into PRODUCT_MASTER values(?,?,?,?,?,?)");

			preparedStatement.setInt(1, 2);
			preparedStatement.setInt(2, 100);
			preparedStatement.setString(3, "ram 4gb and rom 64gb");
			preparedStatement.setFloat(4, 2000);
			preparedStatement.setInt(5, 19);
			preparedStatement.setString(6, "sathguru");

			preparedStatement.execute();

			connection.close();

			System.out.println("inserted successfully");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
