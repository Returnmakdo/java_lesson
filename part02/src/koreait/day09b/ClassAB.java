package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA{
	// 과연 이 클래스가 필드 , 메소드 상속받았나 확인
	
	public void test() {
//		System.out.println("name = " + name); // name 필드 접근한정자는 디폴트 : 다른패키지에서 사용불가
		title = "momo";      // 상속받은 title 필드 : 다른패키지 이지만 protected 이기 때문에 접근가능
		System.out.println(title);
		setName("신비");
		System.out.println("name = " + getName());
	}
}
