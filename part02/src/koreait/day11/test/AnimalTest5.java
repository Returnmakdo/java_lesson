package koreait.day11.test;

public class AnimalTest5 {

	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.act();
		frog.jump();
		frog.mouth = "입";
		Animal f = (Animal)frog;
		f.act();
//		f.jump();  부모거에선 자식메소드 실행 안됌
		f.setName("케로로");
		f.setColor("초록색");
		f.print();
		f.body();
		System.out.println("-------------------");
		
		Cat cat = new Cat();
		cat.act();
		cat.sound();
		cat.eyes = "눈";
		Animal c = (Animal)cat;
		c.act();
		c.setName("달수,달봉");
		c.setColor("흰색,회색");
		c.print();
		c.body();
		System.out.println("-------------------");
		
		Dog dog = new Dog();
		dog.act();
		dog.run();
		dog.legs = 4;
		Animal d = (Animal)dog;
		d.act();
		d.setName("바둑이");
		d.setColor("검은색,흰색");
		d.print();
		d.body();
		System.out.println("-------------------");
		
		Crow crow = new Crow();
		crow.act();
		crow.fly();
		crow.wings = 2;
		Animal cr = (Animal)crow;
		cr.act();
		cr.setName("까막이");
		cr.setColor("검은색");
		cr.print();
		cr.body();
		System.out.println("-------------------");
		
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[8] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("개굴A");
		animals[4] = new Frog();
		animals[4].setName("개굴B");
		animals[6] = new Crow();
		
		for(Animal temp : animals)
			if(temp != null) {
				temp.act();
			}
		
		int cnt = 0;
		long start = System.nanoTime();  // 현재시간을 ns(0.000000001초)
		System.out.println("개구리 먹이주기-------------");
		for(Animal temp : animals) {
			if(temp != null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100*(cnt+2)));
			}
		}
		long end = System.nanoTime();
		System.out.println("개구리 먹이주는데 걸린시간 : " + (end-start) + " ms");
		System.out.println("개구리는 " + cnt + " 마리 살고 있습니다..");
		
		System.out.println("강아지 먹이주기---------------");
		cnt = 0;
		for(Animal temp : animals) {
			if(temp != null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("맛있는 간식"));
			}
		}
		System.out.println("강아지" + cnt + " 마리 살고 있습니다..");
		
		System.out.println("까마귀에게 먹이주기----------------");
		System.out.println(animals[6].eat(animals[3].getName()));
	}
}	

class Frog extends Animal{	

	protected String mouth;  
	public Frog() {
		System.out.println("새로운 동물가족은Frog");
		type = Animal.FROG;
	}
	
	public void jump() {
		setName("개구리");
		setColor("초록색");
		System.out.println("특징 : 점핑");
	}
	
	@Override	
	public void act() {		
			System.out.println("개구리는 개굴개굴웁니다.");
	}

	@Override
	public void body() {
		System.out.println("개구리는 " + mouth + "이 큽니다.");
	}

	@Override
	public String eat(Object object) {
		return "먹이는" + object + "입니다.";
	}
}
class Cat extends Animal{
	protected String eyes;
	public Cat() {
		System.out.println("새로운 동물가족은 cat" );
		type = Animal.CAT;
	}
	public void sound() {
		setName("고양이");
		setColor("하얀색");
		System.out.println ("특징 : 야옹야옹울기");
	}
	
	@Override
	public void act() {
		System.out.println("고양이는 츄ㅜ르를 먹습니다..");
	}
	@Override
	public void body() {
		System.out.println("고양ㅇ이는 이쁜 " + eyes + "을 가지고 있습니다..");
	}
	@Override
	public String eat(Object object) {
		return "먹이는" + object + "입니다.";
	}
}