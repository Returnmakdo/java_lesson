package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
// 작성자 : 안치영
	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------");
		System.out.println("시작합니다.");
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] first = new int[10];
		int[] second = new int[10];
		int[] user = new int[10];
		int correct = 0;
		
		for(int i=0; i<first.length; i++) {
			first[i] = r.nextInt(90)+10;
			second[i] = r.nextInt(90)+10;
			System.out.printf("문제 %d. %d + %d = 답 입력 -> ", i+1, first[i], second[i]);
			user[i] = sc.nextInt();
			if(user[i] == first[i]+second[i])
				correct++;
		}
		System.out.println("----------------------");
		System.out.printf("채점 합니다. 맞은 갯수 %d (%d 점)\n", correct, (correct*10));
		System.out.println("::::: 틀린문제 정답 보기 :::::");
		// for문 만들어서하기...... 틀린문제 정답출력
		for(int i=0; i<first.length; i++) {
			if(user[i] != first[i]+second[i])
			first[i] = r.nextInt(90)+10;
			second[i] = r.nextInt(90)+10;
			System.out.printf("문제 %d. %d + %d = %d -> ", i+1, first[i], second[i], first[i]+second[i]);
		}
	
		}
}
