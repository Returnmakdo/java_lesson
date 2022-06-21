package koreait.day11.test;

public abstract class Animal {
	
	// �̸� ��ӵ� ��������� Ÿ���� ���ϴ� ����
	static final int CAT = 1;
	static final int DOG = 2;
	static final int CROW = 3;
	static final int FROG = 4;
	static final int SNAKE = 5;
	
	private String name;
	private String color;
	protected int type;
	
	public Animal() {
		System.out.println("���ο� ���� ������ ������ϴ�.");
	}
	// �߻�޼ҵ�κ���
	public abstract void act();
	
	// �߻�޼ҵ� �ٸ��ŵ� ������
	public abstract void body();
	
	public abstract String eat(Object object);
	
	public void print() {
		System.out.println("name:" + name +",color:"+ color);
	}
	
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	
}
