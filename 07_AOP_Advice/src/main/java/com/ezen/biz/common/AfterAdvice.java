package com.ezen.biz.common;

public class AfterAdvice {
	
	/*
	 * 	try-catch-finally �������� finally ���ó�� ���� �߻� ���ο� �������,
	 * 	������ ����Ǵ� �����̽��� ����� �� ���.
	 * 	(����Ͻ� �޼ҵ尡 ����� ��, ������ ����)
	 */
	public void finallyLog() {
		System.out.println("[���� ó��]: ����Ͻ� ���� ���� !��! !!!������!!! ����...");
	}
}
