package koreait.day03;

import java.util.Scanner;

// ��ġ��
public class C08_KeyInputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----�簢�� ������ ���� ���ϱ�-----");
		
		System.out.print("���α��� �Է� : ");
		int width = sc.nextInt();
		
		System.out.print("���α��� �Է� : ");
		int height = sc.nextInt();
		
		int box_area = width * height;
		
		System.out.println("���� : " + width + "��");
		System.out.println("���� : " + height + "��");
		System.out.println("���̸� ���߽��ϴ� : " + box_area + "��");
		
		System.out.println("============================");
		
		System.out.println("-----�� ������ ���̿� �ѷ� ���ϱ�-----");
		
		System.out.print("���������� �Է� : ");
		double half = sc.nextDouble();
		final double PI = 3.14;
		
		double round = 2 * PI * half;
		double area = PI * half * half;
		System.out.printf("������ : %.3f�� \n", half);
		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f�� \n", round);
		System.out.printf("���̸� ���߽��ϴ� : %.3f�� \n",area);
		
		// final �׽�Ʈ
		// �������� �տ� final Ű���带 ���̸� ���� �������� ���Ѵ�.
		
//		final int test = 123;   // ���� ���� ���ϴ� ��� static�̾�� �ݸ� ����� ���߿� Ŭ�����Ҷ� �Ұ�
//		System.out.println(test);
//		test = 456;
		sc.close();
	}

}
