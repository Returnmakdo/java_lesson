package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

// Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ���� ����ü(Comparator)�� ��������.
public class MemberNameDescending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		String age1 = o1.getName();
		String age2 = o2.getName();
		return age2.compareTo(age1);  // �������� : 
		// return o2.getName().compareTo(o1.getName()); �̰ŷ� ���� ����
	}
	/* ���Ͻ��� �������� ������ ��츦 ���ϴ�. ��ȯ���� �ʴ� ��츦 -1(����)�� ���ϵǰ� �մϴ�.
	 * ���� ��ȯ���� �ʴ� ���� 
	 *�������� : o1 < o2    	//�������� : o1 > o2 
	*/

}
