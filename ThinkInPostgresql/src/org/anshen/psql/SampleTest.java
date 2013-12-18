package org.anshen.psql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SampleTest {
	
	public static void main(String[] args) {
		Driver driver = null;
		try {
			driver = (Driver) Class.forName("org.postgresql.Driver").newInstance();
			DriverManager.registerDriver(driver);
			Connection cnn = DriverManager.getConnection("jdbc:postgresql://", "", "");
			PreparedStatement pstm = cnn.prepareStatement("");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
