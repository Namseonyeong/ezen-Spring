package com.ezen.biz.dao;

import java.sql.*;

import org.springframework.stereotype.Repository;

import com.ezen.biz.common.JDBCUtil;
import com.ezen.biz.dto.UserVO;

@Repository("userDAO")		// (2) 어노테이션 방식으로 구현시 필요.
public class UserDAO {
	// JDBC 관련 변수
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// SQL 명령어들
	private final static String USER_GET = "SELECT * FROM USERS WHERE id=? AND password=?";
	
	// CRUD 기능의 메소드 구현
		//	---- 사용자 조회. ----
	public UserVO getUser (UserVO vo) {
		System.out.println("===> JDBC로 getUser() 기능 처리");
		UserVO user = null; 
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			
			rs= pstmt.executeQuery();
			
			if (rs.next()) {
				user = new UserVO();
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
	


