package com.ezen.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.UserDAO;
import com.ezen.biz.dto.UserVO;


// UserService ���鶧 �ش� ���� ������ ���콺-refactor-extr..�������̽�

@Service("userService") //(2) ������̼� ������� ������ �ʿ� 
public class UserServiceimpl implements UserService {
	@Autowired  //(3) ������̼� ������� ������ �ʿ� (��ü ������ �ȵǾ��ֱ� ������ �ڵ� ��ü ��
	private UserDAO userDAO; // ���� ������ ��ü
	

	
	@Override
	public UserVO getUser(UserVO vo) {
		
		return userDAO.getUser(vo); // UserDAO���� ���� ���� �ִ´�
	}

	@Override
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

	
}
