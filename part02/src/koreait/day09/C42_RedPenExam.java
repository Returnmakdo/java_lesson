package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedPenExam {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------");
		System.out.println("시작합니다.");
		
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
			System.out.printf("문제 %d. %d + %d = 답 입력 -> ", i+1, first[i], second[i]);
			user[i] = sc.nextInt();
			if(user[i] == first[i]+second[i]) {
				correct++;
			}
		}
		System.out.println("----------------------");
		System.out.println("채점 합니다. 맞은 갯수" + correct + " ( " + correct*100/size + "점)");
		System.out.println("::::: 틀린문제 정답 보기 :::::");
		// for문 만들어서하기...... 틀린문제 정답출력
		for(int i=0; i<first.length; i++) {
			if(user[i] != first[i]+second[i])
			System.out.println(String.format("문제 %d. %d + %d = %d", i+1, first[i], second[i], first[i]+second[i]));
		}
		sc.close();
	
	}

}
