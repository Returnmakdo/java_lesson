package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
// �ۼ��� : ��ġ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String best;
		int kor, eng, sci, max;
		double total, average;
		
		System.out.println("[[�������� : ��հ� ���� ���ϱ�]]");
		System.out.println("���� �Է��ϼ���.");
		
		System.out.print("���� ->");
		kor = sc.nextInt();
		System.out.print("���� ->");
		eng = sc.nextInt();
		System.out.print("���� ->");
		sci = sc.nextInt();
		
		System.out.println();
		System.out.println(">>ó���Ǿ����ϴ�.");
		
		total = kor + eng + sci;
		average = total / 3;
		
		if(kor > eng) {
			max = kor;
			best = "����";
		}else {
			max = eng;
			best = "����";
		}
		
		if(max < sci) {
			max = sci;
			best = "����";
		}
		
		System.out.printf("���� : %d", (int)(total));
		System.out.printf("��� : %d (%.2f) , ����� : %d\n", (int)(average), average, 3);
		System.out.printf("�� �л��� Ư������� . %s . �Դϴ�.", best);
		
		sc.close();
		
	}

}
