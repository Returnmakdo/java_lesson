package koreait.day04;

public class C17_StringTest {
	public static void main(String[] args) {
		
		String name = "kim";  // 참조형 변수(클래스 타입)
		String name2 = "kim"; // 리터럴이 같기 때문에 메모리를 따로 할당하지 않고 같은곳을 참조
		String name3 = "lee";
		String name4 = new String("kim"); // 새로운 String 객체 생성 -> 메모리 할당
		
		System.out.println("name == name2 참조위치? " + (name==name2) ); //T
		System.out.println("name == name2 참조위치? " + (name==name4) ); //F
		System.out.println("name == name2 참조위치? " + (name2==name4) );//F
		
		name2 = "son";
		System.out.println("name == name2 참조위치? " + (name==name2) ); //F
		
		System.out.println("name = " + name);
		System.out.println("name2 = " + name2);
		System.out.printf("name3 = %s\n", name3);
		System.out.printf("name4 = %s\n", name4);
	}

}
/*
 * 문자열 : 기호 "" 를 사용
 *       자바에서는 기본형 데이터가 아니고 String 클래스타입으로 사용한다.
 *                                ㄴ 필드, 메소드 이용하여 문자열 기능 사용
 *  
 * 
 */