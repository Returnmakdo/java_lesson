package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {
	public static void main(String[] args) {
		// sc는 변수명이다. 기본형 변수가 아닌 클래스 타입의 변수 -> 참조형 변수
		// new 연산으로 만드는 객체의 클래스이름과 같은 이름으로 변수선언 합니다.
		Scanner sc = new Scanner(System.in);
		
		int data;
		
		System.out.print("정수값 입력하세요 -> "); // 입력안내 메시지
		data = sc.nextInt();
		
		// 사용자가 숫자입력하지 않으면 오류 -> 프로그래머가 처리
		
		System.out.println("입력된 값 : " + data + "입니다.");
		
		double point;
		System.out.print("실수값 입력하세요 -> ");
		point = sc.nextDouble();
		System.out.println("입력된 값 : " + point + "입니다.");
		
		sc.close();
	}

}
/*
 * 	표준 출력 : System.out   (out은 System 클래스의 정적인 필드)
 *  표준 입력 : System.in    (in은 System 클래스의 정적인 필드)
 *            -> Scanner 클래스를 이용해서 입력값을 특정 기본형식으로 변환시켜는 기능 사용.
 *            -> 기본 패키지의 클래스가  아니므로 import 가 필요합니다.	
 *            
 *        * 참고 : 기본패키지 java.lang은 import없이 사용한다.
 * 
 */
