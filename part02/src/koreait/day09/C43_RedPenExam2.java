package koreait.day09;

import java.util.Random;
import java.util.Scanner;

// C42번을 MathProblem 클래스를 사용하는 거으로 바꾸기 : 연산은 덧셈으로
public class C43_RedPenExam2 {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------");
		System.out.println("시작합니다.");
		
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int max_size = MathProblem.max_size;   //size변수값이 max_size 초과하는지 검사 추가
		
		MathProblem[] problems = new MathProblem[size];
		// 모든 문제 저장하는 배열
		
		// 배열의 타입은 MathProblem 객체참조형 : n1,n2,op,isCorrect
		
		int[] user = new int[size];
		int correct = 0;
		
		for(int i=0; i<size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();         // n1, n2 값이 객체의 필드로 난수생성
//			System.out.printf("문제 %d. %d + %d = 답 입력 -> ", i+1, temp.getN1(), temp.getN2());
			System.out.print("문제 "+(i+1)+".  " + temp.problem() + "답 입력 -> ");  //클래스안의 메소드 활용
			user[i] = sc.nextInt();
			if(user[i] == temp.showAnswer()) {  // 정답과 비교
				correct++;
				temp.setCorrect(true);
			}
			problems[i] = temp;
		}
		System.out.println("----------------------");
		System.out.println("채점 합니다. 맞은 갯수" + correct + " ( " + correct*100/size + "점)");
		System.out.println("::::: 틀린문제 정답 보기 :::::");
		// for문 만들어서하기...... 틀린문제 정답출력
//		for(int i=0; i<problems.length; i++) {
//			if(!problems[i].isCorrect()) {
//				System.out.println("문제 "+(i+1)+".  " + problems[i].problem() + problems[i].showAnswer());
//			}
//		} 위의 for문에서 문제i+1부분 출력을 안하면 i의값을 사용하지 않기에  아래에 for each 문처럼 해주는게 더 빠르다 
		for(MathProblem temp : problems) {
			if(!temp.isCorrect()) {
				System.out.println(temp.problem() + temp.showAnswer());
			}
		}
		sc.close();
	
	}
	// 추가 : 사용자가 입력한 user를 저장해서 오답 출력시 같이 보여주고 싶다면?
	// 클래스에 user필드 추가해서 사용자가 입력한 답 저장할 수도 있다.

}
