package com.ezen.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

// @Service = ��ü ���
@Service
@Aspect
public class BeforeAdvice {
/*	* = ����Ÿ�� / com.ezen.biz.. = ��Ű��  /     /*(..) = �Ű�����
	�� ��ü�� ����ϱ� ���� �����̽��� �����Ͽ� ��� */
//	@Pointcut("execution(* com.ezen.biz..*Impl.*(..))")
//	public void allPointcut() { }  // �޼ҵ� ���� ������� �̸��� ����
	
	
	/*
	 * 	Before �����̽��� ����Ͻ� �޼ҵ尡 ����Ǳ� ���� ������ ������ �����ϹǷ�,
	 * 	JoinPoint �Ű������� �̿��Ͽ� �پ��� ���� ó�� ���� ����.
	 */
	
	// �޼ҵ� ������ ������� �ҷ��� 
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp) {
		// ����ó�� �޼ҵ��� ����� ������ ���´�.
		Signature sig = jp.getSignature();
		
		String method = sig.getName();
		Object[] args = jp.getArgs();
		
		System.out.println("\n[���� ó��]: ����Ͻ� ���� ���� �� ó��...");
		if (args.length == 0) {		// ����Ͻ� ���� ȣ��� �Ű������� !����!
			System.out.printf("�޼ҵ��: %s\n", method);
			System.out.printf("�Ű�����: ����.\n");
		} else {
			System.out.printf("�޼ҵ��: %s\n", method);
			System.out.printf("�Ű�����: %s\n", args[0].toString());
		}
		
	}
}
