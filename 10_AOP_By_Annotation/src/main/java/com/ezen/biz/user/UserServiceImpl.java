package com.ezen.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.UserDAO;
import com.ezen.biz.dto.UserVO;

@Service("userService")			// (2) ������̼� ������� ������ �ʿ�.
public class UserServiceImpl implements UserService {
	@Autowired			// (2) ������̼� ������� ������ �ʿ�.
	private UserDAO userDAO; // ���� ������ ��ü
   
   // UserService ���鶧 �ش� ���� ������ ���콺-refactor-extr..�������̽�
   
   @Override
   public UserVO getUser(UserVO vo) {
      
      return userDAO.getUser(vo); // UserDAO���� ���� ���� �ִ´�
   }

   @Override
   public void setUserDAO(UserDAO userDAO) {
      this.userDAO = userDAO;
   }
   

   
}