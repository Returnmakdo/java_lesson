package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
// �ۼ��� : ��ġ��
	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------");
		System.out.println("�����մϴ�.");
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] first = new int[10];
		int[] second = new int[10];
		int[] user = new int[10];
		int correct = 0;
		
		for(int i=0; i<first.length; i++) {
			first[i] = r.nextInt(90)+10;
			second[i] = r.nextInt(90)+10;
			System.out.printf("���� %d. %d + %d = �� �Է� -> ", i+1, first[i], second[i]);
			user[i] = sc.nextInt();
			if(user[i] == first[i]+second[i])
				correct++;
		}
		System.out.println("----------------------");
		System.out.printf("ä�� �մϴ�. ���� ���� %d (%d ��)\n", correct, (correct*10));
		System.out.println("::::: Ʋ������ ���� ���� :::::");
		// for�� �����ϱ�...... Ʋ������ �������
		for(int i=0; i<first.length; i++) {
			if(user[i] != first[i]+second[i])
			first[i] = r.nextInt(90)+10;
			second[i] = r.nextInt(90)+10;
			System.out.printf("���� %d. %d + %d = %d -> ", i+1, first[i], second[i], first[i]+second[i]);
		}
	
		}
}
