package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {

	public static void main(String[] args) {
		// 위에걸 클래스,리스트로 바꿔서 시험문제냈음.
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>(); // TreeMap을 List로 바꿔서
		
		String choice, eng, kor;
		int level;
		System.out.println("선택기능 >>> 1.단어저장  2.단어검색  3.전체보기  4. 레벨로 검색 5.프로그램 끝내기");
		boolean run = true;
		
		while(run) {                  // while 반복안에 switch로종료조건 동작시킬때 break;로 못함 -> 변수사용
			System.out.print("선택 -> ");
			choice = sc.nextLine();
			switch(choice) {
				case "1":   // if문으로는 sel.eqauls("1")
					System.out.print("English -> ");
					eng = sc.nextLine();
					System.out.print("Korean -> ");
					kor = sc.nextLine();
					System.out.print("레벨 -> ");
					level = Integer.parseInt(sc.nextLine());
					Word temp = new Word(eng,kor); // 저장
					temp.setLevel(level);
					mywords.add(temp);
					//생성자 3개만들어서 해도됨
					break;
				
				case "2":
					System.out.print("검색단어 English ->");
					eng = sc.nextLine();
					for(Word w : mywords)
						if(w.getEnglish().equals(eng))
					System.out.print("단어장 검색했습니다. 결과 => " + w);
					break;
				
				case "3":
					System.out.println("단어장 전체보기 : " + mywords);
					all(mywords); // 정렬하고 출력하기
					break;
					
				case "4":
					System.out.println("검색할 레벨 입력(1~3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords, no);
					break;
				
				case "5":
					System.out.println("프로그램을 종료합니다.");
					run = false;
					break;
					
				default:
					System.out.print("선택 -> ");
					break;
			}
		
		}
		sc.close();
	}

	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)  // for-each문 연습하기
			if(w.getLevel()==no)
				System.out.println(w);
	}

	private static void all(List<Word> mywords) { // mywords 의 참조값을 전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		System.out.println(String.format("%-20s %-20s\t %-40s", "English", "Korean", "Level"));
		System.out.println("-------------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %-40s", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
	}
	
	
}
