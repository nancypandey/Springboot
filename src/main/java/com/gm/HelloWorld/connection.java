package com.gm.HelloWorld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "root");

			stmt = con.createStatement();

			//Creating all tables
			String sql = "CREATE TABLE calculatro(firstno INTEGER,secondno INTEGER)";
            stmt.executeUpdate(sql);
            
			
			
			System.out.println("table created");

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				System.out.println("Closing Connection");
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException sqlEx) {
				System.out.println(sqlEx.getMessage());
			}
		}
		System.out.println("Ending Program..");
	}
}
