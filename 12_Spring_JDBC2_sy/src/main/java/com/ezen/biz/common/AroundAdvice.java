package com.ezen.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {
	
//	@Pointcut("execution(* com.ezen.biz..*Impl.*(..))")
//	public void allPointcut() { }
	
	/*
	 * 	�޼ҵ� ȣ�� ��ü�� ����ä ����Ͻ� �޼ҵ� ���� ���Ŀ� ó���� ������ ������ �� ����.
	 * 	�ϳ��� �����̽��� ����Ͻ� �޼ҵ� ���� ���� �Ŀ� ��� �����Ͽ� ������ ó���� �� ���.
	 * 
	 * 	���ϰ�:
	 * 	 Object: ����Ͻ� ���� ������ ��� return ���� ȣ���� ������ �����ϱ� ���� ���.
	 */
	
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		// pjp.proceed() �޼ҵ� ȣ�� �տ� �ۼ��� �ڵ�� Before �����̽��� �����ϰ� ����.
		String method = pjp.getSignature().getName(); // ȣ���� ����Ͻ� �޼ҵ� �̵�
		
		
		// �޼ҵ� ����ð� ������ ���� ��ü ����
		StopWatch stopWatch = new StopWatch();
		
		stopWatch.start();  // ����Ͻ� �޼ҵ� ���� �ð� ����
	
		// ����Ͻ� ���� ȣ�� �� ���ϰ� ��ȯ.
		Object returnObj = pjp.proceed();
		
		stopWatch.stop();  // ����Ͻ� �޼ҵ� ���� �ð� ����
		
		System.out.printf("�޼ҵ�� : %s  ���࿡ �ɸ� �ð� : %d(ms)\n", method, stopWatch.getTotalTimeMillis());
		
		return returnObj;
	}
}
