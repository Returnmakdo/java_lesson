package koreait.day08;

public class MyClass2Test {
// 하고싶은 연습 해보기
	public static void main(String[] args) {
		
		// 기본생성자로 객체생성
		MyClass2 MY = new MyClass2();
		// 직접 클래스에서 정의를 하면 오류가 나지 않는다.
		
		
		// 커스텀 생성자로 객체 생성하기
		MyClass2 my = new MyClass2("안치영");
		my.setAge(26);
		System.out.println(my.getName() + my.getAge());
		System.out.println("MY name : " + MY.getName());
		
		// MY 객체에 기본생성자를 허용하면 name 필드값 초기화를 못한다.(예시적용했을떄)
	}

}
