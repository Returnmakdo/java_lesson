package koreait.day09a;

/*
 * 클래스의 상속
 *  - 클래스간의 부모(상위클래스, super) -자식(하위클래스)관계가 만들어집니다.
 *  - 부모의 클래스 구성요소를 자식이 사용할 수 있다. 상속되는 요소는 필드, 메소드
 *  - extends 키워드를 사용하여 부모클래스를 지정한다.
 *  - private 접근한정자는 상속이 안된다
 *  - protected는 다른 패키지의 클래스가 상속받을 수 있도록 합니다.
 */

public class ClassA {  // 부모클래스
	int ab;
	String name;
	protected String title;
	
	void print() {
		System.out.println("ab = " + ab);
		System.out.println("name = " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
