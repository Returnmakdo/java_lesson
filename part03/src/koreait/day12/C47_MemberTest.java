package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		
		// Member[] members = new Member[10];
		ArrayList<Member> list = new ArrayList<>(); //리스트에 저장되는 것은 객체의 참조값
		
		list.add(new Member("모모", 27)); // 새로운객체 생성하고 참조값을 리스트에 추가
		Member member = new Member("다현", 26);
		list.add(member);
		list.add(new Member("나나", 20));
		list.add(new Member("신비", 22));		
		System.out.println("현재 list의 요소 개수 : " + list.size());
		System.out.println("1.리스트 출력");
		System.out.println(list);
		
		// list.get(i) -> Member객체의 참조값
		System.out.println("2.list의 요소 중 참조객체 age의 필드값이 25이하인것만 출력해보기");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAge() <= 25)
				System.out.println("i = " + i + "," + list.get(i));
		}
		
		System.out.println("3.나나는 몇번 인덱스에서 참조하고 있는 객체 인가?");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("나나"))
				System.out.println("나나의 인덱스는 : " + i);
		}
		
		// 리스트의 요소가 여러개의 필드를 갖는 객체일 때 필드값을 비교하는 equals예제입니다.
		System.out.println("4. 참고");
		// indexOf 메소드는 제너릭타입이 String, 기본형래퍼클래스만 추가적인 기능 구현 없이 사용가능
		System.out.println("Member객체로 indexOf 실행 : " + list.indexOf(new Member("신비", 22)));  
		// -1 못찾음 (이유는 참조값이 같은것을 찾는것인데 이것을 필드값 비교해서 찾도록 바꿔주는 작업이 필요)
		System.out.println("Member객체로 indexOf 실행 : " + list.indexOf(member)); // 1
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("나나") && list.get(i).getAge() == 20)
				System.out.println("나나의 인덱스는 : " + i);
		}
	}

}
