package koreait.day02;

public class C04_DoubleData {
	public static void main(String[] args) {
		
		System.out.println("Float �Ǽ�������------------");
		System.out.println("�޸� ũ�� : " + Float.BYTES);
		System.out.println("Float �Ǽ��� �ּҰ� : " + Float.MIN_VALUE);
		System.out.println("Float �Ǽ��� �ִ밪 : " + Float.MAX_VALUE);
		
		System.out.println("Double �Ǽ�������------------");
		System.out.println("�޸� ũ�� : " + Double.BYTES);
		System.out.println("Double �Ǽ��� �ּҰ� : " + Double.MIN_VALUE);
		System.out.println("Double �Ǽ��� �ִ밪 : " + Double.MAX_VALUE);
		
	}

}
/* �Ǽ������ʹ� ��ǻ�� �������� �ε��Ҽ��� �������� �ٷ��. 
 * ex) 1.234 * 10��23�¿��� 1.23(����)�� 23(����)�� ���� �ũ�⸸ŭ �Ҵ��ϴ��Ŀ� ����
 * ���� ǥ�������� ���е�(������ �Ҽ����� float�� 7�ڸ�, double�� 16�ڸ�)�� �����ȴ�.
 * 
 * �Ǽ� ������ �⺻ ���� : float ,double (�������� Ű����)
 * 	   Wrapper Ŭ������ Float, Double
 * 		1.234�� double �����Դϴ�.	
 */
