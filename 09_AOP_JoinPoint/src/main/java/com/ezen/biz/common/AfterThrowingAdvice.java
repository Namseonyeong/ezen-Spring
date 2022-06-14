package com.ezen.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	
	/*
	 * After Throwing�� ����Ͻ� �޼ҵ尡 ���� �� ���ܰ� �߻����� �� �����ϴ� �����̽��̹Ƿ�,
	 * � �޼ҵ忡�� ���ܰ� �߻��ߴ��� �˾ƾ��Ѵ�.
	 * 
	 * JoinPoint - ���ܰ� �߻��� �޼ҵ� ������ �˾Ƴ���.
	 * exceptObj - ����Ͻ� �޼ҵ忡�� �߻��� ���� ��ü�� ���ε� �ϴ� ����
	 */
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
//		%s() �޼ҵ�� ȣ�� 
		System.out.printf("[���� ó��]: %s() ���� !��! ���ܹ߻� %s\n", method, exceptObj.getMessage());
	}
}
