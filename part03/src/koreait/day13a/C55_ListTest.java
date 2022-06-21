package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;

public class C55_ListTest {
// sort와 관련된 인터페이스 사용
	
	public static void main(String[] args) {
		// List는 인터페이스, ArrayList는 구현체
		// 다형성 : List를 참조타입으로 하여 선언한다. 앞으로 배울 라이브러리들이 List타입으로 원합니다.
		
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort 이전 : " + ilist);
		// 정렬 : 오름차순
		ilist.sort(null);   // 인자로 필요한것은 비교자 Comparator 구현체 필요하다.
		                    // 기본형,String은 null로 할 수 있다.(오름차순 기본)
		System.out.println("sort 이후 : " + ilist);
		// 정렬 : 내림차순 ( static 메소드 )
		ilist.sort(Comparator.reverseOrder());
		System.out.println("내림차순 sort : " + ilist);
		
		slist.add("트와이스");
		slist.add("오마이걸");
		slist.add("아이즈원");
		slist.add("비비즈");
		slist.add("소녀시대");
		slist.add("브레이브걸스");
		System.out.println("sort 이전 : " + slist);
		
		slist.sort(null);
		System.out.println("sort 이후(ASCEending) : " + slist);
		
		slist.sort(Comparator.reverseOrder());
		System.out.println("내림차순 sort(DESCending) : " + slist);
		
		List<Member> mlist = new ArrayList<>();
		
		mlist.add(new Member("momo", 23));
		mlist.add(new Member("nana", 27));
		mlist.add(new Member("nayeon", 25));
		mlist.add(new Member("dahyun", 29));
		mlist.add(new Member("sooni", 26));
		mlist.add(new Member("jenny", 27));
		
		System.out.println("member 리스트 상태 : " + mlist);
//		mlist.sort(null);  오류 : Member 객체는 비교할수 없는 객체 -> 비교자 인터페이스를 인자로 해야함.
// 		member 객체의 sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자 구현체(Comparator)를 만들어야함.
		
		mlist.sort(new MemberNameAscending());
		System.out.println("member sort 확인(ASCE) : " + mlist);
		
		mlist.sort(new MemberNameDescending());
		System.out.println("member sort 확인(DESC) : " + mlist);
		
	}

}
