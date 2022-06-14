//0610 DB Connection�� ��ų� �����ϴ� ó�� , JDBC ���� ȣ������ DB���� ����
package com.ezen.biz.common;

import java.sql.*;

public class JDBCUtil {
	public static Connection getConnection() {

		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String uid = "spring_user";
		String pass = "ora123";

		try {
			// ����Ŭ JDBC ����̹��� �޸𸮿� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// connection Ÿ���� ��ü
			conn = DriverManager.getConnection(url, uid, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (conn != null) {
				if (!conn.isClosed()) {
					conn.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (stmt != null) {
				if (!stmt.isClosed()) {
					stmt.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (rs != null) {
				if (!rs.isClosed()) {
					rs.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// insert, update, delete ���� �� ���ҽ� ���� �޼ҵ�
	public static void close(Connection conn, Statement stmt) {
		try {
			if (conn != null) {
				if (!conn.isClosed()) {
					conn.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (stmt != null) {
				if (!stmt.isClosed()) {
					stmt.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
