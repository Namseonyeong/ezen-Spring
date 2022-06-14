package com.ezen.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/*
 * 	-------  �����̽��� �����ϴ� �ֽ���Ʈ Ŭ����.  -------
 */

public class TrackOperation {

	public void myadvice(JoinPoint jp) {
		System.out.println("�ΰ� ��� ����!");
	}
	
	public void myadvice2(JoinPoint jp) {
		System.out.println("[���� ó��]: �ΰ� ��� ����!");
	}
	
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		// pjp.proceed() �޼ҵ� ȣ�� �տ� �ۼ��� �ڵ�� Before �����̽��� �����ϰ� ����.
		System.out.println("[���� ó��]: ����Ͻ� �޼ҵ� ���� !��! ó������...");
	
		// ����Ͻ� ���� ȣ�� �� ���ϰ� ��ȯ.
		Object returnObj = pjp.proceed();
		
		// pjp.proceed() �޼ҵ� ȣ�� �ڿ� �ۼ��� �ڵ�� After �����̽��� �����ϰ� ����.
		System.out.println("[���� ó��]: ����Ͻ� �޼ҵ� ���� !��! ó������...");
		
		return returnObj;
	}
}
