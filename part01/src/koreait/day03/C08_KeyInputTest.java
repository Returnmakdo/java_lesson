package koreait.day03;

import java.util.Scanner;

// 안치영
public class C08_KeyInputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----사각형 도형의 넓이 구하기-----");
		
		System.out.print("가로길이 입력 : ");
		int width = sc.nextInt();
		
		System.out.print("세로길이 입력 : ");
		int height = sc.nextInt();
		
		int box_area = width * height;
		
		System.out.println("가로 : " + width + "㎝");
		System.out.println("세로 : " + height + "㎝");
		System.out.println("넓이를 구했습니다 : " + box_area + "㎠");
		
		System.out.println("============================");
		
		System.out.println("-----원 도형의 넓이와 둘레 구하기-----");
		
		System.out.print("반지름길이 입력 : ");
		double half = sc.nextDouble();
		final double PI = 3.14;
		
		double round = 2 * PI * half;
		double area = PI * half * half;
		System.out.printf("반지름 : %.3f㎝ \n", half);
		System.out.printf("둘레를 구했습니다 : %.3f㎠ \n", round);
		System.out.printf("넓이를 구했습니다 : %.3f㎠ \n",area);
		
		// final 테스트
		// 변수선언 앞에 final 키워드를 붙이면 값을 변경하지 못한다.
		
//		final int test = 123;   // 값을 변경 못하는 상수 static이없어서 반만 상수임 나중에 클래스할때 할거
//		System.out.println(test);
//		test = 456;
		sc.close();
	}

}
