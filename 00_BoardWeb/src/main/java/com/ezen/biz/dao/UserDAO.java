package com.ezen.biz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.ezen.biz.common.JDBCUtil;
import com.ezen.biz.dto.UserVO;


@Repository("userDAO") // ������̼� ������� ������ �ʿ� (Setter �� client���� ��� ����� ��Ľ� �ʿ� ����)
 public class UserDAO {
	// JDBC ���� ����
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// SQL ��ɾ�
	private final String USER_GET = "SELECT * FROM users WHERE id=? AND password=?";


	// CRUD ����� �޼ҵ� ����
	// ����� ��ȸ
	public UserVO getUser(UserVO vo) {
		System.out.println("===> JDBC�� getUser() ��� ó��");
		UserVO user = null;

		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			
			//��ȸ ����
			rs = pstmt.executeQuery();
			// ��ܿ� SQL ��ɾ �� �����߱⶧���� ��ȸ����� �� �ʿ䰡 ����

			// ��ȸ ��� ��������, id�� �����̸Ӹ� Ű�̱� ������ while���� �ƴ� IF�� ���
			if (rs.next()) {
				user = new UserVO(); //���� ���� user��ü ����

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
