package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal(); // 객체생성
		animal.act();
		animal.print();
		System.out.println("--------------------------");
		
		Dog dog = new Dog();
		dog.run(); // 자기꺼
		dog.print();  // 상속 메소드
		System.out.println("--------------------------");
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println(":::::::::::::::::::::::::");
		Animal temp = dog;  // 자식클래스는 부모클래스타입으로 자동캐스팅
		temp.print();
//		temp.run();   부모타입 변수로는 자식메소드 실행이안된다
		temp = crow;
		temp.print();
//		temp.fly();   부모타입 변수로는 자식메소드 실행이안된다
		System.out.println("-------------------------");
		Animal puppy = new Dog();   // 자식 객체는 부모클래스 타입으로 참조할 수 있다.
		Animal bird = new Crow();
		puppy.print();
		bird.print();
//		puppy.run();  부모타입 변수로는 자식메소드 실행이안된다
//		bird.fly();         "
		
		Dog puddle = (Dog)puppy; // Animal 타입을 Dog타입으로 강제 casting(자식클래스 Dog 객체이므로 가능)
		puddle.run();            //   puppy 변수가 참조하는 객체가 Dog 타입일때만 가능
		puddle.print();
		
		Crow angmoo = (Crow)crow;
		angmoo.fly();
		angmoo.print();
	}

}
