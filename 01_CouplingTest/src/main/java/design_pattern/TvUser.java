//0608 ���յ��� ���ߴ� ��� (������ ���� �̿�)
// ���յ��� ����� - ���α׷��Ӱ� �ҽ��ڵ带 ���� �� �ȴ�� �ִ��� ª�� �����ϴ°�
package design_pattern;

public class TvUser {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		
		TV tv = (TV)factory.getBean(args[0]);  //args�� ���� ������ �������� �����ϰڴ�. args[0]
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
