package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedPenExam {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------");
		System.out.println("�����մϴ�.");
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		int[] first = new int[size];
		int[] second = new int[size];
		int[] user = new int[size];
		int correct = 0;
		
		for(int i=0; i<first.length; i++) {
			first[i] = r.nextInt(89)+11;
			second[i] = r.nextInt(89)+11;
			System.out.printf("���� %d. %d + %d = �� �Է� -> ", i+1, first[i], second[i]);
			user[i] = sc.nextInt();
			if(user[i] == first[i]+second[i]) {
				correct++;
			}
		}
		System.out.println("----------------------");
		System.out.println("ä�� �մϴ�. ���� ����" + correct + " ( " + correct*100/size + "��)");
		System.out.println("::::: Ʋ������ ���� ���� :::::");
		// for�� �����ϱ�...... Ʋ������ �������
		for(int i=0; i<first.length; i++) {
			if(user[i] != first[i]+second[i])
			System.out.println(String.format("���� %d. %d + %d = %d", i+1, first[i], second[i], first[i]+second[i]));
		}
		sc.close();
	
	}

}
