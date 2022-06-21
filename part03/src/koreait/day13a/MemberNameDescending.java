package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

// Member 객체의 sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자 구현체(Comparator)를 만들어야함.
public class MemberNameDescending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		String age1 = o1.getName();
		String age2 = o2.getName();
		return age2.compareTo(age1);  // 내림차순 : 
		// return o2.getName().compareTo(o1.getName()); 이거로 한줄 가능
	}
	/* 리턴식은 음수값이 나오는 경우를 씁니다. 교환하지 않는 경우를 -1(음수)로 리턴되게 합니다.
	 * 각각 교환하지 않는 경우는 
	 *오름차순 : o1 < o2    	//내림차순 : o1 > o2 
	*/

}
