package koreait.day02;
// ��ġ��
public class C08_Test {
	public static void main(String[] args) {
		System.out.println("-----�簢�� ������ ���� ���ϱ�-----");
		
		int width = 23;
		int height = 19;
		System.out.println("���� : " + width + "��");
		System.out.println("���� : " + height + "��");
		System.out.println("���̸� ���߽��ϴ� : " + (width*height) + "��");
		
		System.out.println("============================");
		
		System.out.println("-----�� ������ ���̿� �ѷ� ���ϱ�-----");
		
		double half = 23.230;
		double round = 2 * 3.14 * half;
		double area = 3.14 * half * half;
		System.out.printf("������ : %.3f�� \n", half);
		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f�� \n", round);
		System.out.printf("���̸� ���߽��ϴ� : %.3f�� \n",area);
		
		// final �׽�Ʈ
		// �������� �տ� final Ű���带 ���̸� ���� �������� ���Ѵ�.
		
		final int test = 123;   // ���� ���� ���ϴ� ��� static�̾�� �ݸ� ����� ���߿� Ŭ�����Ҷ� �Ұ�
		System.out.println(test);
//		test = 456;
		final double PI = 3.14;
	}

}
