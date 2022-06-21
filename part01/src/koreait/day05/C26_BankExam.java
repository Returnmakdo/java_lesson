package koreait.day05;

import java.util.Scanner;

// GUI : Graphic User Interface (사용자명령을 아이콘, 메뉴방식으로 처리하는것)
// CLI : Command Line Interface (사용자 명령을 텍스트로만 처리)
public class C26_BankExam {
    // CLI 방식의 메뉴선택을 while문으로 연습
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sel;
		int balance = 0;
		
		while(run) {
			int money;
			System.out.println("---------------------------------");
			System.out.println("1: 예금 | 2: 출금 | 3: 잔고확인 | 4: 종료");
			System.out.println("---------------------------------");
			System.out.print("메뉴선택 >>> ");
			sel = sc.nextInt();
			
			switch(sel) {
			      case 1:
			    	  System.out.print("예금액 > ");
			    	  money = sc.nextInt();
			    	  balance += money;
			    	  System.out.println("고객님의 잔액은 " + balance + "원입니다");
			    	  break;
			      case 2:
			    	  System.out.print("출금 금액 입력 > ");
			    	  money = sc.nextInt();
			    	  if(money > balance)
			    		  System.out.print("잔액이 부족합니다.");
			    	  else
			    		  balance -= money;
			    	  System.out.println("고객님의 잔액은 " + balance + "원입니다");
			    	  break;
			      case 3:
			    	  System.out.print("현재 잔고 : " + balance);
			    	  System.out.println();
			    	  break;
			      case 4:
			    	  System.out.println("프로그램을 종료합니다."); 
			    	  run = false;
			    	  break;
			      default:
			    	  System.out.println("잘못된 선택입니다. 값은 1~4만 입력하세요");
			    
			}
			
		
		}
		
		System.out.println("**** END ****");
		sc.close();
	}

}
