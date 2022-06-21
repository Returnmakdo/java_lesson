package koreait.day12;

import java.util.HashMap;

public class C50_HashMap {

	public static void main(String[] args) {
		
		//식당의 메뉴판(메뉴이름, 가격) 데이터를 저장하려한다.
		String[] title = {"스파게티", "스테이크", "샐러드"};
		int[] price = {12000, 22000, 7000};
		
		// key는 메뉴이름, value는 가격으로하는 hashmap선언
		// key는 중복된 값으로 사용 못합니다.(유일한 값)
		HashMap<String,Integer> menus = new HashMap<>();
		
		//데이터 저장 : put() 메소드
		menus.put("스파게티", 12000);
		menus.put("스테이크", 22000);
		menus.put("샐러드", 7000);
		
		System.out.println("1. 저장된 데이터 출력");
		System.out.println(menus);
		
		//데이터 접근(읽기) : get() 메소드
		System.out.println("2. 특정한 key값의 value 출력");
		System.out.println("'스파게티의 가격?'" + menus.get("스파게티") );
		System.out.println("'스테이크 가격?'" + menus.get("스테이크") );
		System.out.println("'샐러드 가격?'" + menus.get("샐러드") );
		
		// key값 중복되면?
		menus.put("샐러드", 8200);
		System.out.println(menus);
		
		// 데이터삭제 : remove() 메소드
		System.out.println("3. 특정요소 삭제");
		menus.remove("스테이크");
		System.out.println("삭제 결과 확인 : " + menus);
//		menus.remove("샐러드", 6000);  둘다 맞아야 삭제
		menus.remove("샐러드", 8200);
		System.out.println("삭제 결과 확인 : " + menus);
	}

}
/*	ArrayList : 순차적(인덱스로 접근) 으로 데이터를 관리하는 자료구조입니다.배열과 유사한 구조입니다.
	HashMap : 	순차적인 구조가 아닙니다. 인덱스를 사용하지 앖고 Key 값을 이용하여 데이터접근하여 저장/읽기 합니다.
				*검색*이 많은 알고리즘에 유용합니다. 제너릭 타입은 K:Key , V:Value 한쌍입니다.
				Key와 value는 모든 타입이 가능합니다. hashmap에서는 key,value 한쌍으로 요소
 	HashMap도 ArrayList 와 마찬가지로 int,long,double 기본형 타입 대신에 래퍼(wrapper)클래스로 표기합니다.
*/
