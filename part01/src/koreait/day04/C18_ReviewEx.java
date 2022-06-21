package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
// 작성자 : 안치영
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String best;
		int kor, eng, sci, max;
		double total, average;
		
		System.out.println("[[성적집계 : 평균과 총점 구하기]]");
		System.out.println("성적 입력하세요.");
		
		System.out.print("국어 ->");
		kor = sc.nextInt();
		System.out.print("영어 ->");
		eng = sc.nextInt();
		System.out.print("과학 ->");
		sci = sc.nextInt();
		
		System.out.println();
		System.out.println(">>처리되었습니다.");
		
		total = kor + eng + sci;
		average = total / 3;
		
		if(kor > eng) {
			max = kor;
			best = "국어";
		}else {
			max = eng;
			best = "영어";
		}
		
		if(max < sci) {
			max = sci;
			best = "과학";
		}
		
		System.out.printf("총점 : %d", (int)(total));
		System.out.printf("평균 : %d (%.2f) , 과목수 : %d\n", (int)(average), average, 3);
		System.out.printf("이 학생의 특기과목은 . %s . 입니다.", best);
		
		sc.close();
		
	}

}
