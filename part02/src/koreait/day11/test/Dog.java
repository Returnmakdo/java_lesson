package koreait.day11.test;

public class Dog extends Animal{
	
	protected int legs;
	
	public Dog() {
		System.out.println("���ο� ����������dog" );
		type = Animal.DOG;
	}
	
	
	public void run() {
		setName("������");
		setColor("����");
		System.out.println("Ư¡ : �޸���");
	}


	@Override
	public void act() {
		System.out.println("�������� �۸� ¢���ϴ�..");
	}


	@Override
	public void body() {
		System.out.println("�������� �ٸ��� " + legs + "�� �Դϴ�.");
	}

	@Override
	public String eat(Object object) {
		return "���̴� " + object + "�Դϴ�.";
	}

}
