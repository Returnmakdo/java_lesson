package koreait.day03;
// 안치영
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 내가 푼 풀이
//		int n1, n2, n3;
//		
//		System.out.print("n1 값 입력 : ");
//		n1 = sc.nextInt();
//		System.out.print("n2 값 입력 : ");
//		n2 = sc.nextInt();
//		System.out.print("n3 값 입력 : ");
//		n3 = sc.nextInt();
//		
//		int max = n1;
//		if(n2 > max)
//			max = n2;
//		if(n3 > max)
//			max = n3;
//		
//		System.out.println("최대값은 : " + max);
//		
//		sc.close();
		
		
 		int n1, n2, n3, max, min;
		
		System.out.print("n1 값 입력 : ");
		n1 = sc.nextInt();
		System.out.print("n2 값 입력 : ");
		n2 = sc.nextInt();
		System.out.print("n3 값 입력 : ");
		n3 = sc.nextInt();
		
		if(n1> n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		}
		
		if(max < n3)
			max = n3;
		if(min > n3)
			min = n3;
		
		System.out.println("최대값 : " + max + " , 최소값은 : " + min);
		
		sc.close();
	}

}
