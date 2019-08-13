package com.gm.HelloWorld;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class ServiceCon {

	private String url = "jdbc:mysql://localhost:3306/newdb";
	private String driverName = "com.mysql.cj.jdbc.Driver";
	private String username = "root";
	private String password = "root";
	private Connection con;

	@PostConstruct
	public Connection getConnection() {
		try {
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url, username, password);
			System.out.println("connetion created");
			return con;
		} catch (Exception ex) {
			System.out.println("Failed to create the database connection.");
			return null;
		}
	}
}
