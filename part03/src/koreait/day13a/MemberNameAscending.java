package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

// Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ���� ����ü(Comparator)�� ��������.
public class MemberNameAscending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		String age1 = o1.getName();
		String age2 = o2.getName();
		return age1.compareTo(age2);  // �������� : age1<age2 �϶� -1�� ����
		// return o1.getName().compareTo(o2.getName()); �̰ŷ� ���� ����
	}
	
}
