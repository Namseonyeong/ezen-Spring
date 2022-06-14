package com.ezen.biz.user;


import com.ezen.biz.dao.UserDAO;
import com.ezen.biz.dto.EqulipmentVO;

public interface UserService {
	public  EqulipmentVO getUser(EqulipmentVO vo);
	
	void setUserDAO(UserDAO uDao);
}
