package com.ezen.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	
	/*
	 * 	�޼ҵ� ȣ�� ��ü�� ����ä ����Ͻ� �޼ҵ� ���� ���Ŀ� ó���� ������ ������ �� ����.
	 * 	�ϳ��� �����̽��� ����Ͻ� �޼ҵ� ���� ���� �Ŀ� ��� �����Ͽ� ������ ó���� �� ���.
	 * 
	 * 	���ϰ�:
	 * 	 Object: ����Ͻ� ���� ������ ��� return ���� ȣ���� ������ �����ϱ� ���� ���.
	 */
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		// pjp.proceed() �޼ҵ� ȣ�� �տ� �ۼ��� �ڵ�� Before �����̽��� �����ϰ� ����.
		System.out.println("[BEFORE]: ����Ͻ� �޼ҵ� ���� !��! �� ó���� ����...");
	
		// ����Ͻ� ���� ȣ�� �� ���ϰ� ��ȯ.
		Object returnObj = pjp.proceed();
		
		// pjp.proceed() �޼ҵ� ȣ�� �ڿ� �ۼ��� �ڵ�� After �����̽��� �����ϰ� ����.
		System.out.println("[AFTER]: ����Ͻ� �޼ҵ� ���� !��! �� ó���� ����...");
		
		return returnObj;
	}
}
