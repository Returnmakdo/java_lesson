package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {

	public static void main(String[] args) {
		
		Animal animal = new Dog();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		
		// 메소드인자로 Object 타입객체를 받는 메소드
		System.out.println(Animal.isCrow(puddle));
		System.out.println(Animal.isDog(puddle));
		System.out.println(Animal.isDog("동물"));
		System.out.println(Animal.isDog(1));
		System.out.println(Animal.isDog(animal));
		System.out.println(Animal.isDog(crow));
		System.out.println(Animal.isDog(animal2));
		System.out.println(Animal.isDog("가마귀"));
	}

}
