package koreait.day11.test;

public class Crow extends Animal{	//

	protected int wings;  //����

	
	public Crow() {
		System.out.println("���ο� ���������� crow");
		type = Animal.CROW;
	}
	
	public void fly() {
		setName("���");
		setColor("������");
		System.out.println("Ư¡ : ����");
	}

	@Override
	public void act() {
		System.out.println("��ʹ� ��Ǳ�� ��ϴ�..");
	}

	@Override
	public void body() {
		System.out.println("����� ������ " + wings + "�� �Դϴ�.");
	}

	@Override
	public String eat(Object object) {
		return "���̴� ������" + object + "�Դϴ�.";
	}
}
