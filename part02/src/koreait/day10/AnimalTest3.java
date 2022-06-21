package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest3 {

	public static void main(String[] args) {
		// �θ�Ÿ�� Ŭ���� �迭 : �迭���� AnimalŸ�� �ν��Ͻ� ��ü�� ������
		Animal[] animals = new Animal[10];
		
		animals[0] = new Frog();
		animals[1] = new Cat();
		animals[5] = new Dog();
		animals[7] = new Frog();
		animals[8] = new Crow();
		
		System.out.println("--------------------");
		for(Animal temp : animals) {  // �迭���� ������� �ϳ��� ��������
			if(temp != null) {
				Cat cat; Dog dog; Frog frog; Crow crow;
				if(temp instanceof Cat) {  
					cat = (Cat)temp; // �ٿ�ĳ����:  animal�� ��¥ ��ü�� ���� ���� || ��������
					cat.sound();
				}
				if(temp instanceof Dog) {
					dog = (Dog)temp;
					dog.run();
				}
				if(temp instanceof Frog) {
					frog = (Frog)temp;
					frog.jump();
				}
				if(temp instanceof Crow) {
					crow = (Crow)temp;
					crow.fly();
				}
				temp.act();   // �����ǵ� �޼ҵ�� �����ǵ� �޼ҵ� / ������ �θ�޼ҵ� �״�����
				temp.print();
			}
			else {
				System.out.println("null �����Դϴ�.");
			}
			System.out.println("--------------------");
		}
	}

}
