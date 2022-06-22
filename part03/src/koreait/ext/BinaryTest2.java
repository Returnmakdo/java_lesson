package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {
		
		int n10 = 123;
		int n16 = 0xa41c;   // 16진수 표기 0x로 시작
		int n2 = 0b1010010000011100;  // 2진수표기  0b로시작
		
		System.out.println("1. 변수를 그대로 출력");
		System.out.println("10진수 리터럴 " + n10);
		System.out.println("16진수 리터럴 " + n16);
		System.out.println("2진수리터럴 " + n2);
		
		System.out.println("2. format 지정하여 16진수 출력");
		System.out.println(String.format("16진수 리터럴 0xa41c : %x", n16)); // 16진수 형식 %x
		System.out.println(String.format("2진수 리터럴 0b1010010000011100 : %x", n2)); 
		System.out.println(String.format("10진수 리터럴 42012 : %x", n2)); 
		// 결론 : 10진수 42012, n16과 n2변수값이 메모리에 저장될 때는 모두동일한 0,1 표현값이다.
		
		System.out.println("3. -1의 2진수, 16진수 표현 확인");
		System.out.printf("%x\n", -1);
		System.out.println("2진수 : " + Integer.toBinaryString(-1));
		
		
		System.out.println("4. 입력한 2진수 또는 16진수값을 10진수로 바꾸기");
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 값 입력 >>> ");
		String t2 = sc.nextLine();
		System.out.print("16진수 값 입력 >>> ");
		String t16 = sc.nextLine();
		// 원래는 Integer.parseInt(s)이 형식이었고 s문자열이 10진수 표현이라는 의미입니다.
		System.out.println(String.format("2진수 %s 는 10진수 %d 입니다.", t2, Integer.parseInt(t2, 2)));
		System.out.println(String.format("16진수 %s 는 10진수 %d 입니다.", t16, Integer.parseInt(t16, 16)));
		                                   // 음수는 -기호써서 절대값 넘지않는 범위에서 문자열 입력
		                                   // 최대 음수 입력값은 -7ffffffff
		
		/*
		 * 요약
		 * n은 2(Binary), 8(Octal), 16(hex) 가능합니다.
		 * n진법 문자열 -> 10진 정수값 변환 Integer.parseInt(문자열, n)
		 * 10진 정수값 -> n진법 문자열 Integer.toBinaryString메소드, toHexString 메소드
		 * 
		 * format 에서 %d는 10진수, %x는 16진수, %o는 8진수, 참고로 2진수는 포맷형식 없다.
		 */
		
	}

}
