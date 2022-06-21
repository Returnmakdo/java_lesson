package koreait.day11.test;

public class Dog extends Animal{
	
	protected int legs;
	
	public Dog() {
		System.out.println("새로운 동물가족은dog" );
		type = Animal.DOG;
	}
	
	
	public void run() {
		setName("강아지");
		setColor("브라운");
		System.out.println("특징 : 달리기");
	}


	@Override
	public void act() {
		System.out.println("강아지는 멍멍 짖습니다..");
	}


	@Override
	public void body() {
		System.out.println("강아지의 다리는 " + legs + "개 입니다.");
	}

	@Override
	public String eat(Object object) {
		return "먹이는 " + object + "입니다.";
	}

}
