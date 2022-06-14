package com.ezen.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

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
		String method = pjp.getSignature().getName(); // ȣ���� ����Ͻ� �޼ҵ� �̵�
		
		
		// �޼ҵ� ����ð� ������ ���� ��ü ����
		StopWatch stopWatch = new StopWatch();
		
		stopWatch.start();  // ����Ͻ� �޼ҵ� ���� �ð� ����
	
		// ����Ͻ� ���� ȣ�� �� ���ϰ� ��ȯ.
		Object returnObj = pjp.proceed();
		
		stopWatch.stop();  // ����Ͻ� �޼ҵ� ���� �ð� ����
		
		// pjp.proceed() �޼ҵ� ȣ�� �ڿ� �ۼ��� �ڵ�� After �����̽��� �����ϰ� ����.
		System.out.printf("�޼ҵ�� : %s  ���࿡ �ɸ� �ð� : %d(ms)\n", method, stopWatch.getTotalTimeMillis());
		
		return returnObj;
	}
}
