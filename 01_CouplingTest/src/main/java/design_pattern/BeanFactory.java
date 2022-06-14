//0608 ���յ��� ���ߴ� ��� (������ ���� �̿�) / ��û�� ���ڿ��� ������ �������ִ� �޼ҵ�
package design_pattern;

public class BeanFactory {
	
	/*
	 * �Ű����� :
	 * 		beanName - ��û�ϴ� ��ü�� (Samsung, Lg)
	 */
	public Object getBean(String beanName) {

		if (beanName.equals("Samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("Lg")) {
			return new LgTV();
		}

		return null;
	}

}
