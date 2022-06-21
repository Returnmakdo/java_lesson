package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		System.out.println("선택기능 >>> 1.단어저장  2.단어검색  3.단어장보기  4.프로그램 끝내기");
//		HashMap<String, String> map = new HashMap<>(); 단어장 저장할 자료구조
		TreeMap<String, String> map = new TreeMap<String, String>();
		// 위에걸 클래스,리스트로 바꿔서 시험문제냈음.
		String choice, eng, kor;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("선택 -> ");
		while(run) {                  // while 반복안에 switch로종료조건 동작시킬때 break;로 못함 -> 변수사용
			choice = sc.nextLine();
			switch(choice) {
				case "1":   // if문으로는 sel.eqauls("1")
					System.out.print("English -> ");
					eng = sc.next();
					System.out.print("Korean -> ");
					kor = sc.next();
					map.put(eng, kor);  // 저장
					break;
				
				case "2":
					System.out.print("검색단어 English ->");
					eng = sc.nextLine();
					System.out.print("단어장 검색했습니다.");
					if(!map.containsKey(eng))
						System.out.println("결과 => null");
					else if(map.containsKey(eng))
						System.out.println("결과 => " + map.get(eng));
					break;
				
				case "3":
					System.out.println("단어장 전체보기 : " + map);
					break;
				
				case "4":
					System.out.println("프로그램을 종료합니다.");
					run = false;
					break;
					
				default:
					System.out.print("선택 -> ");
					break;
			}
		
		}
		sc.close();
		// 참고 : 정수데이터 입력을 받아야한다면 문자열 nextLine()으로 받아서 정수로 변환. 
		// int score = Integer.parseInt(sc.nextLine());
		// 이유 : nextInt()는 엔터를 처리하지 않아서 다음에나오는 nextLine()에게 전달되어 입력흐름에 방해가된다.
	}

}
