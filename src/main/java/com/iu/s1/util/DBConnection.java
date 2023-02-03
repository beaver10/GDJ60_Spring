package com.iu.s1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	//getConnection
	public static Connection getConnection() throws Exception{
		//1. 연결정보
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver ="oracle.jdbc.driver.OracleDriver";
		
		//2. Driver를 메모리에 로딩
		Class.forName(driver);
		
		//3. DB연결
		return DriverManager.getConnection(url,user,password);
			
	}
	
	public static void disConnect(PreparedStatement st, Connection con) throws Exception {
		st.close();
		con.close();
	}
	
	public static void disConnect (PreparedStatement st, Connection con, ResultSet rs) throws Exception {
		rs.close();
		st.close();
		con.close();
		
	}
	

}
