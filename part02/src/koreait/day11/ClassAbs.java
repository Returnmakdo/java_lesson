package koreait.day11;
/*
	추상클래스 : 
	1.객체를 직접생성하지 않는 형태의 클래스 입니다. new 연산 못함
	2.추상메소드를 갖고 있습니다. 추상(abstract): 구체화되지 않은 상태.
	3.부모클래스에서 구체화되지 않은 추상메소드를 자식클래스가 재정의(오버라이드)하도록 하는 것입니다.
	4.비유 : '사람'은 추상황 개념. '손흥민'은 구체화된 실체
		ㄴ 추상클래스 목적은 추상화 된 것은 객체를 만들지 마라!!
	5.추상메소드를 재정의(구현)한 자식클래스를 정의해서 객체를 생성합니다.
*
*/

public abstract class ClassAbs {
	
	protected String name;		//자식 클래스 다른 패키지에서도 직접 접근
	
	//추상메소드 : 자식들이 재정의하도록 형식만 선얺바니다. { }(body, 몸체)없습니다.
	public abstract void test();
	
	public void print() {
		System.out.println("name = "+name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
