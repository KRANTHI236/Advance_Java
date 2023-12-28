package com.sathguru.main;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingImage {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			

			String dburl = "jdbc:oracle:thin:@//10.0.0.5:1521/rvpdb1.sub081409003601.rvtestvcn.oraclevcn.com";
			String dbun = "TEST_ALL";
			String dbpwd = "test_all";

			Connection connection = DriverManager.getConnection(dburl, dbun, dbpwd);

//			Statement statement = connection.createStatement();
//
//			statement.execute(
//					"create table IMAGE_OR_FILE (id integer,name varchar(45),description varchar(45),image BLOB)");

			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO IMAGE_OR_FILE VALUES(?,?,?,?)");

			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "river");
			preparedStatement.setString(3, "river picture");

			InputStream inputStream = new FileInputStream("C:\\Users\\kiranr\\Pictures\\Mountains.jpg.jpeg");
			preparedStatement.setBlob(4, inputStream);

//			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\kiranr\\Pictures\\River.jpg");
//			preparedStatement.setBinaryStream(4, fileInputStream, fileInputStream.available());

			preparedStatement.execute();

			connection.close();

			System.out.println("inserted successfully");

		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}

	}

}
