package koreait.day07;

public class C36_C35Test {
// C35 클래스를1)객체로만들어서 2)static인것을 테스트합니다
// 참고 : main메소드를 갖는 클래스를 객체로 만들지 않는것이 일반적이다
	public static void main(String[] args) {
		
		C35_GlobalVar test1 = new C35_GlobalVar(); // C35 클래스타입의 객체 생성
		C35_GlobalVar test2 = new C35_GlobalVar(); // C35 클래스타입의 객체 생성
		
		// C35 클래스에서 static이 아닌 인스턴스 변수에는 객체마다 다른 값을 저장한다 - 객체 각각 다른 특성을 나타냄
		test1.count = 10;
		test2.count = 20;
		
		test1.message = "hi test1";
		test2.message = "hello test2";
		
		test1.methodA(); // 인스턴스 메소드
		test2.methodA();
		
		test1.methodC(123);  // this.count 에서 this는 test1
		test2.methodC(999);  // this.count 에서 this는 test2
		
		System.out.println(test1.count);
		System.out.println(test2.count);
		
		// static 요소 테스트 : static 변수 또는 메소드는 클래스이름으로 접근한다
		
		C35_GlobalVar.num = 101;
		System.out.println("static num = " + C35_GlobalVar.num);
		System.out.println("static num = " + test1.num);  // 경고 : static방법으로  사용해라
		System.out.println("static num = " + test2.num);  // 경고 : static방법으로  사용해라
		
		// static이 저장되는 메모리 영역(메소드 영역)과 객체가 저장되는 메모리 영역(힙 영역)은 다르다.
		
		// 상수 TEST 확인
		System.out.println("TEST = " + C35_GlobalVar.TEST);
//		C35_GlobalVar.TEST = 100;    오류 : final은 값 변경 X
		
		C35_GlobalVar test3 = new C35_GlobalVar();
		// 전역변수의 기본 초기값 - 0, 0.0, 참조타입은null
		// 참고 : 지역변수의 기본 초기값 - 배열일때만 0, 0.0, 참조타입은null, 그리고 기본형데이터타입은 오류
		System.out.println("test3.count = " + test3.count);
		System.out.println("test3.message = " + test3.message);
		System.out.println("C35_GlobalVar.point = " + C35_GlobalVar.point);
		}

}
