package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
	public static void main(String[] args) {
		
		/*  구글 이메일 계정을 체크하는 기능 구현 
		 *  1. @ 기호가 1개 포함되어야 합니다.	(메시지 : 이메일 형식이 아닙니다.)
		 *  2. 1번이 참일 때 @ 뒤에는 gmail.com 이어야 합니다. (메시지 : 도메인 이름이 틀립니다.)
		 *  3. 2번이 참일 떄 @ 앞까지의 문자열(계정이름)만 추출합니다.
		 *  4. 3번의 계정이름은 6글자 이상이어야 합니다.
		 *  5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다. 
		 *   
		 */

		// 작성자 안치영
		
		Scanner sc = new Scanner(System.in);
		String email, account, domain;
		boolean isValid = true;
		
		System.out.print("사용할 이메일 입력하세요. >>>");
		email = sc.nextLine();  // 키보드 입력을 문자열로 받는다.
		
		int idx = email.indexOf("@");
	
// 처리조건 1,2,4,5에 해당되지 않으면 메시지 출력하고 isValid변수를  false로 합니다.
		if(!(idx == email.lastIndexOf("@")) || idx == -1) {
			isValid = false;
			System.out.println("이메일 형식이 아닙니다. @기호를 1개 포함해주세요");
		}else if(!(email.substring(idx + 1, email.length()).equals("gmail.com"))) {
			isValid = false;
			System.out.println("도메인 이름이 틀립니다. gmail.com으로 입력해주세요");
		}else if(email.substring(0, idx).length() < 6) {
			isValid = false;
			System.out.println("이메일 제외 아이디는 6자리 이상 입력해주세요.");
		}else if(!(email.substring(0, idx).indexOf('$') == -1 && email.substring(0, idx).indexOf('%') == -1)) {
			isValid = false;
			System.out.println("특수문자 $,%는 허용하지 않습니다.");
		}else {
		    System.out.println(isValid);
		    System.out.println("회원가입 가능한 계정입니다.");
		}
		sc.close();
		
	}

}
