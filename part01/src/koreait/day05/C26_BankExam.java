package koreait.day05;

import java.util.Scanner;

// GUI : Graphic User Interface (����ڸ���� ������, �޴�������� ó���ϴ°�)
// CLI : Command Line Interface (����� ����� �ؽ�Ʈ�θ� ó��)
public class C26_BankExam {
    // CLI ����� �޴������� while������ ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sel;
		int balance = 0;
		
		while(run) {
			int money;
			System.out.println("---------------------------------");
			System.out.println("1: ���� | 2: ��� | 3: �ܰ�Ȯ�� | 4: ����");
			System.out.println("---------------------------------");
			System.out.print("�޴����� >>> ");
			sel = sc.nextInt();
			
			switch(sel) {
			      case 1:
			    	  System.out.print("���ݾ� > ");
			    	  money = sc.nextInt();
			    	  balance += money;
			    	  System.out.println("������ �ܾ��� " + balance + "���Դϴ�");
			    	  break;
			      case 2:
			    	  System.out.print("��� �ݾ� �Է� > ");
			    	  money = sc.nextInt();
			    	  if(money > balance)
			    		  System.out.print("�ܾ��� �����մϴ�.");
			    	  else
			    		  balance -= money;
			    	  System.out.println("������ �ܾ��� " + balance + "���Դϴ�");
			    	  break;
			      case 3:
			    	  System.out.print("���� �ܰ� : " + balance);
			    	  System.out.println();
			    	  break;
			      case 4:
			    	  System.out.println("���α׷��� �����մϴ�."); 
			    	  run = false;
			    	  break;
			      default:
			    	  System.out.println("�߸��� �����Դϴ�. ���� 1~4�� �Է��ϼ���");
			    
			}
			
		
		}
		
		System.out.println("**** END ****");
		sc.close();
	}

}
