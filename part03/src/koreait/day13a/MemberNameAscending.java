package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

// Member 객체의 sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자 구현체(Comparator)를 만들어야함.
public class MemberNameAscending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		String age1 = o1.getName();
		String age2 = o2.getName();
		return age1.compareTo(age2);  // 오름차순 : age1<age2 일때 -1을 리턴
		// return o1.getName().compareTo(o2.getName()); 이거로 한줄 가능
	}
	
}
