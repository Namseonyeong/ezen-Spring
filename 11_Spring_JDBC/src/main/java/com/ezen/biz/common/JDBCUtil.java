package com.ezen.biz.common;

import java.sql.*;

/*
 * 	-------  �����ͺ��̽� Connection �� ��ų� �����ϴ� ó��.  -------
 */

public class JDBCUtil {
	public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String uid = "spring_user";
		String pass = "ora123";
		
		try {
			// ����Ŭ JDBC ����̹��� �޸𸮿� �ε�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	/*
	 * 	Select�� ���� �� close() �޼ҵ�.
	 */
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 	Update, Insert, Delete�� ������ close() �޼ҵ�.
	 */
	public static void close(Connection conn, Statement stmt) { //stmt�� psmt ����Ÿ��.
		try {
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




