package com.ezen.biz.dao;

import java.sql.*;

import org.springframework.stereotype.Repository;

import com.ezen.biz.common.JDBCUtil;
import com.ezen.biz.dto.EqulipmentVO;

@Repository("userDAO")		// (2) ������̼� ������� ������ �ʿ�.
public class UserDAO {
	// JDBC ���� ����
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// SQL ��ɾ��
	private final static String USER_GET = "SELECT * FROM USERS WHERE id=? AND password=?";
	
	// CRUD ����� �޼ҵ� ����
		//	---- ����� ��ȸ. ----
	public EqulipmentVO getUser (EqulipmentVO vo) {
		System.out.println("===> JDBC�� getUser() ��� ó��");
		EqulipmentVO user = null; 
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			
			rs= pstmt.executeQuery();
			
			if (rs.next()) {
				user = new EqulipmentVO();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setRole(rs.getString("role"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return user;
	
	}

}
	


