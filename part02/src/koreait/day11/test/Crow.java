package koreait.day11.test;

public class Crow extends Animal{	//

	protected int wings;  //날개

	
	public Crow() {
		System.out.println("새로운 동물가족은 crow");
		type = Animal.CROW;
	}
	
	public void fly() {
		setName("까마귀");
		setColor("검은색");
		System.out.println("특징 : 날기");
	}

	@Override
	public void act() {
		System.out.println("까마귀는 까악까악 웁니다..");
	}

	@Override
	public void body() {
		System.out.println("까마귀의 날개는 " + wings + "개 입니다.");
	}

	@Override
	public String eat(Object object) {
		return "먹이는 개구리" + object + "입니다.";
	}
}
