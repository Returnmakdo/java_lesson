package koreait.day09a;

public class Animal {
	private String name;
	private String color;
	
	public Animal(){ // 디폴트 생성자
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	public void act() { // 그냥 메소드인데 나중에 추상메소드 할때 사용할것임.
		System.out.println("Animal 행동 : 아직 모름 (unknown)");
	}
	
	public void print() {
		System.out.println("name : " + name + ", color : " + color);
	}
	
	// Object 설명하고 작성한 메소드입니다.
	public static boolean isDog(Object object) {
		return object instanceof Dog;
	}
	
	public static boolean isCrow(Object object) {
		return object instanceof Crow;
	}
	
	
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
	
	
}
