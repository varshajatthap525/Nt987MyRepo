package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnTest {
	public static void main(String[] args) throws SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "tiger");

		if (con == null)
			System.out.println("connection is not establish");
		else
			System.out.println("connection is establish");
	}
}
