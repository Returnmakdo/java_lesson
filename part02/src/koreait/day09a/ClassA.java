package koreait.day09a;

/*
 * Ŭ������ ���
 *  - Ŭ�������� �θ�(����Ŭ����, super) -�ڽ�(����Ŭ����)���谡 ��������ϴ�.
 *  - �θ��� Ŭ���� ������Ҹ� �ڽ��� ����� �� �ִ�. ��ӵǴ� ��Ҵ� �ʵ�, �޼ҵ�
 *  - extends Ű���带 ����Ͽ� �θ�Ŭ������ �����Ѵ�.
 *  - private ���������ڴ� ����� �ȵȴ�
 *  - protected�� �ٸ� ��Ű���� Ŭ������ ��ӹ��� �� �ֵ��� �մϴ�.
 */

public class ClassA {  // �θ�Ŭ����
	int ab;
	String name;
	protected String title;
	
	void print() {
		System.out.println("ab = " + ab);
		System.out.println("name = " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
