package koreait.day03;
// ��ġ��
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� Ǭ Ǯ��
//		int n1, n2, n3;
//		
//		System.out.print("n1 �� �Է� : ");
//		n1 = sc.nextInt();
//		System.out.print("n2 �� �Է� : ");
//		n2 = sc.nextInt();
//		System.out.print("n3 �� �Է� : ");
//		n3 = sc.nextInt();
//		
//		int max = n1;
//		if(n2 > max)
//			max = n2;
//		if(n3 > max)
//			max = n3;
//		
//		System.out.println("�ִ밪�� : " + max);
//		
//		sc.close();
		
		
 		int n1, n2, n3, max, min;
		
		System.out.print("n1 �� �Է� : ");
		n1 = sc.nextInt();
		System.out.print("n2 �� �Է� : ");
		n2 = sc.nextInt();
		System.out.print("n3 �� �Է� : ");
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
		
		System.out.println("�ִ밪 : " + max + " , �ּҰ��� : " + min);
		
		sc.close();
	}

}
