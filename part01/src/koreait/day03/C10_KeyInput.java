package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {
	public static void main(String[] args) {
		// sc�� �������̴�. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� ���� -> ������ ����
		// new �������� ����� ��ü�� Ŭ�����̸��� ���� �̸����� �������� �մϴ�.
		Scanner sc = new Scanner(System.in);
		
		int data;
		
		System.out.print("������ �Է��ϼ��� -> "); // �Է¾ȳ� �޽���
		data = sc.nextInt();
		
		// ����ڰ� �����Է����� ������ ���� -> ���α׷��Ӱ� ó��
		
		System.out.println("�Էµ� �� : " + data + "�Դϴ�.");
		
		double point;
		System.out.print("�Ǽ��� �Է��ϼ��� -> ");
		point = sc.nextDouble();
		System.out.println("�Էµ� �� : " + point + "�Դϴ�.");
		
		sc.close();
	}

}
/*
 * 	ǥ�� ��� : System.out   (out�� System Ŭ������ ������ �ʵ�)
 *  ǥ�� �Է� : System.in    (in�� System Ŭ������ ������ �ʵ�)
 *            -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 *            -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 *            
 *        * ���� : �⺻��Ű�� java.lang�� import���� ����Ѵ�.
 * 
 */
