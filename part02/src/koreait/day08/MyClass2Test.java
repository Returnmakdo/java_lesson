package koreait.day08;

public class MyClass2Test {
// �ϰ���� ���� �غ���
	public static void main(String[] args) {
		
		// �⺻�����ڷ� ��ü����
		MyClass2 MY = new MyClass2();
		// ���� Ŭ�������� ���Ǹ� �ϸ� ������ ���� �ʴ´�.
		
		
		// Ŀ���� �����ڷ� ��ü �����ϱ�
		MyClass2 my = new MyClass2("��ġ��");
		my.setAge(26);
		System.out.println(my.getName() + my.getAge());
		System.out.println("MY name : " + MY.getName());
		
		// MY ��ü�� �⺻�����ڸ� ����ϸ� name �ʵ尪 �ʱ�ȭ�� ���Ѵ�.(��������������)
	}

}
