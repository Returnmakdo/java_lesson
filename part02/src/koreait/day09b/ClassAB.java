package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA{
	// ���� �� Ŭ������ �ʵ� , �޼ҵ� ��ӹ޾ҳ� Ȯ��
	
	public void test() {
//		System.out.println("name = " + name); // name �ʵ� ���������ڴ� ����Ʈ : �ٸ���Ű������ ���Ұ�
		title = "momo";      // ��ӹ��� title �ʵ� : �ٸ���Ű�� ������ protected �̱� ������ ���ٰ���
		System.out.println(title);
		setName("�ź�");
		System.out.println("name = " + getName());
	}
}
