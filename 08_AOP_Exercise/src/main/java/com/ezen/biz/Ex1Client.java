package com.ezen.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 	-------  ������ ���� Ŭ���̾�Ʈ.  -------
 */

public class Ex1Client {

	public static void main(String[] args) {
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		Operation op = (Operation) container.getBean("opBean");
				
		System.out.println("msg ȣ��>>>");
			op.message();
			System.out.println("------------------------------.");
			
		System.out.println("m ȣ��>>>");
			int result = op.m();
			System.out.println("op.m()�� ���� �����" + result);
			System.out.println("------------------------------.");
			
		System.out.println("k ȣ��>>>");
			int result2 = op.k();
			System.out.println("op.k()�� ���� �����" + result2);
			
		container.close();

	}
}


