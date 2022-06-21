package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
	public static void main(String[] args) {
		
		/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
		 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
		 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
		 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
		 *   
		 */

		// �ۼ��� ��ġ��
		
		Scanner sc = new Scanner(System.in);
		String email, account, domain;
		boolean isValid = true;
		
		System.out.print("����� �̸��� �Է��ϼ���. >>>");
		email = sc.nextLine();  // Ű���� �Է��� ���ڿ��� �޴´�.
		
		int idx = email.indexOf("@");
	
// ó������ 1,2,4,5�� �ش���� ������ �޽��� ����ϰ� isValid������  false�� �մϴ�.
		if(!(idx == email.lastIndexOf("@")) || idx == -1) {
			isValid = false;
			System.out.println("�̸��� ������ �ƴմϴ�. @��ȣ�� 1�� �������ּ���");
		}else if(!(email.substring(idx + 1, email.length()).equals("gmail.com"))) {
			isValid = false;
			System.out.println("������ �̸��� Ʋ���ϴ�. gmail.com���� �Է����ּ���");
		}else if(email.substring(0, idx).length() < 6) {
			isValid = false;
			System.out.println("�̸��� ���� ���̵�� 6�ڸ� �̻� �Է����ּ���.");
		}else if(!(email.substring(0, idx).indexOf('$') == -1 && email.substring(0, idx).indexOf('%') == -1)) {
			isValid = false;
			System.out.println("Ư������ $,%�� ������� �ʽ��ϴ�.");
		}else {
		    System.out.println(isValid);
		    System.out.println("ȸ������ ������ �����Դϴ�.");
		}
		sc.close();
		
	}

}
