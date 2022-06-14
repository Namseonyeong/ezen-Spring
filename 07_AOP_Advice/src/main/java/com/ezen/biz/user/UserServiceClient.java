package com.ezen.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


import com.ezen.biz.dto.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {
		
		// 1. ������ �����̳� ����.
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. UserSerivceImpl ��ü Lookup
		UserService userService = (UserService) container.getBean("userService");
		
		// 3. �α��� ��� �׽�Ʈ.
		//		UserVO ��ü ����, id/password ����
		// 		userService�� getUser() ȣ��
		// 		���� ȣ�� ����� �̿��Ͽ� �α��� �������� Ȯ��
			UserVO user = new UserVO();
			user.setId("sslee");
			user.setPassword("1234");
			
			UserVO result = userService.getUser(user);
			
			if (result != null) {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
			} else {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
			}
			
		container.close();
		}
		
		
	}
