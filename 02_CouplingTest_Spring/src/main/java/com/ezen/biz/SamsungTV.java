//0608 ���յ��� ���� ���α׷� �ǽ� (������)
package com.ezen.biz;
		// implements �� TV(�������̽�)������ �޼ҵ� �����°�
public class SamsungTV implements TV {
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV -- ������ �Ҵ�.");
	
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV -- ������ ����.");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SamsungTV -- �Ҹ��� �ø���.");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("SamsungTV -- �Ҹ��� ������.");
	}
	
}