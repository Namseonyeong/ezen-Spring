//0610 Speaker�� ����
package com.ezen.biz;

import org.springframework.stereotype.Component;

// bean��ü�� �����϶�� component �� ���� 
@Component("bose")
public class BoseSpeaker implements Speaker {
	
//	�⺻������ : ������������ �Ϸ��� �⺻������ �ʼ���
	public BoseSpeaker() {
		System.out.println("---> Bose Speaker ��ü ����");
	}
	
	
	@Override
	public void volumeUp() {
		System.out.println("Bose Speaker -- ������ �ø���.");
	}

	@Override
	public void volumeDown() {
		System.out.println("Bose Speaker -- ������ ������.");
	}

}
