package koreait.day11.test;

public class AnimalTest5 {

	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.act();
		frog.jump();
		frog.mouth = "��";
		Animal f = (Animal)frog;
		f.act();
//		f.jump();  �θ�ſ��� �ڽĸ޼ҵ� ���� �ȉ�
		f.setName("�ɷη�");
		f.setColor("�ʷϻ�");
		f.print();
		f.body();
		System.out.println("-------------------");
		
		Cat cat = new Cat();
		cat.act();
		cat.sound();
		cat.eyes = "��";
		Animal c = (Animal)cat;
		c.act();
		c.setName("�޼�,�޺�");
		c.setColor("���,ȸ��");
		c.print();
		c.body();
		System.out.println("-------------------");
		
		Dog dog = new Dog();
		dog.act();
		dog.run();
		dog.legs = 4;
		Animal d = (Animal)dog;
		d.act();
		d.setName("�ٵ���");
		d.setColor("������,���");
		d.print();
		d.body();
		System.out.println("-------------------");
		
		Crow crow = new Crow();
		crow.act();
		crow.fly();
		crow.wings = 2;
		Animal cr = (Animal)crow;
		cr.act();
		cr.setName("���");
		cr.setColor("������");
		cr.print();
		cr.body();
		System.out.println("-------------------");
		
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[8] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("����A");
		animals[4] = new Frog();
		animals[4].setName("����B");
		animals[6] = new Crow();
		
		for(Animal temp : animals)
			if(temp != null) {
				temp.act();
			}
		
		int cnt = 0;
		long start = System.nanoTime();  // ����ð��� ns(0.000000001��)
		System.out.println("������ �����ֱ�-------------");
		for(Animal temp : animals) {
			if(temp != null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100*(cnt+2)));
			}
		}
		long end = System.nanoTime();
		System.out.println("������ �����ִµ� �ɸ��ð� : " + (end-start) + " ms");
		System.out.println("�������� " + cnt + " ���� ��� �ֽ��ϴ�..");
		
		System.out.println("������ �����ֱ�---------------");
		cnt = 0;
		for(Animal temp : animals) {
			if(temp != null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("���ִ� ����"));
			}
		}
		System.out.println("������" + cnt + " ���� ��� �ֽ��ϴ�..");
		
		System.out.println("��Ϳ��� �����ֱ�----------------");
		System.out.println(animals[6].eat(animals[3].getName()));
	}
}	

class Frog extends Animal{	

	protected String mouth;  
	public Frog() {
		System.out.println("���ο� ����������Frog");
		type = Animal.FROG;
	}
	
	public void jump() {
		setName("������");
		setColor("�ʷϻ�");
		System.out.println("Ư¡ : ����");
	}
	
	@Override	
	public void act() {		
			System.out.println("�������� ����������ϴ�.");
	}

	@Override
	public void body() {
		System.out.println("�������� " + mouth + "�� Ů�ϴ�.");
	}

	@Override
	public String eat(Object object) {
		return "���̴�" + object + "�Դϴ�.";
	}
}
class Cat extends Animal{
	protected String eyes;
	public Cat() {
		System.out.println("���ο� ���������� cat" );
		type = Animal.CAT;
	}
	public void sound() {
		setName("�����");
		setColor("�Ͼ��");
		System.out.println ("Ư¡ : �߿˾߿˿��");
	}
	
	@Override
	public void act() {
		System.out.println("����̴� ��̸��� �Խ��ϴ�..");
	}
	@Override
	public void body() {
		System.out.println("��礷�̴� �̻� " + eyes + "�� ������ �ֽ��ϴ�..");
	}
	@Override
	public String eat(Object object) {
		return "���̴�" + object + "�Դϴ�.";
	}
}