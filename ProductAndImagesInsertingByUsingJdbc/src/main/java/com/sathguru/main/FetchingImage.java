package com.sathguru.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchingImage {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dburl = "jdbc:oracle:thin:@//10.0.0.5:1521/rvpdb1.sub081409003601.rvtestvcn.oraclevcn.com";
			String dbun = "TEST_ALL";
			String dbpwd = "test_all";

			Connection connection = DriverManager.getConnection(dburl, dbun, dbpwd);

			PreparedStatement preparedStatement = connection.prepareStatement("Select * from IMAGE_OR_FILE");

			ResultSet resultSet = preparedStatement.executeQuery();

//			if (resultSet.next()) {
//				Blob blob = resultSet.getBlob(4);
//				byte b[] = blob.getBytes(253, (int) blob.length());
//
//				FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\kiranr\\Pictures\\River.jpg");
//
//				fileOutputStream.write(b);
//
//				fileOutputStream.close();
//			}

			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String name = resultSet.getString("name");
				String description = resultSet.getString("description");

				Blob image = resultSet.getBlob("image");

				System.out.println(id + "\t\t" + name + "\t\t" + description+"\t\t"+image);

			}

			System.out.println("fetched successfully");
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
