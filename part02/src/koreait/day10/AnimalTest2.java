package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog();   // ��ĳ���� : �ڵ�����ȯ <-> �ٿ�ĳ���� : ������ȯ
		Animal ani2 = new Cat();
		
		Dog puddle = new Dog();
		Crow crow  = new Crow();
		// �ڽ� ��ü�� �����ɶ� ���� �θ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ŭ���� ������ ����
		System.out.println("::::::::");
		animal(ani1);
//		animal(ani2);
//		animal(puddle);
//		animal(crow);
//		animal(new Frog());
	}
	
	// ������
	// �������� 1: �޼ҵ� ���� Ÿ���� Animal : Animal, Dog, Crow, Frog, Cat ��ü ��� ����
	public static void animal(Animal animal) {
		
		// �������� 2: �޼ҵ� ������  animal ��ü �ν��Ͻ� Ÿ�Կ� ���� ����Ǵ� act����� �ٸ���
		animal.act();
		
		animal.print();
		// ���ڷ� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ��(�ν��Ͻ� Ÿ��) �˻�
		System.out.println("dog ? " + (animal instanceof Dog));
		System.out.println("cat ? " + (animal instanceof Cat));
		System.out.println("frog ? " + (animal instanceof Frog));
		System.out.println("crow ? " + (animal instanceof Crow));
		
		/*
		 * Animal �θ�Ÿ�� ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ� ���� ����
		 * animal.jump();
		 * animal.run();
		 * animal.fly();
		 * animal.sound();
		 */
		 
		Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
			cat = (Cat)animal; // �ٿ�ĳ����:  animal�� ��¥ ��ü�� ���� ���� || ��������
			cat.sound();
		}
		if(animal instanceof Dog) {
			dog = (Dog)animal;
			dog.run();
		}
		if(animal instanceof Frog) {
			frog = (Frog)animal;
			frog.jump();
		}
		if(animal instanceof Crow) {
			crow = (Crow)animal;
			crow.fly();
		}
	}

}

class Frog extends Animal{
	
	protected String mouth;
	
	public Frog() {
		System.out.println("���ο� ���������� Frog");
	}
	
	public void jump() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	}
	// ���������� : �޼ҵ� �������̵� (*���� : �����ε�(overloading)�� �򰥸��� ����)  
	//               �� �θ� Ŭ������ �޼ҵ带 ������ �ϴ� ��. �̶� ���ڿ� ����Ÿ���� �����ϰ�
	@Override  // annotation �ֳ����̼� : �ڵ�(�Ǵ� ����)�� ���� �Ǵ� �ּ�
	public void act() {
//		super.act();  // �θ�Ŭ������ act ����
		System.out.println("Animal �ൿ : ���÷� �����ϱ�");
	}
	
	public void print() {
		System.out.println("��������");
	}
}

class Cat extends Animal{
	
	protected String eyes;
	
	public Cat() {
		System.out.println("���ο� ���������� Cat");
	}
	
	public void sound() {
		setName("�����");
		setColor("ȭ��Ʈ");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	
	@Override
	public void act() {
		System.out.println("Animal �ൿ : ���÷� �߿˾߿� ���");
	}
	
	public void print() {
		System.out.println("�޼�~");
	}
}
