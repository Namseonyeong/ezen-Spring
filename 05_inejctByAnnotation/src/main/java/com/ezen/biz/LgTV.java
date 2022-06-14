package com.ezen.biz;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;


//@�� ���Ե� ���ڿ� : ������̼�(Annotation)
@Component("tv")

public class LgTV implements TV{
	
	// �����̳ʿ� ��ϵ� ��ü�� ã�Ƽ� �ڵ����� �Ҵ�
	//@Autowired  
	//@Qualifier("bose")
	@Resource(name="bose")
	private Speaker speaker; // ����Ŀ ��ü
	
	
	public LgTV() {
		System.out.println("===> LgTV ��ü ����");
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV -- ������ �Ѵ�.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV -- ������ ����.");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp(); //��ü ������ ���ϸ� nullpointException �߻� 
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
