package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {
		
		int n10 = 123;
		int n16 = 0xa41c;   // 16���� ǥ�� 0x�� ����
		int n2 = 0b1010010000011100;  // 2����ǥ��  0b�ν���
		
		System.out.println("1. ������ �״�� ���");
		System.out.println("10���� ���ͷ� " + n10);
		System.out.println("16���� ���ͷ� " + n16);
		System.out.println("2�������ͷ� " + n2);
		
		System.out.println("2. format �����Ͽ� 16���� ���");
		System.out.println(String.format("16���� ���ͷ� 0xa41c : %x", n16)); // 16���� ���� %x
		System.out.println(String.format("2���� ���ͷ� 0b1010010000011100 : %x", n2)); 
		System.out.println(String.format("10���� ���ͷ� 42012 : %x", n2)); 
		// ��� : 10���� 42012, n16�� n2�������� �޸𸮿� ����� ���� ��ε����� 0,1 ǥ�����̴�.
		
		System.out.println("3. -1�� 2����, 16���� ǥ�� Ȯ��");
		System.out.printf("%x\n", -1);
		System.out.println("2���� : " + Integer.toBinaryString(-1));
		
		
		System.out.println("4. �Է��� 2���� �Ǵ� 16�������� 10������ �ٲٱ�");
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� �� �Է� >>> ");
		String t2 = sc.nextLine();
		System.out.print("16���� �� �Է� >>> ");
		String t16 = sc.nextLine();
		// ������ Integer.parseInt(s)�� �����̾��� s���ڿ��� 10���� ǥ���̶�� �ǹ��Դϴ�.
		System.out.println(String.format("2���� %s �� 10���� %d �Դϴ�.", t2, Integer.parseInt(t2, 2)));
		System.out.println(String.format("16���� %s �� 10���� %d �Դϴ�.", t16, Integer.parseInt(t16, 16)));
		                                   // ������ -��ȣ�Ἥ ���밪 �����ʴ� �������� ���ڿ� �Է�
		                                   // �ִ� ���� �Է°��� -7ffffffff
		
		/*
		 * ���
		 * n�� 2(Binary), 8(Octal), 16(hex) �����մϴ�.
		 * n���� ���ڿ� -> 10�� ������ ��ȯ Integer.parseInt(���ڿ�, n)
		 * 10�� ������ -> n���� ���ڿ� Integer.toBinaryString�޼ҵ�, toHexString �޼ҵ�
		 * 
		 * format ���� %d�� 10����, %x�� 16����, %o�� 8����, ����� 2������ �������� ����.
		 */
		
	}

}
