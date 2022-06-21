package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[영화감상 후기]]");
		System.out.println("평점을 몇 점 주시겠습니까?(1~5) >>> ");
		int count = sc.nextInt();
		
		System.out.println("방법 1");
		for (int i = 0; i < count; i++) {
			System.out.print("★");
		}
		
		System.out.println("\n\n방법 2"); // 5-count
		for (int i = 0; i < count; i++)
			System.out.print("★");
		for (int i = 0; i < (5 - count); i++)
			System.out.print("☆");
		
		System.out.println("\n\n방법 2_");
		for (int i = 0; i < 5; i++)
			if(i<count)
				System.out.print("★");
			else
				System.out.print("☆");
		
		System.out.println("\n\n방법 2__");
		int k = 0;            // loop counter 변수가 main메소드의 지역변수
		for(k=0; k<count; k++)
			System.out.print("★");
		
//		System.out.println("k=" +k); // k=3 , ㅟ의 for문이 종료가되는 k값
		for(;k<5; k++)               // k의 값은 얼마부터 시작하는걸까요. k는 count부터
			System.out.print("☆");
		sc.close();
		
	}

}
