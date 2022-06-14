package com.ezen.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterReturningAdvice {

	/*
	 * ����Ʈ������ ������ �޼ҵ尡 ���������� ����ǰ� ����, �޼ҵ� ���� ����� ������ �����͸� �����ϴ� ������ �����Ѵ�.
	 * 
	 * ����Ͻ� �޼ҵ� ���� ����� ���� ��� �����͸� �̿��Ͽ� ���� ó�� ������ �߰��� �� ���.
	 * 
	 * (����Ͻ� �޼ҵ尡 ���������� ���ϵǸ� ����.)
	 * 
	 * 
	 * After Returning �� ����Ͻ� �޼ҵ尡 ����ǰ� ����, ��� �����͸� ������ �� �����ϴ� �����̽� �̹Ƿ� JoinPoint
	 * �Ű������� �̿��Ͽ� !!����!! ó�� ����� �پ��ϰ� ���� ����.
	 */

	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName(); // ȣ���� ����Ͻ� �޼ҵ� �̸�.

		System.out.println("[���� ó��]: ����Ͻ� ���� ���� !��! �۾�...");
		System.out.printf("[���� ó��]: %s(), ���ϰ�: %s\n", method, returnObj.toString());

		/*
		 * public void afterLog() { System.out.println("[���� ó��]: ����Ͻ� ���� ���� !��! �۾�...");
		 */
	}
}
