package com.ezen.biz;

import org.springframework.stereotype.Component;

/*
 * 	-------  ����Ͻ� ������ �����ϴ� Ŭ����.  -------
 */

@Component("opBean")
public class Operation {
	public void message() {
		System.out.println("message() method ȣ���.\n");
	}
	
	public int m() {
		System.out.println("m() �޼ҵ� ȣ���.\n");
		return 2;
	}
		
	public int k() {
		System.out.println("k() �޼ҵ� ȣ���.\n");
		return 3;
	}
		
	public void throwException() {
		throw new RuntimeException("���� �߻�...");
	}
	
}