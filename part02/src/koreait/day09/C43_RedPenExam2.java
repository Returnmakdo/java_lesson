package koreait.day09;

import java.util.Random;
import java.util.Scanner;

// C42���� MathProblem Ŭ������ ����ϴ� ������ �ٲٱ� : ������ ��������
public class C43_RedPenExam2 {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------");
		System.out.println("�����մϴ�.");
		
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int max_size = MathProblem.max_size;   //size�������� max_size �ʰ��ϴ��� �˻� �߰�
		
		MathProblem[] problems = new MathProblem[size];
		// ��� ���� �����ϴ� �迭
		
		// �迭�� Ÿ���� MathProblem ��ü������ : n1,n2,op,isCorrect
		
		int[] user = new int[size];
		int correct = 0;
		
		for(int i=0; i<size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();         // n1, n2 ���� ��ü�� �ʵ�� ��������
//			System.out.printf("���� %d. %d + %d = �� �Է� -> ", i+1, temp.getN1(), temp.getN2());
			System.out.print("���� "+(i+1)+".  " + temp.problem() + "�� �Է� -> ");  //Ŭ�������� �޼ҵ� Ȱ��
			user[i] = sc.nextInt();
			if(user[i] == temp.showAnswer()) {  // ����� ��
				correct++;
				temp.setCorrect(true);
			}
			problems[i] = temp;
		}
		System.out.println("----------------------");
		System.out.println("ä�� �մϴ�. ���� ����" + correct + " ( " + correct*100/size + "��)");
		System.out.println("::::: Ʋ������ ���� ���� :::::");
		// for�� �����ϱ�...... Ʋ������ �������
//		for(int i=0; i<problems.length; i++) {
//			if(!problems[i].isCorrect()) {
//				System.out.println("���� "+(i+1)+".  " + problems[i].problem() + problems[i].showAnswer());
//			}
//		} ���� for������ ����i+1�κ� ����� ���ϸ� i�ǰ��� ������� �ʱ⿡  �Ʒ��� for each ��ó�� ���ִ°� �� ������ 
		for(MathProblem temp : problems) {
			if(!temp.isCorrect()) {
				System.out.println(temp.problem() + temp.showAnswer());
			}
		}
		sc.close();
	
	}
	// �߰� : ����ڰ� �Է��� user�� �����ؼ� ���� ��½� ���� �����ְ� �ʹٸ�?
	// Ŭ������ user�ʵ� �߰��ؼ� ����ڰ� �Է��� �� ������ ���� �ִ�.

}
