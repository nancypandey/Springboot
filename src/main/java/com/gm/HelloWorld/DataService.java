package com.gm.HelloWorld;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataService {

	@Autowired
	ServiceCon serviceCon;
	
	public String insertData(int a, int b) {
		
		PreparedStatement pstmt;
		int count = 0;
		Connection connection = serviceCon.getConnection();
		try {
			pstmt = connection.prepareStatement("insert into calculator  values (?,?)");
			pstmt.setInt(1, a);
			pstmt.setInt(2, b);
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("data inserted" + count);
		return "data inserted" + count;
	}
	
	
}
