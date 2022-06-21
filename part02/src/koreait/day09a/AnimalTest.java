package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal(); // ��ü����
		animal.act();
		animal.print();
		System.out.println("--------------------------");
		
		Dog dog = new Dog();
		dog.run(); // �ڱⲨ
		dog.print();  // ��� �޼ҵ�
		System.out.println("--------------------------");
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println(":::::::::::::::::::::::::");
		Animal temp = dog;  // �ڽ�Ŭ������ �θ�Ŭ����Ÿ������ �ڵ�ĳ����
		temp.print();
//		temp.run();   �θ�Ÿ�� �����δ� �ڽĸ޼ҵ� �����̾ȵȴ�
		temp = crow;
		temp.print();
//		temp.fly();   �θ�Ÿ�� �����δ� �ڽĸ޼ҵ� �����̾ȵȴ�
		System.out.println("-------------------------");
		Animal puppy = new Dog();   // �ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ������ �� �ִ�.
		Animal bird = new Crow();
		puppy.print();
		bird.print();
//		puppy.run();  �θ�Ÿ�� �����δ� �ڽĸ޼ҵ� �����̾ȵȴ�
//		bird.fly();         "
		
		Dog puddle = (Dog)puppy; // Animal Ÿ���� DogŸ������ ���� casting(�ڽ�Ŭ���� Dog ��ü�̹Ƿ� ����)
		puddle.run();            //   puppy ������ �����ϴ� ��ü�� Dog Ÿ���϶��� ����
		puddle.print();
		
		Crow angmoo = (Crow)crow;
		angmoo.fly();
		angmoo.print();
	}

}
