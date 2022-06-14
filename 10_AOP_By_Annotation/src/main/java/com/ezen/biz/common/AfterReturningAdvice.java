package com.ezen.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Service
@Aspect
public class AfterReturningAdvice {

//	@Pointcut("execution(* com.ezen.biz..*Impl.get*(..))")
//	public void getPointcut() { }	
	
	/*
	 * After Returning �� ����Ͻ� �޼ҵ尡 ����ǰ� ����, ��� �����͸� ������ �� �����ϴ� �����̽� �̹Ƿ� JoinPoint
	 * �Ű������� �̿��Ͽ� !!����!! ó�� ����� �پ��ϰ� ���� ����.
	 */
	
	
	// ���Ͽ�����Ʈ�� ������ �ؾߵż� �տ� pointcut�̶�� ���� ��
	@AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnObj")  
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName(); // ȣ���� ����Ͻ� �޼ҵ� �̸�.

		System.out.println("[���� ó��]: ����Ͻ� ���� ���� �� �۾�...");
		System.out.printf("[���� ó��]: %s(), ���ϰ�: %s\n", method, returnObj.toString());

		

	}
}




/*
 * ����Ʈ������ ������ �޼ҵ尡 ���������� ����ǰ� ����, �޼ҵ� ���� ����� ������ �����͸� �����ϴ� ������ �����Ѵ�.
 * 
 * ����Ͻ� �޼ҵ� ���� ����� ���� ��� �����͸� �̿��Ͽ� ���� ó�� ������ �߰��� �� ���.
 * 
 * (����Ͻ� �޼ҵ尡 ���������� ���ϵǸ� ����.)
 * 
 * 	public void afterLog(JoinPoint jp, Object returnObj) {
	String method = jp.getSignature().getName();
 * 
 * 
 * public void afterLog() { System.out.println("[���� ó��]: ����Ͻ� ���� ���� !��! �۾�...");
 */