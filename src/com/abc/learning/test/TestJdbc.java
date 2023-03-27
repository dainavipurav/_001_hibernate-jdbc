package com.abc.learning.test;


import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
		
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/userdb?useSSL=false";
		String username = "root";
		String password = "root";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(jdbcUrl, username, password);
			
			System.out.println("Connection established succesfully...");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connection establish failure...");
		}
	}
}
